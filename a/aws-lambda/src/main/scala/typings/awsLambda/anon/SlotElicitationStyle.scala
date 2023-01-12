package typings.awsLambda.anon

import typings.awsLambda.awsLambdaStrings.Default
import typings.awsLambda.awsLambdaStrings.ElicitSlot
import typings.awsLambda.awsLambdaStrings.SpellByLetter
import typings.awsLambda.awsLambdaStrings.SpellByWord
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SlotElicitationStyle extends StObject {
  
  var slotElicitationStyle: Default | SpellByLetter | SpellByWord
  
  var slotToElicit: String
  
  var `type`: ElicitSlot
}
object SlotElicitationStyle {
  
  inline def apply(slotElicitationStyle: Default | SpellByLetter | SpellByWord, slotToElicit: String): SlotElicitationStyle = {
    val __obj = js.Dynamic.literal(slotElicitationStyle = slotElicitationStyle.asInstanceOf[js.Any], slotToElicit = slotToElicit.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ElicitSlot")
    __obj.asInstanceOf[SlotElicitationStyle]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SlotElicitationStyle] (val x: Self) extends AnyVal {
    
    inline def setSlotElicitationStyle(value: Default | SpellByLetter | SpellByWord): Self = StObject.set(x, "slotElicitationStyle", value.asInstanceOf[js.Any])
    
    inline def setSlotToElicit(value: String): Self = StObject.set(x, "slotToElicit", value.asInstanceOf[js.Any])
    
    inline def setType(value: ElicitSlot): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
