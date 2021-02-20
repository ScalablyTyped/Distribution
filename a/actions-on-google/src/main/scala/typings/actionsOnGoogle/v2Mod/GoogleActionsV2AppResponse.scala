package typings.actionsOnGoogle.v2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleActionsV2AppResponse extends StObject {
  
  /**
    * An opaque token that is recirculated to the Action every conversation
    * turn.
    */
  var conversationToken: js.UndefOr[String] = js.native
  
  /**
    * A custom push message that allows developers to send structured data to
    * Actions on Google.
    */
  var customPushMessage: js.UndefOr[GoogleActionsV2CustomPushMessage] = js.native
  
  /**
    * Indicates whether the Action is expecting a user response. This is true
    * when the conversation is ongoing, false when the conversation is done.
    */
  var expectUserResponse: js.UndefOr[Boolean] = js.native
  
  /**
    * List of inputs the Action expects, each input can be a common Actions on
    * Google intent (start with 'actions.'), or an input taking list of possible
    * intents. Only one input is supported for now.
    */
  var expectedInputs: js.UndefOr[js.Array[GoogleActionsV2ExpectedInput]] = js.native
  
  /**
    * Final response when the Action does not expect user's input.
    */
  var finalResponse: js.UndefOr[GoogleActionsV2FinalResponse] = js.native
  
  /**
    * Indicates whether the response should be handled in sandbox mode. This
    * bit is needed to push structured data to Google in sandbox mode.
    */
  var isInSandbox: js.UndefOr[Boolean] = js.native
  
  /**
    * Whether to clear the persisted user_storage. If set to true, then in the
    * next interaction with the user, the user_storage field will be empty.
    */
  var resetUserStorage: js.UndefOr[Boolean] = js.native
  
  /**
    * An opaque token controlled by the Action that is persisted across
    * conversations for a particular user. If empty or unspecified, the
    * existing persisted token will be unchanged.
    * The maximum size of the string is 10k bytes.
    * If multiple dialogs are occurring concurrently for the same user, then
    * updates to this token can overwrite each other unexpectedly.
    */
  var userStorage: js.UndefOr[String] = js.native
}
object GoogleActionsV2AppResponse {
  
  @scala.inline
  def apply(): GoogleActionsV2AppResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleActionsV2AppResponse]
  }
  
  @scala.inline
  implicit class GoogleActionsV2AppResponseMutableBuilder[Self <: GoogleActionsV2AppResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConversationToken(value: String): Self = StObject.set(x, "conversationToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConversationTokenUndefined: Self = StObject.set(x, "conversationToken", js.undefined)
    
    @scala.inline
    def setCustomPushMessage(value: GoogleActionsV2CustomPushMessage): Self = StObject.set(x, "customPushMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomPushMessageUndefined: Self = StObject.set(x, "customPushMessage", js.undefined)
    
    @scala.inline
    def setExpectUserResponse(value: Boolean): Self = StObject.set(x, "expectUserResponse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpectUserResponseUndefined: Self = StObject.set(x, "expectUserResponse", js.undefined)
    
    @scala.inline
    def setExpectedInputs(value: js.Array[GoogleActionsV2ExpectedInput]): Self = StObject.set(x, "expectedInputs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpectedInputsUndefined: Self = StObject.set(x, "expectedInputs", js.undefined)
    
    @scala.inline
    def setExpectedInputsVarargs(value: GoogleActionsV2ExpectedInput*): Self = StObject.set(x, "expectedInputs", js.Array(value :_*))
    
    @scala.inline
    def setFinalResponse(value: GoogleActionsV2FinalResponse): Self = StObject.set(x, "finalResponse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFinalResponseUndefined: Self = StObject.set(x, "finalResponse", js.undefined)
    
    @scala.inline
    def setIsInSandbox(value: Boolean): Self = StObject.set(x, "isInSandbox", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsInSandboxUndefined: Self = StObject.set(x, "isInSandbox", js.undefined)
    
    @scala.inline
    def setResetUserStorage(value: Boolean): Self = StObject.set(x, "resetUserStorage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResetUserStorageUndefined: Self = StObject.set(x, "resetUserStorage", js.undefined)
    
    @scala.inline
    def setUserStorage(value: String): Self = StObject.set(x, "userStorage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserStorageUndefined: Self = StObject.set(x, "userStorage", js.undefined)
  }
}
