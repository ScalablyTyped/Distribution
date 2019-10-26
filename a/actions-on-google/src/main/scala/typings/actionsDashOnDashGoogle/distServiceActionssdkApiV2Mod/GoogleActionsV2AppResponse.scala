package typings.actionsDashOnDashGoogle.distServiceActionssdkApiV2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GoogleActionsV2AppResponse extends js.Object {
  /**
    * An opaque token that is recirculated to the Action every conversation
    * turn.
    */
  var conversationToken: js.UndefOr[String] = js.undefined
  /**
    * A custom push message that allows developers to send structured data to
    * Actions on Google.
    */
  var customPushMessage: js.UndefOr[GoogleActionsV2CustomPushMessage] = js.undefined
  /**
    * Indicates whether the Action is expecting a user response. This is true
    * when the conversation is ongoing, false when the conversation is done.
    */
  var expectUserResponse: js.UndefOr[Boolean] = js.undefined
  /**
    * List of inputs the Action expects, each input can be a common Actions on
    * Google intent (start with 'actions.'), or an input taking list of possible
    * intents. Only one input is supported for now.
    */
  var expectedInputs: js.UndefOr[js.Array[GoogleActionsV2ExpectedInput]] = js.undefined
  /**
    * Final response when the Action does not expect user's input.
    */
  var finalResponse: js.UndefOr[GoogleActionsV2FinalResponse] = js.undefined
  /**
    * Indicates whether the response should be handled in sandbox mode. This
    * bit is needed to push structured data to Google in sandbox mode.
    */
  var isInSandbox: js.UndefOr[Boolean] = js.undefined
  /**
    * Whether to clear the persisted user_storage. If set to true, then in the
    * next interaction with the user, the user_storage field will be empty.
    */
  var resetUserStorage: js.UndefOr[Boolean] = js.undefined
  /**
    * An opaque token controlled by the Action that is persisted across
    * conversations for a particular user. If empty or unspecified, the
    * existing persisted token will be unchanged.
    * The maximum size of the string is 10k bytes.
    * If multiple dialogs are occurring concurrently for the same user, then
    * updates to this token can overwrite each other unexpectedly.
    */
  var userStorage: js.UndefOr[String] = js.undefined
}

object GoogleActionsV2AppResponse {
  @scala.inline
  def apply(
    conversationToken: String = null,
    customPushMessage: GoogleActionsV2CustomPushMessage = null,
    expectUserResponse: js.UndefOr[Boolean] = js.undefined,
    expectedInputs: js.Array[GoogleActionsV2ExpectedInput] = null,
    finalResponse: GoogleActionsV2FinalResponse = null,
    isInSandbox: js.UndefOr[Boolean] = js.undefined,
    resetUserStorage: js.UndefOr[Boolean] = js.undefined,
    userStorage: String = null
  ): GoogleActionsV2AppResponse = {
    val __obj = js.Dynamic.literal()
    if (conversationToken != null) __obj.updateDynamic("conversationToken")(conversationToken)
    if (customPushMessage != null) __obj.updateDynamic("customPushMessage")(customPushMessage)
    if (!js.isUndefined(expectUserResponse)) __obj.updateDynamic("expectUserResponse")(expectUserResponse)
    if (expectedInputs != null) __obj.updateDynamic("expectedInputs")(expectedInputs)
    if (finalResponse != null) __obj.updateDynamic("finalResponse")(finalResponse)
    if (!js.isUndefined(isInSandbox)) __obj.updateDynamic("isInSandbox")(isInSandbox)
    if (!js.isUndefined(resetUserStorage)) __obj.updateDynamic("resetUserStorage")(resetUserStorage)
    if (userStorage != null) __obj.updateDynamic("userStorage")(userStorage)
    __obj.asInstanceOf[GoogleActionsV2AppResponse]
  }
}

