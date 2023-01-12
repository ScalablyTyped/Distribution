package typings.awsSdk.clientsLexmodelsv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StillWaitingResponseSpecification extends StObject {
  
  /**
    * Indicates that the user can interrupt the response by speaking while the message is being played.
    */
  var allowInterrupt: js.UndefOr[BoxedBoolean] = js.undefined
  
  /**
    * How often a message should be sent to the user. Minimum of 1 second, maximum of 5 minutes.
    */
  var frequencyInSeconds: StillWaitingResponseFrequency
  
  /**
    * One or more message groups, each containing one or more messages, that define the prompts that Amazon Lex sends to the user.
    */
  var messageGroups: MessageGroupsList
  
  /**
    * If Amazon Lex waits longer than this length of time for a response, it will stop sending messages.
    */
  var timeoutInSeconds: StillWaitingResponseTimeout
}
object StillWaitingResponseSpecification {
  
  inline def apply(
    frequencyInSeconds: StillWaitingResponseFrequency,
    messageGroups: MessageGroupsList,
    timeoutInSeconds: StillWaitingResponseTimeout
  ): StillWaitingResponseSpecification = {
    val __obj = js.Dynamic.literal(frequencyInSeconds = frequencyInSeconds.asInstanceOf[js.Any], messageGroups = messageGroups.asInstanceOf[js.Any], timeoutInSeconds = timeoutInSeconds.asInstanceOf[js.Any])
    __obj.asInstanceOf[StillWaitingResponseSpecification]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StillWaitingResponseSpecification] (val x: Self) extends AnyVal {
    
    inline def setAllowInterrupt(value: BoxedBoolean): Self = StObject.set(x, "allowInterrupt", value.asInstanceOf[js.Any])
    
    inline def setAllowInterruptUndefined: Self = StObject.set(x, "allowInterrupt", js.undefined)
    
    inline def setFrequencyInSeconds(value: StillWaitingResponseFrequency): Self = StObject.set(x, "frequencyInSeconds", value.asInstanceOf[js.Any])
    
    inline def setMessageGroups(value: MessageGroupsList): Self = StObject.set(x, "messageGroups", value.asInstanceOf[js.Any])
    
    inline def setMessageGroupsVarargs(value: MessageGroup*): Self = StObject.set(x, "messageGroups", js.Array(value*))
    
    inline def setTimeoutInSeconds(value: StillWaitingResponseTimeout): Self = StObject.set(x, "timeoutInSeconds", value.asInstanceOf[js.Any])
  }
}
