package typings.atlaskitTokens.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BlueGreen[BaseToken] extends StObject {
  
  var blue: `9`[BaseToken]
  
  var green: `9`[BaseToken]
  
  var magenta: `9`[BaseToken]
  
  var orange: `9`[BaseToken]
  
  var purple: `9`[BaseToken]
  
  var red: `9`[BaseToken]
  
  var teal: `9`[BaseToken]
  
  var yellow: `9`[BaseToken]
}
object BlueGreen {
  
  inline def apply[BaseToken](
    blue: `9`[BaseToken],
    green: `9`[BaseToken],
    magenta: `9`[BaseToken],
    orange: `9`[BaseToken],
    purple: `9`[BaseToken],
    red: `9`[BaseToken],
    teal: `9`[BaseToken],
    yellow: `9`[BaseToken]
  ): BlueGreen[BaseToken] = {
    val __obj = js.Dynamic.literal(blue = blue.asInstanceOf[js.Any], green = green.asInstanceOf[js.Any], magenta = magenta.asInstanceOf[js.Any], orange = orange.asInstanceOf[js.Any], purple = purple.asInstanceOf[js.Any], red = red.asInstanceOf[js.Any], teal = teal.asInstanceOf[js.Any], yellow = yellow.asInstanceOf[js.Any])
    __obj.asInstanceOf[BlueGreen[BaseToken]]
  }
  
  extension [Self <: BlueGreen[?], BaseToken](x: Self & BlueGreen[BaseToken]) {
    
    inline def setBlue(value: `9`[BaseToken]): Self = StObject.set(x, "blue", value.asInstanceOf[js.Any])
    
    inline def setGreen(value: `9`[BaseToken]): Self = StObject.set(x, "green", value.asInstanceOf[js.Any])
    
    inline def setMagenta(value: `9`[BaseToken]): Self = StObject.set(x, "magenta", value.asInstanceOf[js.Any])
    
    inline def setOrange(value: `9`[BaseToken]): Self = StObject.set(x, "orange", value.asInstanceOf[js.Any])
    
    inline def setPurple(value: `9`[BaseToken]): Self = StObject.set(x, "purple", value.asInstanceOf[js.Any])
    
    inline def setRed(value: `9`[BaseToken]): Self = StObject.set(x, "red", value.asInstanceOf[js.Any])
    
    inline def setTeal(value: `9`[BaseToken]): Self = StObject.set(x, "teal", value.asInstanceOf[js.Any])
    
    inline def setYellow(value: `9`[BaseToken]): Self = StObject.set(x, "yellow", value.asInstanceOf[js.Any])
  }
}
