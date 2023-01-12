package typings.antdMobileRn.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BorderBottomColorBorderBottomWidth extends StObject {
  
  var borderBottomColor: String
  
  var borderBottomWidth: Double
}
object BorderBottomColorBorderBottomWidth {
  
  inline def apply(borderBottomColor: String, borderBottomWidth: Double): BorderBottomColorBorderBottomWidth = {
    val __obj = js.Dynamic.literal(borderBottomColor = borderBottomColor.asInstanceOf[js.Any], borderBottomWidth = borderBottomWidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[BorderBottomColorBorderBottomWidth]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BorderBottomColorBorderBottomWidth] (val x: Self) extends AnyVal {
    
    inline def setBorderBottomColor(value: String): Self = StObject.set(x, "borderBottomColor", value.asInstanceOf[js.Any])
    
    inline def setBorderBottomWidth(value: Double): Self = StObject.set(x, "borderBottomWidth", value.asInstanceOf[js.Any])
  }
}
