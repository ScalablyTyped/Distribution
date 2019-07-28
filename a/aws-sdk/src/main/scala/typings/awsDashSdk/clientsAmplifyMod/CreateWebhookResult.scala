package typings.awsDashSdk.clientsAmplifyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateWebhookResult extends js.Object {
  /**
    *  Webhook structure. 
    */
  var webhook: Webhook
}

object CreateWebhookResult {
  @scala.inline
  def apply(webhook: Webhook): CreateWebhookResult = {
    val __obj = js.Dynamic.literal(webhook = webhook)
  
    __obj.asInstanceOf[CreateWebhookResult]
  }
}

