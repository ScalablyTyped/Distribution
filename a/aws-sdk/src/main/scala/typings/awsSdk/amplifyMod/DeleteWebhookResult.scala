package typings.awsSdk.amplifyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteWebhookResult extends js.Object {
  /**
    *  Describes a webhook that connects repository events to an Amplify app. 
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

