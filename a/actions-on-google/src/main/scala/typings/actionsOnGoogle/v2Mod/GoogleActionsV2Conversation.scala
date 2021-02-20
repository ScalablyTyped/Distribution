package typings.actionsOnGoogle.v2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleActionsV2Conversation extends StObject {
  
  /**
    * Unique ID for the multi-turn conversation. It's assigned for the first
    * turn. After that it remains the same for subsequent conversation turns
    * until the conversation is terminated.
    */
  var conversationId: js.UndefOr[String] = js.native
  
  /**
    * Opaque token specified by the Action in the last conversation turn. It can
    * be used by an Action to track the conversation or to store conversation
    * related data.
    */
  var conversationToken: js.UndefOr[String] = js.native
  
  /**
    * Type indicates the state of the conversation in its lifecycle.
    */
  var `type`: js.UndefOr[GoogleActionsV2ConversationType] = js.native
}
object GoogleActionsV2Conversation {
  
  @scala.inline
  def apply(): GoogleActionsV2Conversation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleActionsV2Conversation]
  }
  
  @scala.inline
  implicit class GoogleActionsV2ConversationMutableBuilder[Self <: GoogleActionsV2Conversation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConversationId(value: String): Self = StObject.set(x, "conversationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConversationIdUndefined: Self = StObject.set(x, "conversationId", js.undefined)
    
    @scala.inline
    def setConversationToken(value: String): Self = StObject.set(x, "conversationToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConversationTokenUndefined: Self = StObject.set(x, "conversationToken", js.undefined)
    
    @scala.inline
    def setType(value: GoogleActionsV2ConversationType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
