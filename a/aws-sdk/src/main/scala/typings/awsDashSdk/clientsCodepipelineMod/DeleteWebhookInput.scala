package typings.awsDashSdk.clientsCodepipelineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteWebhookInput extends js.Object {
  /**
    * The name of the webhook you want to delete.
    */
  var name: WebhookName
}

object DeleteWebhookInput {
  @scala.inline
  def apply(name: WebhookName): DeleteWebhookInput = {
    val __obj = js.Dynamic.literal(name = name)
  
    __obj.asInstanceOf[DeleteWebhookInput]
  }
}

