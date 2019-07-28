package typings.awsDashSdk.clientsAmplifyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteWebhookResult extends js.Object {
  /**
    *  Webhook structure. 
    */
  var webhook: Webhook
}

object DeleteWebhookResult {
  @scala.inline
  def apply(webhook: Webhook): DeleteWebhookResult = {
    val __obj = js.Dynamic.literal(webhook = webhook)
  
    __obj.asInstanceOf[DeleteWebhookResult]
  }
}

