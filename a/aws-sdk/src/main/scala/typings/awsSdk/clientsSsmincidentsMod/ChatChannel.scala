package typings.awsSdk.clientsSsmincidentsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChatChannel extends StObject {
  
  /**
    * The Amazon SNS targets that Chatbot uses to notify the chat channel of updates to an incident. You can also make updates to the incident through the chat channel by using the Amazon SNS topics. 
    */
  var chatbotSns: js.UndefOr[ChatbotSnsConfigurationSet] = js.undefined
  
  /**
    * Used to remove the chat channel from an incident record or response plan.
    */
  var empty: js.UndefOr[EmptyChatChannel] = js.undefined
}
object ChatChannel {
  
  inline def apply(): ChatChannel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChatChannel]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ChatChannel] (val x: Self) extends AnyVal {
    
    inline def setChatbotSns(value: ChatbotSnsConfigurationSet): Self = StObject.set(x, "chatbotSns", value.asInstanceOf[js.Any])
    
    inline def setChatbotSnsUndefined: Self = StObject.set(x, "chatbotSns", js.undefined)
    
    inline def setChatbotSnsVarargs(value: SnsArn*): Self = StObject.set(x, "chatbotSns", js.Array(value*))
    
    inline def setEmpty(value: EmptyChatChannel): Self = StObject.set(x, "empty", value.asInstanceOf[js.Any])
    
    inline def setEmptyUndefined: Self = StObject.set(x, "empty", js.undefined)
  }
}
