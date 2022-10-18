package typings.awsSdk.clientsLexmodelsv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WaitAndContinueSpecification extends StObject {
  
  /**
    * Specifies whether the bot will wait for a user to respond. When this field is false, wait and continue responses for a slot aren't used. If the active field isn't specified, the default is true.
    */
  var active: js.UndefOr[BoxedBoolean] = js.undefined
  
  /**
    * The response that Amazon Lex sends to indicate that the bot is ready to continue the conversation.
    */
  var continueResponse: ResponseSpecification
  
  /**
    * A response that Amazon Lex sends periodically to the user to indicate that the bot is still waiting for input from the user.
    */
  var stillWaitingResponse: js.UndefOr[StillWaitingResponseSpecification] = js.undefined
  
  /**
    * The response that Amazon Lex sends to indicate that the bot is waiting for the conversation to continue.
    */
  var waitingResponse: ResponseSpecification
}
object WaitAndContinueSpecification {
  
  inline def apply(continueResponse: ResponseSpecification, waitingResponse: ResponseSpecification): WaitAndContinueSpecification = {
    val __obj = js.Dynamic.literal(continueResponse = continueResponse.asInstanceOf[js.Any], waitingResponse = waitingResponse.asInstanceOf[js.Any])
    __obj.asInstanceOf[WaitAndContinueSpecification]
  }
  
  extension [Self <: WaitAndContinueSpecification](x: Self) {
    
    inline def setActive(value: BoxedBoolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
    
    inline def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
    
    inline def setContinueResponse(value: ResponseSpecification): Self = StObject.set(x, "continueResponse", value.asInstanceOf[js.Any])
    
    inline def setStillWaitingResponse(value: StillWaitingResponseSpecification): Self = StObject.set(x, "stillWaitingResponse", value.asInstanceOf[js.Any])
    
    inline def setStillWaitingResponseUndefined: Self = StObject.set(x, "stillWaitingResponse", js.undefined)
    
    inline def setWaitingResponse(value: ResponseSpecification): Self = StObject.set(x, "waitingResponse", value.asInstanceOf[js.Any])
  }
}
