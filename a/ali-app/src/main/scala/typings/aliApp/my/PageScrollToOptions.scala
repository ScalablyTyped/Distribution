package typings.aliApp.my

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

//#endregion
//#region 滚动 https://docs.alipay.com/mini/api/scroll
trait PageScrollToOptions extends StObject {
  
  var scrollTop: Double
}
object PageScrollToOptions {
  
  @scala.inline
  def apply(scrollTop: Double): PageScrollToOptions = {
    val __obj = js.Dynamic.literal(scrollTop = scrollTop.asInstanceOf[js.Any])
    __obj.asInstanceOf[PageScrollToOptions]
  }
  
  @scala.inline
  implicit class PageScrollToOptionsMutableBuilder[Self <: PageScrollToOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setScrollTop(value: Double): Self = StObject.set(x, "scrollTop", value.asInstanceOf[js.Any])
  }
}
