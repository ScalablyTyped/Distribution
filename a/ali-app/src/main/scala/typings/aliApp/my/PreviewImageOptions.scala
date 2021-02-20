package typings.aliApp.my

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PreviewImageOptions
  extends BaseOptions[js.Any, js.Any] {
  
  /** 当当前显示图片索引，默认 0 */
  var current: js.UndefOr[Double] = js.native
  
  /** 要预览的图片链接列表 */
  var urls: js.Array[String] = js.native
}
object PreviewImageOptions {
  
  @scala.inline
  def apply(urls: js.Array[String]): PreviewImageOptions = {
    val __obj = js.Dynamic.literal(urls = urls.asInstanceOf[js.Any])
    __obj.asInstanceOf[PreviewImageOptions]
  }
  
  @scala.inline
  implicit class PreviewImageOptionsMutableBuilder[Self <: PreviewImageOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCurrent(value: Double): Self = StObject.set(x, "current", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentUndefined: Self = StObject.set(x, "current", js.undefined)
    
    @scala.inline
    def setUrls(value: js.Array[String]): Self = StObject.set(x, "urls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlsVarargs(value: String*): Self = StObject.set(x, "urls", js.Array(value :_*))
  }
}
