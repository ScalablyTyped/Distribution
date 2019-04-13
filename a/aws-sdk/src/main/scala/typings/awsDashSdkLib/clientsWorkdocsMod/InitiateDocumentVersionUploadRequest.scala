package typings
package awsDashSdkLib.clientsWorkdocsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InitiateDocumentVersionUploadRequest extends js.Object {
  /**
    * Amazon WorkDocs authentication token. Do not set this field when using administrative API actions, as in accessing the API using AWS credentials.
    */
  var AuthenticationToken: js.UndefOr[AuthenticationHeaderType] = js.undefined
  /**
    * The timestamp when the content of the document was originally created.
    */
  var ContentCreatedTimestamp: js.UndefOr[TimestampType] = js.undefined
  /**
    * The timestamp when the content of the document was modified.
    */
  var ContentModifiedTimestamp: js.UndefOr[TimestampType] = js.undefined
  /**
    * The content type of the document.
    */
  var ContentType: js.UndefOr[DocumentContentType] = js.undefined
  /**
    * The size of the document, in bytes.
    */
  var DocumentSizeInBytes: js.UndefOr[SizeType] = js.undefined
  /**
    * The ID of the document.
    */
  var Id: js.UndefOr[ResourceIdType] = js.undefined
  /**
    * The name of the document.
    */
  var Name: js.UndefOr[ResourceNameType] = js.undefined
  /**
    * The ID of the parent folder.
    */
  var ParentFolderId: ResourceIdType
}

object InitiateDocumentVersionUploadRequest {
  @scala.inline
  def apply(
    ParentFolderId: ResourceIdType,
    AuthenticationToken: AuthenticationHeaderType = null,
    ContentCreatedTimestamp: TimestampType = null,
    ContentModifiedTimestamp: TimestampType = null,
    ContentType: DocumentContentType = null,
    DocumentSizeInBytes: js.UndefOr[SizeType] = js.undefined,
    Id: ResourceIdType = null,
    Name: ResourceNameType = null
  ): InitiateDocumentVersionUploadRequest = {
    val __obj = js.Dynamic.literal(ParentFolderId = ParentFolderId)
    if (AuthenticationToken != null) __obj.updateDynamic("AuthenticationToken")(AuthenticationToken)
    if (ContentCreatedTimestamp != null) __obj.updateDynamic("ContentCreatedTimestamp")(ContentCreatedTimestamp)
    if (ContentModifiedTimestamp != null) __obj.updateDynamic("ContentModifiedTimestamp")(ContentModifiedTimestamp)
    if (ContentType != null) __obj.updateDynamic("ContentType")(ContentType)
    if (!js.isUndefined(DocumentSizeInBytes)) __obj.updateDynamic("DocumentSizeInBytes")(DocumentSizeInBytes)
    if (Id != null) __obj.updateDynamic("Id")(Id)
    if (Name != null) __obj.updateDynamic("Name")(Name)
    __obj.asInstanceOf[InitiateDocumentVersionUploadRequest]
  }
}

