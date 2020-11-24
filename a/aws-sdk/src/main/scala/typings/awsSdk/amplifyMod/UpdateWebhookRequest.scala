package typings.awsSdk.amplifyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  def apply(webhookId: WebhookId): UpdateWebhookRequest = {
    val __obj = js.Dynamic.literal(webhookId = webhookId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateWebhookRequest]
  }
  
  @scala.inline
  implicit class UpdateWebhookRequestOps[Self <: UpdateWebhookRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setWebhookId(value: WebhookId): Self = this.set("webhookId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBranchName(value: BranchName): Self = this.set("branchName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBranchName: Self = this.set("branchName", js.undefined)
    
    @scala.inline
    def setDescription(value: Description): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
  }
}
