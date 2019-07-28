package typings.awsDashSdk.clientsCodepipelineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeregisterWebhookWithThirdPartyInput extends js.Object {
  /**
    * The name of the webhook you want to deregister.
    */
  var webhookName: js.UndefOr[WebhookName] = js.undefined
}

object DeregisterWebhookWithThirdPartyInput {
  @scala.inline
  def apply(webhookName: WebhookName = null): DeregisterWebhookWithThirdPartyInput = {
    val __obj = js.Dynamic.literal()
    if (webhookName != null) __obj.updateDynamic("webhookName")(webhookName)
    __obj.asInstanceOf[DeregisterWebhookWithThirdPartyInput]
  }
}

