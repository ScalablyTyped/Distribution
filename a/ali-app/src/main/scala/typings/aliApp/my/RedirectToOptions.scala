package typings.aliApp.my

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RedirectToOptions
  extends StObject
     with BaseOptions[Any, Any] {
  
  /** 需要跳转的应用内页面的路径 */
  var url: String
}
object RedirectToOptions {
  
  inline def apply(url: String): RedirectToOptions = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[RedirectToOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RedirectToOptions] (val x: Self) extends AnyVal {
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
