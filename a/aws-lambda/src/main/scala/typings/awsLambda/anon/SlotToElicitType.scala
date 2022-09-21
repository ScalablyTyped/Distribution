package typings.awsLambda.anon

import typings.awsLambda.awsLambdaStrings.ElicitSlot
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SlotToElicitType extends StObject {
  
  var slotToElicit: String
  
  var `type`: ElicitSlot
}
object SlotToElicitType {
  
  inline def apply(slotToElicit: String): SlotToElicitType = {
    val __obj = js.Dynamic.literal(slotToElicit = slotToElicit.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ElicitSlot")
    __obj.asInstanceOf[SlotToElicitType]
  }
  
  extension [Self <: SlotToElicitType](x: Self) {
    
    inline def setSlotToElicit(value: String): Self = StObject.set(x, "slotToElicit", value.asInstanceOf[js.Any])
    
    inline def setType(value: ElicitSlot): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
