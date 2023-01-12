package typings.alipayjssdk.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResultCode extends StObject {
  
  /**
    * 支付结果状态码，详见下表
    *
    * | resultCode | 说明 |
    * | - | - |
    * | 9000 | 订单支付成功 |
    * | 8000 | 正在处理中 |
    * | 4000 | 订单支付失败 |
    * | 6001 | 用户中途取消 |
    * | 6002 | 网络连接出错 |
    * | 99 | 用户点击忘记密码导致快捷界面退出(only iOS) |
    */
  var resultCode: String
}
object ResultCode {
  
  inline def apply(resultCode: String): ResultCode = {
    val __obj = js.Dynamic.literal(resultCode = resultCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResultCode]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ResultCode] (val x: Self) extends AnyVal {
    
    inline def setResultCode(value: String): Self = StObject.set(x, "resultCode", value.asInstanceOf[js.Any])
  }
}
