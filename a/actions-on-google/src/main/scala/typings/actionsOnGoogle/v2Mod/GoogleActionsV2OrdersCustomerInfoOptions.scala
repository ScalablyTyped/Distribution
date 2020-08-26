package typings.actionsOnGoogle.v2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GoogleActionsV2OrdersCustomerInfoOptions extends js.Object {
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
  implicit class GoogleActionsV2OrdersCustomerInfoOptionsOps[Self <: GoogleActionsV2OrdersCustomerInfoOptions] (val x: Self) extends AnyVal {
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
    def setCustomerInfoPropertiesVarargs(value: GoogleActionsV2OrdersCustomerInfoOptionsCustomerInfoProperties*): Self = this.set("customerInfoProperties", js.Array(value :_*))
    @scala.inline
    def setCustomerInfoProperties(value: js.Array[GoogleActionsV2OrdersCustomerInfoOptionsCustomerInfoProperties]): Self = this.set("customerInfoProperties", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCustomerInfoProperties: Self = this.set("customerInfoProperties", js.undefined)
  }
  
}

