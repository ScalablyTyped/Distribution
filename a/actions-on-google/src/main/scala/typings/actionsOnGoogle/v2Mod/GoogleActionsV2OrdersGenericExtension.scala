package typings.actionsOnGoogle.v2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleActionsV2OrdersGenericExtension extends StObject {
  
  /**
    * Locations associated with the order. Up to 2 locations.
    */
  var locations: js.UndefOr[js.Array[GoogleActionsV2OrdersOrderLocation]] = js.undefined
  
  /**
    * Time indicator associated with the proposed order.
    */
  var time: js.UndefOr[GoogleActionsV2OrdersTime] = js.undefined
}
object GoogleActionsV2OrdersGenericExtension {
  
  inline def apply(): GoogleActionsV2OrdersGenericExtension = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleActionsV2OrdersGenericExtension]
  }
  
  extension [Self <: GoogleActionsV2OrdersGenericExtension](x: Self) {
    
    inline def setLocations(value: js.Array[GoogleActionsV2OrdersOrderLocation]): Self = StObject.set(x, "locations", value.asInstanceOf[js.Any])
    
    inline def setLocationsUndefined: Self = StObject.set(x, "locations", js.undefined)
    
    inline def setLocationsVarargs(value: GoogleActionsV2OrdersOrderLocation*): Self = StObject.set(x, "locations", js.Array(value*))
    
    inline def setTime(value: GoogleActionsV2OrdersTime): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
    
    inline def setTimeUndefined: Self = StObject.set(x, "time", js.undefined)
  }
}
