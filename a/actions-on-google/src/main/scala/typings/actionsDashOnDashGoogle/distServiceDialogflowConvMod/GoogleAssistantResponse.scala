package typings.actionsDashOnDashGoogle.distServiceDialogflowConvMod

import typings.actionsDashOnDashGoogle.distServiceActionssdkApiV2Mod.GoogleActionsV2RichResponse
import typings.actionsDashOnDashGoogle.distServiceActionssdkApiV2Mod.GoogleActionsV2SimpleResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GoogleAssistantResponse extends js.Object {
  var expectUserResponse: js.UndefOr[Boolean] = js.undefined
  var isSsml: js.UndefOr[Boolean] = js.undefined
  var noInputPrompts: js.UndefOr[js.Array[GoogleActionsV2SimpleResponse]] = js.undefined
  var richResponse: js.UndefOr[GoogleActionsV2RichResponse] = js.undefined
  var speechBiasingHints: js.UndefOr[js.Array[String]] = js.undefined
  var systemIntent: js.UndefOr[SystemIntent] = js.undefined
  var userStorage: js.UndefOr[String] = js.undefined
}

object GoogleAssistantResponse {
  @scala.inline
  def apply(
    expectUserResponse: js.UndefOr[Boolean] = js.undefined,
    isSsml: js.UndefOr[Boolean] = js.undefined,
    noInputPrompts: js.Array[GoogleActionsV2SimpleResponse] = null,
    richResponse: GoogleActionsV2RichResponse = null,
    speechBiasingHints: js.Array[String] = null,
    systemIntent: SystemIntent = null,
    userStorage: String = null
  ): GoogleAssistantResponse = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(expectUserResponse)) __obj.updateDynamic("expectUserResponse")(expectUserResponse)
    if (!js.isUndefined(isSsml)) __obj.updateDynamic("isSsml")(isSsml)
    if (noInputPrompts != null) __obj.updateDynamic("noInputPrompts")(noInputPrompts)
    if (richResponse != null) __obj.updateDynamic("richResponse")(richResponse)
    if (speechBiasingHints != null) __obj.updateDynamic("speechBiasingHints")(speechBiasingHints)
    if (systemIntent != null) __obj.updateDynamic("systemIntent")(systemIntent)
    if (userStorage != null) __obj.updateDynamic("userStorage")(userStorage)
    __obj.asInstanceOf[GoogleAssistantResponse]
  }
}

