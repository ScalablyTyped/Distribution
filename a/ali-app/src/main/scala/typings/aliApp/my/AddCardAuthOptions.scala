package typings.aliApp.my

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AddCardAuthOptions
  extends StObject
     with BaseOptions[Any, Any] {
  
  @JSName("success")
  var success_AddCardAuthOptions: js.UndefOr[js.Function1[/* res */ AddCardAuthResult, Unit]] = js.undefined
  
  /**
    * 开卡授权的页面地址，从alipay.marketing.card.activateurl.apply接口获取
    */
  var url: String
}
object AddCardAuthOptions {
  
  inline def apply(url: String): AddCardAuthOptions = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddCardAuthOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AddCardAuthOptions] (val x: Self) extends AnyVal {
    
    inline def setSuccess(value: /* res */ AddCardAuthResult => Unit): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
    
    inline def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
