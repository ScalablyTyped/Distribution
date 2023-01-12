package typings.aliApp.my

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

//#endregion
//#region 支付代扣签约 https://docs.alipay.com/mini/api/pay-sign
trait PaySignCenterOptions
  extends StObject
     with BaseOptions[Any, Any] {
  
  var signStr: String
}
object PaySignCenterOptions {
  
  inline def apply(signStr: String): PaySignCenterOptions = {
    val __obj = js.Dynamic.literal(signStr = signStr.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaySignCenterOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PaySignCenterOptions] (val x: Self) extends AnyVal {
    
    inline def setSignStr(value: String): Self = StObject.set(x, "signStr", value.asInstanceOf[js.Any])
  }
}
