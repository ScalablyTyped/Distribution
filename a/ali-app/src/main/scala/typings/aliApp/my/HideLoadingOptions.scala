package typings.aliApp.my

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HideLoadingOptions extends StObject {
  
  /**
    * 体指当前page实例，某些场景下，需要指明在哪个page执行hideLoading。
    */
  var page: Any
}
object HideLoadingOptions {
  
  inline def apply(page: Any): HideLoadingOptions = {
    val __obj = js.Dynamic.literal(page = page.asInstanceOf[js.Any])
    __obj.asInstanceOf[HideLoadingOptions]
  }
  
  extension [Self <: HideLoadingOptions](x: Self) {
    
    inline def setPage(value: Any): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
  }
}
