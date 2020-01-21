package typings.actionsOnGoogle.dialogflowDialogflowMod

import typings.actionsOnGoogle.argumentArgumentMod.Argument
import typings.actionsOnGoogle.contextMod.Contexts
import typings.actionsOnGoogle.contextMod.Parameters
import typings.actionsOnGoogle.conversationConversationMod.ConversationApp
import typings.actionsOnGoogle.conversationConversationMod.ExceptionHandler
import typings.actionsOnGoogle.dialogflowConvMod.DialogflowConversation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DialogflowApp[TConvData, TUserStorage, TContexts /* <: Contexts */, TConversation /* <: DialogflowConversation[TConvData, TUserStorage, TContexts] */] extends ConversationApp[TConvData, TUserStorage] {
  /** @hidden */
  var _handlers: DialogflowHandlers[TConvData, TUserStorage, TContexts, TConversation] = js.native
  /** @hidden */
  var _middlewares: js.Array[DialogflowMiddleware[DialogflowConversation[js.Object, js.Object, Contexts]]] = js.native
  /** @public */
  var verification: js.UndefOr[DialogflowVerification | DialogflowVerificationHeaders] = js.native
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
}

