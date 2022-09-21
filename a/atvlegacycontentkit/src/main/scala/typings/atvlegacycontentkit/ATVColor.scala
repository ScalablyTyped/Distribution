package typings.atvlegacycontentkit

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The colour class for specifying the colours of programmatic views.
  *
  * This appears to be loosely based on CGColor, but without the ability to use different colour spaces.
  */
// tslint:disable-next-line:strict-export-declare-modifiers
trait ATVColor extends StObject {
  
  /**
    * The opacity of the object. On a scale of 0 (totally transparent) to 1 (totally opaque).
    */
  var alpha: js.UndefOr[Double] = js.undefined
  
  /**
    * The brightness of the blue component. On a scale of 0 (being no blue at all) to 1 (to having 100% blue brightness).
    */
  var blue: Double
  
  /**
    * The brightness of the green component. On a scale of 0 (being no green at all) to 1 (to having 100% green brightness).
    */
  var green: Double
  
  /**
    * The brightness of the red component. On a scale of 0 (being no red at all) to 1 (to having 100% red brightness).
    */
  var red: Double
}
object ATVColor {
  
  inline def apply(blue: Double, green: Double, red: Double): ATVColor = {
    val __obj = js.Dynamic.literal(blue = blue.asInstanceOf[js.Any], green = green.asInstanceOf[js.Any], red = red.asInstanceOf[js.Any])
    __obj.asInstanceOf[ATVColor]
  }
  
  extension [Self <: ATVColor](x: Self) {
    
    inline def setAlpha(value: Double): Self = StObject.set(x, "alpha", value.asInstanceOf[js.Any])
    
    inline def setAlphaUndefined: Self = StObject.set(x, "alpha", js.undefined)
    
    inline def setBlue(value: Double): Self = StObject.set(x, "blue", value.asInstanceOf[js.Any])
    
    inline def setGreen(value: Double): Self = StObject.set(x, "green", value.asInstanceOf[js.Any])
    
    inline def setRed(value: Double): Self = StObject.set(x, "red", value.asInstanceOf[js.Any])
  }
}
