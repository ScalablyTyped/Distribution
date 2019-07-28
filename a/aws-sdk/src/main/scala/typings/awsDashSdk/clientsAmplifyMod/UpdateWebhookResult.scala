package typings.awsDashSdk.clientsAmplifyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateWebhookResult extends js.Object {
  /**
    *  Webhook structure. 
    */
  var webhook: Webhook
}

object UpdateWebhookResult {
  @scala.inline
  def apply(webhook: Webhook): UpdateWebhookResult = {
    val __obj = js.Dynamic.literal(webhook = webhook)
  
    __obj.asInstanceOf[UpdateWebhookResult]
  }
}

