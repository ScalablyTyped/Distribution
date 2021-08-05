package typings.awsSdk.amplifyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetWebhookRequest extends StObject {
  
  /**
    *  The unique ID for a webhook. 
    */
  var webhookId: WebhookId
}
object GetWebhookRequest {
  
  inline def apply(webhookId: WebhookId): GetWebhookRequest = {
    val __obj = js.Dynamic.literal(webhookId = webhookId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetWebhookRequest]
  }
  
  extension [Self <: GetWebhookRequest](x: Self) {
    
    inline def setWebhookId(value: WebhookId): Self = StObject.set(x, "webhookId", value.asInstanceOf[js.Any])
  }
}
