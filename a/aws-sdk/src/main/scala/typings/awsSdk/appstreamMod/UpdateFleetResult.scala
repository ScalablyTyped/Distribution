package typings.awsSdk.appstreamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateFleetResult extends js.Object {
  /**
    * Information about the fleet.
    */
  var Fleet: js.UndefOr[typings.awsSdk.appstreamMod.Fleet] = js.native
}

object UpdateFleetResult {
  @scala.inline
  def apply(Fleet: Fleet = null): UpdateFleetResult = {
    val __obj = js.Dynamic.literal()
    if (Fleet != null) __obj.updateDynamic("Fleet")(Fleet.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateFleetResult]
  }
}

