package typings.atlaskitTokens.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Magenta extends StObject {
  
  var blue: BoldPaintToken
  
  var green: BoldPaintToken
  
  var magenta: BoldPaintToken
  
  var orange: BoldPaintToken
  
  var purple: BoldPaintToken
  
  var red: BoldPaintToken
  
  var teal: BoldPaintToken
  
  var yellow: BoldPaintToken
}
object Magenta {
  
  inline def apply(
    blue: BoldPaintToken,
    green: BoldPaintToken,
    magenta: BoldPaintToken,
    orange: BoldPaintToken,
    purple: BoldPaintToken,
    red: BoldPaintToken,
    teal: BoldPaintToken,
    yellow: BoldPaintToken
  ): Magenta = {
    val __obj = js.Dynamic.literal(blue = blue.asInstanceOf[js.Any], green = green.asInstanceOf[js.Any], magenta = magenta.asInstanceOf[js.Any], orange = orange.asInstanceOf[js.Any], purple = purple.asInstanceOf[js.Any], red = red.asInstanceOf[js.Any], teal = teal.asInstanceOf[js.Any], yellow = yellow.asInstanceOf[js.Any])
    __obj.asInstanceOf[Magenta]
  }
  
  extension [Self <: Magenta](x: Self) {
    
    inline def setBlue(value: BoldPaintToken): Self = StObject.set(x, "blue", value.asInstanceOf[js.Any])
    
    inline def setGreen(value: BoldPaintToken): Self = StObject.set(x, "green", value.asInstanceOf[js.Any])
    
    inline def setMagenta(value: BoldPaintToken): Self = StObject.set(x, "magenta", value.asInstanceOf[js.Any])
    
    inline def setOrange(value: BoldPaintToken): Self = StObject.set(x, "orange", value.asInstanceOf[js.Any])
    
    inline def setPurple(value: BoldPaintToken): Self = StObject.set(x, "purple", value.asInstanceOf[js.Any])
    
    inline def setRed(value: BoldPaintToken): Self = StObject.set(x, "red", value.asInstanceOf[js.Any])
    
    inline def setTeal(value: BoldPaintToken): Self = StObject.set(x, "teal", value.asInstanceOf[js.Any])
    
    inline def setYellow(value: BoldPaintToken): Self = StObject.set(x, "yellow", value.asInstanceOf[js.Any])
  }
}
