package typings.awsDashSdk.clientsWorkdocsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetDocumentRequest extends js.Object {
  /**
    * Amazon WorkDocs authentication token. Do not set this field when using administrative API actions, as in accessing the API using AWS credentials.
    */
  var AuthenticationToken: js.UndefOr[AuthenticationHeaderType] = js.undefined
  /**
    * The ID of the document.
    */
  var DocumentId: ResourceIdType
  /**
    * Set this to TRUE to include custom metadata in the response.
    */
  var IncludeCustomMetadata: js.UndefOr[BooleanType] = js.undefined
}

object GetDocumentRequest {
  @scala.inline
  def apply(
    DocumentId: ResourceIdType,
    AuthenticationToken: AuthenticationHeaderType = null,
    IncludeCustomMetadata: js.UndefOr[BooleanType] = js.undefined
  ): GetDocumentRequest = {
    val __obj = js.Dynamic.literal(DocumentId = DocumentId)
    if (AuthenticationToken != null) __obj.updateDynamic("AuthenticationToken")(AuthenticationToken)
    if (!js.isUndefined(IncludeCustomMetadata)) __obj.updateDynamic("IncludeCustomMetadata")(IncludeCustomMetadata)
    __obj.asInstanceOf[GetDocumentRequest]
  }
}

