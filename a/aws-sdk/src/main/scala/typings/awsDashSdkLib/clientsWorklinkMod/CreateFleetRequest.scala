package typings
package awsDashSdkLib.clientsWorklinkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateFleetRequest extends js.Object {
  /**
    * The fleet name to display.
    */
  var DisplayName: js.UndefOr[DisplayName] = js.undefined
  /**
    * A unique name for the fleet.
    */
  var FleetName: awsDashSdkLib.clientsWorklinkMod.FleetName
  /**
    * The option to optimize for better performance by routing traffic through the closest AWS Region to users, which may be outside of your home Region.
    */
  var OptimizeForEndUserLocation: js.UndefOr[Boolean] = js.undefined
}

object CreateFleetRequest {
  @scala.inline
  def apply(
    FleetName: FleetName,
    DisplayName: DisplayName = null,
    OptimizeForEndUserLocation: js.UndefOr[Boolean] = js.undefined
  ): CreateFleetRequest = {
    val __obj = js.Dynamic.literal(FleetName = FleetName)
    if (DisplayName != null) __obj.updateDynamic("DisplayName")(DisplayName)
    if (!js.isUndefined(OptimizeForEndUserLocation)) __obj.updateDynamic("OptimizeForEndUserLocation")(OptimizeForEndUserLocation)
    __obj.asInstanceOf[CreateFleetRequest]
  }
}

