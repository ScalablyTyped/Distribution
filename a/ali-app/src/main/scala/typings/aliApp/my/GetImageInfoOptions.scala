package typings.aliApp.my

import typings.aliApp.anon.Height
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetImageInfoOptions
  extends BaseOptions[js.Any, js.Any] {
  
  /**
    * 图片路径，目前支持：
    * - 网络图片路径
    * - apFilePath路径
    * - 相对路径
    */
  var src: String = js.native
  
  @JSName("success")
  var success_GetImageInfoOptions: js.UndefOr[js.Function1[/* res */ Height, Unit]] = js.native
}
object GetImageInfoOptions {
  
  @scala.inline
  def apply(src: String): GetImageInfoOptions = {
    val __obj = js.Dynamic.literal(src = src.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetImageInfoOptions]
  }
  
  @scala.inline
  implicit class GetImageInfoOptionsMutableBuilder[Self <: GetImageInfoOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSrc(value: String): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuccess(value: /* res */ Height => Unit): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
  }
}
