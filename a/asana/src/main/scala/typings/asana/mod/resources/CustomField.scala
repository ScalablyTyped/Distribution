package typings.asana.mod.resources

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CustomField
  extends StObject
     with Resource {
  
  var created_by: Resource
  
  var display_value: String | Null
  
  var enabled: Boolean
  
  var enum_options: js.Array[EnumValue] | Null
  
  var enum_value: EnumValue | Null
  
  var number_value: Double | Null
  
  var precision: Double | Null
  
  var `type`: String | Null
}
object CustomField {
  
  inline def apply(created_by: Resource, enabled: Boolean, gid: String, name: String, resource_type: String): CustomField = {
    val __obj = js.Dynamic.literal(created_by = created_by.asInstanceOf[js.Any], enabled = enabled.asInstanceOf[js.Any], gid = gid.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], resource_type = resource_type.asInstanceOf[js.Any], display_value = null, enum_options = null, enum_value = null, number_value = null, precision = null)
    __obj.updateDynamic("type")(null)
    __obj.asInstanceOf[CustomField]
  }
  
  extension [Self <: CustomField](x: Self) {
    
    inline def setCreated_by(value: Resource): Self = StObject.set(x, "created_by", value.asInstanceOf[js.Any])
    
    inline def setDisplay_value(value: String): Self = StObject.set(x, "display_value", value.asInstanceOf[js.Any])
    
    inline def setDisplay_valueNull: Self = StObject.set(x, "display_value", null)
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEnum_options(value: js.Array[EnumValue]): Self = StObject.set(x, "enum_options", value.asInstanceOf[js.Any])
    
    inline def setEnum_optionsNull: Self = StObject.set(x, "enum_options", null)
    
    inline def setEnum_optionsVarargs(value: EnumValue*): Self = StObject.set(x, "enum_options", js.Array(value*))
    
    inline def setEnum_value(value: EnumValue): Self = StObject.set(x, "enum_value", value.asInstanceOf[js.Any])
    
    inline def setEnum_valueNull: Self = StObject.set(x, "enum_value", null)
    
    inline def setNumber_value(value: Double): Self = StObject.set(x, "number_value", value.asInstanceOf[js.Any])
    
    inline def setNumber_valueNull: Self = StObject.set(x, "number_value", null)
    
    inline def setPrecision(value: Double): Self = StObject.set(x, "precision", value.asInstanceOf[js.Any])
    
    inline def setPrecisionNull: Self = StObject.set(x, "precision", null)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeNull: Self = StObject.set(x, "type", null)
  }
}
