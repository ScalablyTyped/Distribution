package typings.actionsOnGoogle.v2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GoogleActionsV2LinkValueSpec extends js.Object {
  var dialogSpec: js.UndefOr[GoogleActionsV2DialogSpec] = js.native
  /**
    * Destination that the app should link to. Could be a web URL, a
    * conversational link or an Android intent. A web URL is used to handoff the
    * flow to some website. A conversational link is used to provide a deep link
    * into another AoG app. An Android intent URI is used to trigger an Android
    * intent. This requires the package_name to be specified.
    */
  var openUrlAction: js.UndefOr[GoogleActionsV2UiElementsOpenUrlAction] = js.native
}

object GoogleActionsV2LinkValueSpec {
  @scala.inline
  def apply(): GoogleActionsV2LinkValueSpec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleActionsV2LinkValueSpec]
  }
  @scala.inline
  implicit class GoogleActionsV2LinkValueSpecOps[Self <: GoogleActionsV2LinkValueSpec] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDialogSpec(value: GoogleActionsV2DialogSpec): Self = this.set("dialogSpec", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDialogSpec: Self = this.set("dialogSpec", js.undefined)
    @scala.inline
    def setOpenUrlAction(value: GoogleActionsV2UiElementsOpenUrlAction): Self = this.set("openUrlAction", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOpenUrlAction: Self = this.set("openUrlAction", js.undefined)
  }
  
}

