package typings.awsSdk.amplifyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetWebhookRequest extends StObject {
  
  /**
    *  The unique ID for a webhook. 
    */
  var webhookId: WebhookId = js.native
}
object GetWebhookRequest {
  
  @scala.inline
  def apply(webhookId: WebhookId): GetWebhookRequest = {
    val __obj = js.Dynamic.literal(webhookId = webhookId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetWebhookRequest]
  }
  
  @scala.inline
  implicit class GetWebhookRequestMutableBuilder[Self <: GetWebhookRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setWebhookId(value: WebhookId): Self = StObject.set(x, "webhookId", value.asInstanceOf[js.Any])
  }
}
