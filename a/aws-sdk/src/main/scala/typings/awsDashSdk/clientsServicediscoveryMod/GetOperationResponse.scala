package typings.awsDashSdk.clientsServicediscoveryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetOperationResponse extends js.Object {
  /**
    * A complex type that contains information about the operation.
    */
  var Operation: js.UndefOr[typings.awsDashSdk.clientsServicediscoveryMod.Operation] = js.undefined
}

object GetOperationResponse {
  @scala.inline
  def apply(Operation: Operation = null): GetOperationResponse = {
    val __obj = js.Dynamic.literal()
    if (Operation != null) __obj.updateDynamic("Operation")(Operation)
    __obj.asInstanceOf[GetOperationResponse]
  }
}

