package typings.awsDashSdk.clientsGameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RoutingStrategy extends js.Object {
  /**
    * The unique identifier for a fleet that the alias points to. This value is the fleet ID, not the fleet ARN.
    */
  var FleetId: js.UndefOr[typings.awsDashSdk.clientsGameliftMod.FleetId] = js.native
  /**
    * The message text to be used with a terminal routing strategy.
    */
  var Message: js.UndefOr[FreeText] = js.native
  /**
    * The type of routing strategy for the alias. Possible routing types include the following:    SIMPLE - The alias resolves to one specific fleet. Use this type when routing to active fleets.    TERMINAL - The alias does not resolve to a fleet but instead can be used to display a message to the user. A terminal alias throws a TerminalRoutingStrategyException with the RoutingStrategy message embedded.  
    */
  var Type: js.UndefOr[RoutingStrategyType] = js.native
}

object RoutingStrategy {
  @scala.inline
  def apply(FleetId: FleetId = null, Message: FreeText = null, Type: RoutingStrategyType = null): RoutingStrategy = {
    val __obj = js.Dynamic.literal()
    if (FleetId != null) __obj.updateDynamic("FleetId")(FleetId.asInstanceOf[js.Any])
    if (Message != null) __obj.updateDynamic("Message")(Message.asInstanceOf[js.Any])
    if (Type != null) __obj.updateDynamic("Type")(Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[RoutingStrategy]
  }
}

