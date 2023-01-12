package typings.awsSdk.clientsLexmodelsv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SlotPriority extends StObject {
  
  /**
    * The priority that a slot should be elicited.
    */
  var priority: PriorityValue
  
  /**
    * The unique identifier of the slot.
    */
  var slotId: Id
}
object SlotPriority {
  
  inline def apply(priority: PriorityValue, slotId: Id): SlotPriority = {
    val __obj = js.Dynamic.literal(priority = priority.asInstanceOf[js.Any], slotId = slotId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SlotPriority]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SlotPriority] (val x: Self) extends AnyVal {
    
    inline def setPriority(value: PriorityValue): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
    
    inline def setSlotId(value: Id): Self = StObject.set(x, "slotId", value.asInstanceOf[js.Any])
  }
}
