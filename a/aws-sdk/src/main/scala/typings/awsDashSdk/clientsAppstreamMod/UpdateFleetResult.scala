package typings.awsDashSdk.clientsAppstreamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateFleetResult extends js.Object {
  /**
    * Information about the fleet.
    */
  var Fleet: js.UndefOr[typings.awsDashSdk.clientsAppstreamMod.Fleet] = js.undefined
}

object UpdateFleetResult {
  @scala.inline
  def apply(Fleet: Fleet = null): UpdateFleetResult = {
    val __obj = js.Dynamic.literal()
    if (Fleet != null) __obj.updateDynamic("Fleet")(Fleet)
    __obj.asInstanceOf[UpdateFleetResult]
  }
}

