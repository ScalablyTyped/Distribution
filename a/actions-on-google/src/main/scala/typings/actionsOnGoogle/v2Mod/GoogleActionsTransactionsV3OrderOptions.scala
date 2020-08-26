package typings.actionsOnGoogle.v2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GoogleActionsTransactionsV3OrderOptions extends js.Object {
  /**
    * If true, delivery address is required for the associated order.
    */
  var requestDeliveryAddress: js.UndefOr[Boolean] = js.native
  /**
    * The app can request user info by setting this field.
    * If set, the corresponding field will show up in ProposedOrderCard for
    * user's confirmation.
    */
  var userInfoOptions: js.UndefOr[GoogleActionsTransactionsV3UserInfoOptions] = js.native
}

object GoogleActionsTransactionsV3OrderOptions {
  @scala.inline
  def apply(): GoogleActionsTransactionsV3OrderOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleActionsTransactionsV3OrderOptions]
  }
  @scala.inline
  implicit class GoogleActionsTransactionsV3OrderOptionsOps[Self <: GoogleActionsTransactionsV3OrderOptions] (val x: Self) extends AnyVal {
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
    def setRequestDeliveryAddress(value: Boolean): Self = this.set("requestDeliveryAddress", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequestDeliveryAddress: Self = this.set("requestDeliveryAddress", js.undefined)
    @scala.inline
    def setUserInfoOptions(value: GoogleActionsTransactionsV3UserInfoOptions): Self = this.set("userInfoOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUserInfoOptions: Self = this.set("userInfoOptions", js.undefined)
  }
  
}

