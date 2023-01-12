package typings.awsSdk.clientsIotsitewiseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AssetModelPropertyDefinition extends StObject {
  
  /**
    * The data type of the property definition. If you specify STRUCT, you must also specify dataTypeSpec to identify the type of the structure for this property.
    */
  var dataType: PropertyDataType
  
  /**
    * The data type of the structure for this property. This parameter is required on properties that have the STRUCT data type. The options for this parameter depend on the type of the composite model in which you define this property. Use AWS/ALARM_STATE for alarm state in alarm composite models.
    */
  var dataTypeSpec: js.UndefOr[Name] = js.undefined
  
  /**
    * The name of the property definition.
    */
  var name: Name
  
  /**
    * The property definition type (see PropertyType). You can only specify one type in a property definition.
    */
  var `type`: PropertyType
  
  /**
    * The unit of the property definition, such as Newtons or RPM.
    */
  var unit: js.UndefOr[PropertyUnit] = js.undefined
}
object AssetModelPropertyDefinition {
  
  inline def apply(dataType: PropertyDataType, name: Name, `type`: PropertyType): AssetModelPropertyDefinition = {
    val __obj = js.Dynamic.literal(dataType = dataType.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssetModelPropertyDefinition]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AssetModelPropertyDefinition] (val x: Self) extends AnyVal {
    
    inline def setDataType(value: PropertyDataType): Self = StObject.set(x, "dataType", value.asInstanceOf[js.Any])
    
    inline def setDataTypeSpec(value: Name): Self = StObject.set(x, "dataTypeSpec", value.asInstanceOf[js.Any])
    
    inline def setDataTypeSpecUndefined: Self = StObject.set(x, "dataTypeSpec", js.undefined)
    
    inline def setName(value: Name): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: PropertyType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setUnit(value: PropertyUnit): Self = StObject.set(x, "unit", value.asInstanceOf[js.Any])
    
    inline def setUnitUndefined: Self = StObject.set(x, "unit", js.undefined)
  }
}
