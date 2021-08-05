package typings.activexLibreoffice.com_.sun.star.rendering

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ARGBColor extends StObject {
  
  /**
    * Alpha component.
    *
    * Valid range is [0,1.0], with 0.0 denoting fully transparent, and 1.0 fully opaque.
    */
  var Alpha: ColorComponent
  
  var Blue: ColorComponent
  
  var Green: ColorComponent
  
  var Red: ColorComponent
}
object ARGBColor {
  
  inline def apply(Alpha: ColorComponent, Blue: ColorComponent, Green: ColorComponent, Red: ColorComponent): ARGBColor = {
    val __obj = js.Dynamic.literal(Alpha = Alpha.asInstanceOf[js.Any], Blue = Blue.asInstanceOf[js.Any], Green = Green.asInstanceOf[js.Any], Red = Red.asInstanceOf[js.Any])
    __obj.asInstanceOf[ARGBColor]
  }
  
  extension [Self <: ARGBColor](x: Self) {
    
    inline def setAlpha(value: ColorComponent): Self = StObject.set(x, "Alpha", value.asInstanceOf[js.Any])
    
    inline def setBlue(value: ColorComponent): Self = StObject.set(x, "Blue", value.asInstanceOf[js.Any])
    
    inline def setGreen(value: ColorComponent): Self = StObject.set(x, "Green", value.asInstanceOf[js.Any])
    
    inline def setRed(value: ColorComponent): Self = StObject.set(x, "Red", value.asInstanceOf[js.Any])
  }
}
