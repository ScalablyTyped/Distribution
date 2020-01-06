package typings.awsDashSdk.clientsAmplifyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteWebhookRequest extends js.Object {
  /**
    *  Unique Id for a webhook. 
    */
  var webhookId: WebhookId = js.native
}

object DeleteWebhookRequest {
  @scala.inline
  def apply(webhookId: WebhookId): DeleteWebhookRequest = {
    val __obj = js.Dynamic.literal(webhookId = webhookId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DeleteWebhookRequest]
  }
}

