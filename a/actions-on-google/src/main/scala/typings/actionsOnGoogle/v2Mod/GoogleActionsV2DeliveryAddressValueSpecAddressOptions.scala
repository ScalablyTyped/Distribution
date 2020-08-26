package typings.actionsOnGoogle.v2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GoogleActionsV2DeliveryAddressValueSpecAddressOptions extends js.Object {
  /**
    * App can optionally pass a short text giving user a hint why delivery
    * address is requested. For example, \"Grubhub is asking your address for
    * [determining the service area].\", the text in `[]` is the custom TTS
    * that should be populated here.
    */
  var reason: js.UndefOr[String] = js.native
}

object GoogleActionsV2DeliveryAddressValueSpecAddressOptions {
  @scala.inline
  def apply(): GoogleActionsV2DeliveryAddressValueSpecAddressOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleActionsV2DeliveryAddressValueSpecAddressOptions]
  }
  @scala.inline
  implicit class GoogleActionsV2DeliveryAddressValueSpecAddressOptionsOps[Self <: GoogleActionsV2DeliveryAddressValueSpecAddressOptions] (val x: Self) extends AnyVal {
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
    def setReason(value: String): Self = this.set("reason", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReason: Self = this.set("reason", js.undefined)
  }
  
}

