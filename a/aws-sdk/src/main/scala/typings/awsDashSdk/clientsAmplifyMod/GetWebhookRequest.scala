package typings.awsDashSdk.clientsAmplifyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetWebhookRequest extends js.Object {
  /**
    *  Unique Id for a webhook. 
    */
  var webhookId: WebhookId
}

object GetWebhookRequest {
  @scala.inline
  def apply(webhookId: WebhookId): GetWebhookRequest = {
    val __obj = js.Dynamic.literal(webhookId = webhookId)
  
    __obj.asInstanceOf[GetWebhookRequest]
  }
}

