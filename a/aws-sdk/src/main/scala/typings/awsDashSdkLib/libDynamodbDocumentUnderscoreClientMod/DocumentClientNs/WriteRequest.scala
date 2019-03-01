package typings
package awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WriteRequest extends js.Object {
  /**
    * A request to perform a DeleteItem operation.
    */
  var DeleteRequest: js.UndefOr[DeleteRequest] = js.undefined
  /**
    * A request to perform a PutItem operation.
    */
  var PutRequest: js.UndefOr[PutRequest] = js.undefined
}

object WriteRequest {
  @scala.inline
  def apply(DeleteRequest: DeleteRequest = null, PutRequest: PutRequest = null): WriteRequest = {
    val __obj = js.Dynamic.literal()
    if (DeleteRequest != null) __obj.updateDynamic("DeleteRequest")(DeleteRequest)
    if (PutRequest != null) __obj.updateDynamic("PutRequest")(PutRequest)
    __obj.asInstanceOf[WriteRequest]
  }
}

