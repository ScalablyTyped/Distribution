package typings.applepayjs.ApplePayJS

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Defines a shipping method for delivering physical goods.
  */
@js.native
trait ApplePayShippingMethod extends StObject {
  
  /**
    * The amount associated with this shipping method.
    */
  var amount: String = js.native
  
  /**
    * A further description of the shipping method.
    */
  var detail: String = js.native
  
  /**
    * A client-defined identifier.
    */
  var identifier: String = js.native
  
  /**
    * A short description of the shipping method.
    */
  var label: String = js.native
}
object ApplePayShippingMethod {
  
  @scala.inline
  def apply(amount: String, detail: String, identifier: String, label: String): ApplePayShippingMethod = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], detail = detail.asInstanceOf[js.Any], identifier = identifier.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplePayShippingMethod]
  }
  
  @scala.inline
  implicit class ApplePayShippingMethodMutableBuilder[Self <: ApplePayShippingMethod] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAmount(value: String): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDetail(value: String): Self = StObject.set(x, "detail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdentifier(value: String): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
