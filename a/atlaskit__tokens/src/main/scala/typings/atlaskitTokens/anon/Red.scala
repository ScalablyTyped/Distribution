package typings.atlaskitTokens.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Red[BaseToken] extends StObject {
  
  var blue: BolderPaintToken[BaseToken]
  
  var gray: BolderPaintToken[BaseToken]
  
  var green: BolderPaintToken[BaseToken]
  
  var magenta: BolderPaintToken[BaseToken]
  
  var orange: BolderPaintToken[BaseToken]
  
  var purple: BolderPaintToken[BaseToken]
  
  var red: BolderPaintToken[BaseToken]
  
  var teal: BolderPaintToken[BaseToken]
  
  var yellow: BolderPaintToken[BaseToken]
}
object Red {
  
  inline def apply[BaseToken](
    blue: BolderPaintToken[BaseToken],
    gray: BolderPaintToken[BaseToken],
    green: BolderPaintToken[BaseToken],
    magenta: BolderPaintToken[BaseToken],
    orange: BolderPaintToken[BaseToken],
    purple: BolderPaintToken[BaseToken],
    red: BolderPaintToken[BaseToken],
    teal: BolderPaintToken[BaseToken],
    yellow: BolderPaintToken[BaseToken]
  ): Red[BaseToken] = {
    val __obj = js.Dynamic.literal(blue = blue.asInstanceOf[js.Any], gray = gray.asInstanceOf[js.Any], green = green.asInstanceOf[js.Any], magenta = magenta.asInstanceOf[js.Any], orange = orange.asInstanceOf[js.Any], purple = purple.asInstanceOf[js.Any], red = red.asInstanceOf[js.Any], teal = teal.asInstanceOf[js.Any], yellow = yellow.asInstanceOf[js.Any])
    __obj.asInstanceOf[Red[BaseToken]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Red[?], BaseToken] (val x: Self & Red[BaseToken]) extends AnyVal {
    
    inline def setBlue(value: BolderPaintToken[BaseToken]): Self = StObject.set(x, "blue", value.asInstanceOf[js.Any])
    
    inline def setGray(value: BolderPaintToken[BaseToken]): Self = StObject.set(x, "gray", value.asInstanceOf[js.Any])
    
    inline def setGreen(value: BolderPaintToken[BaseToken]): Self = StObject.set(x, "green", value.asInstanceOf[js.Any])
    
    inline def setMagenta(value: BolderPaintToken[BaseToken]): Self = StObject.set(x, "magenta", value.asInstanceOf[js.Any])
    
    inline def setOrange(value: BolderPaintToken[BaseToken]): Self = StObject.set(x, "orange", value.asInstanceOf[js.Any])
    
    inline def setPurple(value: BolderPaintToken[BaseToken]): Self = StObject.set(x, "purple", value.asInstanceOf[js.Any])
    
    inline def setRed(value: BolderPaintToken[BaseToken]): Self = StObject.set(x, "red", value.asInstanceOf[js.Any])
    
    inline def setTeal(value: BolderPaintToken[BaseToken]): Self = StObject.set(x, "teal", value.asInstanceOf[js.Any])
    
    inline def setYellow(value: BolderPaintToken[BaseToken]): Self = StObject.set(x, "yellow", value.asInstanceOf[js.Any])
  }
}
