package typings.aliApp.my

import typings.aliApp.anon.Text
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

//#region 数据安全 https://docs.alipay.com/mini/api/data-safe
trait RsaOptions
  extends StObject
     with BaseOptions[Any, Any] {
  
  /**
    * 使用rsa加密还是rsa解密，encrypt加密，decrypt解密
    */
  var action: String
  
  /**
    * rsa秘钥，加密使用公钥，解密使用私钥
    */
  var key: String
  
  @JSName("success")
  var success_RsaOptions: js.UndefOr[js.Function1[/* res */ Text, Unit]] = js.undefined
  
  /**
    * 要处理的文本，加密为原始文本，解密为Base64编码格式文本
    */
  var text: String
}
object RsaOptions {
  
  inline def apply(action: String, key: String, text: String): RsaOptions = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[RsaOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RsaOptions] (val x: Self) extends AnyVal {
    
    inline def setAction(value: String): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setSuccess(value: /* res */ Text => Unit): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
    
    inline def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
  }
}
