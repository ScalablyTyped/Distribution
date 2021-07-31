package typings.awsSdk.amplifyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetWebhookResult extends StObject {
  
  /**
    *  Describes the structure of a webhook. 
    */
  var webhook: Webhook
}
object GetWebhookResult {
  
  @scala.inline
  def apply(webhook: Webhook): GetWebhookResult = {
    val __obj = js.Dynamic.literal(webhook = webhook.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetWebhookResult]
  }
  
  @scala.inline
  implicit class GetWebhookResultMutableBuilder[Self <: GetWebhookResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setWebhook(value: Webhook): Self = StObject.set(x, "webhook", value.asInstanceOf[js.Any])
  }
}
