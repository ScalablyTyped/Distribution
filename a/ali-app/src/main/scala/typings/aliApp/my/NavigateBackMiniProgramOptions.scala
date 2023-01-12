package typings.aliApp.my

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NavigateBackMiniProgramOptions
  extends StObject
     with BaseOptions[Any, Any] {
  
  /**
    * 需要传递给目标小程序的数据，目标小程序可在 App.onLaunch()，App.onShow() 中获取到这份数据
    */
  var extraData: js.UndefOr[Any] = js.undefined
}
object NavigateBackMiniProgramOptions {
  
  inline def apply(): NavigateBackMiniProgramOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NavigateBackMiniProgramOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NavigateBackMiniProgramOptions] (val x: Self) extends AnyVal {
    
    inline def setExtraData(value: Any): Self = StObject.set(x, "extraData", value.asInstanceOf[js.Any])
    
    inline def setExtraDataUndefined: Self = StObject.set(x, "extraData", js.undefined)
  }
}
