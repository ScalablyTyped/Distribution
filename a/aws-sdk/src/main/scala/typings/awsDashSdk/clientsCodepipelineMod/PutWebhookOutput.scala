package typings.awsDashSdk.clientsCodepipelineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PutWebhookOutput extends js.Object {
  /**
    * The detail returned from creating the webhook, such as the webhook name, webhook URL, and webhook ARN.
    */
  var webhook: js.UndefOr[ListWebhookItem] = js.native
}

object PutWebhookOutput {
  @scala.inline
  def apply(webhook: ListWebhookItem = null): PutWebhookOutput = {
    val __obj = js.Dynamic.literal()
    if (webhook != null) __obj.updateDynamic("webhook")(webhook.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutWebhookOutput]
  }
}

