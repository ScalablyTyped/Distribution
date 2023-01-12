package typings.awsSdk.clientsLexmodelsv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IntentOverride extends StObject {
  
  /**
    * The name of the intent. Only required when you're switching intents.
    */
  var name: js.UndefOr[Name] = js.undefined
  
  /**
    * A map of all of the slot value overrides for the intent. The name of the slot maps to the value of the slot. Slots that are not included in the map aren't overridden.,
    */
  var slots: js.UndefOr[SlotValueOverrideMap] = js.undefined
}
object IntentOverride {
  
  inline def apply(): IntentOverride = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IntentOverride]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IntentOverride] (val x: Self) extends AnyVal {
    
    inline def setName(value: Name): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setSlots(value: SlotValueOverrideMap): Self = StObject.set(x, "slots", value.asInstanceOf[js.Any])
    
    inline def setSlotsUndefined: Self = StObject.set(x, "slots", js.undefined)
  }
}
