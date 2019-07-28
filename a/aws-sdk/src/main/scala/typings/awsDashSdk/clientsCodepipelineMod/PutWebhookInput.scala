package typings.awsDashSdk.clientsCodepipelineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PutWebhookInput extends js.Object {
  /**
    * The tags for the webhook.
    */
  var tags: js.UndefOr[TagList] = js.undefined
  /**
    * The detail provided in an input file to create the webhook, such as the webhook name, the pipeline name, and the action name. Give the webhook a unique name which identifies the webhook being defined. You may choose to name the webhook after the pipeline and action it targets so that you can easily recognize what it's used for later.
    */
  var webhook: WebhookDefinition
}

object PutWebhookInput {
  @scala.inline
  def apply(webhook: WebhookDefinition, tags: TagList = null): PutWebhookInput = {
    val __obj = js.Dynamic.literal(webhook = webhook)
    if (tags != null) __obj.updateDynamic("tags")(tags)
    __obj.asInstanceOf[PutWebhookInput]
  }
}

