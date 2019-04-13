package typings
package awsDashSdkLib.clientsAppstreamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateFleetResult extends js.Object {
  /**
    * Information about the fleet.
    */
  var Fleet: js.UndefOr[Fleet] = js.undefined
}

object CreateFleetResult {
  @scala.inline
  def apply(Fleet: Fleet = null): CreateFleetResult = {
    val __obj = js.Dynamic.literal()
    if (Fleet != null) __obj.updateDynamic("Fleet")(Fleet)
    __obj.asInstanceOf[CreateFleetResult]
  }
}

