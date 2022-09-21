package typings.actionsOnGoogle

import org.scalablytyped.runtime.StringDictionary
import typings.actionsOnGoogle.argumentMod.Arguments
import typings.actionsOnGoogle.assistantMod.AppOptions
import typings.actionsOnGoogle.assistantMod.ServiceBaseApp
import typings.actionsOnGoogle.canvasMod.Canvas
import typings.actionsOnGoogle.commonMod.JsonObject
import typings.actionsOnGoogle.deviceMod.Device
import typings.actionsOnGoogle.frameworkFrameworkMod.BuiltinFrameworkMetadata
import typings.actionsOnGoogle.frameworkFrameworkMod.Headers
import typings.actionsOnGoogle.frameworkFrameworkMod.StandardResponse
import typings.actionsOnGoogle.helperMod.Helper
import typings.actionsOnGoogle.htmlMod.HtmlResponse
import typings.actionsOnGoogle.inputMod.Input
import typings.actionsOnGoogle.responseMod.SimpleResponse
import typings.actionsOnGoogle.surfaceMod.Available
import typings.actionsOnGoogle.surfaceMod.Surface
import typings.actionsOnGoogle.userMod.User
import typings.actionsOnGoogle.v2Mod.GoogleActionsV2AppRequest
import typings.actionsOnGoogle.v2Mod.GoogleActionsV2ConversationType
import typings.actionsOnGoogle.v2Mod.GoogleActionsV2ExpectedIntent
import typings.actionsOnGoogle.v2Mod.GoogleActionsV2RichResponse
import typings.actionsOnGoogle.v2Mod.GoogleActionsV2SimpleResponse
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object conversationConversationMod {
  
  @JSImport("actions-on-google/dist/service/actionssdk/conversation/conversation", "Conversation")
  @js.native
  /** @hidden */
  open class Conversation[TUserStorage] () extends StObject {
    def this(options: ConversationOptions[TUserStorage]) = this()
    
    /** @hidden */
    var _init: ConversationOptionsInit[js.Object, TUserStorage] = js.native
    
    /** @hidden */
    var _ordersv3: Boolean = js.native
    
    /** @hidden */
    var _raw: js.UndefOr[JsonObject] = js.native
    
    /** @hidden */
    var _responded: Boolean = js.native
    
    /** @public */
    def add(responses: Response*): this.type = js.native
    
    /** @public */
    var arguments: Arguments = js.native
    
    /**
      * Asks to collect user's input. All user's queries need to be sent to the app.
      * {@link https://developers.google.com/actions/policies/general-policies#user_experience|
      *     The guidelines when prompting the user for a response must be followed at all times}.
      *
      * @example
      * ```javascript
      *
      * // Actions SDK
      * const app = actionssdk()
      *
      * app.intent('actions.intent.MAIN', conv => {
      *   const ssml = '<speak>Hi! <break time="1"/> ' +
      *     'I can read out an ordinal like <say-as interpret-as="ordinal">123</say-as>. ' +
      *     'Say a number.</speak>'
      *   conv.ask(ssml)
      * })
      *
      * app.intent('actions.intent.TEXT', (conv, input) => {
      *   if (input === 'bye') {
      *     return conv.close('Goodbye!')
      *   }
      *   const ssml = `<speak>You said, <say-as interpret-as="ordinal">${input}</say-as></speak>`
      *   conv.ask(ssml)
      * })
      *
      * // Dialogflow
      * const app = dialogflow()
      *
      * app.intent('Default Welcome Intent', conv => {
      *   conv.ask('Welcome to action snippets! Say a number.')
      * })
      *
      * app.intent('Number Input', (conv, {num}) => {
      *   conv.close(`You said ${num}`)
      * })
      * ```
      *
      * @param responses A response fragment for the library to construct a single complete response
      * @public
      */
    def ask(responses: Response*): this.type = js.native
    
    /** @public */
    var available: Available = js.native
    
    /** @public */
    var canvas: Canvas = js.native
    
    /**
      * Have Assistant render the speech response and close the mic.
      *
      * @example
      * ```javascript
      *
      * // Actions SDK
      * const app = actionssdk()
      *
      * app.intent('actions.intent.MAIN', conv => {
      *   const ssml = '<speak>Hi! <break time="1"/> ' +
      *     'I can read out an ordinal like <say-as interpret-as="ordinal">123</say-as>. ' +
      *     'Say a number.</speak>'
      *   conv.ask(ssml)
      * })
      *
      * app.intent('actions.intent.TEXT', (conv, input) => {
      *   if (input === 'bye') {
      *     return conv.close('Goodbye!')
      *   }
      *   const ssml = `<speak>You said, <say-as interpret-as="ordinal">${input}</say-as></speak>`
      *   conv.ask(ssml)
      * })
      *
      * // Dialogflow
      * const app = dialogflow()
      *
      * app.intent('Default Welcome Intent', conv => {
      *   conv.ask('Welcome to action snippets! Say a number.')
      * })
      *
      * app.intent('Number Input', (conv, {num}) => {
      *   conv.close(`You said ${num}`)
      * })
      * ```
      *
      * @param responses A response fragment for the library to construct a single complete response
      * @public
      */
    def close(responses: Response*): this.type = js.native
    
    /** @public */
    var device: Device = js.native
    
    /** @public */
    var digested: Boolean = js.native
    
    /** @public */
    var expectUserResponse: Boolean = js.native
    
    /** @public */
    var headers: Headers = js.native
    
    /**
      * Gets the unique conversation ID. It's a new ID for the initial query,
      * and stays the same until the end of the conversation.
      *
      * @example
      * ```javascript
      *
      * app.intent('actions.intent.MAIN', conv => {
      *   const conversationId = conv.id
      * })
      * ```
      *
      * @public
      */
    var id: String = js.native
    
    /** @public */
    var input: Input = js.native
    
    /** @public */
    def json[T](json: T): this.type = js.native
    
    /**
      * Set reprompts when users don't provide input to this action (no-input errors).
      * Each reprompt represents as the {@link SimpleResponse}, but raw strings also can be specified
      * for convenience (they're passed to the constructor of {@link SimpleResponse}).
      * Notice that this value is not kept over conversations. Thus, it is necessary to set
      * the reprompts per each conversation response.
      *
      * @example
      * ```javascript
      *
      * app.intent('actions.intent.MAIN', conv => {
      *   conv.noInputs = [
      *     'Are you still there?',
      *     'Hello?',
      *     new SimpleResponse({
      *       text: 'Talk to you later. Bye!',
      *       speech: '<speak>Talk to you later. Bye!</speak>'
      *     })
      *   ]
      *   conv.ask('What's your favorite color?')
      * })
      * ```
      *
      * @public
      */
    var noInputs: js.Array[String | SimpleResponse] = js.native
    
    /** @public */
    var request: GoogleActionsV2AppRequest = js.native
    
    /** @public */
    def response(): ConversationResponse = js.native
    
    /** @public */
    var responses: js.Array[Response] = js.native
    
    /**
      * True if the app is being tested in sandbox mode. Enable sandbox
      * mode in the [Actions console](console.actions.google.com) to test
      * transactions.
      * @public
      */
    var sandbox: Boolean = js.native
    
    /**
      * Shortcut for
      * {@link Capabilities|conv.surface.capabilities.has('actions.capability.SCREEN_OUTPUT')}
      * @public
      */
    var screen: Boolean = js.native
    
    /**
      * Sets speech biasing options.
      *
      * @example
      * ``` javascript
      *
      * app.intent('actions.intent.MAIN', conv => {
      *   conv.speechBiasing = ['red', 'blue', 'green']
      *   conv.ask('What is your favorite color out of red, blue, and green?')
      * })
      * ```
      *
      * @public
      */
    var speechBiasing: js.Array[String] = js.native
    
    /** @public */
    var surface: Surface = js.native
    
    /** @public */
    var `type`: GoogleActionsV2ConversationType = js.native
    
    /**
      * Gets the {@link User} object.
      * The user object contains information about the user, including
      * a string identifier and personal information (requires requesting permissions,
      * see {@link Permission|conv.ask(new Permission)}).
      * @public
      */
    var user: User[TUserStorage] = js.native
  }
  
  @JSImport("actions-on-google/dist/service/actionssdk/conversation/conversation", "UnauthorizedError")
  @js.native
  open class UnauthorizedError ()
    extends StObject
       with Error {
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
  }
  
  trait ConversationApp[TConvData, TUserStorage]
    extends StObject
       with ServiceBaseApp {
    
    /** @hidden */
    var _client: js.UndefOr[OAuth2Client] = js.undefined
    
    /** @public */
    var auth: js.UndefOr[OAuth2Config] = js.undefined
    
    /** @public */
    var init: js.UndefOr[js.Function0[ConversationOptionsInit[TConvData, TUserStorage]]] = js.undefined
    
    /** @public */
    var ordersv3: Boolean
  }
  object ConversationApp {
    
    inline def apply[TConvData, TUserStorage](
      handler: (/* body */ JsonObject, /* headers */ Headers, /* metadata */ js.UndefOr[BuiltinFrameworkMetadata]) => js.Promise[StandardResponse],
      ordersv3: Boolean
    ): ConversationApp[TConvData, TUserStorage] = {
      val __obj = js.Dynamic.literal(handler = js.Any.fromFunction3(handler), ordersv3 = ordersv3.asInstanceOf[js.Any])
      __obj.asInstanceOf[ConversationApp[TConvData, TUserStorage]]
    }
    
    extension [Self <: ConversationApp[?, ?], TConvData, TUserStorage](x: Self & (ConversationApp[TConvData, TUserStorage])) {
      
      inline def setAuth(value: OAuth2Config): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
      
      inline def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
      
      inline def setInit(value: () => ConversationOptionsInit[TConvData, TUserStorage]): Self = StObject.set(x, "init", js.Any.fromFunction0(value))
      
      inline def setInitUndefined: Self = StObject.set(x, "init", js.undefined)
      
      inline def setOrdersv3(value: Boolean): Self = StObject.set(x, "ordersv3", value.asInstanceOf[js.Any])
      
      inline def set_client(value: OAuth2Client): Self = StObject.set(x, "_client", value.asInstanceOf[js.Any])
      
      inline def set_clientUndefined: Self = StObject.set(x, "_client", js.undefined)
    }
  }
  
  trait ConversationAppOptions[TConvData, TUserStorage]
    extends StObject
       with AppOptions {
    
    /**
      * Client ID for User Profile Payload Verification
      * See {@link Profile#payload|conv.user.profile.payload}
      * @public
      */
    var clientId: js.UndefOr[String] = js.undefined
    
    /** @public */
    var init: js.UndefOr[js.Function0[ConversationOptionsInit[TConvData, TUserStorage]]] = js.undefined
    
    /** @public */
    var ordersv3: js.UndefOr[Boolean] = js.undefined
  }
  object ConversationAppOptions {
    
    inline def apply[TConvData, TUserStorage](): ConversationAppOptions[TConvData, TUserStorage] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConversationAppOptions[TConvData, TUserStorage]]
    }
    
    extension [Self <: ConversationAppOptions[?, ?], TConvData, TUserStorage](x: Self & (ConversationAppOptions[TConvData, TUserStorage])) {
      
      inline def setClientId(value: String): Self = StObject.set(x, "clientId", value.asInstanceOf[js.Any])
      
      inline def setClientIdUndefined: Self = StObject.set(x, "clientId", js.undefined)
      
      inline def setInit(value: () => ConversationOptionsInit[TConvData, TUserStorage]): Self = StObject.set(x, "init", js.Any.fromFunction0(value))
      
      inline def setInitUndefined: Self = StObject.set(x, "init", js.undefined)
      
      inline def setOrdersv3(value: Boolean): Self = StObject.set(x, "ordersv3", value.asInstanceOf[js.Any])
      
      inline def setOrdersv3Undefined: Self = StObject.set(x, "ordersv3", js.undefined)
    }
  }
  
  trait ConversationBaseOptions[TConvData, TUserStorage] extends StObject {
    
    /** @public */
    var debug: js.UndefOr[Boolean] = js.undefined
    
    /** @public */
    var headers: js.UndefOr[Headers] = js.undefined
    
    /** @public */
    var init: js.UndefOr[ConversationOptionsInit[TConvData, TUserStorage]] = js.undefined
    
    /** @public */
    var ordersv3: js.UndefOr[Boolean] = js.undefined
  }
  object ConversationBaseOptions {
    
    inline def apply[TConvData, TUserStorage](): ConversationBaseOptions[TConvData, TUserStorage] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConversationBaseOptions[TConvData, TUserStorage]]
    }
    
    extension [Self <: ConversationBaseOptions[?, ?], TConvData, TUserStorage](x: Self & (ConversationBaseOptions[TConvData, TUserStorage])) {
      
      inline def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
      
      inline def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
      
      inline def setHeaders(value: Headers): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      inline def setInit(value: ConversationOptionsInit[TConvData, TUserStorage]): Self = StObject.set(x, "init", value.asInstanceOf[js.Any])
      
      inline def setInitUndefined: Self = StObject.set(x, "init", js.undefined)
      
      inline def setOrdersv3(value: Boolean): Self = StObject.set(x, "ordersv3", value.asInstanceOf[js.Any])
      
      inline def setOrdersv3Undefined: Self = StObject.set(x, "ordersv3", js.undefined)
    }
  }
  
  trait ConversationOptions[TUserStorage] extends StObject {
    
    /** @public */
    var headers: js.UndefOr[Headers] = js.undefined
    
    /** @public */
    var init: js.UndefOr[ConversationOptionsInit[js.Object, TUserStorage]] = js.undefined
    
    /** @public */
    var ordersv3: js.UndefOr[Boolean] = js.undefined
    
    /** @public */
    var request: js.UndefOr[GoogleActionsV2AppRequest] = js.undefined
  }
  object ConversationOptions {
    
    inline def apply[TUserStorage](): ConversationOptions[TUserStorage] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConversationOptions[TUserStorage]]
    }
    
    extension [Self <: ConversationOptions[?], TUserStorage](x: Self & ConversationOptions[TUserStorage]) {
      
      inline def setHeaders(value: Headers): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      inline def setInit(value: ConversationOptionsInit[js.Object, TUserStorage]): Self = StObject.set(x, "init", value.asInstanceOf[js.Any])
      
      inline def setInitUndefined: Self = StObject.set(x, "init", js.undefined)
      
      inline def setOrdersv3(value: Boolean): Self = StObject.set(x, "ordersv3", value.asInstanceOf[js.Any])
      
      inline def setOrdersv3Undefined: Self = StObject.set(x, "ordersv3", js.undefined)
      
      inline def setRequest(value: GoogleActionsV2AppRequest): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
      
      inline def setRequestUndefined: Self = StObject.set(x, "request", js.undefined)
    }
  }
  
  trait ConversationOptionsInit[TConvData, TUserStorage] extends StObject {
    
    /** @public */
    var data: js.UndefOr[TConvData] = js.undefined
    
    /** @public */
    var storage: js.UndefOr[TUserStorage] = js.undefined
  }
  object ConversationOptionsInit {
    
    inline def apply[TConvData, TUserStorage](): ConversationOptionsInit[TConvData, TUserStorage] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConversationOptionsInit[TConvData, TUserStorage]]
    }
    
    extension [Self <: ConversationOptionsInit[?, ?], TConvData, TUserStorage](x: Self & (ConversationOptionsInit[TConvData, TUserStorage])) {
      
      inline def setData(value: TConvData): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setStorage(value: TUserStorage): Self = StObject.set(x, "storage", value.asInstanceOf[js.Any])
      
      inline def setStorageUndefined: Self = StObject.set(x, "storage", js.undefined)
    }
  }
  
  trait ConversationResponse extends StObject {
    
    var expectUserResponse: Boolean
    
    var expectedIntent: js.UndefOr[GoogleActionsV2ExpectedIntent] = js.undefined
    
    var noInputPrompts: js.UndefOr[js.Array[GoogleActionsV2SimpleResponse]] = js.undefined
    
    var richResponse: GoogleActionsV2RichResponse
    
    var speechBiasingHints: js.UndefOr[js.Array[String]] = js.undefined
    
    var userStorage: String
  }
  object ConversationResponse {
    
    inline def apply(expectUserResponse: Boolean, richResponse: GoogleActionsV2RichResponse, userStorage: String): ConversationResponse = {
      val __obj = js.Dynamic.literal(expectUserResponse = expectUserResponse.asInstanceOf[js.Any], richResponse = richResponse.asInstanceOf[js.Any], userStorage = userStorage.asInstanceOf[js.Any])
      __obj.asInstanceOf[ConversationResponse]
    }
    
    extension [Self <: ConversationResponse](x: Self) {
      
      inline def setExpectUserResponse(value: Boolean): Self = StObject.set(x, "expectUserResponse", value.asInstanceOf[js.Any])
      
      inline def setExpectedIntent(value: GoogleActionsV2ExpectedIntent): Self = StObject.set(x, "expectedIntent", value.asInstanceOf[js.Any])
      
      inline def setExpectedIntentUndefined: Self = StObject.set(x, "expectedIntent", js.undefined)
      
      inline def setNoInputPrompts(value: js.Array[GoogleActionsV2SimpleResponse]): Self = StObject.set(x, "noInputPrompts", value.asInstanceOf[js.Any])
      
      inline def setNoInputPromptsUndefined: Self = StObject.set(x, "noInputPrompts", js.undefined)
      
      inline def setNoInputPromptsVarargs(value: GoogleActionsV2SimpleResponse*): Self = StObject.set(x, "noInputPrompts", js.Array(value*))
      
      inline def setRichResponse(value: GoogleActionsV2RichResponse): Self = StObject.set(x, "richResponse", value.asInstanceOf[js.Any])
      
      inline def setSpeechBiasingHints(value: js.Array[String]): Self = StObject.set(x, "speechBiasingHints", value.asInstanceOf[js.Any])
      
      inline def setSpeechBiasingHintsUndefined: Self = StObject.set(x, "speechBiasingHints", js.undefined)
      
      inline def setSpeechBiasingHintsVarargs(value: String*): Self = StObject.set(x, "speechBiasingHints", js.Array(value*))
      
      inline def setUserStorage(value: String): Self = StObject.set(x, "userStorage", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.actionsOnGoogle.actionsOnGoogleStrings.typeDotgoogleapisDotcomSlashgoogleDotactionsDotv2DotPlaceValueSpecDotPlaceDialogSpec
    - typings.actionsOnGoogle.actionsOnGoogleStrings.typeDotgoogleapisDotcomSlashgoogleDotactionsDotv2DotLinkValueSpecDotLinkDialogSpec
  */
  trait DialogSpec extends StObject
  object DialogSpec {
    
    inline def typeDotgoogleapisDotcomSlashgoogleDotactionsDotv2DotLinkValueSpecDotLinkDialogSpec: typings.actionsOnGoogle.actionsOnGoogleStrings.typeDotgoogleapisDotcomSlashgoogleDotactionsDotv2DotLinkValueSpecDotLinkDialogSpec = "type.googleapis.com/google.actions.v2.LinkValueSpec.LinkDialogSpec".asInstanceOf[typings.actionsOnGoogle.actionsOnGoogleStrings.typeDotgoogleapisDotcomSlashgoogleDotactionsDotv2DotLinkValueSpecDotLinkDialogSpec]
    
    inline def typeDotgoogleapisDotcomSlashgoogleDotactionsDotv2DotPlaceValueSpecDotPlaceDialogSpec: typings.actionsOnGoogle.actionsOnGoogleStrings.typeDotgoogleapisDotcomSlashgoogleDotactionsDotv2DotPlaceValueSpecDotPlaceDialogSpec = "type.googleapis.com/google.actions.v2.PlaceValueSpec.PlaceDialogSpec".asInstanceOf[typings.actionsOnGoogle.actionsOnGoogleStrings.typeDotgoogleapisDotcomSlashgoogleDotactionsDotv2DotPlaceValueSpecDotPlaceDialogSpec]
  }
  
  type ExceptionHandler[TUserStorage, TConversation /* <: Conversation[TUserStorage] */] = js.Function2[/* conv */ TConversation, /* error */ js.Error, js.Promise[Any] | Any]
  
  /* Rewritten from type alias, can be one of: 
    - typings.actionsOnGoogle.actionsOnGoogleStrings.typeDotgoogleapisDotcomSlashgoogleDotactionsDotv2DotPermissionValueSpec
    - typings.actionsOnGoogle.actionsOnGoogleStrings.typeDotgoogleapisDotcomSlashgoogleDotactionsDotv2DotOptionValueSpec
    - typings.actionsOnGoogle.actionsOnGoogleStrings.typeDotgoogleapisDotcomSlashgoogleDotactionsDotv2DotTransactionRequirementsCheckSpec
    - typings.actionsOnGoogle.actionsOnGoogleStrings.typeDotgoogleapisDotcomSlashgoogleDotactionsDotv2DotDeliveryAddressValueSpec
    - typings.actionsOnGoogle.actionsOnGoogleStrings.typeDotgoogleapisDotcomSlashgoogleDotactionsDotv2DotTransactionDecisionValueSpec
    - typings.actionsOnGoogle.actionsOnGoogleStrings.typeDotgoogleapisDotcomSlashgoogleDotactionsDotv2DotConfirmationValueSpec
    - typings.actionsOnGoogle.actionsOnGoogleStrings.typeDotgoogleapisDotcomSlashgoogleDotactionsDotv2DotDateTimeValueSpec
    - typings.actionsOnGoogle.actionsOnGoogleStrings.typeDotgoogleapisDotcomSlashgoogleDotactionsDotv2DotNewSurfaceValueSpec
    - typings.actionsOnGoogle.actionsOnGoogleStrings.typeDotgoogleapisDotcomSlashgoogleDotactionsDotv2DotRegisterUpdateValueSpec
    - typings.actionsOnGoogle.actionsOnGoogleStrings.typeDotgoogleapisDotcomSlashgoogleDotactionsDotv2DotSignInValueSpec
    - typings.actionsOnGoogle.actionsOnGoogleStrings.typeDotgoogleapisDotcomSlashgoogleDotactionsDotv2DotPlaceValueSpec
    - typings.actionsOnGoogle.actionsOnGoogleStrings.typeDotgoogleapisDotcomSlashgoogleDotactionsDotv2DotLinkValueSpec
    - typings.actionsOnGoogle.actionsOnGoogleStrings.typeDotgoogleapisDotcomSlashgoogleDotactionsDottransactionsDotv3DotCompletePurchaseValueSpec
    - typings.actionsOnGoogle.actionsOnGoogleStrings.typeDotgoogleapisDotcomSlashgoogleDotactionsDottransactionsDotv3DotTransactionDecisionValueSpec
    - typings.actionsOnGoogle.actionsOnGoogleStrings.typeDotgoogleapisDotcomSlashgoogleDotactionsDottransactionsDotv3DotTransactionRequirementsCheckSpec
    - typings.actionsOnGoogle.actionsOnGoogleStrings.typeDotgoogleapisDotcomSlashgoogleDotactionsDottransactionsDotv3DotDigitalPurchaseCheckSpec
  */
  trait InputValueSpec extends StObject
  object InputValueSpec {
    
    inline def typeDotgoogleapisDotcomSlashgoogleDotactionsDottransactionsDotv3DotCompletePurchaseValueSpec: typings.actionsOnGoogle.actionsOnGoogleStrings.typeDotgoogleapisDotcomSlashgoogleDotactionsDottransactionsDotv3DotCompletePurchaseValueSpec = "type.googleapis.com/google.actions.transactions.v3.CompletePurchaseValueSpec".asInstanceOf[typings.actionsOnGoogle.actionsOnGoogleStrings.typeDotgoogleapisDotcomSlashgoogleDotactionsDottransactionsDotv3DotCompletePurchaseValueSpec]
    
    inline def typeDotgoogleapisDotcomSlashgoogleDotactionsDottransactionsDotv3DotDigitalPurchaseCheckSpec: typings.actionsOnGoogle.actionsOnGoogleStrings.typeDotgoogleapisDotcomSlashgoogleDotactionsDottransactionsDotv3DotDigitalPurchaseCheckSpec = "type.googleapis.com/google.actions.transactions.v3.DigitalPurchaseCheckSpec".asInstanceOf[typings.actionsOnGoogle.actionsOnGoogleStrings.typeDotgoogleapisDotcomSlashgoogleDotactionsDottransactionsDotv3DotDigitalPurchaseCheckSpec]
    
    inline def typeDotgoogleapisDotcomSlashgoogleDotactionsDottransactionsDotv3DotTransactionDecisionValueSpec: typings.actionsOnGoogle.actionsOnGoogleStrings.typeDotgoogleapisDotcomSlashgoogleDotactionsDottransactionsDotv3DotTransactionDecisionValueSpec = "type.googleapis.com/google.actions.transactions.v3.TransactionDecisionValueSpec".asInstanceOf[typings.actionsOnGoogle.actionsOnGoogleStrings.typeDotgoogleapisDotcomSlashgoogleDotactionsDottransactionsDotv3DotTransactionDecisionValueSpec]
    
    inline def typeDotgoogleapisDotcomSlashgoogleDotactionsDottransactionsDotv3DotTransactionRequirementsCheckSpec: typings.actionsOnGoogle.actionsOnGoogleStrings.typeDotgoogleapisDotcomSlashgoogleDotactionsDottransactionsDotv3DotTransactionRequirementsCheckSpec = "type.googleapis.com/google.actions.transactions.v3.TransactionRequirementsCheckSpec".asInstanceOf[typings.actionsOnGoogle.actionsOnGoogleStrings.typeDotgoogleapisDotcomSlashgoogleDotactionsDottransactionsDotv3DotTransactionRequirementsCheckSpec]
    
    inline def typeDotgoogleapisDotcomSlashgoogleDotactionsDotv2DotConfirmationValueSpec: typings.actionsOnGoogle.actionsOnGoogleStrings.typeDotgoogleapisDotcomSlashgoogleDotactionsDotv2DotConfirmationValueSpec = "type.googleapis.com/google.actions.v2.ConfirmationValueSpec".asInstanceOf[typings.actionsOnGoogle.actionsOnGoogleStrings.typeDotgoogleapisDotcomSlashgoogleDotactionsDotv2DotConfirmationValueSpec]
    
    inline def typeDotgoogleapisDotcomSlashgoogleDotactionsDotv2DotDateTimeValueSpec: typings.actionsOnGoogle.actionsOnGoogleStrings.typeDotgoogleapisDotcomSlashgoogleDotactionsDotv2DotDateTimeValueSpec = "type.googleapis.com/google.actions.v2.DateTimeValueSpec".asInstanceOf[typings.actionsOnGoogle.actionsOnGoogleStrings.typeDotgoogleapisDotcomSlashgoogleDotactionsDotv2DotDateTimeValueSpec]
    
    inline def typeDotgoogleapisDotcomSlashgoogleDotactionsDotv2DotDeliveryAddressValueSpec: typings.actionsOnGoogle.actionsOnGoogleStrings.typeDotgoogleapisDotcomSlashgoogleDotactionsDotv2DotDeliveryAddressValueSpec = "type.googleapis.com/google.actions.v2.DeliveryAddressValueSpec".asInstanceOf[typings.actionsOnGoogle.actionsOnGoogleStrings.typeDotgoogleapisDotcomSlashgoogleDotactionsDotv2DotDeliveryAddressValueSpec]
    
    inline def typeDotgoogleapisDotcomSlashgoogleDotactionsDotv2DotLinkValueSpec: typings.actionsOnGoogle.actionsOnGoogleStrings.typeDotgoogleapisDotcomSlashgoogleDotactionsDotv2DotLinkValueSpec = "type.googleapis.com/google.actions.v2.LinkValueSpec".asInstanceOf[typings.actionsOnGoogle.actionsOnGoogleStrings.typeDotgoogleapisDotcomSlashgoogleDotactionsDotv2DotLinkValueSpec]
    
    inline def typeDotgoogleapisDotcomSlashgoogleDotactionsDotv2DotNewSurfaceValueSpec: typings.actionsOnGoogle.actionsOnGoogleStrings.typeDotgoogleapisDotcomSlashgoogleDotactionsDotv2DotNewSurfaceValueSpec = "type.googleapis.com/google.actions.v2.NewSurfaceValueSpec".asInstanceOf[typings.actionsOnGoogle.actionsOnGoogleStrings.typeDotgoogleapisDotcomSlashgoogleDotactionsDotv2DotNewSurfaceValueSpec]
    
    inline def typeDotgoogleapisDotcomSlashgoogleDotactionsDotv2DotOptionValueSpec: typings.actionsOnGoogle.actionsOnGoogleStrings.typeDotgoogleapisDotcomSlashgoogleDotactionsDotv2DotOptionValueSpec = "type.googleapis.com/google.actions.v2.OptionValueSpec".asInstanceOf[typings.actionsOnGoogle.actionsOnGoogleStrings.typeDotgoogleapisDotcomSlashgoogleDotactionsDotv2DotOptionValueSpec]
    
    inline def typeDotgoogleapisDotcomSlashgoogleDotactionsDotv2DotPermissionValueSpec: typings.actionsOnGoogle.actionsOnGoogleStrings.typeDotgoogleapisDotcomSlashgoogleDotactionsDotv2DotPermissionValueSpec = "type.googleapis.com/google.actions.v2.PermissionValueSpec".asInstanceOf[typings.actionsOnGoogle.actionsOnGoogleStrings.typeDotgoogleapisDotcomSlashgoogleDotactionsDotv2DotPermissionValueSpec]
    
    inline def typeDotgoogleapisDotcomSlashgoogleDotactionsDotv2DotPlaceValueSpec: typings.actionsOnGoogle.actionsOnGoogleStrings.typeDotgoogleapisDotcomSlashgoogleDotactionsDotv2DotPlaceValueSpec = "type.googleapis.com/google.actions.v2.PlaceValueSpec".asInstanceOf[typings.actionsOnGoogle.actionsOnGoogleStrings.typeDotgoogleapisDotcomSlashgoogleDotactionsDotv2DotPlaceValueSpec]
    
    inline def typeDotgoogleapisDotcomSlashgoogleDotactionsDotv2DotRegisterUpdateValueSpec: typings.actionsOnGoogle.actionsOnGoogleStrings.typeDotgoogleapisDotcomSlashgoogleDotactionsDotv2DotRegisterUpdateValueSpec = "type.googleapis.com/google.actions.v2.RegisterUpdateValueSpec".asInstanceOf[typings.actionsOnGoogle.actionsOnGoogleStrings.typeDotgoogleapisDotcomSlashgoogleDotactionsDotv2DotRegisterUpdateValueSpec]
    
    inline def typeDotgoogleapisDotcomSlashgoogleDotactionsDotv2DotSignInValueSpec: typings.actionsOnGoogle.actionsOnGoogleStrings.typeDotgoogleapisDotcomSlashgoogleDotactionsDotv2DotSignInValueSpec = "type.googleapis.com/google.actions.v2.SignInValueSpec".asInstanceOf[typings.actionsOnGoogle.actionsOnGoogleStrings.typeDotgoogleapisDotcomSlashgoogleDotactionsDotv2DotSignInValueSpec]
    
    inline def typeDotgoogleapisDotcomSlashgoogleDotactionsDotv2DotTransactionDecisionValueSpec: typings.actionsOnGoogle.actionsOnGoogleStrings.typeDotgoogleapisDotcomSlashgoogleDotactionsDotv2DotTransactionDecisionValueSpec = "type.googleapis.com/google.actions.v2.TransactionDecisionValueSpec".asInstanceOf[typings.actionsOnGoogle.actionsOnGoogleStrings.typeDotgoogleapisDotcomSlashgoogleDotactionsDotv2DotTransactionDecisionValueSpec]
    
    inline def typeDotgoogleapisDotcomSlashgoogleDotactionsDotv2DotTransactionRequirementsCheckSpec: typings.actionsOnGoogle.actionsOnGoogleStrings.typeDotgoogleapisDotcomSlashgoogleDotactionsDotv2DotTransactionRequirementsCheckSpec = "type.googleapis.com/google.actions.v2.TransactionRequirementsCheckSpec".asInstanceOf[typings.actionsOnGoogle.actionsOnGoogleStrings.typeDotgoogleapisDotcomSlashgoogleDotactionsDotv2DotTransactionRequirementsCheckSpec]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.actionsOnGoogle.actionsOnGoogleStrings.actionsDotintentDotMAIN
    - typings.actionsOnGoogle.actionsOnGoogleStrings.actionsDotintentDotTEXT
    - typings.actionsOnGoogle.actionsOnGoogleStrings.actionsDotintentDotPERMISSION
    - typings.actionsOnGoogle.actionsOnGoogleStrings.actionsDotintentDotOPTION
    - typings.actionsOnGoogle.actionsOnGoogleStrings.actionsDotintentDotTRANSACTION_REQUIREMENTS_CHECK
    - typings.actionsOnGoogle.actionsOnGoogleStrings.actionsDotintentDotDELIVERY_ADDRESS
    - typings.actionsOnGoogle.actionsOnGoogleStrings.actionsDotintentDotTRANSACTION_DECISION
    - typings.actionsOnGoogle.actionsOnGoogleStrings.actionsDotintentDotCONFIRMATION
    - typings.actionsOnGoogle.actionsOnGoogleStrings.actionsDotintentDotDATETIME
    - typings.actionsOnGoogle.actionsOnGoogleStrings.actionsDotintentDotSIGN_IN
    - typings.actionsOnGoogle.actionsOnGoogleStrings.actionsDotintentDotNO_INPUT
    - typings.actionsOnGoogle.actionsOnGoogleStrings.actionsDotintentDotCANCEL
    - typings.actionsOnGoogle.actionsOnGoogleStrings.actionsDotintentDotNEW_SURFACE
    - typings.actionsOnGoogle.actionsOnGoogleStrings.actionsDotintentDotREGISTER_UPDATE
    - typings.actionsOnGoogle.actionsOnGoogleStrings.actionsDotintentDotCONFIGURE_UPDATES
    - typings.actionsOnGoogle.actionsOnGoogleStrings.actionsDotintentDotPLACE
    - typings.actionsOnGoogle.actionsOnGoogleStrings.actionsDotintentDotLINK
    - typings.actionsOnGoogle.actionsOnGoogleStrings.actionsDotintentDotMEDIA_STATUS
    - typings.actionsOnGoogle.actionsOnGoogleStrings.actionsDotintentDotCOMPLETE_PURCHASE
    - typings.actionsOnGoogle.actionsOnGoogleStrings.actionsDotintentDotDIGITAL_PURCHASE_CHECK
  */
  trait Intent extends StObject
  object Intent {
    
    inline def actionsDotintentDotCANCEL: typings.actionsOnGoogle.actionsOnGoogleStrings.actionsDotintentDotCANCEL = "actions.intent.CANCEL".asInstanceOf[typings.actionsOnGoogle.actionsOnGoogleStrings.actionsDotintentDotCANCEL]
    
    inline def actionsDotintentDotCOMPLETE_PURCHASE: typings.actionsOnGoogle.actionsOnGoogleStrings.actionsDotintentDotCOMPLETE_PURCHASE = "actions.intent.COMPLETE_PURCHASE".asInstanceOf[typings.actionsOnGoogle.actionsOnGoogleStrings.actionsDotintentDotCOMPLETE_PURCHASE]
    
    inline def actionsDotintentDotCONFIGURE_UPDATES: typings.actionsOnGoogle.actionsOnGoogleStrings.actionsDotintentDotCONFIGURE_UPDATES = "actions.intent.CONFIGURE_UPDATES".asInstanceOf[typings.actionsOnGoogle.actionsOnGoogleStrings.actionsDotintentDotCONFIGURE_UPDATES]
    
    inline def actionsDotintentDotCONFIRMATION: typings.actionsOnGoogle.actionsOnGoogleStrings.actionsDotintentDotCONFIRMATION = "actions.intent.CONFIRMATION".asInstanceOf[typings.actionsOnGoogle.actionsOnGoogleStrings.actionsDotintentDotCONFIRMATION]
    
    inline def actionsDotintentDotDATETIME: typings.actionsOnGoogle.actionsOnGoogleStrings.actionsDotintentDotDATETIME = "actions.intent.DATETIME".asInstanceOf[typings.actionsOnGoogle.actionsOnGoogleStrings.actionsDotintentDotDATETIME]
    
    inline def actionsDotintentDotDELIVERY_ADDRESS: typings.actionsOnGoogle.actionsOnGoogleStrings.actionsDotintentDotDELIVERY_ADDRESS = "actions.intent.DELIVERY_ADDRESS".asInstanceOf[typings.actionsOnGoogle.actionsOnGoogleStrings.actionsDotintentDotDELIVERY_ADDRESS]
    
    inline def actionsDotintentDotDIGITAL_PURCHASE_CHECK: typings.actionsOnGoogle.actionsOnGoogleStrings.actionsDotintentDotDIGITAL_PURCHASE_CHECK = "actions.intent.DIGITAL_PURCHASE_CHECK".asInstanceOf[typings.actionsOnGoogle.actionsOnGoogleStrings.actionsDotintentDotDIGITAL_PURCHASE_CHECK]
    
    inline def actionsDotintentDotLINK: typings.actionsOnGoogle.actionsOnGoogleStrings.actionsDotintentDotLINK = "actions.intent.LINK".asInstanceOf[typings.actionsOnGoogle.actionsOnGoogleStrings.actionsDotintentDotLINK]
    
    inline def actionsDotintentDotMAIN: typings.actionsOnGoogle.actionsOnGoogleStrings.actionsDotintentDotMAIN = "actions.intent.MAIN".asInstanceOf[typings.actionsOnGoogle.actionsOnGoogleStrings.actionsDotintentDotMAIN]
    
    inline def actionsDotintentDotMEDIA_STATUS: typings.actionsOnGoogle.actionsOnGoogleStrings.actionsDotintentDotMEDIA_STATUS = "actions.intent.MEDIA_STATUS".asInstanceOf[typings.actionsOnGoogle.actionsOnGoogleStrings.actionsDotintentDotMEDIA_STATUS]
    
    inline def actionsDotintentDotNEW_SURFACE: typings.actionsOnGoogle.actionsOnGoogleStrings.actionsDotintentDotNEW_SURFACE = "actions.intent.NEW_SURFACE".asInstanceOf[typings.actionsOnGoogle.actionsOnGoogleStrings.actionsDotintentDotNEW_SURFACE]
    
    inline def actionsDotintentDotNO_INPUT: typings.actionsOnGoogle.actionsOnGoogleStrings.actionsDotintentDotNO_INPUT = "actions.intent.NO_INPUT".asInstanceOf[typings.actionsOnGoogle.actionsOnGoogleStrings.actionsDotintentDotNO_INPUT]
    
    inline def actionsDotintentDotOPTION: typings.actionsOnGoogle.actionsOnGoogleStrings.actionsDotintentDotOPTION = "actions.intent.OPTION".asInstanceOf[typings.actionsOnGoogle.actionsOnGoogleStrings.actionsDotintentDotOPTION]
    
    inline def actionsDotintentDotPERMISSION: typings.actionsOnGoogle.actionsOnGoogleStrings.actionsDotintentDotPERMISSION = "actions.intent.PERMISSION".asInstanceOf[typings.actionsOnGoogle.actionsOnGoogleStrings.actionsDotintentDotPERMISSION]
    
    inline def actionsDotintentDotPLACE: typings.actionsOnGoogle.actionsOnGoogleStrings.actionsDotintentDotPLACE = "actions.intent.PLACE".asInstanceOf[typings.actionsOnGoogle.actionsOnGoogleStrings.actionsDotintentDotPLACE]
    
    inline def actionsDotintentDotREGISTER_UPDATE: typings.actionsOnGoogle.actionsOnGoogleStrings.actionsDotintentDotREGISTER_UPDATE = "actions.intent.REGISTER_UPDATE".asInstanceOf[typings.actionsOnGoogle.actionsOnGoogleStrings.actionsDotintentDotREGISTER_UPDATE]
    
    inline def actionsDotintentDotSIGN_IN: typings.actionsOnGoogle.actionsOnGoogleStrings.actionsDotintentDotSIGN_IN = "actions.intent.SIGN_IN".asInstanceOf[typings.actionsOnGoogle.actionsOnGoogleStrings.actionsDotintentDotSIGN_IN]
    
    inline def actionsDotintentDotTEXT: typings.actionsOnGoogle.actionsOnGoogleStrings.actionsDotintentDotTEXT = "actions.intent.TEXT".asInstanceOf[typings.actionsOnGoogle.actionsOnGoogleStrings.actionsDotintentDotTEXT]
    
    inline def actionsDotintentDotTRANSACTION_DECISION: typings.actionsOnGoogle.actionsOnGoogleStrings.actionsDotintentDotTRANSACTION_DECISION = "actions.intent.TRANSACTION_DECISION".asInstanceOf[typings.actionsOnGoogle.actionsOnGoogleStrings.actionsDotintentDotTRANSACTION_DECISION]
    
    inline def actionsDotintentDotTRANSACTION_REQUIREMENTS_CHECK: typings.actionsOnGoogle.actionsOnGoogleStrings.actionsDotintentDotTRANSACTION_REQUIREMENTS_CHECK = "actions.intent.TRANSACTION_REQUIREMENTS_CHECK".asInstanceOf[typings.actionsOnGoogle.actionsOnGoogleStrings.actionsDotintentDotTRANSACTION_REQUIREMENTS_CHECK]
  }
  
  trait OAuth2Config extends StObject {
    
    /** @public */
    var client: OAuth2ConfigClient
  }
  object OAuth2Config {
    
    inline def apply(client: OAuth2ConfigClient): OAuth2Config = {
      val __obj = js.Dynamic.literal(client = client.asInstanceOf[js.Any])
      __obj.asInstanceOf[OAuth2Config]
    }
    
    extension [Self <: OAuth2Config](x: Self) {
      
      inline def setClient(value: OAuth2ConfigClient): Self = StObject.set(x, "client", value.asInstanceOf[js.Any])
    }
  }
  
  trait OAuth2ConfigClient extends StObject {
    
    /** @public */
    var id: String
  }
  object OAuth2ConfigClient {
    
    inline def apply(id: String): OAuth2ConfigClient = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
      __obj.asInstanceOf[OAuth2ConfigClient]
    }
    
    extension [Self <: OAuth2ConfigClient](x: Self) {
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.actionsOnGoogle.responseMod.RichResponse
    - typings.actionsOnGoogle.richMod.RichResponseItem
    - typings.actionsOnGoogle.responseMod.Image
    - typings.actionsOnGoogle.responseMod.Suggestions
    - typings.actionsOnGoogle.responseMod.MediaObject
    - typings.actionsOnGoogle.helperMod.Helper[
  typings.actionsOnGoogle.conversationConversationMod.Intent, 
  typings.actionsOnGoogle.commonMod.JsonObject]
  */
  type Response = _Response | (Helper[Intent, JsonObject]) | HtmlResponse[JsonObject] | String
  
  type Traversed = StringDictionary[Boolean]
  
  trait _Response extends StObject
}
