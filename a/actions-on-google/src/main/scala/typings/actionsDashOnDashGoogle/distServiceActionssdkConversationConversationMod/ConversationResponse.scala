package typings.actionsDashOnDashGoogle.distServiceActionssdkConversationConversationMod

import typings.actionsDashOnDashGoogle.distServiceActionssdkApiV2Mod.GoogleActionsV2ExpectedIntent
import typings.actionsDashOnDashGoogle.distServiceActionssdkApiV2Mod.GoogleActionsV2RichResponse
import typings.actionsDashOnDashGoogle.distServiceActionssdkApiV2Mod.GoogleActionsV2SimpleResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConversationResponse extends js.Object {
  var expectUserResponse: Boolean
  var expectedIntent: js.UndefOr[GoogleActionsV2ExpectedIntent] = js.undefined
  var noInputPrompts: js.UndefOr[js.Array[GoogleActionsV2SimpleResponse]] = js.undefined
  var richResponse: GoogleActionsV2RichResponse
  var speechBiasingHints: js.UndefOr[js.Array[String]] = js.undefined
  var userStorage: String
}

object ConversationResponse {
  @scala.inline
  def apply(
    expectUserResponse: Boolean,
    richResponse: GoogleActionsV2RichResponse,
    userStorage: String,
    expectedIntent: GoogleActionsV2ExpectedIntent = null,
    noInputPrompts: js.Array[GoogleActionsV2SimpleResponse] = null,
    speechBiasingHints: js.Array[String] = null
  ): ConversationResponse = {
    val __obj = js.Dynamic.literal(expectUserResponse = expectUserResponse, richResponse = richResponse, userStorage = userStorage)
    if (expectedIntent != null) __obj.updateDynamic("expectedIntent")(expectedIntent)
    if (noInputPrompts != null) __obj.updateDynamic("noInputPrompts")(noInputPrompts)
    if (speechBiasingHints != null) __obj.updateDynamic("speechBiasingHints")(speechBiasingHints)
    __obj.asInstanceOf[ConversationResponse]
  }
}

