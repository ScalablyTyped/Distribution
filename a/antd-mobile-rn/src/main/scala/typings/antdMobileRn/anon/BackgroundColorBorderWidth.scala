package typings.antdMobileRn.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BackgroundColorBorderWidth extends StObject {
  
  var backgroundColor: String
  
  var borderWidth: Double
}
object BackgroundColorBorderWidth {
  
  inline def apply(backgroundColor: String, borderWidth: Double): BackgroundColorBorderWidth = {
    val __obj = js.Dynamic.literal(backgroundColor = backgroundColor.asInstanceOf[js.Any], borderWidth = borderWidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[BackgroundColorBorderWidth]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BackgroundColorBorderWidth] (val x: Self) extends AnyVal {
    
    inline def setBackgroundColor(value: String): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
    
    inline def setBorderWidth(value: Double): Self = StObject.set(x, "borderWidth", value.asInstanceOf[js.Any])
  }
}
