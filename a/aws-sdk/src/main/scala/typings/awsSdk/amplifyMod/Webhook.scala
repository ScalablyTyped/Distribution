package typings.awsSdk.amplifyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Webhook extends js.Object {
  /**
    *  The name for a branch that is part of an Amplify app. 
    */
  var branchName: BranchName = js.native
  /**
    *  The create date and time for a webhook. 
    */
  var createTime: CreateTime = js.native
  /**
    *  The description for a webhook. 
    */
  var description: Description = js.native
  /**
    *  Updates the date and time for a webhook. 
    */
  var updateTime: UpdateTime = js.native
  /**
    *  The Amazon Resource Name (ARN) for the webhook. 
    */
  var webhookArn: WebhookArn = js.native
  /**
    *  The ID of the webhook. 
    */
  var webhookId: WebhookId = js.native
  /**
    *  The URL of the webhook. 
    */
  var webhookUrl: WebhookUrl = js.native
}

object Webhook {
  @scala.inline
  def apply(
    branchName: BranchName,
    createTime: CreateTime,
    description: Description,
    updateTime: UpdateTime,
    webhookArn: WebhookArn,
    webhookId: WebhookId,
    webhookUrl: WebhookUrl
  ): Webhook = {
    val __obj = js.Dynamic.literal(branchName = branchName.asInstanceOf[js.Any], createTime = createTime.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], updateTime = updateTime.asInstanceOf[js.Any], webhookArn = webhookArn.asInstanceOf[js.Any], webhookId = webhookId.asInstanceOf[js.Any], webhookUrl = webhookUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[Webhook]
  }
}

