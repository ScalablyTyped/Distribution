package typings.awsSdk.clientsCognitoidentityserviceproviderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CompromisedCredentialsRiskConfigurationType extends StObject {
  
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
  
  inline def apply(Actions: CompromisedCredentialsActionsType): CompromisedCredentialsRiskConfigurationType = {
    val __obj = js.Dynamic.literal(Actions = Actions.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompromisedCredentialsRiskConfigurationType]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CompromisedCredentialsRiskConfigurationType] (val x: Self) extends AnyVal {
    
    inline def setActions(value: CompromisedCredentialsActionsType): Self = StObject.set(x, "Actions", value.asInstanceOf[js.Any])
    
    inline def setEventFilter(value: EventFiltersType): Self = StObject.set(x, "EventFilter", value.asInstanceOf[js.Any])
    
    inline def setEventFilterUndefined: Self = StObject.set(x, "EventFilter", js.undefined)
    
    inline def setEventFilterVarargs(value: EventFilterType*): Self = StObject.set(x, "EventFilter", js.Array(value*))
  }
}
