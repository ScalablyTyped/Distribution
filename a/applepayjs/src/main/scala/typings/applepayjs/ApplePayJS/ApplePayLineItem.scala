package typings.applepayjs.ApplePayJS

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Defines a line item in a payment request - for example, total, tax, discount, or grand total.
  */
trait ApplePayLineItem extends StObject {
  
  /**
    * The line item's amount.
    */
  var amount: String
  
  /**
    * A short, localized description of the line item.
    */
  var label: String
  
  /**
    * A value that indicates if the line item is final or pending.
    */
  var `type`: js.UndefOr[ApplePayLineItemType] = js.undefined
}
object ApplePayLineItem {
  
  inline def apply(amount: String, label: String): ApplePayLineItem = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplePayLineItem]
  }
  
  extension [Self <: ApplePayLineItem](x: Self) {
    
    inline def setAmount(value: String): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setType(value: ApplePayLineItemType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
