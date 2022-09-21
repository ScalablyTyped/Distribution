package typings.awsLambda.lexV2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.awsLambda.lexV2Mod.LexV2ScalarSlotValue
  - typings.awsLambda.lexV2Mod.LexV2ListSlotValue
*/
trait LexV2Slot extends StObject
object LexV2Slot {
  
  inline def LexV2ListSlotValue(value: LexV2SlotValue, values: js.Array[LexV2ScalarSlotValue]): typings.awsLambda.lexV2Mod.LexV2ListSlotValue = {
    val __obj = js.Dynamic.literal(shape = "List", value = value.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.awsLambda.lexV2Mod.LexV2ListSlotValue]
  }
  
  inline def LexV2ScalarSlotValue(value: LexV2SlotValue): typings.awsLambda.lexV2Mod.LexV2ScalarSlotValue = {
    val __obj = js.Dynamic.literal(shape = "Scalar", value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.awsLambda.lexV2Mod.LexV2ScalarSlotValue]
  }
}
