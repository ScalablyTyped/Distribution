package typings.actionsOnGoogle.conversationConversationMod

import typings.actionsOnGoogle.argumentMod.Arguments
import typings.actionsOnGoogle.commonMod.JsonObject
import typings.actionsOnGoogle.deviceMod.Device
import typings.actionsOnGoogle.frameworkFrameworkMod.Headers
import typings.actionsOnGoogle.inputMod.Input
import typings.actionsOnGoogle.responseMod.SimpleResponse
import typings.actionsOnGoogle.surfaceMod.Available
import typings.actionsOnGoogle.surfaceMod.Surface
import typings.actionsOnGoogle.userMod.User
import typings.actionsOnGoogle.v2Mod.GoogleActionsV2AppRequest
import typings.actionsOnGoogle.v2Mod.GoogleActionsV2ConversationType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("actions-on-google/dist/service/actionssdk/conversation/conversation", "Conversation")
@js.native
/** @hidden */
class Conversation[TUserStorage] () extends js.Object {
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
  var arguments: Arguments = js.native
  /** @public */
  var available: Available = js.native
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
  /** @public */
  def add(responses: Response*): this.type = js.native
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
  def json[T](json: T): this.type = js.native
  /** @public */
  def response(): ConversationResponse = js.native
}

