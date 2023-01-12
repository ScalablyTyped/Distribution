package typings.awsSdk.clientsIottwinmakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataType extends StObject {
  
  /**
    * The allowed values for this data type.
    */
  var allowedValues: js.UndefOr[DataValueList] = js.undefined
  
  /**
    * The nested type in the data type.
    */
  var nestedType: js.UndefOr[DataType] = js.undefined
  
  /**
    * A relationship that associates a component with another component.
    */
  var relationship: js.UndefOr[Relationship] = js.undefined
  
  /**
    * The underlying type of the data type.
    */
  var `type`: Type
  
  /**
    * The unit of measure used in this data type.
    */
  var unitOfMeasure: js.UndefOr[String] = js.undefined
}
object DataType {
  
  inline def apply(`type`: Type): DataType = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataType]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DataType] (val x: Self) extends AnyVal {
    
    inline def setAllowedValues(value: DataValueList): Self = StObject.set(x, "allowedValues", value.asInstanceOf[js.Any])
    
    inline def setAllowedValuesUndefined: Self = StObject.set(x, "allowedValues", js.undefined)
    
    inline def setAllowedValuesVarargs(value: DataValue*): Self = StObject.set(x, "allowedValues", js.Array(value*))
    
    inline def setNestedType(value: DataType): Self = StObject.set(x, "nestedType", value.asInstanceOf[js.Any])
    
    inline def setNestedTypeUndefined: Self = StObject.set(x, "nestedType", js.undefined)
    
    inline def setRelationship(value: Relationship): Self = StObject.set(x, "relationship", value.asInstanceOf[js.Any])
    
    inline def setRelationshipUndefined: Self = StObject.set(x, "relationship", js.undefined)
    
    inline def setType(value: Type): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setUnitOfMeasure(value: String): Self = StObject.set(x, "unitOfMeasure", value.asInstanceOf[js.Any])
    
    inline def setUnitOfMeasureUndefined: Self = StObject.set(x, "unitOfMeasure", js.undefined)
  }
}
