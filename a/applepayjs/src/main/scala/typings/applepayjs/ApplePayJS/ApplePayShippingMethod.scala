package typings.applepayjs.ApplePayJS

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Defines a shipping method for delivering physical goods.
  */
trait ApplePayShippingMethod extends StObject {
  
  /**
    * The amount associated with this shipping method.
    */
  var amount: String
  
  /**
    * A dictionary that specifies the start and end dates for a range of time.
    */
  var dateComponentsRange: js.UndefOr[ApplePayDateComponentsRange] = js.undefined
  
  /**
    * A further description of the shipping method.
    */
  var detail: String
  
  /**
    * A client-defined identifier.
    */
  var identifier: String
  
  /**
    * A short description of the shipping method.
    */
  var label: String
}
object ApplePayShippingMethod {
  
  inline def apply(amount: String, detail: String, identifier: String, label: String): ApplePayShippingMethod = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], detail = detail.asInstanceOf[js.Any], identifier = identifier.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplePayShippingMethod]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ApplePayShippingMethod] (val x: Self) extends AnyVal {
    
    inline def setAmount(value: String): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
    
    inline def setDateComponentsRange(value: ApplePayDateComponentsRange): Self = StObject.set(x, "dateComponentsRange", value.asInstanceOf[js.Any])
    
    inline def setDateComponentsRangeUndefined: Self = StObject.set(x, "dateComponentsRange", js.undefined)
    
    inline def setDetail(value: String): Self = StObject.set(x, "detail", value.asInstanceOf[js.Any])
    
    inline def setIdentifier(value: String): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
