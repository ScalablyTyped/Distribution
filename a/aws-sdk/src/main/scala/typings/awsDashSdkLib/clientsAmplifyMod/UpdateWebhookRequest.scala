package typings
package awsDashSdkLib.clientsAmplifyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateWebhookRequest extends js.Object {
  /**
    *  Name for a branch, part of an Amplify App. 
    */
  var branchName: js.UndefOr[BranchName] = js.undefined
  /**
    *  Description for a webhook. 
    */
  var description: js.UndefOr[Description] = js.undefined
  /**
    *  Unique Id for a webhook. 
    */
  var webhookId: WebhookId
}

object UpdateWebhookRequest {
  @scala.inline
  def apply(webhookId: WebhookId, branchName: BranchName = null, description: Description = null): UpdateWebhookRequest = {
    val __obj = js.Dynamic.literal(webhookId = webhookId)
    if (branchName != null) __obj.updateDynamic("branchName")(branchName)
    if (description != null) __obj.updateDynamic("description")(description)
    __obj.asInstanceOf[UpdateWebhookRequest]
  }
}

