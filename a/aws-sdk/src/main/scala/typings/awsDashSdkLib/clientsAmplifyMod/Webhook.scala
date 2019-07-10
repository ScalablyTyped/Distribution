package typings
package awsDashSdkLib.clientsAmplifyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Webhook extends js.Object {
  /**
    *  Name for a branch, part of an Amplify App. 
    */
  var branchName: BranchName
  /**
    *  Create date / time for a webhook. 
    */
  var createTime: CreateTime
  /**
    *  Description for a webhook. 
    */
  var description: Description
  /**
    *  Update date / time for a webhook. 
    */
  var updateTime: UpdateTime
  /**
    *  ARN for the webhook. 
    */
  var webhookArn: WebhookArn
  /**
    *  Id of the webhook. 
    */
  var webhookId: WebhookId
  /**
    *  Url of the webhook. 
    */
  var webhookUrl: WebhookUrl
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
    val __obj = js.Dynamic.literal(branchName = branchName, createTime = createTime, description = description, updateTime = updateTime, webhookArn = webhookArn, webhookId = webhookId, webhookUrl = webhookUrl)
  
    __obj.asInstanceOf[Webhook]
  }
}

