package typings.awsSdk.amplifyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateWebhookResult extends js.Object {
  /**
    *  Webhook structure. 
    */
  var webhook: Webhook = js.native
}

object CreateWebhookResult {
  @scala.inline
  def apply(webhook: Webhook): CreateWebhookResult = {
    val __obj = js.Dynamic.literal(webhook = webhook.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CreateWebhookResult]
  }
}

