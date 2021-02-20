package typings.actionsOnGoogle.v2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleActionsV2OrdersCustomerInfoOptions extends StObject {
  
  /**
    * List of customer info properties.
    */
  var customerInfoProperties: js.UndefOr[js.Array[GoogleActionsV2OrdersCustomerInfoOptionsCustomerInfoProperties]] = js.native
}
object GoogleActionsV2OrdersCustomerInfoOptions {
  
  @scala.inline
  def apply(): GoogleActionsV2OrdersCustomerInfoOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleActionsV2OrdersCustomerInfoOptions]
  }
  
  @scala.inline
  implicit class GoogleActionsV2OrdersCustomerInfoOptionsMutableBuilder[Self <: GoogleActionsV2OrdersCustomerInfoOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCustomerInfoProperties(value: js.Array[GoogleActionsV2OrdersCustomerInfoOptionsCustomerInfoProperties]): Self = StObject.set(x, "customerInfoProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomerInfoPropertiesUndefined: Self = StObject.set(x, "customerInfoProperties", js.undefined)
    
    @scala.inline
    def setCustomerInfoPropertiesVarargs(value: GoogleActionsV2OrdersCustomerInfoOptionsCustomerInfoProperties*): Self = StObject.set(x, "customerInfoProperties", js.Array(value :_*))
  }
}
