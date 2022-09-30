package typings.awsLambda.lexV2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LexV2ListSlotValue
  extends StObject
     with LexV2Slot {
  
  var shape: typings.awsLambda.awsLambdaStrings.List
  
  var value: LexV2SlotValue
  
  var values: js.Array[LexV2ScalarSlotValue]
}
object LexV2ListSlotValue {
  
  inline def apply(value: LexV2SlotValue, values: js.Array[LexV2ScalarSlotValue]): LexV2ListSlotValue = {
    val __obj = js.Dynamic.literal(shape = "List", value = value.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[LexV2ListSlotValue]
  }
  
  extension [Self <: LexV2ListSlotValue](x: Self) {
    
    inline def setShape(value: typings.awsLambda.awsLambdaStrings.List): Self = StObject.set(x, "shape", value.asInstanceOf[js.Any])
    
    inline def setValue(value: LexV2SlotValue): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValues(value: js.Array[LexV2ScalarSlotValue]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    inline def setValuesVarargs(value: LexV2ScalarSlotValue*): Self = StObject.set(x, "values", js.Array(value*))
  }
}
