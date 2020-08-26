package typings.aliApp.my

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OpenTicketDetailOptions2
  extends BaseOptions[js.Any, js.Any] {
  var partnerId: String = js.native
      // 商户编号（如果传入了passId则不需要传入partnerId）
  var serialNumber: String = js.native
}

object OpenTicketDetailOptions2 {
  @scala.inline
  def apply(partnerId: String, serialNumber: String): OpenTicketDetailOptions2 = {
    val __obj = js.Dynamic.literal(partnerId = partnerId.asInstanceOf[js.Any], serialNumber = serialNumber.asInstanceOf[js.Any])
    __obj.asInstanceOf[OpenTicketDetailOptions2]
  }
  @scala.inline
  implicit class OpenTicketDetailOptions2Ops[Self <: OpenTicketDetailOptions2] (val x: Self) extends AnyVal {
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
    @scala.inline
    def setSerialNumber(value: String): Self = this.set("serialNumber", value.asInstanceOf[js.Any])
  }
  
}

