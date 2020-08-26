package typings.applepayjs.ApplePayJS

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Defines a shipping method for delivering physical goods.
  */
@js.native
trait ApplePayShippingMethod extends js.Object {
  /**
    * The amount associated with this shipping method.
    */
  var amount: String = js.native
  /**
    * A further description of the shipping method.
    */
  var detail: js.UndefOr[String] = js.native
  /**
    * A client-defined identifier.
    */
  var identifier: js.UndefOr[String] = js.native
  /**
    * A short description of the shipping method.
    */
  var label: String = js.native
}

object ApplePayShippingMethod {
  @scala.inline
  def apply(amount: String, label: String): ApplePayShippingMethod = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplePayShippingMethod]
  }
  @scala.inline
  implicit class ApplePayShippingMethodOps[Self <: ApplePayShippingMethod] (val x: Self) extends AnyVal {
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
    def setDetail(value: String): Self = this.set("detail", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDetail: Self = this.set("detail", js.undefined)
    @scala.inline
    def setIdentifier(value: String): Self = this.set("identifier", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIdentifier: Self = this.set("identifier", js.undefined)
  }
  
}

