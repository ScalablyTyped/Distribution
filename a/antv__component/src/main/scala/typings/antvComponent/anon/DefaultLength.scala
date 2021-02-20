package typings.antvComponent.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DefaultLength extends StObject {
  
  var defaultLength: Double = js.native
  
  var size: Double = js.native
  
  var style: FillString = js.native
  
  var `type`: String = js.native
}
object DefaultLength {
  
  @scala.inline
  def apply(defaultLength: Double, size: Double, style: FillString, `type`: String): DefaultLength = {
    val __obj = js.Dynamic.literal(defaultLength = defaultLength.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefaultLength]
  }
  
  @scala.inline
  implicit class DefaultLengthMutableBuilder[Self <: DefaultLength] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefaultLength(value: Double): Self = StObject.set(x, "defaultLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyle(value: FillString): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
