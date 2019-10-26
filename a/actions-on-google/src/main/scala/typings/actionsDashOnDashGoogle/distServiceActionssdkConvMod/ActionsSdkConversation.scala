package typings.actionsDashOnDashGoogle.distServiceActionssdkConvMod

import typings.actionsDashOnDashGoogle.distServiceActionssdkApiV2Mod.GoogleActionsV2AppRequest
import typings.actionsDashOnDashGoogle.distServiceActionssdkApiV2Mod.GoogleActionsV2AppResponse
import typings.actionsDashOnDashGoogle.distServiceActionssdkConversationConversationMod.ConversationOptionsInit
import typings.actionsDashOnDashGoogle.distServiceActionssdkConversationMod.Conversation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("actions-on-google/dist/service/actionssdk/conv", "ActionsSdkConversation")
@js.native
/** @public */
class ActionsSdkConversation[TConvData, TUserStorage] () extends Conversation[TUserStorage] {
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

