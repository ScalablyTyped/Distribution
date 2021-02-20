package typings.actionsOnGoogle

import org.scalablytyped.runtime.StringDictionary
import typings.actionsOnGoogle.argumentMod.Arguments
import typings.actionsOnGoogle.assistantMod.AppOptions
import typings.actionsOnGoogle.assistantMod.ServiceBaseApp
import typings.actionsOnGoogle.canvasMod.Canvas
import typings.actionsOnGoogle.commonMod.JsonObject
import typings.actionsOnGoogle.deviceMod.Device
import typings.actionsOnGoogle.frameworkFrameworkMod.Headers
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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object conversationConversationMod {
  
  @JSImport("actions-on-google/dist/service/actionssdk/conversation/conversation", "Conversation")
  @js.native
  /** @hidden */
  class Conversation[TUserStorage] () extends StObject {
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
  class UnauthorizedError () extends Error
  
  @js.native
  trait ConversationApp[TConvData, TUserStorage] extends ServiceBaseApp {
    
    /** @hidden */
    var _client: js.UndefOr[OAuth2Client] = js.native
    
    /** @public */
    var auth: js.UndefOr[OAuth2Config] = js.native
    
    /** @public */
    var init: js.UndefOr[js.Function0[ConversationOptionsInit[TConvData, TUserStorage]]] = js.native
    
    /** @public */
    var ordersv3: Boolean = js.native
  }
  
  @js.native
  trait ConversationAppOptions[TConvData, TUserStorage] extends AppOptions {
    
    /**
      * Client ID for User Profile Payload Verification
      * See {@link Profile#payload|conv.user.profile.payload}
      * @public
      */
    var clientId: js.UndefOr[String] = js.native
    
    /** @public */
    var init: js.UndefOr[js.Function0[ConversationOptionsInit[TConvData, TUserStorage]]] = js.native
    
    /** @public */
    var ordersv3: js.UndefOr[Boolean] = js.native
  }
  object ConversationAppOptions {
    
    @scala.inline
    def apply[TConvData, TUserStorage](): ConversationAppOptions[TConvData, TUserStorage] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConversationAppOptions[TConvData, TUserStorage]]
    }
    
    @scala.inline
    implicit class ConversationAppOptionsMutableBuilder[Self <: ConversationAppOptions[_, _], TConvData, TUserStorage] (val x: Self with (ConversationAppOptions[TConvData, TUserStorage])) extends AnyVal {
      
      @scala.inline
      def setClientId(value: String): Self = StObject.set(x, "clientId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClientIdUndefined: Self = StObject.set(x, "clientId", js.undefined)
      
      @scala.inline
      def setInit(value: () => ConversationOptionsInit[TConvData, TUserStorage]): Self = StObject.set(x, "init", js.Any.fromFunction0(value))
      
      @scala.inline
      def setInitUndefined: Self = StObject.set(x, "init", js.undefined)
      
      @scala.inline
      def setOrdersv3(value: Boolean): Self = StObject.set(x, "ordersv3", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOrdersv3Undefined: Self = StObject.set(x, "ordersv3", js.undefined)
    }
  }
  
  @js.native
  trait ConversationBaseOptions[TConvData, TUserStorage] extends StObject {
    
    /** @public */
    var debug: js.UndefOr[Boolean] = js.native
    
    /** @public */
    var headers: js.UndefOr[Headers] = js.native
    
    /** @public */
    var init: js.UndefOr[ConversationOptionsInit[TConvData, TUserStorage]] = js.native
    
    /** @public */
    var ordersv3: js.UndefOr[Boolean] = js.native
  }
  object ConversationBaseOptions {
    
    @scala.inline
    def apply[TConvData, TUserStorage](): ConversationBaseOptions[TConvData, TUserStorage] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConversationBaseOptions[TConvData, TUserStorage]]
    }
    
    @scala.inline
    implicit class ConversationBaseOptionsMutableBuilder[Self <: ConversationBaseOptions[_, _], TConvData, TUserStorage] (val x: Self with (ConversationBaseOptions[TConvData, TUserStorage])) extends AnyVal {
      
      @scala.inline
      def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
      
      @scala.inline
      def setHeaders(value: Headers): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      @scala.inline
      def setInit(value: ConversationOptionsInit[TConvData, TUserStorage]): Self = StObject.set(x, "init", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInitUndefined: Self = StObject.set(x, "init", js.undefined)
      
      @scala.inline
      def setOrdersv3(value: Boolean): Self = StObject.set(x, "ordersv3", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOrdersv3Undefined: Self = StObject.set(x, "ordersv3", js.undefined)
    }
  }
  
  @js.native
  trait ConversationOptions[TUserStorage] extends StObject {
    
    /** @public */
    var headers: js.UndefOr[Headers] = js.native
    
    /** @public */
    var init: js.UndefOr[ConversationOptionsInit[js.Object, TUserStorage]] = js.native
    
    /** @public */
    var ordersv3: js.UndefOr[Boolean] = js.native
    
    /** @public */
    var request: js.UndefOr[GoogleActionsV2AppRequest] = js.native
  }
  object ConversationOptions {
    
    @scala.inline
    def apply[TUserStorage](): ConversationOptions[TUserStorage] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConversationOptions[TUserStorage]]
    }
    
    @scala.inline
    implicit class ConversationOptionsMutableBuilder[Self <: ConversationOptions[_], TUserStorage] (val x: Self with ConversationOptions[TUserStorage]) extends AnyVal {
      
      @scala.inline
      def setHeaders(value: Headers): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      @scala.inline
      def setInit(value: ConversationOptionsInit[js.Object, TUserStorage]): Self = StObject.set(x, "init", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInitUndefined: Self = StObject.set(x, "init", js.undefined)
      
      @scala.inline
      def setOrdersv3(value: Boolean): Self = StObject.set(x, "ordersv3", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOrdersv3Undefined: Self = StObject.set(x, "ordersv3", js.undefined)
      
      @scala.inline
      def setRequest(value: GoogleActionsV2AppRequest): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequestUndefined: Self = StObject.set(x, "request", js.undefined)
    }
  }
  
  @js.native
  trait ConversationOptionsInit[TConvData, TUserStorage] extends StObject {
    
    /** @public */
    var data: js.UndefOr[TConvData] = js.native
    
    /** @public */
    var storage: js.UndefOr[TUserStorage] = js.native
  }
  object ConversationOptionsInit {
    
    @scala.inline
    def apply[TConvData, TUserStorage](): ConversationOptionsInit[TConvData, TUserStorage] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConversationOptionsInit[TConvData, TUserStorage]]
    }
    
    @scala.inline
    implicit class ConversationOptionsInitMutableBuilder[Self <: ConversationOptionsInit[_, _], TConvData, TUserStorage] (val x: Self with (ConversationOptionsInit[TConvData, TUserStorage])) extends AnyVal {
      
      @scala.inline
      def setData(value: TConvData): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      @scala.inline
      def setStorage(value: TUserStorage): Self = StObject.set(x, "storage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStorageUndefined: Self = StObject.set(x, "storage", js.undefined)
    }
  }
  
  @js.native
  trait ConversationResponse extends StObject {
    
    var expectUserResponse: Boolean = js.native
    
    var expectedIntent: js.UndefOr[GoogleActionsV2ExpectedIntent] = js.native
    
    var noInputPrompts: js.UndefOr[js.Array[GoogleActionsV2SimpleResponse]] = js.native
    
    var richResponse: GoogleActionsV2RichResponse = js.native
    
    var speechBiasingHints: js.UndefOr[js.Array[String]] = js.native
    
    var userStorage: String = js.native
  }
  object ConversationResponse {
    
    @scala.inline
    def apply(expectUserResponse: Boolean, richResponse: GoogleActionsV2RichResponse, userStorage: String): ConversationResponse = {
      val __obj = js.Dynamic.literal(expectUserResponse = expectUserResponse.asInstanceOf[js.Any], richResponse = richResponse.asInstanceOf[js.Any], userStorage = userStorage.asInstanceOf[js.Any])
      __obj.asInstanceOf[ConversationResponse]
    }
    
    @scala.inline
    implicit class ConversationResponseMutableBuilder[Self <: ConversationResponse] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setExpectUserResponse(value: Boolean): Self = StObject.set(x, "expectUserResponse", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpectedIntent(value: GoogleActionsV2ExpectedIntent): Self = StObject.set(x, "expectedIntent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpectedIntentUndefined: Self = StObject.set(x, "expectedIntent", js.undefined)
      
      @scala.inline
      def setNoInputPrompts(value: js.Array[GoogleActionsV2SimpleResponse]): Self = StObject.set(x, "noInputPrompts", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNoInputPromptsUndefined: Self = StObject.set(x, "noInputPrompts", js.undefined)
      
      @scala.inline
      def setNoInputPromptsVarargs(value: GoogleActionsV2SimpleResponse*): Self = StObject.set(x, "noInputPrompts", js.Array(value :_*))
      
      @scala.inline
      def setRichResponse(value: GoogleActionsV2RichResponse): Self = StObject.set(x, "richResponse", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpeechBiasingHints(value: js.Array[String]): Self = StObject.set(x, "speechBiasingHints", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpeechBiasingHintsUndefined: Self = StObject.set(x, "speechBiasingHints", js.undefined)
      
      @scala.inline
      def setSpeechBiasingHintsVarargs(value: String*): Self = StObject.set(x, "speechBiasingHints", js.Array(value :_*))
      
      @scala.inline
      def setUserStorage(value: String): Self = StObject.set(x, "userStorage", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.actionsOnGoogle.actionsOnGoogleStrings.typeDotgoogleapisDotcomSlashgoogleDotactionsDotv2DotPlaceValueSpecDotPlaceDialogSpec
    - typings.actionsOnGoogle.actionsOnGoogleStrings.typeDotgoogleapisDotcomSlashgoogleDotactionsDotv2DotLinkValueSpecDotLinkDialogSpec
  */
  trait DialogSpec extends StObject
  object DialogSpec {
    
    @scala.inline
    def typeDotgoogleapisDotcomSlashgoogleDotactionsDotv2DotLinkValueSpecDotLinkDialogSpec: typings.actionsOnGoogle.actionsOnGoogleStrings.typeDotgoogleapisDotcomSlashgoogleDotactionsDotv2DotLinkValueSpecDotLinkDialogSpec = "type.googleapis.com/google.actions.v2.LinkValueSpec.LinkDialogSpec".asInstanceOf[typings.actionsOnGoogle.actionsOnGoogleStrings.typeDotgoogleapisDotcomSlashgoogleDotactionsDotv2DotLinkValueSpecDotLinkDialogSpec]
    
    @scala.inline
    def typeDotgoogleapisDotcomSlashgoogleDotactionsDotv2DotPlaceValueSpecDotPlaceDialogSpec: typings.actionsOnGoogle.actionsOnGoogleStrings.typeDotgoogleapisDotcomSlashgoogleDotactionsDotv2DotPlaceValueSpecDotPlaceDialogSpec = "type.googleapis.com/google.actions.v2.PlaceValueSpec.PlaceDialogSpec".asInstanceOf[typings.actionsOnGoogle.actionsOnGoogleStrings.typeDotgoogleapisDotcomSlashgoogleDotactionsDotv2DotPlaceValueSpecDotPlaceDialogSpec]
  }
  
  type ExceptionHandler[TUserStorage, TConversation /* <: Conversation[TUserStorage] */] = js.Function2[/* conv */ TConversation, /* error */ Error, js.Promise[js.Any] | js.Any]
  
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
    
    @scala.inline
    def typeDotgoogleapisDotcomSlashgoogleDotactionsDottransactionsDotv3DotCompletePurchaseValueSpec: typings.actionsOnGoogle.actionsOnGoogleStrings.typeDotgoogleapisDotcomSlashgoogleDotactionsDottransactionsDotv3DotCompletePurchaseValueSpec = "type.googleapis.com/google.actions.transactions.v3.CompletePurchaseValueSpec".asInstanceOf[typings.actionsOnGoogle.actionsOnGoogleStrings.typeDotgoogleapisDotcomSlashgoogleDotactionsDottransactionsDotv3DotCompletePurchaseValueSpec]
    
    @scala.inline
    def typeDotgoogleapisDotcomSlashgoogleDotactionsDottransactionsDotv3DotDigitalPurchaseCheckSpec: typings.actionsOnGoogle.actionsOnGoogleStrings.typeDotgoogleapisDotcomSlashgoogleDotactionsDottransactionsDotv3DotDigitalPurchaseCheckSpec = "type.googleapis.com/google.actions.transactions.v3.DigitalPurchaseCheckSpec".asInstanceOf[typings.actionsOnGoogle.actionsOnGoogleStrings.typeDotgoogleapisDotcomSlashgoogleDotactionsDottransactionsDotv3DotDigitalPurchaseCheckSpec]
    
    @scala.inline
    def typeDotgoogleapisDotcomSlashgoogleDotactionsDottransactionsDotv3DotTransactionDecisionValueSpec: typings.actionsOnGoogle.actionsOnGoogleStrings.typeDotgoogleapisDotcomSlashgoogleDotactionsDottransactionsDotv3DotTransactionDecisionValueSpec = "type.googleapis.com/google.actions.transactions.v3.TransactionDecisionValueSpec".asInstanceOf[typings.actionsOnGoogle.actionsOnGoogleStrings.typeDotgoogleapisDotcomSlashgoogleDotactionsDottransactionsDotv3DotTransactionDecisionValueSpec]
    
    @scala.inline
    def typeDotgoogleapisDotcomSlashgoogleDotactionsDottransactionsDotv3DotTransactionRequirementsCheckSpec: typings.actionsOnGoogle.actionsOnGoogleStrings.typeDotgoogleapisDotcomSlashgoogleDotactionsDottransactionsDotv3DotTransactionRequirementsCheckSpec = "type.googleapis.com/google.actions.transactions.v3.TransactionRequirementsCheckSpec".asInstanceOf[typings.actionsOnGoogle.actionsOnGoogleStrings.typeDotgoogleapisDotcomSlashgoogleDotactionsDottransactionsDotv3DotTransactionRequirementsCheckSpec]
    
    @scala.inline
    def typeDotgoogleapisDotcomSlashgoogleDotactionsDotv2DotConfirmationValueSpec: typings.actionsOnGoogle.actionsOnGoogleStrings.typeDotgoogleapisDotcomSlashgoogleDotactionsDotv2DotConfirmationValueSpec = "type.googleapis.com/google.actions.v2.ConfirmationValueSpec".asInstanceOf[typings.actionsOnGoogle.actionsOnGoogleStrings.typeDotgoogleapisDotcomSlashgoogleDotactionsDotv2DotConfirmationValueSpec]
    
    @scala.inline
    def typeDotgoogleapisDotcomSlashgoogleDotactionsDotv2DotDateTimeValueSpec: typings.actionsOnGoogle.actionsOnGoogleStrings.typeDotgoogleapisDotcomSlashgoogleDotactionsDotv2DotDateTimeValueSpec = "type.googleapis.com/google.actions.v2.DateTimeValueSpec".asInstanceOf[typings.actionsOnGoogle.actionsOnGoogleStrings.typeDotgoogleapisDotcomSlashgoogleDotactionsDotv2DotDateTimeValueSpec]
    
    @scala.inline
    def typeDotgoogleapisDotcomSlashgoogleDotactionsDotv2DotDeliveryAddressValueSpec: typings.actionsOnGoogle.actionsOnGoogleStrings.typeDotgoogleapisDotcomSlashgoogleDotactionsDotv2DotDeliveryAddressValueSpec = "type.googleapis.com/google.actions.v2.DeliveryAddressValueSpec".asInstanceOf[typings.actionsOnGoogle.actionsOnGoogleStrings.typeDotgoogleapisDotcomSlashgoogleDotactionsDotv2DotDeliveryAddressValueSpec]
    
    @scala.inline
    def typeDotgoogleapisDotcomSlashgoogleDotactionsDotv2DotLinkValueSpec: typings.actionsOnGoogle.actionsOnGoogleStrings.typeDotgoogleapisDotcomSlashgoogleDotactionsDotv2DotLinkValueSpec = "type.googleapis.com/google.actions.v2.LinkValueSpec".asInstanceOf[typings.actionsOnGoogle.actionsOnGoogleStrings.typeDotgoogleapisDotcomSlashgoogleDotactionsDotv2DotLinkValueSpec]
    
    @scala.inline
    def typeDotgoogleapisDotcomSlashgoogleDotactionsDotv2DotNewSurfaceValueSpec: typings.actionsOnGoogle.actionsOnGoogleStrings.typeDotgoogleapisDotcomSlashgoogleDotactionsDotv2DotNewSurfaceValueSpec = "type.googleapis.com/google.actions.v2.NewSurfaceValueSpec".asInstanceOf[typings.actionsOnGoogle.actionsOnGoogleStrings.typeDotgoogleapisDotcomSlashgoogleDotactionsDotv2DotNewSurfaceValueSpec]
    
    @scala.inline
    def typeDotgoogleapisDotcomSlashgoogleDotactionsDotv2DotOptionValueSpec: typings.actionsOnGoogle.actionsOnGoogleStrings.typeDotgoogleapisDotcomSlashgoogleDotactionsDotv2DotOptionValueSpec = "type.googleapis.com/google.actions.v2.OptionValueSpec".asInstanceOf[typings.actionsOnGoogle.actionsOnGoogleStrings.typeDotgoogleapisDotcomSlashgoogleDotactionsDotv2DotOptionValueSpec]
    
    @scala.inline
    def typeDotgoogleapisDotcomSlashgoogleDotactionsDotv2DotPermissionValueSpec: typings.actionsOnGoogle.actionsOnGoogleStrings.typeDotgoogleapisDotcomSlashgoogleDotactionsDotv2DotPermissionValueSpec = "type.googleapis.com/google.actions.v2.PermissionValueSpec".asInstanceOf[typings.actionsOnGoogle.actionsOnGoogleStrings.typeDotgoogleapisDotcomSlashgoogleDotactionsDotv2DotPermissionValueSpec]
    
    @scala.inline
    def typeDotgoogleapisDotcomSlashgoogleDotactionsDotv2DotPlaceValueSpec: typings.actionsOnGoogle.actionsOnGoogleStrings.typeDotgoogleapisDotcomSlashgoogleDotactionsDotv2DotPlaceValueSpec = "type.googleapis.com/google.actions.v2.PlaceValueSpec".asInstanceOf[typings.actionsOnGoogle.actionsOnGoogleStrings.typeDotgoogleapisDotcomSlashgoogleDotactionsDotv2DotPlaceValueSpec]
    
    @scala.inline
    def typeDotgoogleapisDotcomSlashgoogleDotactionsDotv2DotRegisterUpdateValueSpec: typings.actionsOnGoogle.actionsOnGoogleStrings.typeDotgoogleapisDotcomSlashgoogleDotactionsDotv2DotRegisterUpdateValueSpec = "type.googleapis.com/google.actions.v2.RegisterUpdateValueSpec".asInstanceOf[typings.actionsOnGoogle.actionsOnGoogleStrings.typeDotgoogleapisDotcomSlashgoogleDotactionsDotv2DotRegisterUpdateValueSpec]
    
    @scala.inline
    def typeDotgoogleapisDotcomSlashgoogleDotactionsDotv2DotSignInValueSpec: typings.actionsOnGoogle.actionsOnGoogleStrings.typeDotgoogleapisDotcomSlashgoogleDotactionsDotv2DotSignInValueSpec = "type.googleapis.com/google.actions.v2.SignInValueSpec".asInstanceOf[typings.actionsOnGoogle.actionsOnGoogleStrings.typeDotgoogleapisDotcomSlashgoogleDotactionsDotv2DotSignInValueSpec]
    
    @scala.inline
    def typeDotgoogleapisDotcomSlashgoogleDotactionsDotv2DotTransactionDecisionValueSpec: typings.actionsOnGoogle.actionsOnGoogleStrings.typeDotgoogleapisDotcomSlashgoogleDotactionsDotv2DotTransactionDecisionValueSpec = "type.googleapis.com/google.actions.v2.TransactionDecisionValueSpec".asInstanceOf[typings.actionsOnGoogle.actionsOnGoogleStrings.typeDotgoogleapisDotcomSlashgoogleDotactionsDotv2DotTransactionDecisionValueSpec]
    
    @scala.inline
    def typeDotgoogleapisDotcomSlashgoogleDotactionsDotv2DotTransactionRequirementsCheckSpec: typings.actionsOnGoogle.actionsOnGoogleStrings.typeDotgoogleapisDotcomSlashgoogleDotactionsDotv2DotTransactionRequirementsCheckSpec = "type.googleapis.com/google.actions.v2.TransactionRequirementsCheckSpec".asInstanceOf[typings.actionsOnGoogle.actionsOnGoogleStrings.typeDotgoogleapisDotcomSlashgoogleDotactionsDotv2DotTransactionRequirementsCheckSpec]
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
    
    @scala.inline
    def actionsDotintentDotCANCEL: typings.actionsOnGoogle.actionsOnGoogleStrings.actionsDotintentDotCANCEL = "actions.intent.CANCEL".asInstanceOf[typings.actionsOnGoogle.actionsOnGoogleStrings.actionsDotintentDotCANCEL]
    
    @scala.inline
    def actionsDotintentDotCOMPLETE_PURCHASE: typings.actionsOnGoogle.actionsOnGoogleStrings.actionsDotintentDotCOMPLETE_PURCHASE = "actions.intent.COMPLETE_PURCHASE".asInstanceOf[typings.actionsOnGoogle.actionsOnGoogleStrings.actionsDotintentDotCOMPLETE_PURCHASE]
    
    @scala.inline
    def actionsDotintentDotCONFIGURE_UPDATES: typings.actionsOnGoogle.actionsOnGoogleStrings.actionsDotintentDotCONFIGURE_UPDATES = "actions.intent.CONFIGURE_UPDATES".asInstanceOf[typings.actionsOnGoogle.actionsOnGoogleStrings.actionsDotintentDotCONFIGURE_UPDATES]
    
    @scala.inline
    def actionsDotintentDotCONFIRMATION: typings.actionsOnGoogle.actionsOnGoogleStrings.actionsDotintentDotCONFIRMATION = "actions.intent.CONFIRMATION".asInstanceOf[typings.actionsOnGoogle.actionsOnGoogleStrings.actionsDotintentDotCONFIRMATION]
    
    @scala.inline
    def actionsDotintentDotDATETIME: typings.actionsOnGoogle.actionsOnGoogleStrings.actionsDotintentDotDATETIME = "actions.intent.DATETIME".asInstanceOf[typings.actionsOnGoogle.actionsOnGoogleStrings.actionsDotintentDotDATETIME]
    
    @scala.inline
    def actionsDotintentDotDELIVERY_ADDRESS: typings.actionsOnGoogle.actionsOnGoogleStrings.actionsDotintentDotDELIVERY_ADDRESS = "actions.intent.DELIVERY_ADDRESS".asInstanceOf[typings.actionsOnGoogle.actionsOnGoogleStrings.actionsDotintentDotDELIVERY_ADDRESS]
    
    @scala.inline
    def actionsDotintentDotDIGITAL_PURCHASE_CHECK: typings.actionsOnGoogle.actionsOnGoogleStrings.actionsDotintentDotDIGITAL_PURCHASE_CHECK = "actions.intent.DIGITAL_PURCHASE_CHECK".asInstanceOf[typings.actionsOnGoogle.actionsOnGoogleStrings.actionsDotintentDotDIGITAL_PURCHASE_CHECK]
    
    @scala.inline
    def actionsDotintentDotLINK: typings.actionsOnGoogle.actionsOnGoogleStrings.actionsDotintentDotLINK = "actions.intent.LINK".asInstanceOf[typings.actionsOnGoogle.actionsOnGoogleStrings.actionsDotintentDotLINK]
    
    @scala.inline
    def actionsDotintentDotMAIN: typings.actionsOnGoogle.actionsOnGoogleStrings.actionsDotintentDotMAIN = "actions.intent.MAIN".asInstanceOf[typings.actionsOnGoogle.actionsOnGoogleStrings.actionsDotintentDotMAIN]
    
    @scala.inline
    def actionsDotintentDotMEDIA_STATUS: typings.actionsOnGoogle.actionsOnGoogleStrings.actionsDotintentDotMEDIA_STATUS = "actions.intent.MEDIA_STATUS".asInstanceOf[typings.actionsOnGoogle.actionsOnGoogleStrings.actionsDotintentDotMEDIA_STATUS]
    
    @scala.inline
    def actionsDotintentDotNEW_SURFACE: typings.actionsOnGoogle.actionsOnGoogleStrings.actionsDotintentDotNEW_SURFACE = "actions.intent.NEW_SURFACE".asInstanceOf[typings.actionsOnGoogle.actionsOnGoogleStrings.actionsDotintentDotNEW_SURFACE]
    
    @scala.inline
    def actionsDotintentDotNO_INPUT: typings.actionsOnGoogle.actionsOnGoogleStrings.actionsDotintentDotNO_INPUT = "actions.intent.NO_INPUT".asInstanceOf[typings.actionsOnGoogle.actionsOnGoogleStrings.actionsDotintentDotNO_INPUT]
    
    @scala.inline
    def actionsDotintentDotOPTION: typings.actionsOnGoogle.actionsOnGoogleStrings.actionsDotintentDotOPTION = "actions.intent.OPTION".asInstanceOf[typings.actionsOnGoogle.actionsOnGoogleStrings.actionsDotintentDotOPTION]
    
    @scala.inline
    def actionsDotintentDotPERMISSION: typings.actionsOnGoogle.actionsOnGoogleStrings.actionsDotintentDotPERMISSION = "actions.intent.PERMISSION".asInstanceOf[typings.actionsOnGoogle.actionsOnGoogleStrings.actionsDotintentDotPERMISSION]
    
    @scala.inline
    def actionsDotintentDotPLACE: typings.actionsOnGoogle.actionsOnGoogleStrings.actionsDotintentDotPLACE = "actions.intent.PLACE".asInstanceOf[typings.actionsOnGoogle.actionsOnGoogleStrings.actionsDotintentDotPLACE]
    
    @scala.inline
    def actionsDotintentDotREGISTER_UPDATE: typings.actionsOnGoogle.actionsOnGoogleStrings.actionsDotintentDotREGISTER_UPDATE = "actions.intent.REGISTER_UPDATE".asInstanceOf[typings.actionsOnGoogle.actionsOnGoogleStrings.actionsDotintentDotREGISTER_UPDATE]
    
    @scala.inline
    def actionsDotintentDotSIGN_IN: typings.actionsOnGoogle.actionsOnGoogleStrings.actionsDotintentDotSIGN_IN = "actions.intent.SIGN_IN".asInstanceOf[typings.actionsOnGoogle.actionsOnGoogleStrings.actionsDotintentDotSIGN_IN]
    
    @scala.inline
    def actionsDotintentDotTEXT: typings.actionsOnGoogle.actionsOnGoogleStrings.actionsDotintentDotTEXT = "actions.intent.TEXT".asInstanceOf[typings.actionsOnGoogle.actionsOnGoogleStrings.actionsDotintentDotTEXT]
    
    @scala.inline
    def actionsDotintentDotTRANSACTION_DECISION: typings.actionsOnGoogle.actionsOnGoogleStrings.actionsDotintentDotTRANSACTION_DECISION = "actions.intent.TRANSACTION_DECISION".asInstanceOf[typings.actionsOnGoogle.actionsOnGoogleStrings.actionsDotintentDotTRANSACTION_DECISION]
    
    @scala.inline
    def actionsDotintentDotTRANSACTION_REQUIREMENTS_CHECK: typings.actionsOnGoogle.actionsOnGoogleStrings.actionsDotintentDotTRANSACTION_REQUIREMENTS_CHECK = "actions.intent.TRANSACTION_REQUIREMENTS_CHECK".asInstanceOf[typings.actionsOnGoogle.actionsOnGoogleStrings.actionsDotintentDotTRANSACTION_REQUIREMENTS_CHECK]
  }
  
  @js.native
  trait OAuth2Config extends StObject {
    
    /** @public */
    var client: OAuth2ConfigClient = js.native
  }
  object OAuth2Config {
    
    @scala.inline
    def apply(client: OAuth2ConfigClient): OAuth2Config = {
      val __obj = js.Dynamic.literal(client = client.asInstanceOf[js.Any])
      __obj.asInstanceOf[OAuth2Config]
    }
    
    @scala.inline
    implicit class OAuth2ConfigMutableBuilder[Self <: OAuth2Config] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClient(value: OAuth2ConfigClient): Self = StObject.set(x, "client", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait OAuth2ConfigClient extends StObject {
    
    /** @public */
    var id: String = js.native
  }
  object OAuth2ConfigClient {
    
    @scala.inline
    def apply(id: String): OAuth2ConfigClient = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
      __obj.asInstanceOf[OAuth2ConfigClient]
    }
    
    @scala.inline
    implicit class OAuth2ConfigClientMutableBuilder[Self <: OAuth2ConfigClient] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
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
