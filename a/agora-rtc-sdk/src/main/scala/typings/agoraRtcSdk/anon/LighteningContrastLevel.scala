package typings.agoraRtcSdk.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LighteningContrastLevel extends StObject {
  
  /** The contrast level, used with the `lighteningLevel` parameter.
    *
    * - 0: Low contrast level.
    * - 1: (Default) The original contrast level.
    * - 2: High contrast level.
    */
  var lighteningContrastLevel: js.UndefOr[Double] = js.undefined
  
  /** The brightness level.
    *
    * The value ranges from 0.0 (original) to 1.0. The default value is 0.7.
    */
  var lighteningLevel: js.UndefOr[Double] = js.undefined
  
  /** The redness level.
    *
    * The value ranges from 0.0 (original) to 1.0. The default value is 0.1. This parameter adjusts the red saturation level.
    */
  var rednessLevel: js.UndefOr[Double] = js.undefined
  
  /** The sharpness level.
    *
    * The value ranges from 0.0 (original) to 1.0. The default value is 0.5. This parameter is usually used to remove blemishes.
    */
  var smoothnessLevel: js.UndefOr[Double] = js.undefined
}
object LighteningContrastLevel {
  
  inline def apply(): LighteningContrastLevel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LighteningContrastLevel]
  }
  
  extension [Self <: LighteningContrastLevel](x: Self) {
    
    inline def setLighteningContrastLevel(value: Double): Self = StObject.set(x, "lighteningContrastLevel", value.asInstanceOf[js.Any])
    
    inline def setLighteningContrastLevelUndefined: Self = StObject.set(x, "lighteningContrastLevel", js.undefined)
    
    inline def setLighteningLevel(value: Double): Self = StObject.set(x, "lighteningLevel", value.asInstanceOf[js.Any])
    
    inline def setLighteningLevelUndefined: Self = StObject.set(x, "lighteningLevel", js.undefined)
    
    inline def setRednessLevel(value: Double): Self = StObject.set(x, "rednessLevel", value.asInstanceOf[js.Any])
    
    inline def setRednessLevelUndefined: Self = StObject.set(x, "rednessLevel", js.undefined)
    
    inline def setSmoothnessLevel(value: Double): Self = StObject.set(x, "smoothnessLevel", value.asInstanceOf[js.Any])
    
    inline def setSmoothnessLevelUndefined: Self = StObject.set(x, "smoothnessLevel", js.undefined)
  }
}
