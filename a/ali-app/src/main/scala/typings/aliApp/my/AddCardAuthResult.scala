package typings.aliApp.my

import typings.aliApp.anon.Appid
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

//#endregion
//#region 会员开卡授权 https://docs.alipay.com/mini/api/add-card-auth
trait AddCardAuthResult extends StObject {
  
  // false 表示领卡失败
  /**
    * 失败的错误码
    * 领卡失败 code 说明
    * 名称 | 类型 | 说明
    * -----|-----|-----
    * JSAPI_SERVICE_TERMINATED | String | 用户取消
    * JSAPI_PARAM_INVALID | String | url 为空或非法参数
    * JSAPI_SYSTEM_ERROR | String | 系统错误
    */
  var code: String
  
  // 9000 表示成功
  var result: Appid
  
  // true 表示领卡成功
  var resultStatus: String
  
  var success: Boolean
}
object AddCardAuthResult {
  
  inline def apply(code: String, result: Appid, resultStatus: String, success: Boolean): AddCardAuthResult = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any], resultStatus = resultStatus.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddCardAuthResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AddCardAuthResult] (val x: Self) extends AnyVal {
    
    inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setResult(value: Appid): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
    
    inline def setResultStatus(value: String): Self = StObject.set(x, "resultStatus", value.asInstanceOf[js.Any])
    
    inline def setSuccess(value: Boolean): Self = StObject.set(x, "success", value.asInstanceOf[js.Any])
  }
}
