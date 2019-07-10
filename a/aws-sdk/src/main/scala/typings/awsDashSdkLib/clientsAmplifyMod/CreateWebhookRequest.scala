package typings
package awsDashSdkLib.clientsAmplifyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateWebhookRequest extends js.Object {
  /**
    *  Unique Id for an Amplify App. 
    */
  var appId: AppId
  /**
    *  Name for a branch, part of an Amplify App. 
    */
  var branchName: BranchName
  /**
    *  Description for a webhook. 
    */
  var description: js.UndefOr[Description] = js.undefined
}

object CreateWebhookRequest {
  @scala.inline
  def apply(appId: AppId, branchName: BranchName, description: Description = null): CreateWebhookRequest = {
    val __obj = js.Dynamic.literal(appId = appId, branchName = branchName)
    if (description != null) __obj.updateDynamic("description")(description)
    __obj.asInstanceOf[CreateWebhookRequest]
  }
}

