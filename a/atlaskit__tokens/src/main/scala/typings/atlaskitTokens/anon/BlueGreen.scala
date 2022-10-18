package typings.atlaskitTokens.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BlueGreen[BaseToken] extends StObject {
  
  var blue: `4`[BaseToken]
  
  var green: `4`[BaseToken]
  
  var magenta: `4`[BaseToken]
  
  var orange: `4`[BaseToken]
  
  var purple: `4`[BaseToken]
  
  var red: `4`[BaseToken]
  
  var teal: `4`[BaseToken]
  
  var yellow: `4`[BaseToken]
}
object BlueGreen {
  
  inline def apply[BaseToken](
    blue: `4`[BaseToken],
    green: `4`[BaseToken],
    magenta: `4`[BaseToken],
    orange: `4`[BaseToken],
    purple: `4`[BaseToken],
    red: `4`[BaseToken],
    teal: `4`[BaseToken],
    yellow: `4`[BaseToken]
  ): BlueGreen[BaseToken] = {
    val __obj = js.Dynamic.literal(blue = blue.asInstanceOf[js.Any], green = green.asInstanceOf[js.Any], magenta = magenta.asInstanceOf[js.Any], orange = orange.asInstanceOf[js.Any], purple = purple.asInstanceOf[js.Any], red = red.asInstanceOf[js.Any], teal = teal.asInstanceOf[js.Any], yellow = yellow.asInstanceOf[js.Any])
    __obj.asInstanceOf[BlueGreen[BaseToken]]
  }
  
  extension [Self <: BlueGreen[?], BaseToken](x: Self & BlueGreen[BaseToken]) {
    
    inline def setBlue(value: `4`[BaseToken]): Self = StObject.set(x, "blue", value.asInstanceOf[js.Any])
    
    inline def setGreen(value: `4`[BaseToken]): Self = StObject.set(x, "green", value.asInstanceOf[js.Any])
    
    inline def setMagenta(value: `4`[BaseToken]): Self = StObject.set(x, "magenta", value.asInstanceOf[js.Any])
    
    inline def setOrange(value: `4`[BaseToken]): Self = StObject.set(x, "orange", value.asInstanceOf[js.Any])
    
    inline def setPurple(value: `4`[BaseToken]): Self = StObject.set(x, "purple", value.asInstanceOf[js.Any])
    
    inline def setRed(value: `4`[BaseToken]): Self = StObject.set(x, "red", value.asInstanceOf[js.Any])
    
    inline def setTeal(value: `4`[BaseToken]): Self = StObject.set(x, "teal", value.asInstanceOf[js.Any])
    
    inline def setYellow(value: `4`[BaseToken]): Self = StObject.set(x, "yellow", value.asInstanceOf[js.Any])
  }
}
