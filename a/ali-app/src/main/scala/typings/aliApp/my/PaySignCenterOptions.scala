package typings.aliApp.my

import org.scalablytyped.runtime.StObject
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
  implicit class PaySignCenterOptionsMutableBuilder[Self <: PaySignCenterOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSignStr(value: String): Self = StObject.set(x, "signStr", value.asInstanceOf[js.Any])
  }
}
