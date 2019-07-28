package typings.awsDashSdk.clientsWorklinkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateFleetMetadataRequest extends js.Object {
  /**
    * The fleet name to display. The existing DisplayName is unset if null is passed.
    */
  var DisplayName: js.UndefOr[typings.awsDashSdk.clientsWorklinkMod.DisplayName] = js.undefined
  /**
    * The ARN of the fleet.
    */
  var FleetArn: typings.awsDashSdk.clientsWorklinkMod.FleetArn
  /**
    * The option to optimize for better performance by routing traffic through the closest AWS Region to users, which may be outside of your home Region.
    */
  var OptimizeForEndUserLocation: js.UndefOr[Boolean] = js.undefined
}

object UpdateFleetMetadataRequest {
  @scala.inline
  def apply(
    FleetArn: FleetArn,
    DisplayName: DisplayName = null,
    OptimizeForEndUserLocation: js.UndefOr[Boolean] = js.undefined
  ): UpdateFleetMetadataRequest = {
    val __obj = js.Dynamic.literal(FleetArn = FleetArn)
    if (DisplayName != null) __obj.updateDynamic("DisplayName")(DisplayName)
    if (!js.isUndefined(OptimizeForEndUserLocation)) __obj.updateDynamic("OptimizeForEndUserLocation")(OptimizeForEndUserLocation)
    __obj.asInstanceOf[UpdateFleetMetadataRequest]
  }
}

