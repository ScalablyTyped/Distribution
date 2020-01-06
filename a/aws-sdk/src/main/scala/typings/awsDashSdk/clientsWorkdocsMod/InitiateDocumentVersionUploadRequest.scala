package typings.awsDashSdk.clientsWorkdocsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InitiateDocumentVersionUploadRequest extends js.Object {
  /**
    * Amazon WorkDocs authentication token. Do not set this field when using administrative API actions, as in accessing the API using AWS credentials.
    */
  var AuthenticationToken: js.UndefOr[AuthenticationHeaderType] = js.native
  /**
    * The timestamp when the content of the document was originally created.
    */
  var ContentCreatedTimestamp: js.UndefOr[TimestampType] = js.native
  /**
    * The timestamp when the content of the document was modified.
    */
  var ContentModifiedTimestamp: js.UndefOr[TimestampType] = js.native
  /**
    * The content type of the document.
    */
  var ContentType: js.UndefOr[DocumentContentType] = js.native
  /**
    * The size of the document, in bytes.
    */
  var DocumentSizeInBytes: js.UndefOr[SizeType] = js.native
  /**
    * The ID of the document.
    */
  var Id: js.UndefOr[ResourceIdType] = js.native
  /**
    * The name of the document.
    */
  var Name: js.UndefOr[ResourceNameType] = js.native
  /**
    * The ID of the parent folder.
    */
  var ParentFolderId: ResourceIdType = js.native
}

object InitiateDocumentVersionUploadRequest {
  @scala.inline
  def apply(
    ParentFolderId: ResourceIdType,
    AuthenticationToken: AuthenticationHeaderType = null,
    ContentCreatedTimestamp: TimestampType = null,
    ContentModifiedTimestamp: TimestampType = null,
    ContentType: DocumentContentType = null,
    DocumentSizeInBytes: Int | Double = null,
    Id: ResourceIdType = null,
    Name: ResourceNameType = null
  ): InitiateDocumentVersionUploadRequest = {
    val __obj = js.Dynamic.literal(ParentFolderId = ParentFolderId.asInstanceOf[js.Any])
    if (AuthenticationToken != null) __obj.updateDynamic("AuthenticationToken")(AuthenticationToken.asInstanceOf[js.Any])
    if (ContentCreatedTimestamp != null) __obj.updateDynamic("ContentCreatedTimestamp")(ContentCreatedTimestamp.asInstanceOf[js.Any])
    if (ContentModifiedTimestamp != null) __obj.updateDynamic("ContentModifiedTimestamp")(ContentModifiedTimestamp.asInstanceOf[js.Any])
    if (ContentType != null) __obj.updateDynamic("ContentType")(ContentType.asInstanceOf[js.Any])
    if (DocumentSizeInBytes != null) __obj.updateDynamic("DocumentSizeInBytes")(DocumentSizeInBytes.asInstanceOf[js.Any])
    if (Id != null) __obj.updateDynamic("Id")(Id.asInstanceOf[js.Any])
    if (Name != null) __obj.updateDynamic("Name")(Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[InitiateDocumentVersionUploadRequest]
  }
}

