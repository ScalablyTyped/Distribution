package typings.actionsOnGoogle.distServiceActionssdkApiV2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleActionsV2OrdersCustomerInfo extends StObject {
  
  /**
    * Customer email will be included and returned to the app if
    * CustomerInfoProperty.EMAIL specified in CustomerInfoOptions.
    */
  var email: js.UndefOr[String] = js.undefined
}
object GoogleActionsV2OrdersCustomerInfo {
  
  inline def apply(): GoogleActionsV2OrdersCustomerInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleActionsV2OrdersCustomerInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GoogleActionsV2OrdersCustomerInfo] (val x: Self) extends AnyVal {
    
    inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    inline def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
  }
}
