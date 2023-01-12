package typings.antvComponent.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DefaultLength extends StObject {
  
  var defaultLength: Double
  
  var size: Double
  
  var style: FillString
  
  var `type`: String
}
object DefaultLength {
  
  inline def apply(defaultLength: Double, size: Double, style: FillString, `type`: String): DefaultLength = {
    val __obj = js.Dynamic.literal(defaultLength = defaultLength.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefaultLength]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DefaultLength] (val x: Self) extends AnyVal {
    
    inline def setDefaultLength(value: Double): Self = StObject.set(x, "defaultLength", value.asInstanceOf[js.Any])
    
    inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setStyle(value: FillString): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
