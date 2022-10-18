package typings.awsSdk.clientsEmrMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StepStateChangeReason extends StObject {
  
  /**
    * The programmable code for the state change reason. Note: Currently, the service provides no code for the state change.
    */
  var Code: js.UndefOr[StepStateChangeReasonCode] = js.undefined
  
  /**
    * The descriptive message for the state change reason.
    */
  var Message: js.UndefOr[String] = js.undefined
}
object StepStateChangeReason {
  
  inline def apply(): StepStateChangeReason = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StepStateChangeReason]
  }
  
  extension [Self <: StepStateChangeReason](x: Self) {
    
    inline def setCode(value: StepStateChangeReasonCode): Self = StObject.set(x, "Code", value.asInstanceOf[js.Any])
    
    inline def setCodeUndefined: Self = StObject.set(x, "Code", js.undefined)
    
    inline def setMessage(value: String): Self = StObject.set(x, "Message", value.asInstanceOf[js.Any])
    
    inline def setMessageUndefined: Self = StObject.set(x, "Message", js.undefined)
  }
}
