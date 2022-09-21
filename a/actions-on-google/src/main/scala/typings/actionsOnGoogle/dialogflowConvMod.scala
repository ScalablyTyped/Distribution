package typings.actionsOnGoogle

import typings.actionsOnGoogle.actionssdkMod.Conversation
import typings.actionsOnGoogle.anon.ProtoAnystringJsonObject
import typings.actionsOnGoogle.apiV2Mod.GoogleCloudDialogflowV2EventInput
import typings.actionsOnGoogle.apiV2Mod.GoogleCloudDialogflowV2WebhookRequest
import typings.actionsOnGoogle.apiV2Mod.GoogleCloudDialogflowV2WebhookResponse
import typings.actionsOnGoogle.contextMod.ContextValues
import typings.actionsOnGoogle.contextMod.Contexts
import typings.actionsOnGoogle.contextMod.Parameters
import typings.actionsOnGoogle.conversationConversationMod.ConversationBaseOptions
import typings.actionsOnGoogle.conversationConversationMod.ConversationOptionsInit
import typings.actionsOnGoogle.incomingMod.Incoming
import typings.actionsOnGoogle.v1Mod.DialogflowV1FollowupEvent
import typings.actionsOnGoogle.v1Mod.DialogflowV1WebhookRequest
import typings.actionsOnGoogle.v1Mod.DialogflowV1WebhookResponse
import typings.actionsOnGoogle.v2Mod.GoogleActionsV2RichResponse
import typings.actionsOnGoogle.v2Mod.GoogleActionsV2SimpleResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dialogflowConvMod {
  
  @JSImport("actions-on-google/dist/service/dialogflow/conv", "DialogflowConversation")
  @js.native
  /** @public */
  open class DialogflowConversation[TConvData, TUserStorage, TContexts /* <: Contexts */] () extends Conversation[TUserStorage] {
    def this(options: DialogflowConversationOptions[TConvData, TUserStorage]) = this()
    
    /** @hidden */
    var _followup: js.UndefOr[GoogleCloudDialogflowV2EventInput | DialogflowV1FollowupEvent] = js.native
    
    /** @hidden */
    @JSName("_init")
    var _init_DialogflowConversation: ConversationOptionsInit[TConvData, TUserStorage] = js.native
    
    /**
      * Get the current Dialogflow action name.
      *
      * @example
      * ```javascript
      *
      * app.intent('Default Welcome Intent', conv => {
      *   const action = conv.action
      * })
      * ```
      *
      * @public
      */
    var action: String = js.native
    
    /** @public */
    var body: GoogleCloudDialogflowV2WebhookRequest | DialogflowV1WebhookRequest = js.native
    
    /** @public */
    var contexts: ContextValues[TContexts] = js.native
    
    /**
      * The session data in JSON format.
      * Stored using contexts.
      *
      * @example
      * ```javascript
      *
      * app.intent('Default Welcome Intent', conv => {
      *   conv.data.someProperty = 'someValue'
      * })
      * ```
      *
      * @public
      */
    var data: TConvData = js.native
    
    /**
      * Triggers an intent of your choosing by sending a followup event from the webhook.
      * Final response can theoretically include responses but these will not be handled
      * by Dialogflow. Dialogflow will not pass anything back to Google Assistant, therefore
      * Google Assistant specific information, most notably conv.user.storage, is ignored.
      *
      * @example
      * ```javascript
      *
      * const app = dialogflow()
      *
      * // Create a Dialogflow intent with event 'apply-for-license-event'
      *
      * app.intent('Default Welcome Intent', conv => {
      *   conv.followup('apply-for-license-event', {
      *     date: new Date().toISOString(),
      *   })
      *   // The dialogflow intent with the 'apply-for-license-event' event
      *   // will be triggered with the given parameters `date`
      * })
      * ```
      *
      * @param event Name of the event
      * @param parameters Parameters to send with the event
      * @param lang The language of this query.
      *     See {@link https://dialogflow.com/docs/languages|Language Support}
      *     for a list of the currently supported language codes.
      *     Note that queries in the same session do not necessarily need to specify the same language.
      *     By default, it is the languageCode sent with Dialogflow's queryResult.languageCode
      * @public
      */
    def followup(event: String): this.type = js.native
    def followup(event: String, parameters: Unit, lang: String): this.type = js.native
    def followup(event: String, parameters: Parameters): this.type = js.native
    def followup(event: String, parameters: Parameters, lang: String): this.type = js.native
    
    /** @public */
    var incoming: Incoming = js.native
    
    /**
      * Get the current Dialogflow intent name.
      *
      * @example
      * ```javascript
      *
      * app.intent('Default Welcome Intent', conv => {
      *   const intent = conv.intent // will be 'Default Welcome Intent'
      * })
      * ```
      *
      * @public
      */
    var intent: String = js.native
    
    /**
      * The Dialogflow parameters from the current intent.
      * Values will only be a string, an Object, or undefined if not included.
      *
      * Will also be sent via intent handler 3rd argument which is the encouraged method to retrieve.
      *
      * @example
      * ```javascript
      *
      * // Encouraged method through intent handler
      * app.intent('Tell Greeting', (conv, params) => {
      *   const color = params.color
      *   const num = params.num
      * })
      *
      * // Encouraged method through destructuring in intent handler
      * app.intent('Tell Greeting', (conv, { color, num }) => {
      *   // now use color and num as variables
      * }))
      *
      * // Using conv.parameters
      * app.intent('Tell Greeting', conv => {
      *   const parameters = conv.parameters
      *   // or destructed
      *   const { color, num } = conv.parameters
      * })
      * ```
      *
      * @public
      */
    var parameters: Parameters = js.native
    
    /**
      * The user's raw input query.
      *
      * @example
      * ```javascript
      *
      * app.intent('User Input', conv => {
      *   conv.close(`You said ${conv.query}`)
      * })
      * ```
      *
      * @public
      */
    var query: String = js.native
    
    /** @public */
    def serialize(): GoogleCloudDialogflowV2WebhookResponse | DialogflowV1WebhookResponse = js.native
    
    /** @public */
    var version: Double = js.native
  }
  
  trait DialogflowConversationOptions[TConvData, TUserStorage]
    extends StObject
       with ConversationBaseOptions[TConvData, TUserStorage] {
    
    /** @public */
    var body: js.UndefOr[GoogleCloudDialogflowV2WebhookRequest | DialogflowV1WebhookRequest] = js.undefined
  }
  object DialogflowConversationOptions {
    
    inline def apply[TConvData, TUserStorage](): DialogflowConversationOptions[TConvData, TUserStorage] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DialogflowConversationOptions[TConvData, TUserStorage]]
    }
    
    extension [Self <: DialogflowConversationOptions[?, ?], TConvData, TUserStorage](x: Self & (DialogflowConversationOptions[TConvData, TUserStorage])) {
      
      inline def setBody(value: GoogleCloudDialogflowV2WebhookRequest | DialogflowV1WebhookRequest): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
    }
  }
  
  trait GoogleAssistantResponse extends StObject {
    
    var expectUserResponse: js.UndefOr[Boolean] = js.undefined
    
    var isSsml: js.UndefOr[Boolean] = js.undefined
    
    var noInputPrompts: js.UndefOr[js.Array[GoogleActionsV2SimpleResponse]] = js.undefined
    
    var richResponse: js.UndefOr[GoogleActionsV2RichResponse] = js.undefined
    
    var speechBiasingHints: js.UndefOr[js.Array[String]] = js.undefined
    
    var systemIntent: js.UndefOr[SystemIntent] = js.undefined
    
    var userStorage: js.UndefOr[String] = js.undefined
  }
  object GoogleAssistantResponse {
    
    inline def apply(): GoogleAssistantResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GoogleAssistantResponse]
    }
    
    extension [Self <: GoogleAssistantResponse](x: Self) {
      
      inline def setExpectUserResponse(value: Boolean): Self = StObject.set(x, "expectUserResponse", value.asInstanceOf[js.Any])
      
      inline def setExpectUserResponseUndefined: Self = StObject.set(x, "expectUserResponse", js.undefined)
      
      inline def setIsSsml(value: Boolean): Self = StObject.set(x, "isSsml", value.asInstanceOf[js.Any])
      
      inline def setIsSsmlUndefined: Self = StObject.set(x, "isSsml", js.undefined)
      
      inline def setNoInputPrompts(value: js.Array[GoogleActionsV2SimpleResponse]): Self = StObject.set(x, "noInputPrompts", value.asInstanceOf[js.Any])
      
      inline def setNoInputPromptsUndefined: Self = StObject.set(x, "noInputPrompts", js.undefined)
      
      inline def setNoInputPromptsVarargs(value: GoogleActionsV2SimpleResponse*): Self = StObject.set(x, "noInputPrompts", js.Array(value*))
      
      inline def setRichResponse(value: GoogleActionsV2RichResponse): Self = StObject.set(x, "richResponse", value.asInstanceOf[js.Any])
      
      inline def setRichResponseUndefined: Self = StObject.set(x, "richResponse", js.undefined)
      
      inline def setSpeechBiasingHints(value: js.Array[String]): Self = StObject.set(x, "speechBiasingHints", value.asInstanceOf[js.Any])
      
      inline def setSpeechBiasingHintsUndefined: Self = StObject.set(x, "speechBiasingHints", js.undefined)
      
      inline def setSpeechBiasingHintsVarargs(value: String*): Self = StObject.set(x, "speechBiasingHints", js.Array(value*))
      
      inline def setSystemIntent(value: SystemIntent): Self = StObject.set(x, "systemIntent", value.asInstanceOf[js.Any])
      
      inline def setSystemIntentUndefined: Self = StObject.set(x, "systemIntent", js.undefined)
      
      inline def setUserStorage(value: String): Self = StObject.set(x, "userStorage", value.asInstanceOf[js.Any])
      
      inline def setUserStorageUndefined: Self = StObject.set(x, "userStorage", js.undefined)
    }
  }
  
  trait PayloadGoogle extends StObject {
    
    var google: GoogleAssistantResponse
  }
  object PayloadGoogle {
    
    inline def apply(google: GoogleAssistantResponse): PayloadGoogle = {
      val __obj = js.Dynamic.literal(google = google.asInstanceOf[js.Any])
      __obj.asInstanceOf[PayloadGoogle]
    }
    
    extension [Self <: PayloadGoogle](x: Self) {
      
      inline def setGoogle(value: GoogleAssistantResponse): Self = StObject.set(x, "google", value.asInstanceOf[js.Any])
    }
  }
  
  trait SystemIntent extends StObject {
    
    var data: ProtoAnystringJsonObject
    
    var intent: String
  }
  object SystemIntent {
    
    inline def apply(data: ProtoAnystringJsonObject, intent: String): SystemIntent = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], intent = intent.asInstanceOf[js.Any])
      __obj.asInstanceOf[SystemIntent]
    }
    
    extension [Self <: SystemIntent](x: Self) {
      
      inline def setData(value: ProtoAnystringJsonObject): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setIntent(value: String): Self = StObject.set(x, "intent", value.asInstanceOf[js.Any])
    }
  }
}
