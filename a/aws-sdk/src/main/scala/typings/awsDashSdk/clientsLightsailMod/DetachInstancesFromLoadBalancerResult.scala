package typings.awsDashSdk.clientsLightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DetachInstancesFromLoadBalancerResult extends js.Object {
  /**
    * An object describing the API operations.
    */
  var operations: js.UndefOr[OperationList] = js.undefined
}

object DetachInstancesFromLoadBalancerResult {
  @scala.inline
  def apply(operations: OperationList = null): DetachInstancesFromLoadBalancerResult = {
    val __obj = js.Dynamic.literal()
    if (operations != null) __obj.updateDynamic("operations")(operations)
    __obj.asInstanceOf[DetachInstancesFromLoadBalancerResult]
  }
}

