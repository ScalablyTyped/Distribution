package typings.atlaskitTokens.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BlueGreen[BaseToken] extends StObject {
  
  var blue: `5`[BaseToken]
  
  var green: `5`[BaseToken]
  
  var magenta: `5`[BaseToken]
  
  var orange: `5`[BaseToken]
  
  var purple: `5`[BaseToken]
  
  var red: `5`[BaseToken]
  
  var teal: `5`[BaseToken]
  
  var yellow: `5`[BaseToken]
}
object BlueGreen {
  
  inline def apply[BaseToken](
    blue: `5`[BaseToken],
    green: `5`[BaseToken],
    magenta: `5`[BaseToken],
    orange: `5`[BaseToken],
    purple: `5`[BaseToken],
    red: `5`[BaseToken],
    teal: `5`[BaseToken],
    yellow: `5`[BaseToken]
  ): BlueGreen[BaseToken] = {
    val __obj = js.Dynamic.literal(blue = blue.asInstanceOf[js.Any], green = green.asInstanceOf[js.Any], magenta = magenta.asInstanceOf[js.Any], orange = orange.asInstanceOf[js.Any], purple = purple.asInstanceOf[js.Any], red = red.asInstanceOf[js.Any], teal = teal.asInstanceOf[js.Any], yellow = yellow.asInstanceOf[js.Any])
    __obj.asInstanceOf[BlueGreen[BaseToken]]
  }
  
  extension [Self <: BlueGreen[?], BaseToken](x: Self & BlueGreen[BaseToken]) {
    
    inline def setBlue(value: `5`[BaseToken]): Self = StObject.set(x, "blue", value.asInstanceOf[js.Any])
    
    inline def setGreen(value: `5`[BaseToken]): Self = StObject.set(x, "green", value.asInstanceOf[js.Any])
    
    inline def setMagenta(value: `5`[BaseToken]): Self = StObject.set(x, "magenta", value.asInstanceOf[js.Any])
    
    inline def setOrange(value: `5`[BaseToken]): Self = StObject.set(x, "orange", value.asInstanceOf[js.Any])
    
    inline def setPurple(value: `5`[BaseToken]): Self = StObject.set(x, "purple", value.asInstanceOf[js.Any])
    
    inline def setRed(value: `5`[BaseToken]): Self = StObject.set(x, "red", value.asInstanceOf[js.Any])
    
    inline def setTeal(value: `5`[BaseToken]): Self = StObject.set(x, "teal", value.asInstanceOf[js.Any])
    
    inline def setYellow(value: `5`[BaseToken]): Self = StObject.set(x, "yellow", value.asInstanceOf[js.Any])
  }
}
