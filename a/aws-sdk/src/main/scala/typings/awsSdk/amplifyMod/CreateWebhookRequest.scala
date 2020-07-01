package typings.awsSdk.amplifyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateWebhookRequest extends js.Object {
  /**
    *  The unique ID for an Amplify app. 
    */
  var appId: AppId = js.native
  /**
    *  The name for a branch that is part of an Amplify app. 
    */
  var branchName: BranchName = js.native
  /**
    *  The description for a webhook. 
    */
  var description: js.UndefOr[Description] = js.native
}

object CreateWebhookRequest {
  @scala.inline
  def apply(appId: AppId, branchName: BranchName, description: Description = null): CreateWebhookRequest = {
    val __obj = js.Dynamic.literal(appId = appId.asInstanceOf[js.Any], branchName = branchName.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateWebhookRequest]
  }
}

