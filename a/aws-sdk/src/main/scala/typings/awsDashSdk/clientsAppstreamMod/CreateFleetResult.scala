package typings.awsDashSdk.clientsAppstreamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateFleetResult extends js.Object {
  /**
    * Information about the fleet.
    */
  var Fleet: js.UndefOr[typings.awsDashSdk.clientsAppstreamMod.Fleet] = js.native
}

object CreateFleetResult {
  @scala.inline
  def apply(Fleet: Fleet = null): CreateFleetResult = {
    val __obj = js.Dynamic.literal()
    if (Fleet != null) __obj.updateDynamic("Fleet")(Fleet.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateFleetResult]
  }
}

