package typings.actionsOnGoogle

import typings.actionsOnGoogle.distServiceActionssdkApiV2Mod.GoogleActionsV2AppRequest
import typings.actionsOnGoogle.distServiceActionssdkApiV2Mod.GoogleActionsV2AppResponse
import typings.actionsOnGoogle.distServiceActionssdkConversationConversationMod.ConversationBaseOptions
import typings.actionsOnGoogle.distServiceActionssdkConversationConversationMod.ConversationOptionsInit
import typings.actionsOnGoogle.distServiceActionssdkConversationMod.Conversation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distServiceActionssdkConvMod {
  
  @JSImport("actions-on-google/dist/service/actionssdk/conv", "ActionsSdkConversation")
  @js.native
  /** @public */
  open class ActionsSdkConversation[TConvData, TUserStorage] () extends Conversation[TUserStorage] {
    def this(options: ActionsSdkConversationOptions[TConvData, TUserStorage]) = this()
    
    /** @hidden */
    @JSName("_init")
    var _init_ActionsSdkConversation: ConversationOptionsInit[TConvData, TUserStorage] = js.native
    
    /** @public */
    var body: GoogleActionsV2AppRequest = js.native
    
    /**
      * The session data in JSON format.
      * Stored using conversationToken.
      *
      * @example
      * ```javascript
      *
      * app.intent('actions.intent.MAIN', conv => {
      *   conv.data.someProperty = 'someValue'
      * })
      * ```
      *
      * @public
      */
    var data: TConvData = js.native
    
    /**
      * Get the current Actions SDK intent.
      *
      * @example
      * ```javascript
      *
      * app.intent('actions.intent.MAIN', conv => {
      *   const intent = conv.intent // will be 'actions.intent.MAIN'
      * })
      * ```
      *
      * @public
      */
    var intent: String = js.native
    
    /** @public */
    def serialize(): GoogleActionsV2AppResponse = js.native
  }
  
  trait ActionsSdkConversationOptions[TConvData, TUserStorage]
    extends StObject
       with ConversationBaseOptions[TConvData, TUserStorage] {
    
    /** @public */
    var body: js.UndefOr[GoogleActionsV2AppRequest] = js.undefined
  }
  object ActionsSdkConversationOptions {
    
    inline def apply[TConvData, TUserStorage](): ActionsSdkConversationOptions[TConvData, TUserStorage] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ActionsSdkConversationOptions[TConvData, TUserStorage]]
    }
    
    extension [Self <: ActionsSdkConversationOptions[?, ?], TConvData, TUserStorage](x: Self & (ActionsSdkConversationOptions[TConvData, TUserStorage])) {
      
      inline def setBody(value: GoogleActionsV2AppRequest): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
    }
  }
}
