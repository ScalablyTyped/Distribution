package typings.awsSdk.amplifyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteWebhookResult extends js.Object {
  /**
    *  Webhook structure. 
    */
  var webhook: Webhook = js.native
}

object DeleteWebhookResult {
  @scala.inline
  def apply(webhook: Webhook): DeleteWebhookResult = {
    val __obj = js.Dynamic.literal(webhook = webhook.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteWebhookResult]
  }
}

