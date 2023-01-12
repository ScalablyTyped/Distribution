package typings.awsLambda.triggerLexV2Mod

import typings.awsLambda.awsLambdaStrings.Scalar
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LexV2ScalarSlotValue
  extends StObject
     with LexV2Slot {
  
  var shape: Scalar
  
  var value: LexV2SlotValue
}
object LexV2ScalarSlotValue {
  
  inline def apply(value: LexV2SlotValue): LexV2ScalarSlotValue = {
    val __obj = js.Dynamic.literal(shape = "Scalar", value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[LexV2ScalarSlotValue]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LexV2ScalarSlotValue] (val x: Self) extends AnyVal {
    
    inline def setShape(value: Scalar): Self = StObject.set(x, "shape", value.asInstanceOf[js.Any])
    
    inline def setValue(value: LexV2SlotValue): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
