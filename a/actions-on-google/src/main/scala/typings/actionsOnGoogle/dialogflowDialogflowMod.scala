package typings.actionsOnGoogle

import org.scalablytyped.runtime.StringDictionary
import typings.actionsOnGoogle.argumentArgumentMod.Argument
import typings.actionsOnGoogle.assistantMod.AppHandler
import typings.actionsOnGoogle.commonMod.JsonObject
import typings.actionsOnGoogle.contextMod.Contexts
import typings.actionsOnGoogle.contextMod.Parameters
import typings.actionsOnGoogle.conversationConversationMod.ConversationApp
import typings.actionsOnGoogle.conversationConversationMod.ConversationAppOptions
import typings.actionsOnGoogle.conversationConversationMod.ExceptionHandler
import typings.actionsOnGoogle.dialogflowConvMod.DialogflowConversation
import typings.actionsOnGoogle.frameworkFrameworkMod.BuiltinFrameworkMetadata
import typings.actionsOnGoogle.v2Mod.GoogleRpcStatus
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dialogflowDialogflowMod {
  
  @JSImport("actions-on-google/dist/service/dialogflow/dialogflow", "dialogflow")
  @js.native
  val dialogflow: Dialogflow_ = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typings.actionsOnGoogle.actionsOnGoogleStrings.`Default Welcome Intent`
    - typings.actionsOnGoogle.actionsOnGoogleStrings.`Default Fallback Intent`
  */
  trait DefaultDialogflowIntent extends StObject
  object DefaultDialogflowIntent {
    
    @scala.inline
    def `Default Fallback Intent`: typings.actionsOnGoogle.actionsOnGoogleStrings.`Default Fallback Intent` = ("Default Fallback Intent").asInstanceOf[typings.actionsOnGoogle.actionsOnGoogleStrings.`Default Fallback Intent`]
    
    @scala.inline
    def `Default Welcome Intent`: typings.actionsOnGoogle.actionsOnGoogleStrings.`Default Welcome Intent` = ("Default Welcome Intent").asInstanceOf[typings.actionsOnGoogle.actionsOnGoogleStrings.`Default Welcome Intent`]
  }
  
  @js.native
  trait DialogflowApp[TConvData, TUserStorage, TContexts /* <: Contexts */, TConversation /* <: DialogflowConversation[TConvData, TUserStorage, TContexts] */] extends ConversationApp[TConvData, TUserStorage] {
    
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
    def intent_TParameters_Parameters[TParameters /* <: Parameters */](intent: String, handler: String): this.type = js.native
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
    def intent_TParameters_Parameters[TParameters /* <: Parameters */](
      intent: String,
      handler: DialogflowIntentHandler[TConvData, TUserStorage, TContexts, TConversation, TParameters, Argument]
    ): this.type = js.native
    @JSName("intent")
    def intent_TParameters_Parameters[TParameters /* <: Parameters */](intent: js.Array[DefaultDialogflowIntent | String], handler: String): this.type = js.native
    @JSName("intent")
    def intent_TParameters_Parameters[TParameters /* <: Parameters */](
      intent: js.Array[DefaultDialogflowIntent | String],
      handler: DialogflowIntentHandler[TConvData, TUserStorage, TContexts, TConversation, TParameters, Argument]
    ): this.type = js.native
    @JSName("intent")
    def intent_TParameters_Parameters[TParameters /* <: Parameters */](intent: DefaultDialogflowIntent, handler: String): this.type = js.native
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
    def intent_TParameters_Parameters[TParameters /* <: Parameters */](
      intent: DefaultDialogflowIntent,
      handler: DialogflowIntentHandler[TConvData, TUserStorage, TContexts, TConversation, TParameters, Argument]
    ): this.type = js.native
    @JSName("intent")
    def intent_TParameters_ParametersTArgument_Argument[TParameters /* <: Parameters */, TArgument /* <: Argument */](intent: String, handler: String): this.type = js.native
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
    def intent_TParameters_ParametersTArgument_Argument[TParameters /* <: Parameters */, TArgument /* <: Argument */](
      intent: String,
      handler: DialogflowIntentHandler[TConvData, TUserStorage, TContexts, TConversation, TParameters, TArgument]
    ): this.type = js.native
    @JSName("intent")
    def intent_TParameters_ParametersTArgument_Argument[TParameters /* <: Parameters */, TArgument /* <: Argument */](intent: js.Array[DefaultDialogflowIntent | String], handler: String): this.type = js.native
    @JSName("intent")
    def intent_TParameters_ParametersTArgument_Argument[TParameters /* <: Parameters */, TArgument /* <: Argument */](
      intent: js.Array[DefaultDialogflowIntent | String],
      handler: DialogflowIntentHandler[TConvData, TUserStorage, TContexts, TConversation, TParameters, TArgument]
    ): this.type = js.native
    @JSName("intent")
    def intent_TParameters_ParametersTArgument_Argument[TParameters /* <: Parameters */, TArgument /* <: Argument */](intent: DefaultDialogflowIntent, handler: String): this.type = js.native
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
    def intent_TParameters_ParametersTArgument_Argument[TParameters /* <: Parameters */, TArgument /* <: Argument */](
      intent: DefaultDialogflowIntent,
      handler: DialogflowIntentHandler[TConvData, TUserStorage, TContexts, TConversation, TParameters, TArgument]
    ): this.type = js.native
    
    /** @public */
    def middleware[TConversationPlugin /* <: DialogflowConversation[js.Object, js.Object, Contexts] */](middleware: DialogflowMiddleware[TConversationPlugin]): this.type = js.native
    
    /** @public */
    var verification: js.UndefOr[DialogflowVerification | DialogflowVerificationHeaders] = js.native
  }
  
  @js.native
  trait DialogflowHandlers[TConvData, TUserStorage, TContexts /* <: Contexts */, TConversation /* <: DialogflowConversation[TConvData, TUserStorage, TContexts] */] extends StObject {
    
    def catcher(conv: TConversation, error: Error): js.Promise[_] | js.Any = js.native
    @JSName("catcher")
    var catcher_Original: ExceptionHandler[TUserStorage, TConversation] = js.native
    
    var fallback: js.UndefOr[js.Function | String] = js.native
    
    var intents: DialogflowIntentHandlers = js.native
  }
  
  type DialogflowIntentHandler[TConvData, TUserStorage, TContexts /* <: Contexts */, TConversation /* <: DialogflowConversation[TConvData, TUserStorage, TContexts] */, TParameters /* <: Parameters */, TArgument /* <: Argument */] = js.Function4[
    /* conv */ TConversation, 
    /* params */ TParameters, 
    /* argument */ TArgument, 
    /* status */ js.UndefOr[GoogleRpcStatus], 
    js.Promise[js.Any] | js.Any
  ]
  
  type DialogflowIntentHandlers = StringDictionary[js.UndefOr[js.Function | String]]
  
  type DialogflowMiddleware[TConversationPlugin /* <: DialogflowConversation[JsonObject, JsonObject, Contexts] */] = js.Function2[
    /* conv */ DialogflowConversation[JsonObject, JsonObject, Contexts], 
    /* framework */ BuiltinFrameworkMetadata, 
    ((DialogflowConversation[JsonObject, JsonObject, Contexts]) with TConversationPlugin) | Unit | (js.Promise[
      ((DialogflowConversation[JsonObject, JsonObject, Contexts]) with TConversationPlugin) | Unit
    ])
  ]
  
  @js.native
  trait DialogflowOptions[TConvData, TUserStorage] extends ConversationAppOptions[TConvData, TUserStorage] {
    
    /**
      * Verifies whether the request comes from Dialogflow.
      * Uses header keys and values to check against ones specified by the developer
      * in the Dialogflow Fulfillment settings of the app.
      *
      * HTTP Code 403 will be thrown by default on verification error.
      *
      * @public
      */
    var verification: js.UndefOr[DialogflowVerification | DialogflowVerificationHeaders] = js.native
  }
  object DialogflowOptions {
    
    @scala.inline
    def apply[TConvData, TUserStorage](): DialogflowOptions[TConvData, TUserStorage] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DialogflowOptions[TConvData, TUserStorage]]
    }
    
    @scala.inline
    implicit class DialogflowOptionsMutableBuilder[Self <: DialogflowOptions[_, _], TConvData, TUserStorage] (val x: Self with (DialogflowOptions[TConvData, TUserStorage])) extends AnyVal {
      
      @scala.inline
      def setVerification(value: DialogflowVerification | DialogflowVerificationHeaders): Self = StObject.set(x, "verification", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVerificationUndefined: Self = StObject.set(x, "verification", js.undefined)
    }
  }
  
  @js.native
  trait DialogflowVerification extends StObject {
    
    /**
      * Custom error message as a string or a function that returns a string
      * given the original error message set by the library.
      *
      * The message will get sent back in the JSON top level `error` property.
      * @public
      */
    var error: js.UndefOr[String | (js.Function1[/* error */ String, String])] = js.native
    
    /**
      * An object representing the header key to value map to check against,
      * @public
      */
    var headers: DialogflowVerificationHeaders = js.native
    
    /**
      * Custom status code to return on verification error.
      * @public
      */
    var status: js.UndefOr[Double] = js.native
  }
  object DialogflowVerification {
    
    @scala.inline
    def apply(headers: DialogflowVerificationHeaders): DialogflowVerification = {
      val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any])
      __obj.asInstanceOf[DialogflowVerification]
    }
    
    @scala.inline
    implicit class DialogflowVerificationMutableBuilder[Self <: DialogflowVerification] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setError(value: String | (js.Function1[/* error */ String, String])): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrorFunction1(value: /* error */ String => String): Self = StObject.set(x, "error", js.Any.fromFunction1(value))
      
      @scala.inline
      def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      @scala.inline
      def setHeaders(value: DialogflowVerificationHeaders): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatus(value: Double): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
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
    def apply[TConversation /* <: DialogflowConversation[js.Object, js.Object, Contexts] */](): AppHandler with (DialogflowApp[js.Object, js.Object, Contexts, TConversation]) = js.native
    def apply[TConversation /* <: DialogflowConversation[js.Object, js.Object, Contexts] */](options: DialogflowOptions[js.Object, js.Object]): AppHandler with (DialogflowApp[js.Object, js.Object, Contexts, TConversation]) = js.native
  }
}
