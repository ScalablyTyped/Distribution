package typings.awsSdk.clientsRekognitionMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DetectLabelsImageQuality extends StObject {
  
  /**
    * The brightness of an image provided for label detection.
    */
  var Brightness: js.UndefOr[Float] = js.undefined
  
  /**
    * The contrast of an image provided for label detection.
    */
  var Contrast: js.UndefOr[Float] = js.undefined
  
  /**
    * The sharpness of an image provided for label detection.
    */
  var Sharpness: js.UndefOr[Float] = js.undefined
}
object DetectLabelsImageQuality {
  
  inline def apply(): DetectLabelsImageQuality = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DetectLabelsImageQuality]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DetectLabelsImageQuality] (val x: Self) extends AnyVal {
    
    inline def setBrightness(value: Float): Self = StObject.set(x, "Brightness", value.asInstanceOf[js.Any])
    
    inline def setBrightnessUndefined: Self = StObject.set(x, "Brightness", js.undefined)
    
    inline def setContrast(value: Float): Self = StObject.set(x, "Contrast", value.asInstanceOf[js.Any])
    
    inline def setContrastUndefined: Self = StObject.set(x, "Contrast", js.undefined)
    
    inline def setSharpness(value: Float): Self = StObject.set(x, "Sharpness", value.asInstanceOf[js.Any])
    
    inline def setSharpnessUndefined: Self = StObject.set(x, "Sharpness", js.undefined)
  }
}
