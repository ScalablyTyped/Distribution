package typings.awsSdk.clientsRekognitionMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DetectLabelsImageProperties extends StObject {
  
  /**
    * Information about the properties of an image’s background, including the background’s quality and dominant colors, including the quality and dominant colors of the image.
    */
  var Background: js.UndefOr[DetectLabelsImageBackground] = js.undefined
  
  /**
    * Information about the dominant colors found in an image, described with RGB values, CSS color name, simplified color name, and PixelPercentage (the percentage of image pixels that have a particular color).
    */
  var DominantColors: js.UndefOr[typings.awsSdk.clientsRekognitionMod.DominantColors] = js.undefined
  
  /**
    * Information about the properties of an image’s foreground, including the foreground’s quality and dominant colors, including the quality and dominant colors of the image.
    */
  var Foreground: js.UndefOr[DetectLabelsImageForeground] = js.undefined
  
  /**
    * Information about the quality of the image foreground as defined by brightness, sharpness, and contrast. The higher the value the greater the brightness, sharpness, and contrast respectively.
    */
  var Quality: js.UndefOr[DetectLabelsImageQuality] = js.undefined
}
object DetectLabelsImageProperties {
  
  inline def apply(): DetectLabelsImageProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DetectLabelsImageProperties]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DetectLabelsImageProperties] (val x: Self) extends AnyVal {
    
    inline def setBackground(value: DetectLabelsImageBackground): Self = StObject.set(x, "Background", value.asInstanceOf[js.Any])
    
    inline def setBackgroundUndefined: Self = StObject.set(x, "Background", js.undefined)
    
    inline def setDominantColors(value: DominantColors): Self = StObject.set(x, "DominantColors", value.asInstanceOf[js.Any])
    
    inline def setDominantColorsUndefined: Self = StObject.set(x, "DominantColors", js.undefined)
    
    inline def setDominantColorsVarargs(value: DominantColor*): Self = StObject.set(x, "DominantColors", js.Array(value*))
    
    inline def setForeground(value: DetectLabelsImageForeground): Self = StObject.set(x, "Foreground", value.asInstanceOf[js.Any])
    
    inline def setForegroundUndefined: Self = StObject.set(x, "Foreground", js.undefined)
    
    inline def setQuality(value: DetectLabelsImageQuality): Self = StObject.set(x, "Quality", value.asInstanceOf[js.Any])
    
    inline def setQualityUndefined: Self = StObject.set(x, "Quality", js.undefined)
  }
}
