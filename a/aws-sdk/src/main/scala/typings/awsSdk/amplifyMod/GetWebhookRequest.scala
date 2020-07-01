package typings.awsSdk.amplifyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetWebhookRequest extends js.Object {
  /**
    *  The unique ID for a webhook. 
    */
  var webhookId: WebhookId = js.native
}

object GetWebhookRequest {
  @scala.inline
  def apply(webhookId: WebhookId): GetWebhookRequest = {
    val __obj = js.Dynamic.literal(webhookId = webhookId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetWebhookRequest]
  }
}

