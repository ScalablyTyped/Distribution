package typings.aliApp.my

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OpenMerchantVoucherListOptions
  extends BaseOptions[js.Any, js.Any] {
  var partnerId: String = js.native
}

object OpenMerchantVoucherListOptions {
  @scala.inline
  def apply(partnerId: String): OpenMerchantVoucherListOptions = {
    val __obj = js.Dynamic.literal(partnerId = partnerId.asInstanceOf[js.Any])
    __obj.asInstanceOf[OpenMerchantVoucherListOptions]
  }
  @scala.inline
  implicit class OpenMerchantVoucherListOptionsOps[Self <: OpenMerchantVoucherListOptions] (val x: Self) extends AnyVal {
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
    def setPartnerId(value: String): Self = this.set("partnerId", value.asInstanceOf[js.Any])
  }
  
}

