package typings.agoraRtcSdk.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LighteningContrastLevel extends StObject {
  
  /** The contrast level, used with the `lighteningLevel` parameter.
    *
    * - 0: Low contrast level.
    * - 1: (Default) The original contrast level.
    * - 2: High contrast level.
    */
  var lighteningContrastLevel: js.UndefOr[Double] = js.native
  
  /** The brightness level.
    *
    * The value ranges from 0.0 (original) to 1.0. The default value is 0.7.
    */
  var lighteningLevel: js.UndefOr[Double] = js.native
  
  /** The redness level.
    *
    * The value ranges from 0.0 (original) to 1.0. The default value is 0.1. This parameter adjusts the red saturation level.
    */
  var rednessLevel: js.UndefOr[Double] = js.native
  
  /** The sharpness level.
    *
    * The value ranges from 0.0 (original) to 1.0. The default value is 0.5. This parameter is usually used to remove blemishes.
    */
  var smoothnessLevel: js.UndefOr[Double] = js.native
}
object LighteningContrastLevel {
  
  @scala.inline
  def apply(): LighteningContrastLevel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LighteningContrastLevel]
  }
  
  @scala.inline
  implicit class LighteningContrastLevelMutableBuilder[Self <: LighteningContrastLevel] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLighteningContrastLevel(value: Double): Self = StObject.set(x, "lighteningContrastLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLighteningContrastLevelUndefined: Self = StObject.set(x, "lighteningContrastLevel", js.undefined)
    
    @scala.inline
    def setLighteningLevel(value: Double): Self = StObject.set(x, "lighteningLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLighteningLevelUndefined: Self = StObject.set(x, "lighteningLevel", js.undefined)
    
    @scala.inline
    def setRednessLevel(value: Double): Self = StObject.set(x, "rednessLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRednessLevelUndefined: Self = StObject.set(x, "rednessLevel", js.undefined)
    
    @scala.inline
    def setSmoothnessLevel(value: Double): Self = StObject.set(x, "smoothnessLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSmoothnessLevelUndefined: Self = StObject.set(x, "smoothnessLevel", js.undefined)
  }
}
