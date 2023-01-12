package typings.antvG2plot.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FontSizePadding extends StObject {
  
  var fontSize: String
  
  var padding: String
}
object FontSizePadding {
  
  inline def apply(fontSize: String, padding: String): FontSizePadding = {
    val __obj = js.Dynamic.literal(fontSize = fontSize.asInstanceOf[js.Any], padding = padding.asInstanceOf[js.Any])
    __obj.asInstanceOf[FontSizePadding]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FontSizePadding] (val x: Self) extends AnyVal {
    
    inline def setFontSize(value: String): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
    
    inline def setPadding(value: String): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
  }
}
