package typings.awsLambda.triggerLexV2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LexV2SlotValue extends StObject {
  
  var interpretedValue: js.UndefOr[String] = js.undefined
  
  var originalValue: String
  
  var resolvedValues: js.Array[String]
}
object LexV2SlotValue {
  
  inline def apply(originalValue: String, resolvedValues: js.Array[String]): LexV2SlotValue = {
    val __obj = js.Dynamic.literal(originalValue = originalValue.asInstanceOf[js.Any], resolvedValues = resolvedValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[LexV2SlotValue]
  }
  
  extension [Self <: LexV2SlotValue](x: Self) {
    
    inline def setInterpretedValue(value: String): Self = StObject.set(x, "interpretedValue", value.asInstanceOf[js.Any])
    
    inline def setInterpretedValueUndefined: Self = StObject.set(x, "interpretedValue", js.undefined)
    
    inline def setOriginalValue(value: String): Self = StObject.set(x, "originalValue", value.asInstanceOf[js.Any])
    
    inline def setResolvedValues(value: js.Array[String]): Self = StObject.set(x, "resolvedValues", value.asInstanceOf[js.Any])
    
    inline def setResolvedValuesVarargs(value: String*): Self = StObject.set(x, "resolvedValues", js.Array(value*))
  }
}
