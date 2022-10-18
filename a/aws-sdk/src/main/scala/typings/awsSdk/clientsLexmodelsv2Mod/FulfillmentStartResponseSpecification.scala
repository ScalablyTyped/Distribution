package typings.awsSdk.clientsLexmodelsv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FulfillmentStartResponseSpecification extends StObject {
  
  /**
    * Determines whether the user can interrupt the start message while it is playing.
    */
  var allowInterrupt: js.UndefOr[BoxedBoolean] = js.undefined
  
  /**
    * The delay between when the Lambda fulfillment function starts running and the start message is played. If the Lambda function returns before the delay is over, the start message isn't played.
    */
  var delayInSeconds: FulfillmentStartResponseDelay
  
  /**
    * One to 5 message groups that contain start messages. Amazon Lex chooses one of the messages to play to the user.
    */
  var messageGroups: MessageGroupsList
}
object FulfillmentStartResponseSpecification {
  
  inline def apply(delayInSeconds: FulfillmentStartResponseDelay, messageGroups: MessageGroupsList): FulfillmentStartResponseSpecification = {
    val __obj = js.Dynamic.literal(delayInSeconds = delayInSeconds.asInstanceOf[js.Any], messageGroups = messageGroups.asInstanceOf[js.Any])
    __obj.asInstanceOf[FulfillmentStartResponseSpecification]
  }
  
  extension [Self <: FulfillmentStartResponseSpecification](x: Self) {
    
    inline def setAllowInterrupt(value: BoxedBoolean): Self = StObject.set(x, "allowInterrupt", value.asInstanceOf[js.Any])
    
    inline def setAllowInterruptUndefined: Self = StObject.set(x, "allowInterrupt", js.undefined)
    
    inline def setDelayInSeconds(value: FulfillmentStartResponseDelay): Self = StObject.set(x, "delayInSeconds", value.asInstanceOf[js.Any])
    
    inline def setMessageGroups(value: MessageGroupsList): Self = StObject.set(x, "messageGroups", value.asInstanceOf[js.Any])
    
    inline def setMessageGroupsVarargs(value: MessageGroup*): Self = StObject.set(x, "messageGroups", js.Array(value*))
  }
}
