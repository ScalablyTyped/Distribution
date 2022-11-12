package typings.awsSdk.clientsRekognitionMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DominantColor extends StObject {
  
  /**
    * The Blue RGB value for a dominant color.
    */
  var Blue: js.UndefOr[UInteger] = js.undefined
  
  /**
    * The CSS color name of a dominant color.
    */
  var CSSColor: js.UndefOr[String] = js.undefined
  
  /**
    * The Green RGB value for a dominant color.
    */
  var Green: js.UndefOr[UInteger] = js.undefined
  
  /**
    * The Hex code equivalent of the RGB values for a dominant color.
    */
  var HexCode: js.UndefOr[String] = js.undefined
  
  /**
    * The percentage of image pixels that have a given dominant color.
    */
  var PixelPercent: js.UndefOr[Percent] = js.undefined
  
  /**
    * The Red RGB value for a dominant color.
    */
  var Red: js.UndefOr[UInteger] = js.undefined
  
  /**
    * One of 12 simplified color names applied to a dominant color.
    */
  var SimplifiedColor: js.UndefOr[String] = js.undefined
}
object DominantColor {
  
  inline def apply(): DominantColor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DominantColor]
  }
  
  extension [Self <: DominantColor](x: Self) {
    
    inline def setBlue(value: UInteger): Self = StObject.set(x, "Blue", value.asInstanceOf[js.Any])
    
    inline def setBlueUndefined: Self = StObject.set(x, "Blue", js.undefined)
    
    inline def setCSSColor(value: String): Self = StObject.set(x, "CSSColor", value.asInstanceOf[js.Any])
    
    inline def setCSSColorUndefined: Self = StObject.set(x, "CSSColor", js.undefined)
    
    inline def setGreen(value: UInteger): Self = StObject.set(x, "Green", value.asInstanceOf[js.Any])
    
    inline def setGreenUndefined: Self = StObject.set(x, "Green", js.undefined)
    
    inline def setHexCode(value: String): Self = StObject.set(x, "HexCode", value.asInstanceOf[js.Any])
    
    inline def setHexCodeUndefined: Self = StObject.set(x, "HexCode", js.undefined)
    
    inline def setPixelPercent(value: Percent): Self = StObject.set(x, "PixelPercent", value.asInstanceOf[js.Any])
    
    inline def setPixelPercentUndefined: Self = StObject.set(x, "PixelPercent", js.undefined)
    
    inline def setRed(value: UInteger): Self = StObject.set(x, "Red", value.asInstanceOf[js.Any])
    
    inline def setRedUndefined: Self = StObject.set(x, "Red", js.undefined)
    
    inline def setSimplifiedColor(value: String): Self = StObject.set(x, "SimplifiedColor", value.asInstanceOf[js.Any])
    
    inline def setSimplifiedColorUndefined: Self = StObject.set(x, "SimplifiedColor", js.undefined)
  }
}
