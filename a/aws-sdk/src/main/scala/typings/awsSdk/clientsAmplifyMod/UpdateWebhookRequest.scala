package typings.awsSdk.clientsAmplifyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateWebhookRequest extends StObject {
  
  /**
    *  The name for a branch that is part of an Amplify app. 
    */
  var branchName: js.UndefOr[BranchName] = js.undefined
  
  /**
    *  The description for a webhook. 
    */
  var description: js.UndefOr[Description] = js.undefined
  
  /**
    *  The unique ID for a webhook. 
    */
  var webhookId: WebhookId
}
object UpdateWebhookRequest {
  
  inline def apply(webhookId: WebhookId): UpdateWebhookRequest = {
    val __obj = js.Dynamic.literal(webhookId = webhookId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateWebhookRequest]
  }
  
  extension [Self <: UpdateWebhookRequest](x: Self) {
    
    inline def setBranchName(value: BranchName): Self = StObject.set(x, "branchName", value.asInstanceOf[js.Any])
    
    inline def setBranchNameUndefined: Self = StObject.set(x, "branchName", js.undefined)
    
    inline def setDescription(value: Description): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setWebhookId(value: WebhookId): Self = StObject.set(x, "webhookId", value.asInstanceOf[js.Any])
  }
}
