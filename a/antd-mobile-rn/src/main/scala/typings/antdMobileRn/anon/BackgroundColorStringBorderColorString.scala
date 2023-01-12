package typings.antdMobileRn.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BackgroundColorStringBorderColorString extends StObject {
  
  var backgroundColor: String
  
  var borderColor: String
}
object BackgroundColorStringBorderColorString {
  
  inline def apply(backgroundColor: String, borderColor: String): BackgroundColorStringBorderColorString = {
    val __obj = js.Dynamic.literal(backgroundColor = backgroundColor.asInstanceOf[js.Any], borderColor = borderColor.asInstanceOf[js.Any])
    __obj.asInstanceOf[BackgroundColorStringBorderColorString]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BackgroundColorStringBorderColorString] (val x: Self) extends AnyVal {
    
    inline def setBackgroundColor(value: String): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
    
    inline def setBorderColor(value: String): Self = StObject.set(x, "borderColor", value.asInstanceOf[js.Any])
  }
}
