package typings.actionsOnGoogle.apiV2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GoogleCloudDialogflowV2IntentTrainingPhrasePart extends js.Object {
  var alias: js.UndefOr[String] = js.native
  var entityType: js.UndefOr[String] = js.native
  var text: js.UndefOr[String] = js.native
  var userDefined: js.UndefOr[Boolean] = js.native
}

object GoogleCloudDialogflowV2IntentTrainingPhrasePart {
  @scala.inline
  def apply(): GoogleCloudDialogflowV2IntentTrainingPhrasePart = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDialogflowV2IntentTrainingPhrasePart]
  }
  @scala.inline
  implicit class GoogleCloudDialogflowV2IntentTrainingPhrasePartOps[Self <: GoogleCloudDialogflowV2IntentTrainingPhrasePart] (val x: Self) extends AnyVal {
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
    def setAlias(value: String): Self = this.set("alias", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlias: Self = this.set("alias", js.undefined)
    @scala.inline
    def setEntityType(value: String): Self = this.set("entityType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEntityType: Self = this.set("entityType", js.undefined)
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
    @scala.inline
    def setUserDefined(value: Boolean): Self = this.set("userDefined", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUserDefined: Self = this.set("userDefined", js.undefined)
  }
  
}

