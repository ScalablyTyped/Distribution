package typings.aliApp.my

import typings.aliApp.anon.ErrMsg
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

//#endregion
//#region 屏幕亮度 https://docs.alipay.com/mini/api/screen-brightness
trait SetKeepScreenOnOptions
  extends StObject
     with BaseOptions[Any, Any] {
  
  /** 是否保持屏幕常亮 */
  var keepScreenOn: Boolean
  
  @JSName("success")
  var success_SetKeepScreenOnOptions: js.UndefOr[js.Function1[/* res */ ErrMsg, Unit]] = js.undefined
}
object SetKeepScreenOnOptions {
  
  inline def apply(keepScreenOn: Boolean): SetKeepScreenOnOptions = {
    val __obj = js.Dynamic.literal(keepScreenOn = keepScreenOn.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetKeepScreenOnOptions]
  }
  
  extension [Self <: SetKeepScreenOnOptions](x: Self) {
    
    inline def setKeepScreenOn(value: Boolean): Self = StObject.set(x, "keepScreenOn", value.asInstanceOf[js.Any])
    
    inline def setSuccess(value: /* res */ ErrMsg => Unit): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
    
    inline def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
  }
}
