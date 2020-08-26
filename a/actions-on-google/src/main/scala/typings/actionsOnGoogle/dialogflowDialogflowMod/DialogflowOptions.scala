package typings.actionsOnGoogle.dialogflowDialogflowMod

import typings.actionsOnGoogle.conversationConversationMod.ConversationAppOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DialogflowOptions[TConvData, TUserStorage] extends ConversationAppOptions[TConvData, TUserStorage] {
  /**
    * Verifies whether the request comes from Dialogflow.
    * Uses header keys and values to check against ones specified by the developer
    * in the Dialogflow Fulfillment settings of the app.
    *
    * HTTP Code 403 will be thrown by default on verification error.
    *
    * @public
    */
  var verification: js.UndefOr[DialogflowVerification | DialogflowVerificationHeaders] = js.native
}

object DialogflowOptions {
  @scala.inline
  def apply[TConvData, TUserStorage](): DialogflowOptions[TConvData, TUserStorage] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DialogflowOptions[TConvData, TUserStorage]]
  }
  @scala.inline
  implicit class DialogflowOptionsOps[Self <: DialogflowOptions[_, _], TConvData, TUserStorage] (val x: Self with (DialogflowOptions[TConvData, TUserStorage])) extends AnyVal {
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
    def setVerification(value: DialogflowVerification | DialogflowVerificationHeaders): Self = this.set("verification", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVerification: Self = this.set("verification", js.undefined)
  }
  
}

