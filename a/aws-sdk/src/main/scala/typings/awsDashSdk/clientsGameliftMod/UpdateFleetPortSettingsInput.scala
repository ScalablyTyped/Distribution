package typings.awsDashSdk.clientsGameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateFleetPortSettingsInput extends js.Object {
  /**
    * Unique identifier for a fleet to update port settings for.
    */
  var FleetId: typings.awsDashSdk.clientsGameliftMod.FleetId
  /**
    * Collection of port settings to be added to the fleet record.
    */
  var InboundPermissionAuthorizations: js.UndefOr[IpPermissionsList] = js.undefined
  /**
    * Collection of port settings to be removed from the fleet record.
    */
  var InboundPermissionRevocations: js.UndefOr[IpPermissionsList] = js.undefined
}

object UpdateFleetPortSettingsInput {
  @scala.inline
  def apply(
    FleetId: FleetId,
    InboundPermissionAuthorizations: IpPermissionsList = null,
    InboundPermissionRevocations: IpPermissionsList = null
  ): UpdateFleetPortSettingsInput = {
    val __obj = js.Dynamic.literal(FleetId = FleetId)
    if (InboundPermissionAuthorizations != null) __obj.updateDynamic("InboundPermissionAuthorizations")(InboundPermissionAuthorizations)
    if (InboundPermissionRevocations != null) __obj.updateDynamic("InboundPermissionRevocations")(InboundPermissionRevocations)
    __obj.asInstanceOf[UpdateFleetPortSettingsInput]
  }
}

