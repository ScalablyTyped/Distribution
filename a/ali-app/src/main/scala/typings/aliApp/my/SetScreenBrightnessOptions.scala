package typings.aliApp.my

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SetScreenBrightnessOptions
  extends StObject
     with BaseOptions[Any, Any] {
  
  /** 需要设置的屏幕亮度，取值范围0-1 */
  var brightness: Double
}
object SetScreenBrightnessOptions {
  
  inline def apply(brightness: Double): SetScreenBrightnessOptions = {
    val __obj = js.Dynamic.literal(brightness = brightness.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetScreenBrightnessOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SetScreenBrightnessOptions] (val x: Self) extends AnyVal {
    
    inline def setBrightness(value: Double): Self = StObject.set(x, "brightness", value.asInstanceOf[js.Any])
  }
}
