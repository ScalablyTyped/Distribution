package typings.antdMobileRn.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ColorTextAlign extends StObject {
  
  var color: String
  
  var textAlign: String
}
object ColorTextAlign {
  
  inline def apply(color: String, textAlign: String): ColorTextAlign = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], textAlign = textAlign.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColorTextAlign]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ColorTextAlign] (val x: Self) extends AnyVal {
    
    inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setTextAlign(value: String): Self = StObject.set(x, "textAlign", value.asInstanceOf[js.Any])
  }
}
