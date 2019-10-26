package typings.actionsDashOnDashGoogle.distServiceDialogflowConvMod

import typings.actionsDashOnDashGoogle.distServiceActionssdkConversationConversationMod.ConversationOptionsInit
import typings.actionsDashOnDashGoogle.distServiceActionssdkMod.Conversation
import typings.actionsDashOnDashGoogle.distServiceDialogflowApiV1Mod.DialogflowV1FollowupEvent
import typings.actionsDashOnDashGoogle.distServiceDialogflowApiV1Mod.DialogflowV1WebhookRequest
import typings.actionsDashOnDashGoogle.distServiceDialogflowApiV1Mod.DialogflowV1WebhookResponse
import typings.actionsDashOnDashGoogle.distServiceDialogflowApiV2Mod.GoogleCloudDialogflowV2EventInput
import typings.actionsDashOnDashGoogle.distServiceDialogflowApiV2Mod.GoogleCloudDialogflowV2WebhookRequest
import typings.actionsDashOnDashGoogle.distServiceDialogflowApiV2Mod.GoogleCloudDialogflowV2WebhookResponse
import typings.actionsDashOnDashGoogle.distServiceDialogflowContextMod.ContextValues
import typings.actionsDashOnDashGoogle.distServiceDialogflowContextMod.Contexts
import typings.actionsDashOnDashGoogle.distServiceDialogflowContextMod.Parameters
import typings.actionsDashOnDashGoogle.distServiceDialogflowIncomingMod.Incoming
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("actions-on-google/dist/service/dialogflow/conv", "DialogflowConversation")
@js.native
/** @public */
class DialogflowConversation[TConvData, TUserStorage, TContexts /* <: Contexts */] () extends Conversation[TUserStorage] {
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
  var version: Double = js.native
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
  def followup(event: String, parameters: Parameters): this.type = js.native
  def followup(event: String, parameters: Parameters, lang: String): this.type = js.native
  /** @public */
  def serialize(): GoogleCloudDialogflowV2WebhookResponse | DialogflowV1WebhookResponse = js.native
}

