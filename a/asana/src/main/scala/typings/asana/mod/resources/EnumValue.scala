package typings.asana.mod.resources

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnumValue
  extends StObject
     with Resource {
  
  var color: String
  
  var enabled: Boolean
}
object EnumValue {
  
  inline def apply(color: String, enabled: Boolean, gid: String, name: String, resource_type: String): EnumValue = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], enabled = enabled.asInstanceOf[js.Any], gid = gid.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], resource_type = resource_type.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumValue]
  }
  
  extension [Self <: EnumValue](x: Self) {
    
    inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
  }
}
