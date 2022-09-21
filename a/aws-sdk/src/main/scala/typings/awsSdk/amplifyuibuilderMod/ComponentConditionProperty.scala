package typings.awsSdk.amplifyuibuilderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ComponentConditionProperty extends StObject {
  
  /**
    * The value to assign to the property if the condition is not met.
    */
  var `else`: js.UndefOr[ComponentProperty] = js.undefined
  
  /**
    * The name of a field. Specify this when the property is a data model.
    */
  var field: js.UndefOr[String] = js.undefined
  
  /**
    * The value of the property to evaluate.
    */
  var operand: js.UndefOr[String] = js.undefined
  
  /**
    * The type of the property to evaluate.
    */
  var operandType: js.UndefOr[String] = js.undefined
  
  /**
    * The operator to use to perform the evaluation, such as eq to represent equals.
    */
  var operator: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the conditional property.
    */
  var property: js.UndefOr[String] = js.undefined
  
  /**
    * The value to assign to the property if the condition is met.
    */
  var `then`: js.UndefOr[ComponentProperty] = js.undefined
}
object ComponentConditionProperty {
  
  inline def apply(): ComponentConditionProperty = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ComponentConditionProperty]
  }
  
  extension [Self <: ComponentConditionProperty](x: Self) {
    
    inline def setElse(value: ComponentProperty): Self = StObject.set(x, "else", value.asInstanceOf[js.Any])
    
    inline def setElseUndefined: Self = StObject.set(x, "else", js.undefined)
    
    inline def setField(value: String): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    inline def setFieldUndefined: Self = StObject.set(x, "field", js.undefined)
    
    inline def setOperand(value: String): Self = StObject.set(x, "operand", value.asInstanceOf[js.Any])
    
    inline def setOperandType(value: String): Self = StObject.set(x, "operandType", value.asInstanceOf[js.Any])
    
    inline def setOperandTypeUndefined: Self = StObject.set(x, "operandType", js.undefined)
    
    inline def setOperandUndefined: Self = StObject.set(x, "operand", js.undefined)
    
    inline def setOperator(value: String): Self = StObject.set(x, "operator", value.asInstanceOf[js.Any])
    
    inline def setOperatorUndefined: Self = StObject.set(x, "operator", js.undefined)
    
    inline def setProperty(value: String): Self = StObject.set(x, "property", value.asInstanceOf[js.Any])
    
    inline def setPropertyUndefined: Self = StObject.set(x, "property", js.undefined)
    
    inline def setThen(value: ComponentProperty): Self = StObject.set(x, "then", value.asInstanceOf[js.Any])
    
    inline def setThenUndefined: Self = StObject.set(x, "then", js.undefined)
  }
}
