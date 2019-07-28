package typings.awsDashSdk.clientsWorkdocsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateDocumentVersionRequest extends js.Object {
  /**
    * Amazon WorkDocs authentication token. Do not set this field when using administrative API actions, as in accessing the API using AWS credentials.
    */
  var AuthenticationToken: js.UndefOr[AuthenticationHeaderType] = js.undefined
  /**
    * The ID of the document.
    */
  var DocumentId: ResourceIdType
  /**
    * The version ID of the document.
    */
  var VersionId: DocumentVersionIdType
  /**
    * The status of the version.
    */
  var VersionStatus: js.UndefOr[DocumentVersionStatus] = js.undefined
}

object UpdateDocumentVersionRequest {
  @scala.inline
  def apply(
    DocumentId: ResourceIdType,
    VersionId: DocumentVersionIdType,
    AuthenticationToken: AuthenticationHeaderType = null,
    VersionStatus: DocumentVersionStatus = null
  ): UpdateDocumentVersionRequest = {
    val __obj = js.Dynamic.literal(DocumentId = DocumentId, VersionId = VersionId)
    if (AuthenticationToken != null) __obj.updateDynamic("AuthenticationToken")(AuthenticationToken)
    if (VersionStatus != null) __obj.updateDynamic("VersionStatus")(VersionStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateDocumentVersionRequest]
  }
}

