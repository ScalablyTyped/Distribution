package typings
package awsDashSdkLib.clientsCodepipelineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PutWebhookOutput extends js.Object {
  /**
    * The detail returned from creating the webhook, such as the webhook name, webhook URL, and webhook ARN.
    */
  var webhook: js.UndefOr[ListWebhookItem] = js.undefined
}

object PutWebhookOutput {
  @scala.inline
  def apply(webhook: ListWebhookItem = null): PutWebhookOutput = {
    val __obj = js.Dynamic.literal()
    if (webhook != null) __obj.updateDynamic("webhook")(webhook)
    __obj.asInstanceOf[PutWebhookOutput]
  }
}

