package typings.actionsDashOnDashGoogle.distServiceActionssdkApiV2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GoogleActionsV2LinkValueSpec extends js.Object {
  var dialogSpec: js.UndefOr[GoogleActionsV2DialogSpec] = js.undefined
  /**
    * Destination that the app should link to. Could be a web URL, a
    * conversational link or an Android intent. A web URL is used to handoff the
    * flow to some website. A conversational link is used to provide a deep link
    * into another AoG app. An Android intent URI is used to trigger an Android
    * intent. This requires the package_name to be specified.
    */
  var openUrlAction: js.UndefOr[GoogleActionsV2UiElementsOpenUrlAction] = js.undefined
}

object GoogleActionsV2LinkValueSpec {
  @scala.inline
  def apply(
    dialogSpec: GoogleActionsV2DialogSpec = null,
    openUrlAction: GoogleActionsV2UiElementsOpenUrlAction = null
  ): GoogleActionsV2LinkValueSpec = {
    val __obj = js.Dynamic.literal()
    if (dialogSpec != null) __obj.updateDynamic("dialogSpec")(dialogSpec)
    if (openUrlAction != null) __obj.updateDynamic("openUrlAction")(openUrlAction)
    __obj.asInstanceOf[GoogleActionsV2LinkValueSpec]
  }
}

