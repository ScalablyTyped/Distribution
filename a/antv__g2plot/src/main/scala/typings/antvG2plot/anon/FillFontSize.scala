package typings.antvG2plot.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FillFontSize extends StObject {
  
  var fill: String
  
  var fontSize: Double
}
object FillFontSize {
  
  inline def apply(fill: String, fontSize: Double): FillFontSize = {
    val __obj = js.Dynamic.literal(fill = fill.asInstanceOf[js.Any], fontSize = fontSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[FillFontSize]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FillFontSize] (val x: Self) extends AnyVal {
    
    inline def setFill(value: String): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
    
    inline def setFontSize(value: Double): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
  }
}
