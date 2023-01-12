package typings.awsSdk.clientsIotfleetwiseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Actuator extends StObject {
  
  /**
    * A list of possible values an actuator can take.
    */
  var allowedValues: js.UndefOr[listOfStrings] = js.undefined
  
  /**
    * A specified value for the actuator.
    */
  var assignedValue: js.UndefOr[java.lang.String] = js.undefined
  
  /**
    * The specified data type of the actuator. 
    */
  var dataType: NodeDataType
  
  /**
    * A brief description of the actuator.
    */
  var description: js.UndefOr[typings.awsSdk.clientsIotfleetwiseMod.description] = js.undefined
  
  /**
    * The fully qualified name of the actuator. For example, the fully qualified name of an actuator might be Vehicle.Front.Left.Door.Lock.
    */
  var fullyQualifiedName: java.lang.String
  
  /**
    * The specified possible maximum value of an actuator.
    */
  var max: js.UndefOr[double] = js.undefined
  
  /**
    * The specified possible minimum value of an actuator.
    */
  var min: js.UndefOr[double] = js.undefined
  
  /**
    * The scientific unit for the actuator.
    */
  var unit: js.UndefOr[java.lang.String] = js.undefined
}
object Actuator {
  
  inline def apply(dataType: NodeDataType, fullyQualifiedName: java.lang.String): Actuator = {
    val __obj = js.Dynamic.literal(dataType = dataType.asInstanceOf[js.Any], fullyQualifiedName = fullyQualifiedName.asInstanceOf[js.Any])
    __obj.asInstanceOf[Actuator]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Actuator] (val x: Self) extends AnyVal {
    
    inline def setAllowedValues(value: listOfStrings): Self = StObject.set(x, "allowedValues", value.asInstanceOf[js.Any])
    
    inline def setAllowedValuesUndefined: Self = StObject.set(x, "allowedValues", js.undefined)
    
    inline def setAllowedValuesVarargs(value: java.lang.String*): Self = StObject.set(x, "allowedValues", js.Array(value*))
    
    inline def setAssignedValue(value: java.lang.String): Self = StObject.set(x, "assignedValue", value.asInstanceOf[js.Any])
    
    inline def setAssignedValueUndefined: Self = StObject.set(x, "assignedValue", js.undefined)
    
    inline def setDataType(value: NodeDataType): Self = StObject.set(x, "dataType", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: description): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setFullyQualifiedName(value: java.lang.String): Self = StObject.set(x, "fullyQualifiedName", value.asInstanceOf[js.Any])
    
    inline def setMax(value: double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
    
    inline def setMin(value: double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    inline def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
    
    inline def setUnit(value: java.lang.String): Self = StObject.set(x, "unit", value.asInstanceOf[js.Any])
    
    inline def setUnitUndefined: Self = StObject.set(x, "unit", js.undefined)
  }
}
