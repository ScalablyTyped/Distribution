package typings.awsDashSdk.clientsLightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AttachInstancesToLoadBalancerResult extends js.Object {
  /**
    * An object representing the API operations.
    */
  var operations: js.UndefOr[OperationList] = js.undefined
}

object AttachInstancesToLoadBalancerResult {
  @scala.inline
  def apply(operations: OperationList = null): AttachInstancesToLoadBalancerResult = {
    val __obj = js.Dynamic.literal()
    if (operations != null) __obj.updateDynamic("operations")(operations)
    __obj.asInstanceOf[AttachInstancesToLoadBalancerResult]
  }
}

