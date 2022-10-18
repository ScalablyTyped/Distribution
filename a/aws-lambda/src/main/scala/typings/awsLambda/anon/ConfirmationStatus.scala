package typings.awsLambda.anon

import typings.awsLambda.awsLambdaStrings.Confirmed_
import typings.awsLambda.awsLambdaStrings.Denied
import typings.awsLambda.awsLambdaStrings.None
import typings.awsLambda.triggerLexMod.LexEventSlots
import typings.awsLambda.triggerLexMod.LexSlotDetails
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConfirmationStatus extends StObject {
  
  var confirmationStatus: None | Confirmed_ | Denied
  
  var name: String
  
  var slotDetails: LexSlotDetails
  
  var slots: LexEventSlots
}
object ConfirmationStatus {
  
  inline def apply(
    confirmationStatus: None | Confirmed_ | Denied,
    name: String,
    slotDetails: LexSlotDetails,
    slots: LexEventSlots
  ): ConfirmationStatus = {
    val __obj = js.Dynamic.literal(confirmationStatus = confirmationStatus.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], slotDetails = slotDetails.asInstanceOf[js.Any], slots = slots.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConfirmationStatus]
  }
  
  extension [Self <: ConfirmationStatus](x: Self) {
    
    inline def setConfirmationStatus(value: None | Confirmed_ | Denied): Self = StObject.set(x, "confirmationStatus", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setSlotDetails(value: LexSlotDetails): Self = StObject.set(x, "slotDetails", value.asInstanceOf[js.Any])
    
    inline def setSlots(value: LexEventSlots): Self = StObject.set(x, "slots", value.asInstanceOf[js.Any])
  }
}
