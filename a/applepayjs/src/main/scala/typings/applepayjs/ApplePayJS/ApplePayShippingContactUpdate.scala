package typings.applepayjs.ApplePayJS

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Updated transaction details resulting from a change in shipping contact, including any errors.
  */
@js.native
trait ApplePayShippingContactUpdate extends js.Object {
  /**
    * List of custom errors to display on the payment sheet.
    */
  var errors: js.UndefOr[js.Array[ApplePayError]] = js.native
  /**
    * An optional list of updated line items.
    */
  var newLineItems: js.UndefOr[js.Array[ApplePayLineItem]] = js.native
  /**
    * A list of shipping methods that are available to the updated shipping contact.
    */
  var newShippingMethods: js.UndefOr[js.Array[ApplePayShippingMethod]] = js.native
  /**
    * The new total resulting from a change in the shipping contact.
    */
  var newTotal: ApplePayLineItem = js.native
}

object ApplePayShippingContactUpdate {
  @scala.inline
  def apply(newTotal: ApplePayLineItem): ApplePayShippingContactUpdate = {
    val __obj = js.Dynamic.literal(newTotal = newTotal.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplePayShippingContactUpdate]
  }
  @scala.inline
  implicit class ApplePayShippingContactUpdateOps[Self <: ApplePayShippingContactUpdate] (val x: Self) extends AnyVal {
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
    def setNewTotal(value: ApplePayLineItem): Self = this.set("newTotal", value.asInstanceOf[js.Any])
    @scala.inline
    def setErrorsVarargs(value: ApplePayError*): Self = this.set("errors", js.Array(value :_*))
    @scala.inline
    def setErrors(value: js.Array[ApplePayError]): Self = this.set("errors", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteErrors: Self = this.set("errors", js.undefined)
    @scala.inline
    def setNewLineItemsVarargs(value: ApplePayLineItem*): Self = this.set("newLineItems", js.Array(value :_*))
    @scala.inline
    def setNewLineItems(value: js.Array[ApplePayLineItem]): Self = this.set("newLineItems", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNewLineItems: Self = this.set("newLineItems", js.undefined)
    @scala.inline
    def setNewShippingMethodsVarargs(value: ApplePayShippingMethod*): Self = this.set("newShippingMethods", js.Array(value :_*))
    @scala.inline
    def setNewShippingMethods(value: js.Array[ApplePayShippingMethod]): Self = this.set("newShippingMethods", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNewShippingMethods: Self = this.set("newShippingMethods", js.undefined)
  }
  
}

