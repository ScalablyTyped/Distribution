package typings.awsSdk.amplifyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetWebhookResult extends js.Object {
  /**
    *  Describes the structure of a webhook. 
    */
  var webhook: Webhook = js.native
}

object GetWebhookResult {
  @scala.inline
  def apply(webhook: Webhook): GetWebhookResult = {
    val __obj = js.Dynamic.literal(webhook = webhook.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetWebhookResult]
  }
}

