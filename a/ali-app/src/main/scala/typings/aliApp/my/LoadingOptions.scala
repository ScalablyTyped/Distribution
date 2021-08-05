package typings.aliApp.my

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LoadingOptions
  extends StObject
     with BaseOptions[js.Any, js.Any] {
  
  /**
    * loading的文字内容
    */
  var content: js.UndefOr[String] = js.undefined
  
  /**
    * 延迟显示，单位 ms，默认 0。如果在此时间之前调用了 my.hideLoading 则不会显示
    */
  var delay: js.UndefOr[Double] = js.undefined
}
object LoadingOptions {
  
  inline def apply(): LoadingOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LoadingOptions]
  }
  
  extension [Self <: LoadingOptions](x: Self) {
    
    inline def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
    
    inline def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
    
    inline def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
  }
}
