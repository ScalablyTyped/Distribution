package typings.awsSdk.amplifyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateWebhookRequest extends js.Object {
  /**
    *  The name for a branch that is part of an Amplify app. 
    */
  var branchName: js.UndefOr[BranchName] = js.native
  /**
    *  The description for a webhook. 
    */
  var description: js.UndefOr[Description] = js.native
  /**
    *  The unique ID for a webhook. 
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

