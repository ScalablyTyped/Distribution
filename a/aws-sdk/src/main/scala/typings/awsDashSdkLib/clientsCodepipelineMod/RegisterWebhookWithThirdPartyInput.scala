package typings
package awsDashSdkLib.clientsCodepipelineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RegisterWebhookWithThirdPartyInput extends js.Object {
  /**
    * The name of an existing webhook created with PutWebhook to register with a supported third party. 
    */
  var webhookName: js.UndefOr[WebhookName] = js.undefined
}

object RegisterWebhookWithThirdPartyInput {
  @scala.inline
  def apply(webhookName: WebhookName = null): RegisterWebhookWithThirdPartyInput = {
    val __obj = js.Dynamic.literal()
    if (webhookName != null) __obj.updateDynamic("webhookName")(webhookName)
    __obj.asInstanceOf[RegisterWebhookWithThirdPartyInput]
  }
}

