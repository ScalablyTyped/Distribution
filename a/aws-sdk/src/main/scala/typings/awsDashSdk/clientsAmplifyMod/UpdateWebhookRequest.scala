package typings.awsDashSdk.clientsAmplifyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateWebhookRequest extends js.Object {
  /**
    *  Name for a branch, part of an Amplify App. 
    */
  var branchName: js.UndefOr[BranchName] = js.native
  /**
    *  Description for a webhook. 
    */
  var description: js.UndefOr[Description] = js.native
  /**
    *  Unique Id for a webhook. 
    */
  var webhookId: WebhookId = js.native
}

object UpdateWebhookRequest {
  @scala.inline
  def apply(webhookId: WebhookId, branchName: BranchName = null, description: Description = null): UpdateWebhookRequest = {
    val __obj = js.Dynamic.literal(webhookId = webhookId.asInstanceOf[js.Any])
    if (branchName != null) __obj.updateDynamic("branchName")(branchName.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateWebhookRequest]
  }
}

