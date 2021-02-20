package typings.aliApp.my

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SetScreenBrightnessOptions
  extends BaseOptions[js.Any, js.Any] {
  
  /** 需要设置的屏幕亮度，取值范围0-1 */
  var brightness: Double = js.native
}
object SetScreenBrightnessOptions {
  
  @scala.inline
  def apply(brightness: Double): SetScreenBrightnessOptions = {
    val __obj = js.Dynamic.literal(brightness = brightness.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetScreenBrightnessOptions]
  }
  
  @scala.inline
  implicit class SetScreenBrightnessOptionsMutableBuilder[Self <: SetScreenBrightnessOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBrightness(value: Double): Self = StObject.set(x, "brightness", value.asInstanceOf[js.Any])
  }
}
