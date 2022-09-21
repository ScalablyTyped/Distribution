package typings.awsLambda.lexV2Mod

import typings.awsLambda.awsLambdaStrings.Confirmed_
import typings.awsLambda.awsLambdaStrings.Denied
import typings.awsLambda.awsLambdaStrings.None
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LexV2Intent extends StObject {
  
  var confirmationState: Confirmed_ | Denied | None
  
  var kendraResponse: js.UndefOr[Any] = js.undefined
  
  var name: String
  
  var slots: LexV2Slots
  
  var state: LexV2IntentState
}
object LexV2Intent {
  
  inline def apply(
    confirmationState: Confirmed_ | Denied | None,
    name: String,
    slots: LexV2Slots,
    state: LexV2IntentState
  ): LexV2Intent = {
    val __obj = js.Dynamic.literal(confirmationState = confirmationState.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], slots = slots.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[LexV2Intent]
  }
  
  extension [Self <: LexV2Intent](x: Self) {
    
    inline def setConfirmationState(value: Confirmed_ | Denied | None): Self = StObject.set(x, "confirmationState", value.asInstanceOf[js.Any])
    
    inline def setKendraResponse(value: Any): Self = StObject.set(x, "kendraResponse", value.asInstanceOf[js.Any])
    
    inline def setKendraResponseUndefined: Self = StObject.set(x, "kendraResponse", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setSlots(value: LexV2Slots): Self = StObject.set(x, "slots", value.asInstanceOf[js.Any])
    
    inline def setState(value: LexV2IntentState): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
  }
}
