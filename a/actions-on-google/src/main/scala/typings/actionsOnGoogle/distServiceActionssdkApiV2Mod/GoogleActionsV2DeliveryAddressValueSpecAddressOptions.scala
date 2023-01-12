package typings.actionsOnGoogle.distServiceActionssdkApiV2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleActionsV2DeliveryAddressValueSpecAddressOptions extends StObject {
  
  /**
    * App can optionally pass a short text giving user a hint why delivery
    * address is requested. For example, \"Grubhub is asking your address for
    * [determining the service area].\", the text in `[]` is the custom TTS
    * that should be populated here.
    */
  var reason: js.UndefOr[String] = js.undefined
}
object GoogleActionsV2DeliveryAddressValueSpecAddressOptions {
  
  inline def apply(): GoogleActionsV2DeliveryAddressValueSpecAddressOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleActionsV2DeliveryAddressValueSpecAddressOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GoogleActionsV2DeliveryAddressValueSpecAddressOptions] (val x: Self) extends AnyVal {
    
    inline def setReason(value: String): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    
    inline def setReasonUndefined: Self = StObject.set(x, "reason", js.undefined)
  }
}
