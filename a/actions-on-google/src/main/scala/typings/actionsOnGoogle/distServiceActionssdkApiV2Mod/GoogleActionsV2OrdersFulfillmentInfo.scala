package typings.actionsOnGoogle.distServiceActionssdkApiV2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleActionsV2OrdersFulfillmentInfo extends StObject {
  
  /**
    * When the order will be fulfilled.
    */
  var deliveryTime: js.UndefOr[String] = js.undefined
}
object GoogleActionsV2OrdersFulfillmentInfo {
  
  inline def apply(): GoogleActionsV2OrdersFulfillmentInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleActionsV2OrdersFulfillmentInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GoogleActionsV2OrdersFulfillmentInfo] (val x: Self) extends AnyVal {
    
    inline def setDeliveryTime(value: String): Self = StObject.set(x, "deliveryTime", value.asInstanceOf[js.Any])
    
    inline def setDeliveryTimeUndefined: Self = StObject.set(x, "deliveryTime", js.undefined)
  }
}
