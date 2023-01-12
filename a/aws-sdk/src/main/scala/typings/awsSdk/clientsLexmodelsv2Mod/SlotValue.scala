package typings.awsSdk.clientsLexmodelsv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SlotValue extends StObject {
  
  /**
    * The value that Amazon Lex determines for the slot. The actual value depends on the setting of the value selection strategy for the bot. You can choose to use the value entered by the user, or you can have Amazon Lex choose the first value in the resolvedValues list.
    */
  var interpretedValue: js.UndefOr[NonEmptyString] = js.undefined
}
object SlotValue {
  
  inline def apply(): SlotValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SlotValue]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SlotValue] (val x: Self) extends AnyVal {
    
    inline def setInterpretedValue(value: NonEmptyString): Self = StObject.set(x, "interpretedValue", value.asInstanceOf[js.Any])
    
    inline def setInterpretedValueUndefined: Self = StObject.set(x, "interpretedValue", js.undefined)
  }
}
