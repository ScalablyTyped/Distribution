package typings.aliApp.my

import typings.aliApp.anon.ErrMsg
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SaveImageOptions
  extends StObject
     with BaseOptions[js.Any, js.Any] {
  
  @JSName("success")
  var success_SaveImageOptions: js.UndefOr[js.Function1[/* res */ ErrMsg, Unit]] = js.undefined
  
  /**
    * 要保存的图片链接
    */
  var url: String
}
object SaveImageOptions {
  
  @scala.inline
  def apply(url: String): SaveImageOptions = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[SaveImageOptions]
  }
  
  @scala.inline
  implicit class SaveImageOptionsMutableBuilder[Self <: SaveImageOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSuccess(value: /* res */ ErrMsg => Unit): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
