package typings.awsDashSdk.clientsWafv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CheckCapacityResponse extends js.Object {
  /**
    * The capacity required by the rules and scope.
    */
  var Capacity: js.UndefOr[ConsumedCapacity] = js.native
}

object CheckCapacityResponse {
  @scala.inline
  def apply(Capacity: Int | Double = null): CheckCapacityResponse = {
    val __obj = js.Dynamic.literal()
    if (Capacity != null) __obj.updateDynamic("Capacity")(Capacity.asInstanceOf[js.Any])
    __obj.asInstanceOf[CheckCapacityResponse]
  }
}

