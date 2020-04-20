package typings.awsSdk.amplifyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateWebhookResult extends js.Object {
  /**
    *  Webhook structure. 
    */
  var webhook: Webhook = js.native
}

object UpdateWebhookResult {
  @scala.inline
  def apply(webhook: Webhook): UpdateWebhookResult = {
    val __obj = js.Dynamic.literal(webhook = webhook.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateWebhookResult]
  }
}

