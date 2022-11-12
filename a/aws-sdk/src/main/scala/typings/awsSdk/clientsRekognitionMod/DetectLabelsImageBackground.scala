package typings.awsSdk.clientsRekognitionMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DetectLabelsImageBackground extends StObject {
  
  /**
    * The dominant colors found in the background of an image, defined with RGB values, CSS color name, simplified color name, and PixelPercentage (the percentage of image pixels that have a particular color).
    */
  var DominantColors: js.UndefOr[typings.awsSdk.clientsRekognitionMod.DominantColors] = js.undefined
  
  /**
    * The quality of the image background as defined by brightness and sharpness.
    */
  var Quality: js.UndefOr[DetectLabelsImageQuality] = js.undefined
}
object DetectLabelsImageBackground {
  
  inline def apply(): DetectLabelsImageBackground = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DetectLabelsImageBackground]
  }
  
  extension [Self <: DetectLabelsImageBackground](x: Self) {
    
    inline def setDominantColors(value: DominantColors): Self = StObject.set(x, "DominantColors", value.asInstanceOf[js.Any])
    
    inline def setDominantColorsUndefined: Self = StObject.set(x, "DominantColors", js.undefined)
    
    inline def setDominantColorsVarargs(value: DominantColor*): Self = StObject.set(x, "DominantColors", js.Array(value*))
    
    inline def setQuality(value: DetectLabelsImageQuality): Self = StObject.set(x, "Quality", value.asInstanceOf[js.Any])
    
    inline def setQualityUndefined: Self = StObject.set(x, "Quality", js.undefined)
  }
}
