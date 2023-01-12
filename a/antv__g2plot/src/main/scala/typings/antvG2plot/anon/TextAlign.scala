package typings.antvG2plot.anon

import typings.antvG2plot.antvG2plotStrings.center
import typings.antvG2plot.antvG2plotStrings.middle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TextAlign extends StObject {
  
  var textAlign: center
  
  var textBaseline: middle
}
object TextAlign {
  
  inline def apply(): TextAlign = {
    val __obj = js.Dynamic.literal(textAlign = "center", textBaseline = "middle")
    __obj.asInstanceOf[TextAlign]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TextAlign] (val x: Self) extends AnyVal {
    
    inline def setTextAlign(value: center): Self = StObject.set(x, "textAlign", value.asInstanceOf[js.Any])
    
    inline def setTextBaseline(value: middle): Self = StObject.set(x, "textBaseline", value.asInstanceOf[js.Any])
  }
}
