package typings.awsDashSdk.clientsGameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RoutingStrategy extends js.Object {
  /**
    * Unique identifier for a fleet that the alias points to.
    */
  var FleetId: js.UndefOr[typings.awsDashSdk.clientsGameliftMod.FleetId] = js.undefined
  /**
    * Message text to be used with a terminal routing strategy.
    */
  var Message: js.UndefOr[FreeText] = js.undefined
  /**
    * Type of routing strategy. Possible routing types include the following:    SIMPLE -- The alias resolves to one specific fleet. Use this type when routing to active fleets.    TERMINAL -- The alias does not resolve to a fleet but instead can be used to display a message to the user. A terminal alias throws a TerminalRoutingStrategyException with the RoutingStrategy message embedded.  
    */
  var Type: js.UndefOr[RoutingStrategyType] = js.undefined
}

object RoutingStrategy {
  @scala.inline
  def apply(FleetId: FleetId = null, Message: FreeText = null, Type: RoutingStrategyType = null): RoutingStrategy = {
    val __obj = js.Dynamic.literal()
    if (FleetId != null) __obj.updateDynamic("FleetId")(FleetId)
    if (Message != null) __obj.updateDynamic("Message")(Message)
    if (Type != null) __obj.updateDynamic("Type")(Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[RoutingStrategy]
  }
}

