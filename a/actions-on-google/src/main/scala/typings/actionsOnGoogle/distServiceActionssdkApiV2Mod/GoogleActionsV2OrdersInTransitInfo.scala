package typings.actionsOnGoogle.distServiceActionssdkApiV2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleActionsV2OrdersInTransitInfo extends StObject {
  
  /**
    * Last updated time for in transit.
    */
  var updatedTime: js.UndefOr[String] = js.undefined
}
object GoogleActionsV2OrdersInTransitInfo {
  
  inline def apply(): GoogleActionsV2OrdersInTransitInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleActionsV2OrdersInTransitInfo]
  }
  
  extension [Self <: GoogleActionsV2OrdersInTransitInfo](x: Self) {
    
    inline def setUpdatedTime(value: String): Self = StObject.set(x, "updatedTime", value.asInstanceOf[js.Any])
    
    inline def setUpdatedTimeUndefined: Self = StObject.set(x, "updatedTime", js.undefined)
  }
}
