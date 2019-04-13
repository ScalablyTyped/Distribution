package typings
package awsDashSdkLib.clientsWorkdocsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteDocumentRequest extends js.Object {
  /**
    * Amazon WorkDocs authentication token. Do not set this field when using administrative API actions, as in accessing the API using AWS credentials.
    */
  var AuthenticationToken: js.UndefOr[AuthenticationHeaderType] = js.undefined
  /**
    * The ID of the document.
    */
  var DocumentId: ResourceIdType
}

object DeleteDocumentRequest {
  @scala.inline
  def apply(DocumentId: ResourceIdType, AuthenticationToken: AuthenticationHeaderType = null): DeleteDocumentRequest = {
    val __obj = js.Dynamic.literal(DocumentId = DocumentId)
    if (AuthenticationToken != null) __obj.updateDynamic("AuthenticationToken")(AuthenticationToken)
    __obj.asInstanceOf[DeleteDocumentRequest]
  }
}

