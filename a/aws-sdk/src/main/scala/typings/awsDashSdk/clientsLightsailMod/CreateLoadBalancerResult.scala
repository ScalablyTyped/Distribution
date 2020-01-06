package typings.awsDashSdk.clientsLightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateLoadBalancerResult extends js.Object {
  /**
    * An object containing information about the API operations.
    */
  var operations: js.UndefOr[OperationList] = js.native
}

object CreateLoadBalancerResult {
  @scala.inline
  def apply(operations: OperationList = null): CreateLoadBalancerResult = {
    val __obj = js.Dynamic.literal()
    if (operations != null) __obj.updateDynamic("operations")(operations.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateLoadBalancerResult]
  }
}

