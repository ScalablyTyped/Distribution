package typings.awsSdk.clientsAmplifyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Webhook extends StObject {
  
  /**
    *  The name for a branch that is part of an Amplify app. 
    */
  var branchName: BranchName
  
  /**
    *  The create date and time for a webhook. 
    */
  var createTime: js.Date
  
  /**
    *  The description for a webhook. 
    */
  var description: Description
  
  /**
    *  Updates the date and time for a webhook. 
    */
  var updateTime: js.Date
  
  /**
    *  The Amazon Resource Name (ARN) for the webhook. 
    */
  var webhookArn: WebhookArn
  
  /**
    *  The ID of the webhook. 
    */
  var webhookId: WebhookId
  
  /**
    *  The URL of the webhook. 
    */
  var webhookUrl: WebhookUrl
}
object Webhook {
  
  inline def apply(
    branchName: BranchName,
    createTime: js.Date,
    description: Description,
    updateTime: js.Date,
    webhookArn: WebhookArn,
    webhookId: WebhookId,
    webhookUrl: WebhookUrl
  ): Webhook = {
    val __obj = js.Dynamic.literal(branchName = branchName.asInstanceOf[js.Any], createTime = createTime.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], updateTime = updateTime.asInstanceOf[js.Any], webhookArn = webhookArn.asInstanceOf[js.Any], webhookId = webhookId.asInstanceOf[js.Any], webhookUrl = webhookUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[Webhook]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Webhook] (val x: Self) extends AnyVal {
    
    inline def setBranchName(value: BranchName): Self = StObject.set(x, "branchName", value.asInstanceOf[js.Any])
    
    inline def setCreateTime(value: js.Date): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: Description): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setUpdateTime(value: js.Date): Self = StObject.set(x, "updateTime", value.asInstanceOf[js.Any])
    
    inline def setWebhookArn(value: WebhookArn): Self = StObject.set(x, "webhookArn", value.asInstanceOf[js.Any])
    
    inline def setWebhookId(value: WebhookId): Self = StObject.set(x, "webhookId", value.asInstanceOf[js.Any])
    
    inline def setWebhookUrl(value: WebhookUrl): Self = StObject.set(x, "webhookUrl", value.asInstanceOf[js.Any])
  }
}
