package typings.applepayjs.ApplePayJS

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Defines a line item in a payment request - for example, total, tax, discount, or grand total.
  */
@js.native
trait ApplePayLineItem extends js.Object {
  
  /**
    * The line item's amount.
    */
  var amount: String = js.native
  
  /**
    * A short, localized description of the line item.
    */
  var label: String = js.native
  
  /**
    * A value that indicates if the line item is final or pending.
    */
  var `type`: js.UndefOr[ApplePayLineItemType] = js.native
}
object ApplePayLineItem {
  
  @scala.inline
  def apply(amount: String, label: String): ApplePayLineItem = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplePayLineItem]
  }
  
  @scala.inline
  implicit class ApplePayLineItemOps[Self <: ApplePayLineItem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAmount(value: String): Self = this.set("amount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: String): Self = this.set("label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: ApplePayLineItemType): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}
