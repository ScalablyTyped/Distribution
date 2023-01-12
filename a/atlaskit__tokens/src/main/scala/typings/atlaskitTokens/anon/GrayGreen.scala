package typings.atlaskitTokens.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GrayGreen[BaseToken] extends StObject {
  
  var blue: BolderSubtle[BaseToken]
  
  var gray: BolderSubtle[BaseToken]
  
  var green: BolderSubtle[BaseToken]
  
  var magenta: BolderSubtle[BaseToken]
  
  var orange: BolderSubtle[BaseToken]
  
  var purple: BolderSubtle[BaseToken]
  
  var red: BolderSubtle[BaseToken]
  
  var teal: BolderSubtle[BaseToken]
  
  var yellow: BolderSubtle[BaseToken]
}
object GrayGreen {
  
  inline def apply[BaseToken](
    blue: BolderSubtle[BaseToken],
    gray: BolderSubtle[BaseToken],
    green: BolderSubtle[BaseToken],
    magenta: BolderSubtle[BaseToken],
    orange: BolderSubtle[BaseToken],
    purple: BolderSubtle[BaseToken],
    red: BolderSubtle[BaseToken],
    teal: BolderSubtle[BaseToken],
    yellow: BolderSubtle[BaseToken]
  ): GrayGreen[BaseToken] = {
    val __obj = js.Dynamic.literal(blue = blue.asInstanceOf[js.Any], gray = gray.asInstanceOf[js.Any], green = green.asInstanceOf[js.Any], magenta = magenta.asInstanceOf[js.Any], orange = orange.asInstanceOf[js.Any], purple = purple.asInstanceOf[js.Any], red = red.asInstanceOf[js.Any], teal = teal.asInstanceOf[js.Any], yellow = yellow.asInstanceOf[js.Any])
    __obj.asInstanceOf[GrayGreen[BaseToken]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GrayGreen[?], BaseToken] (val x: Self & GrayGreen[BaseToken]) extends AnyVal {
    
    inline def setBlue(value: BolderSubtle[BaseToken]): Self = StObject.set(x, "blue", value.asInstanceOf[js.Any])
    
    inline def setGray(value: BolderSubtle[BaseToken]): Self = StObject.set(x, "gray", value.asInstanceOf[js.Any])
    
    inline def setGreen(value: BolderSubtle[BaseToken]): Self = StObject.set(x, "green", value.asInstanceOf[js.Any])
    
    inline def setMagenta(value: BolderSubtle[BaseToken]): Self = StObject.set(x, "magenta", value.asInstanceOf[js.Any])
    
    inline def setOrange(value: BolderSubtle[BaseToken]): Self = StObject.set(x, "orange", value.asInstanceOf[js.Any])
    
    inline def setPurple(value: BolderSubtle[BaseToken]): Self = StObject.set(x, "purple", value.asInstanceOf[js.Any])
    
    inline def setRed(value: BolderSubtle[BaseToken]): Self = StObject.set(x, "red", value.asInstanceOf[js.Any])
    
    inline def setTeal(value: BolderSubtle[BaseToken]): Self = StObject.set(x, "teal", value.asInstanceOf[js.Any])
    
    inline def setYellow(value: BolderSubtle[BaseToken]): Self = StObject.set(x, "yellow", value.asInstanceOf[js.Any])
  }
}
