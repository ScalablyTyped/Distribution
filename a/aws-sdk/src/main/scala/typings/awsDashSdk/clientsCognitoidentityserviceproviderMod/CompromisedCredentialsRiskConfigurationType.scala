package typings.awsDashSdk.clientsCognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CompromisedCredentialsRiskConfigurationType extends js.Object {
  /**
    * The compromised credentials risk configuration actions.
    */
  var Actions: CompromisedCredentialsActionsType
  /**
    * Perform the action for these events. The default is to perform all events if no event filter is specified.
    */
  var EventFilter: js.UndefOr[EventFiltersType] = js.undefined
}

object CompromisedCredentialsRiskConfigurationType {
  @scala.inline
  def apply(Actions: CompromisedCredentialsActionsType, EventFilter: EventFiltersType = null): CompromisedCredentialsRiskConfigurationType = {
    val __obj = js.Dynamic.literal(Actions = Actions)
    if (EventFilter != null) __obj.updateDynamic("EventFilter")(EventFilter)
    __obj.asInstanceOf[CompromisedCredentialsRiskConfigurationType]
  }
}

