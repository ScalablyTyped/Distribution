package typings.actionsOnGoogle.distServiceActionssdkApiV2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleActionsV2DeliveryAddressValue extends StObject {
  
  /**
    * Contains delivery address only when user agrees to share the delivery
    * address.
    */
  var location: js.UndefOr[GoogleActionsV2Location] = js.undefined
  
  /**
    * User's decision regarding the request.
    */
  var userDecision: js.UndefOr[GoogleActionsV2DeliveryAddressValueUserDecision] = js.undefined
}
object GoogleActionsV2DeliveryAddressValue {
  
  inline def apply(): GoogleActionsV2DeliveryAddressValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleActionsV2DeliveryAddressValue]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GoogleActionsV2DeliveryAddressValue] (val x: Self) extends AnyVal {
    
    inline def setLocation(value: GoogleActionsV2Location): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    inline def setUserDecision(value: GoogleActionsV2DeliveryAddressValueUserDecision): Self = StObject.set(x, "userDecision", value.asInstanceOf[js.Any])
    
    inline def setUserDecisionUndefined: Self = StObject.set(x, "userDecision", js.undefined)
  }
}
