package typings.awsDashSdk.clientsWorkdocsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AbortDocumentVersionUploadRequest extends js.Object {
  /**
    * Amazon WorkDocs authentication token. Do not set this field when using administrative API actions, as in accessing the API using AWS credentials.
    */
  var AuthenticationToken: js.UndefOr[AuthenticationHeaderType] = js.undefined
  /**
    * The ID of the document.
    */
  var DocumentId: ResourceIdType
  /**
    * The ID of the version.
    */
  var VersionId: DocumentVersionIdType
}

object AbortDocumentVersionUploadRequest {
  @scala.inline
  def apply(
    DocumentId: ResourceIdType,
    VersionId: DocumentVersionIdType,
    AuthenticationToken: AuthenticationHeaderType = null
  ): AbortDocumentVersionUploadRequest = {
    val __obj = js.Dynamic.literal(DocumentId = DocumentId, VersionId = VersionId)
    if (AuthenticationToken != null) __obj.updateDynamic("AuthenticationToken")(AuthenticationToken)
    __obj.asInstanceOf[AbortDocumentVersionUploadRequest]
  }
}

