package typings.awsDashSdk.clientsLightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteLoadBalancerResult extends js.Object {
  /**
    * An object describing the API operations.
    */
  var operations: js.UndefOr[OperationList] = js.undefined
}

object DeleteLoadBalancerResult {
  @scala.inline
  def apply(operations: OperationList = null): DeleteLoadBalancerResult = {
    val __obj = js.Dynamic.literal()
    if (operations != null) __obj.updateDynamic("operations")(operations)
    __obj.asInstanceOf[DeleteLoadBalancerResult]
  }
}

