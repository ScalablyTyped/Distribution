package typings.actionsOnGoogle

import org.scalablytyped.runtime.StringDictionary
import typings.actionsOnGoogle.distAssistantMod.AppHandler
import typings.actionsOnGoogle.distCommonMod.JsonObject
import typings.actionsOnGoogle.distFrameworkFrameworkMod.BuiltinFrameworkMetadata
import typings.actionsOnGoogle.distServiceActionssdkApiV2Mod.GoogleRpcStatus
import typings.actionsOnGoogle.distServiceActionssdkConversationArgumentArgumentMod.Argument
import typings.actionsOnGoogle.distServiceActionssdkConversationConversationMod.ConversationApp
import typings.actionsOnGoogle.distServiceActionssdkConversationConversationMod.ConversationAppOptions
import typings.actionsOnGoogle.distServiceActionssdkConversationConversationMod.ExceptionHandler
import typings.actionsOnGoogle.distServiceDialogflowContextMod.Contexts
import typings.actionsOnGoogle.distServiceDialogflowContextMod.Parameters
import typings.actionsOnGoogle.distServiceDialogflowConvMod.DialogflowConversation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distServiceDialogflowDialogflowMod {
  
  @JSImport("actions-on-google/dist/service/dialogflow/dialogflow", "dialogflow")
  @js.native
  val dialogflow: Dialogflow_ = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typings.actionsOnGoogle.actionsOnGoogleStrings.`Default Welcome Intent`
    - typings.actionsOnGoogle.actionsOnGoogleStrings.`Default Fallback Intent`
  */
  trait DefaultDialogflowIntent extends StObject
  object DefaultDialogflowIntent {
    
    inline def `Default Fallback Intent`: typings.actionsOnGoogle.actionsOnGoogleStrings.`Default Fallback Intent` = ("Default Fallback Intent").asInstanceOf[typings.actionsOnGoogle.actionsOnGoogleStrings.`Default Fallback Intent`]
    
    inline def `Default Welcome Intent`: typings.actionsOnGoogle.actionsOnGoogleStrings.`Default Welcome Intent` = ("Default Welcome Intent").asInstanceOf[typings.actionsOnGoogle.actionsOnGoogleStrings.`Default Welcome Intent`]
  }
  
  @js.native
  trait DialogflowApp[TConvData, TUserStorage, TContexts /* <: Contexts */, TConversation /* <: DialogflowConversation[TConvData, TUserStorage, TContexts] */]
    extends StObject
       with ConversationApp[TConvData, TUserStorage] {
    
    /** @hidden */
    var _handlers: DialogflowHandlers[TConvData, TUserStorage, TContexts, TConversation] = js.native
    
    /** @hidden */
    var _middlewares: js.Array[DialogflowMiddleware[DialogflowConversation[js.Object, js.Object, Contexts]]] = js.native
    
    /** @public */
    def `catch`(catcher: ExceptionHandler[TUserStorage, TConversation]): this.type = js.native
    
    def fallback(handler: String): this.type = js.native
    /** @public */
    def fallback(
      handler: DialogflowIntentHandler[TConvData, TUserStorage, TContexts, TConversation, Parameters, Argument]
    ): this.type = js.native
    
    def intent[TArgument /* <: Argument */](intent: String, handler: String): this.type = js.native
    /**
      * Sets the IntentHandler to be execute when the fulfillment is called
      * with a given Dialogflow intent name.
      *
      * @param intent The Dialogflow intent name to match.
      *     When given an array, sets the IntentHandler for any intent name in the array.
      * @param handler The IntentHandler to be executed when the intent name is matched.
      *     When given a string instead of a function, the intent fulfillment will be redirected
      *     to the IntentHandler of the redirected intent name.
      * @public
      */
    def intent[TArgument /* <: Argument */](
      intent: String,
      handler: DialogflowIntentHandler[TConvData, TUserStorage, TContexts, TConversation, Parameters, TArgument]
    ): this.type = js.native
    def intent[TArgument /* <: Argument */](intent: js.Array[DefaultDialogflowIntent | String], handler: String): this.type = js.native
    def intent[TArgument /* <: Argument */](
      intent: js.Array[DefaultDialogflowIntent | String],
      handler: DialogflowIntentHandler[TConvData, TUserStorage, TContexts, TConversation, Parameters, TArgument]
    ): this.type = js.native
    def intent[TArgument /* <: Argument */](intent: DefaultDialogflowIntent, handler: String): this.type = js.native
    /**
      * Sets the IntentHandler to be execute when the fulfillment is called
      * with a given Dialogflow intent name.
      *
      * @param intent The Dialogflow intent name to match.
      *     When given an array, sets the IntentHandler for any intent name in the array.
      * @param handler The IntentHandler to be executed when the intent name is matched.
      *     When given a string instead of a function, the intent fulfillment will be redirected
      *     to the IntentHandler of the redirected intent name.
      * @public
      */
    def intent[TArgument /* <: Argument */](
      intent: DefaultDialogflowIntent,
      handler: DialogflowIntentHandler[TConvData, TUserStorage, TContexts, TConversation, Parameters, TArgument]
    ): this.type = js.native
    @JSName("intent")
    def intent_TParameters[TParameters /* <: Parameters */](intent: String, handler: String): this.type = js.native
    /**
      * Sets the IntentHandler to be execute when the fulfillment is called
      * with a given Dialogflow intent name.
      *
      * @param intent The Dialogflow intent name to match.
      *     When given an array, sets the IntentHandler for any intent name in the array.
      * @param handler The IntentHandler to be executed when the intent name is matched.
      *     When given a string instead of a function, the intent fulfillment will be redirected
      *     to the IntentHandler of the redirected intent name.
      * @public
      */
    @JSName("intent")
    def intent_TParameters[TParameters /* <: Parameters */](
      intent: String,
      handler: DialogflowIntentHandler[TConvData, TUserStorage, TContexts, TConversation, TParameters, Argument]
    ): this.type = js.native
    @JSName("intent")
    def intent_TParameters[TParameters /* <: Parameters */](intent: js.Array[DefaultDialogflowIntent | String], handler: String): this.type = js.native
    @JSName("intent")
    def intent_TParameters[TParameters /* <: Parameters */](
      intent: js.Array[DefaultDialogflowIntent | String],
      handler: DialogflowIntentHandler[TConvData, TUserStorage, TContexts, TConversation, TParameters, Argument]
    ): this.type = js.native
    @JSName("intent")
    def intent_TParameters[TParameters /* <: Parameters */](intent: DefaultDialogflowIntent, handler: String): this.type = js.native
    /**
      * Sets the IntentHandler to be execute when the fulfillment is called
      * with a given Dialogflow intent name.
      *
      * @param intent The Dialogflow intent name to match.
      *     When given an array, sets the IntentHandler for any intent name in the array.
      * @param handler The IntentHandler to be executed when the intent name is matched.
      *     When given a string instead of a function, the intent fulfillment will be redirected
      *     to the IntentHandler of the redirected intent name.
      * @public
      */
    @JSName("intent")
    def intent_TParameters[TParameters /* <: Parameters */](
      intent: DefaultDialogflowIntent,
      handler: DialogflowIntentHandler[TConvData, TUserStorage, TContexts, TConversation, TParameters, Argument]
    ): this.type = js.native
    @JSName("intent")
    def intent_TParametersTArgument[TParameters /* <: Parameters */, TArgument /* <: Argument */](intent: String, handler: String): this.type = js.native
    /**
      * Sets the IntentHandler to be execute when the fulfillment is called
      * with a given Dialogflow intent name.
      *
      * @param intent The Dialogflow intent name to match.
      *     When given an array, sets the IntentHandler for any intent name in the array.
      * @param handler The IntentHandler to be executed when the intent name is matched.
      *     When given a string instead of a function, the intent fulfillment will be redirected
      *     to the IntentHandler of the redirected intent name.
      * @public
      */
    @JSName("intent")
    def intent_TParametersTArgument[TParameters /* <: Parameters */, TArgument /* <: Argument */](
      intent: String,
      handler: DialogflowIntentHandler[TConvData, TUserStorage, TContexts, TConversation, TParameters, TArgument]
    ): this.type = js.native
    @JSName("intent")
    def intent_TParametersTArgument[TParameters /* <: Parameters */, TArgument /* <: Argument */](intent: js.Array[DefaultDialogflowIntent | String], handler: String): this.type = js.native
    @JSName("intent")
    def intent_TParametersTArgument[TParameters /* <: Parameters */, TArgument /* <: Argument */](
      intent: js.Array[DefaultDialogflowIntent | String],
      handler: DialogflowIntentHandler[TConvData, TUserStorage, TContexts, TConversation, TParameters, TArgument]
    ): this.type = js.native
    @JSName("intent")
    def intent_TParametersTArgument[TParameters /* <: Parameters */, TArgument /* <: Argument */](intent: DefaultDialogflowIntent, handler: String): this.type = js.native
    /**
      * Sets the IntentHandler to be execute when the fulfillment is called
      * with a given Dialogflow intent name.
      *
      * @param intent The Dialogflow intent name to match.
      *     When given an array, sets the IntentHandler for any intent name in the array.
      * @param handler The IntentHandler to be executed when the intent name is matched.
      *     When given a string instead of a function, the intent fulfillment will be redirected
      *     to the IntentHandler of the redirected intent name.
      * @public
      */
    @JSName("intent")
    def intent_TParametersTArgument[TParameters /* <: Parameters */, TArgument /* <: Argument */](
      intent: DefaultDialogflowIntent,
      handler: DialogflowIntentHandler[TConvData, TUserStorage, TContexts, TConversation, TParameters, TArgument]
    ): this.type = js.native
    
    /** @public */
    def middleware[TConversationPlugin /* <: DialogflowConversation[js.Object, js.Object, Contexts] */](middleware: DialogflowMiddleware[TConversationPlugin]): this.type = js.native
    
    /** @public */
    var verification: js.UndefOr[DialogflowVerification | DialogflowVerificationHeaders] = js.native
  }
  
  trait DialogflowHandlers[TConvData, TUserStorage, TContexts /* <: Contexts */, TConversation /* <: DialogflowConversation[TConvData, TUserStorage, TContexts] */] extends StObject {
    
    def catcher(conv: TConversation, error: js.Error): js.Promise[Any] | Any
    @JSName("catcher")
    var catcher_Original: ExceptionHandler[TUserStorage, TConversation]
    
    var fallback: js.UndefOr[js.Function | String] = js.undefined
    
    var intents: DialogflowIntentHandlers
  }
  object DialogflowHandlers {
    
    inline def apply[TConvData, TUserStorage, TContexts /* <: Contexts */, TConversation /* <: DialogflowConversation[TConvData, TUserStorage, TContexts] */](
      catcher: (TConversation, /* error */ js.Error) => js.Promise[Any] | Any,
      intents: DialogflowIntentHandlers
    ): DialogflowHandlers[TConvData, TUserStorage, TContexts, TConversation] = {
      val __obj = js.Dynamic.literal(catcher = js.Any.fromFunction2(catcher), intents = intents.asInstanceOf[js.Any])
      __obj.asInstanceOf[DialogflowHandlers[TConvData, TUserStorage, TContexts, TConversation]]
    }
    
    extension [Self <: DialogflowHandlers[?, ?, ?, ?], TConvData, TUserStorage, TContexts /* <: Contexts */, TConversation /* <: DialogflowConversation[TConvData, TUserStorage, TContexts] */](x: Self & (DialogflowHandlers[TConvData, TUserStorage, TContexts, TConversation])) {
      
      inline def setCatcher(value: (TConversation, /* error */ js.Error) => js.Promise[Any] | Any): Self = StObject.set(x, "catcher", js.Any.fromFunction2(value))
      
      inline def setFallback(value: js.Function | String): Self = StObject.set(x, "fallback", value.asInstanceOf[js.Any])
      
      inline def setFallbackUndefined: Self = StObject.set(x, "fallback", js.undefined)
      
      inline def setIntents(value: DialogflowIntentHandlers): Self = StObject.set(x, "intents", value.asInstanceOf[js.Any])
    }
  }
  
  type DialogflowIntentHandler[TConvData, TUserStorage, TContexts /* <: Contexts */, TConversation /* <: DialogflowConversation[TConvData, TUserStorage, TContexts] */, TParameters /* <: Parameters */, TArgument /* <: Argument */] = js.Function4[
    /* conv */ TConversation, 
    /* params */ TParameters, 
    /* argument */ TArgument, 
    /* status */ js.UndefOr[GoogleRpcStatus], 
    js.Promise[Any] | Any
  ]
  
  type DialogflowIntentHandlers = StringDictionary[js.UndefOr[js.Function | String]]
  
  type DialogflowMiddleware[TConversationPlugin /* <: DialogflowConversation[JsonObject, JsonObject, Contexts] */] = js.Function2[
    /* conv */ DialogflowConversation[JsonObject, JsonObject, Contexts], 
    /* framework */ BuiltinFrameworkMetadata, 
    ((DialogflowConversation[JsonObject, JsonObject, Contexts]) & TConversationPlugin) | Unit | (js.Promise[
      ((DialogflowConversation[JsonObject, JsonObject, Contexts]) & TConversationPlugin) | Unit
    ])
  ]
  
  trait DialogflowOptions[TConvData, TUserStorage]
    extends StObject
       with ConversationAppOptions[TConvData, TUserStorage] {
    
    /**
      * Verifies whether the request comes from Dialogflow.
      * Uses header keys and values to check against ones specified by the developer
      * in the Dialogflow Fulfillment settings of the app.
      *
      * HTTP Code 403 will be thrown by default on verification error.
      *
      * @public
      */
    var verification: js.UndefOr[DialogflowVerification | DialogflowVerificationHeaders] = js.undefined
  }
  object DialogflowOptions {
    
    inline def apply[TConvData, TUserStorage](): DialogflowOptions[TConvData, TUserStorage] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DialogflowOptions[TConvData, TUserStorage]]
    }
    
    extension [Self <: DialogflowOptions[?, ?], TConvData, TUserStorage](x: Self & (DialogflowOptions[TConvData, TUserStorage])) {
      
      inline def setVerification(value: DialogflowVerification | DialogflowVerificationHeaders): Self = StObject.set(x, "verification", value.asInstanceOf[js.Any])
      
      inline def setVerificationUndefined: Self = StObject.set(x, "verification", js.undefined)
    }
  }
  
  trait DialogflowVerification extends StObject {
    
    /**
      * Custom error message as a string or a function that returns a string
      * given the original error message set by the library.
      *
      * The message will get sent back in the JSON top level `error` property.
      * @public
      */
    var error: js.UndefOr[String | (js.Function1[/* error */ String, String])] = js.undefined
    
    /**
      * An object representing the header key to value map to check against,
      * @public
      */
    var headers: DialogflowVerificationHeaders
    
    /**
      * Custom status code to return on verification error.
      * @public
      */
    var status: js.UndefOr[Double] = js.undefined
  }
  object DialogflowVerification {
    
    inline def apply(headers: DialogflowVerificationHeaders): DialogflowVerification = {
      val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any])
      __obj.asInstanceOf[DialogflowVerification]
    }
    
    extension [Self <: DialogflowVerification](x: Self) {
      
      inline def setError(value: String | (js.Function1[/* error */ String, String])): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setErrorFunction1(value: /* error */ String => String): Self = StObject.set(x, "error", js.Any.fromFunction1(value))
      
      inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      inline def setHeaders(value: DialogflowVerificationHeaders): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setStatus(value: Double): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    }
  }
  
  type DialogflowVerificationHeaders = /**
    * A header key value pair to check against.
    * @public
    */
  StringDictionary[String]
  
  @js.native
  trait Dialogflow_ extends StObject {
    
    /** @public */
    def apply[TConversation /* <: DialogflowConversation[js.Object, js.Object, Contexts] */](): AppHandler & (DialogflowApp[js.Object, js.Object, Contexts, TConversation]) = js.native
    def apply[TConversation /* <: DialogflowConversation[js.Object, js.Object, Contexts] */](options: DialogflowOptions[js.Object, js.Object]): AppHandler & (DialogflowApp[js.Object, js.Object, Contexts, TConversation]) = js.native
  }
}
