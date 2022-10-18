package typings.awsSdk.clientsNetworkmanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NetworkRoute extends StObject {
  
  /**
    * A unique identifier for the route, such as a CIDR block.
    */
  var DestinationCidrBlock: js.UndefOr[ConstrainedString] = js.undefined
  
  /**
    * The destinations.
    */
  var Destinations: js.UndefOr[NetworkRouteDestinationList] = js.undefined
  
  /**
    * The ID of the prefix list.
    */
  var PrefixListId: js.UndefOr[ConstrainedString] = js.undefined
  
  /**
    * The route state. The possible values are active and blackhole.
    */
  var State: js.UndefOr[RouteState] = js.undefined
  
  /**
    * The route type. The possible values are propagated and static.
    */
  var Type: js.UndefOr[RouteType] = js.undefined
}
object NetworkRoute {
  
  inline def apply(): NetworkRoute = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NetworkRoute]
  }
  
  extension [Self <: NetworkRoute](x: Self) {
    
    inline def setDestinationCidrBlock(value: ConstrainedString): Self = StObject.set(x, "DestinationCidrBlock", value.asInstanceOf[js.Any])
    
    inline def setDestinationCidrBlockUndefined: Self = StObject.set(x, "DestinationCidrBlock", js.undefined)
    
    inline def setDestinations(value: NetworkRouteDestinationList): Self = StObject.set(x, "Destinations", value.asInstanceOf[js.Any])
    
    inline def setDestinationsUndefined: Self = StObject.set(x, "Destinations", js.undefined)
    
    inline def setDestinationsVarargs(value: NetworkRouteDestination*): Self = StObject.set(x, "Destinations", js.Array(value*))
    
    inline def setPrefixListId(value: ConstrainedString): Self = StObject.set(x, "PrefixListId", value.asInstanceOf[js.Any])
    
    inline def setPrefixListIdUndefined: Self = StObject.set(x, "PrefixListId", js.undefined)
    
    inline def setState(value: RouteState): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "State", js.undefined)
    
    inline def setType(value: RouteType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
  }
}
