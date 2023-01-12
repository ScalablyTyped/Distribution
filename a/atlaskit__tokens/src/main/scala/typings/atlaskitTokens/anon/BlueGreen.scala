package typings.atlaskitTokens.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BlueGreen[BaseToken] extends StObject {
  
  var blue: `11`[BaseToken]
  
  var green: `11`[BaseToken]
  
  var magenta: `11`[BaseToken]
  
  var orange: `11`[BaseToken]
  
  var purple: `11`[BaseToken]
  
  var red: `11`[BaseToken]
  
  var teal: `11`[BaseToken]
  
  var yellow: `11`[BaseToken]
}
object BlueGreen {
  
  inline def apply[BaseToken](
    blue: `11`[BaseToken],
    green: `11`[BaseToken],
    magenta: `11`[BaseToken],
    orange: `11`[BaseToken],
    purple: `11`[BaseToken],
    red: `11`[BaseToken],
    teal: `11`[BaseToken],
    yellow: `11`[BaseToken]
  ): BlueGreen[BaseToken] = {
    val __obj = js.Dynamic.literal(blue = blue.asInstanceOf[js.Any], green = green.asInstanceOf[js.Any], magenta = magenta.asInstanceOf[js.Any], orange = orange.asInstanceOf[js.Any], purple = purple.asInstanceOf[js.Any], red = red.asInstanceOf[js.Any], teal = teal.asInstanceOf[js.Any], yellow = yellow.asInstanceOf[js.Any])
    __obj.asInstanceOf[BlueGreen[BaseToken]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BlueGreen[?], BaseToken] (val x: Self & BlueGreen[BaseToken]) extends AnyVal {
    
    inline def setBlue(value: `11`[BaseToken]): Self = StObject.set(x, "blue", value.asInstanceOf[js.Any])
    
    inline def setGreen(value: `11`[BaseToken]): Self = StObject.set(x, "green", value.asInstanceOf[js.Any])
    
    inline def setMagenta(value: `11`[BaseToken]): Self = StObject.set(x, "magenta", value.asInstanceOf[js.Any])
    
    inline def setOrange(value: `11`[BaseToken]): Self = StObject.set(x, "orange", value.asInstanceOf[js.Any])
    
    inline def setPurple(value: `11`[BaseToken]): Self = StObject.set(x, "purple", value.asInstanceOf[js.Any])
    
    inline def setRed(value: `11`[BaseToken]): Self = StObject.set(x, "red", value.asInstanceOf[js.Any])
    
    inline def setTeal(value: `11`[BaseToken]): Self = StObject.set(x, "teal", value.asInstanceOf[js.Any])
    
    inline def setYellow(value: `11`[BaseToken]): Self = StObject.set(x, "yellow", value.asInstanceOf[js.Any])
  }
}
