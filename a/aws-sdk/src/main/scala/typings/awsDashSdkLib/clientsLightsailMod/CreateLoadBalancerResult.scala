package typings
package awsDashSdkLib.clientsLightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateLoadBalancerResult extends js.Object {
  /**
    * An object containing information about the API operations.
    */
  var operations: js.UndefOr[OperationList] = js.undefined
}

object CreateLoadBalancerResult {
  @scala.inline
  def apply(operations: OperationList = null): CreateLoadBalancerResult = {
    val __obj = js.Dynamic.literal()
    if (operations != null) __obj.updateDynamic("operations")(operations)
    __obj.asInstanceOf[CreateLoadBalancerResult]
  }
}

