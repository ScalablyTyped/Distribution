package typings.actionsOnGoogle.apiV2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GoogleCloudDialogflowV2IntentMessageLinkOutSuggestion extends js.Object {
  var destinationName: js.UndefOr[String] = js.native
  var uri: js.UndefOr[String] = js.native
}

object GoogleCloudDialogflowV2IntentMessageLinkOutSuggestion {
  @scala.inline
  def apply(): GoogleCloudDialogflowV2IntentMessageLinkOutSuggestion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDialogflowV2IntentMessageLinkOutSuggestion]
  }
  @scala.inline
  implicit class GoogleCloudDialogflowV2IntentMessageLinkOutSuggestionOps[Self <: GoogleCloudDialogflowV2IntentMessageLinkOutSuggestion] (val x: Self) extends AnyVal {
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
    def setDestinationName(value: String): Self = this.set("destinationName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDestinationName: Self = this.set("destinationName", js.undefined)
    @scala.inline
    def setUri(value: String): Self = this.set("uri", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUri: Self = this.set("uri", js.undefined)
  }
  
}

