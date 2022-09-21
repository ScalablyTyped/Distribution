package typings.actionsOnGoogle.v2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleActionsV2OrdersCustomerInfoOptions extends StObject {
  
  /**
    * List of customer info properties.
    */
  var customerInfoProperties: js.UndefOr[js.Array[GoogleActionsV2OrdersCustomerInfoOptionsCustomerInfoProperties]] = js.undefined
}
object GoogleActionsV2OrdersCustomerInfoOptions {
  
  inline def apply(): GoogleActionsV2OrdersCustomerInfoOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleActionsV2OrdersCustomerInfoOptions]
  }
  
  extension [Self <: GoogleActionsV2OrdersCustomerInfoOptions](x: Self) {
    
    inline def setCustomerInfoProperties(value: js.Array[GoogleActionsV2OrdersCustomerInfoOptionsCustomerInfoProperties]): Self = StObject.set(x, "customerInfoProperties", value.asInstanceOf[js.Any])
    
    inline def setCustomerInfoPropertiesUndefined: Self = StObject.set(x, "customerInfoProperties", js.undefined)
    
    inline def setCustomerInfoPropertiesVarargs(value: GoogleActionsV2OrdersCustomerInfoOptionsCustomerInfoProperties*): Self = StObject.set(x, "customerInfoProperties", js.Array(value*))
  }
}
