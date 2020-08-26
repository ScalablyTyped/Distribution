package typings.awsSdk.amplifyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteWebhookRequest extends js.Object {
  /**
    *  The unique ID for a webhook. 
    */
  var webhookId: WebhookId = js.native
}

object DeleteWebhookRequest {
  @scala.inline
  def apply(webhookId: WebhookId): DeleteWebhookRequest = {
    val __obj = js.Dynamic.literal(webhookId = webhookId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteWebhookRequest]
  }
  @scala.inline
  implicit class DeleteWebhookRequestOps[Self <: DeleteWebhookRequest] (val x: Self) extends AnyVal {
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
    def setWebhookId(value: WebhookId): Self = this.set("webhookId", value.asInstanceOf[js.Any])
  }
  
}

