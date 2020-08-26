package typings.actionsOnGoogle.dialogflowConvMod

import typings.actionsOnGoogle.apiV2Mod.GoogleCloudDialogflowV2WebhookRequest
import typings.actionsOnGoogle.conversationConversationMod.ConversationBaseOptions
import typings.actionsOnGoogle.v1Mod.DialogflowV1WebhookRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DialogflowConversationOptions[TConvData, TUserStorage] extends ConversationBaseOptions[TConvData, TUserStorage] {
  /** @public */
  var body: js.UndefOr[GoogleCloudDialogflowV2WebhookRequest | DialogflowV1WebhookRequest] = js.native
}

object DialogflowConversationOptions {
  @scala.inline
  def apply[TConvData, TUserStorage](): DialogflowConversationOptions[TConvData, TUserStorage] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DialogflowConversationOptions[TConvData, TUserStorage]]
  }
  @scala.inline
  implicit class DialogflowConversationOptionsOps[Self <: DialogflowConversationOptions[_, _], TConvData, TUserStorage] (val x: Self with (DialogflowConversationOptions[TConvData, TUserStorage])) extends AnyVal {
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
    def setBody(value: GoogleCloudDialogflowV2WebhookRequest | DialogflowV1WebhookRequest): Self = this.set("body", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBody: Self = this.set("body", js.undefined)
  }
  
}

