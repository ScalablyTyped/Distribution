package typings.aliApp.my

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

//#endregion
//#region 支付代扣签约 https://docs.alipay.com/mini/api/pay-sign
@js.native
trait PaySignCenterOptions
  extends BaseOptions[js.Any, js.Any] {
  
  var signStr: String = js.native
}
object PaySignCenterOptions {
  
  @scala.inline
  def apply(signStr: String): PaySignCenterOptions = {
    val __obj = js.Dynamic.literal(signStr = signStr.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaySignCenterOptions]
  }
  
  @scala.inline
  implicit class PaySignCenterOptionsOps[Self <: PaySignCenterOptions] (val x: Self) extends AnyVal {
    
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
    def setSignStr(value: String): Self = this.set("signStr", value.asInstanceOf[js.Any])
  }
}
