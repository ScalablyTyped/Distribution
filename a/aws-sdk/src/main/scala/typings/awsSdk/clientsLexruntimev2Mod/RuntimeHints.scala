package typings.awsSdk.clientsLexruntimev2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RuntimeHints extends StObject {
  
  /**
    * A list of the slots in the intent that should have runtime hints added, and the phrases that should be added for each slot. The first level of the slotHints map is the name of the intent. The second level is the name of the slot within the intent. For more information, see Using hints to improve accuracy. The intent name and slot name must exist.
    */
  var slotHints: js.UndefOr[SlotHintsIntentMap] = js.undefined
}
object RuntimeHints {
  
  inline def apply(): RuntimeHints = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RuntimeHints]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RuntimeHints] (val x: Self) extends AnyVal {
    
    inline def setSlotHints(value: SlotHintsIntentMap): Self = StObject.set(x, "slotHints", value.asInstanceOf[js.Any])
    
    inline def setSlotHintsUndefined: Self = StObject.set(x, "slotHints", js.undefined)
  }
}
