package typings.aliApp.my

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HideLoadingOptions extends StObject {
  
  /**
    * 体指当前page实例，某些场景下，需要指明在哪个page执行hideLoading。
    */
  var page: js.Any = js.native
}
object HideLoadingOptions {
  
  @scala.inline
  def apply(page: js.Any): HideLoadingOptions = {
    val __obj = js.Dynamic.literal(page = page.asInstanceOf[js.Any])
    __obj.asInstanceOf[HideLoadingOptions]
  }
  
  @scala.inline
  implicit class HideLoadingOptionsMutableBuilder[Self <: HideLoadingOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPage(value: js.Any): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
  }
}
