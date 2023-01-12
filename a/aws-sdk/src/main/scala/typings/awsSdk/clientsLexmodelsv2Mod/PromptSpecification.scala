package typings.awsSdk.clientsLexmodelsv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PromptSpecification extends StObject {
  
  /**
    * Indicates whether the user can interrupt a speech prompt from the bot.
    */
  var allowInterrupt: js.UndefOr[BoxedBoolean] = js.undefined
  
  /**
    * The maximum number of times the bot tries to elicit a response from the user using this prompt.
    */
  var maxRetries: PromptMaxRetries
  
  /**
    * A collection of messages that Amazon Lex can send to the user. Amazon Lex chooses the actual message to send at runtime.
    */
  var messageGroups: MessageGroupsList
  
  /**
    * Indicates how a message is selected from a message group among retries.
    */
  var messageSelectionStrategy: js.UndefOr[MessageSelectionStrategy] = js.undefined
  
  /**
    * Specifies the advanced settings on each attempt of the prompt.
    */
  var promptAttemptsSpecification: js.UndefOr[PromptAttemptsSpecificationMap] = js.undefined
}
object PromptSpecification {
  
  inline def apply(maxRetries: PromptMaxRetries, messageGroups: MessageGroupsList): PromptSpecification = {
    val __obj = js.Dynamic.literal(maxRetries = maxRetries.asInstanceOf[js.Any], messageGroups = messageGroups.asInstanceOf[js.Any])
    __obj.asInstanceOf[PromptSpecification]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PromptSpecification] (val x: Self) extends AnyVal {
    
    inline def setAllowInterrupt(value: BoxedBoolean): Self = StObject.set(x, "allowInterrupt", value.asInstanceOf[js.Any])
    
    inline def setAllowInterruptUndefined: Self = StObject.set(x, "allowInterrupt", js.undefined)
    
    inline def setMaxRetries(value: PromptMaxRetries): Self = StObject.set(x, "maxRetries", value.asInstanceOf[js.Any])
    
    inline def setMessageGroups(value: MessageGroupsList): Self = StObject.set(x, "messageGroups", value.asInstanceOf[js.Any])
    
    inline def setMessageGroupsVarargs(value: MessageGroup*): Self = StObject.set(x, "messageGroups", js.Array(value*))
    
    inline def setMessageSelectionStrategy(value: MessageSelectionStrategy): Self = StObject.set(x, "messageSelectionStrategy", value.asInstanceOf[js.Any])
    
    inline def setMessageSelectionStrategyUndefined: Self = StObject.set(x, "messageSelectionStrategy", js.undefined)
    
    inline def setPromptAttemptsSpecification(value: PromptAttemptsSpecificationMap): Self = StObject.set(x, "promptAttemptsSpecification", value.asInstanceOf[js.Any])
    
    inline def setPromptAttemptsSpecificationUndefined: Self = StObject.set(x, "promptAttemptsSpecification", js.undefined)
  }
}
