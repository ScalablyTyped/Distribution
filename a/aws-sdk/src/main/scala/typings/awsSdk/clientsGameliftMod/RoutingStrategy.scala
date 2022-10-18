package typings.awsSdk.clientsGameliftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RoutingStrategy extends StObject {
  
  /**
    * A unique identifier for the fleet that the alias points to. This value is the fleet ID, not the fleet ARN.
    */
  var FleetId: js.UndefOr[typings.awsSdk.clientsGameliftMod.FleetId] = js.undefined
  
  /**
    * The message text to be used with a terminal routing strategy.
    */
  var Message: js.UndefOr[FreeText] = js.undefined
  
  /**
    * The type of routing strategy for the alias. Possible routing types include the following:    SIMPLE - The alias resolves to one specific fleet. Use this type when routing to active fleets.    TERMINAL - The alias does not resolve to a fleet but instead can be used to display a message to the user. A terminal alias throws a TerminalRoutingStrategyException with the RoutingStrategy message embedded.  
    */
  var Type: js.UndefOr[RoutingStrategyType] = js.undefined
}
object RoutingStrategy {
  
  inline def apply(): RoutingStrategy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RoutingStrategy]
  }
  
  extension [Self <: RoutingStrategy](x: Self) {
    
    inline def setFleetId(value: FleetId): Self = StObject.set(x, "FleetId", value.asInstanceOf[js.Any])
    
    inline def setFleetIdUndefined: Self = StObject.set(x, "FleetId", js.undefined)
    
    inline def setMessage(value: FreeText): Self = StObject.set(x, "Message", value.asInstanceOf[js.Any])
    
    inline def setMessageUndefined: Self = StObject.set(x, "Message", js.undefined)
    
    inline def setType(value: RoutingStrategyType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
  }
}
