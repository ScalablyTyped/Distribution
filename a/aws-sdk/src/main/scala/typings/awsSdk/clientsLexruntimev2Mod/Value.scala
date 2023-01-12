package typings.awsSdk.clientsLexruntimev2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Value extends StObject {
  
  /**
    * The value that Amazon Lex V2 determines for the slot. The actual value depends on the setting of the value selection strategy for the bot. You can choose to use the value entered by the user, or you can have Amazon Lex V2 choose the first value in the resolvedValues list.
    */
  var interpretedValue: NonEmptyString
  
  /**
    * The text of the utterance from the user that was entered for the slot.
    */
  var originalValue: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * A list of additional values that have been recognized for the slot.
    */
  var resolvedValues: js.UndefOr[StringList] = js.undefined
}
object Value {
  
  inline def apply(interpretedValue: NonEmptyString): Value = {
    val __obj = js.Dynamic.literal(interpretedValue = interpretedValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[Value]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Value] (val x: Self) extends AnyVal {
    
    inline def setInterpretedValue(value: NonEmptyString): Self = StObject.set(x, "interpretedValue", value.asInstanceOf[js.Any])
    
    inline def setOriginalValue(value: NonEmptyString): Self = StObject.set(x, "originalValue", value.asInstanceOf[js.Any])
    
    inline def setOriginalValueUndefined: Self = StObject.set(x, "originalValue", js.undefined)
    
    inline def setResolvedValues(value: StringList): Self = StObject.set(x, "resolvedValues", value.asInstanceOf[js.Any])
    
    inline def setResolvedValuesUndefined: Self = StObject.set(x, "resolvedValues", js.undefined)
    
    inline def setResolvedValuesVarargs(value: NonEmptyString*): Self = StObject.set(x, "resolvedValues", js.Array(value*))
  }
}
