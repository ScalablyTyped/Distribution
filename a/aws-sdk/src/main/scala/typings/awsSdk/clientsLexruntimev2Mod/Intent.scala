package typings.awsSdk.clientsLexruntimev2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Intent extends StObject {
  
  /**
    * Contains information about whether fulfillment of the intent has been confirmed.
    */
  var confirmationState: js.UndefOr[ConfirmationState] = js.undefined
  
  /**
    * The name of the intent.
    */
  var name: NonEmptyString
  
  /**
    * A map of all of the slots for the intent. The name of the slot maps to the value of the slot. If a slot has not been filled, the value is null.
    */
  var slots: js.UndefOr[Slots] = js.undefined
  
  /**
    * Contains fulfillment information for the intent. 
    */
  var state: js.UndefOr[IntentState] = js.undefined
}
object Intent {
  
  inline def apply(name: NonEmptyString): Intent = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Intent]
  }
  
  extension [Self <: Intent](x: Self) {
    
    inline def setConfirmationState(value: ConfirmationState): Self = StObject.set(x, "confirmationState", value.asInstanceOf[js.Any])
    
    inline def setConfirmationStateUndefined: Self = StObject.set(x, "confirmationState", js.undefined)
    
    inline def setName(value: NonEmptyString): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setSlots(value: Slots): Self = StObject.set(x, "slots", value.asInstanceOf[js.Any])
    
    inline def setSlotsUndefined: Self = StObject.set(x, "slots", js.undefined)
    
    inline def setState(value: IntentState): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
  }
}
