package typings.awsSdk.amplifyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteWebhookResult extends StObject {
  
  /**
    *  Describes a webhook that connects repository events to an Amplify app. 
    */
  var webhook: Webhook
}
object DeleteWebhookResult {
  
  @scala.inline
  def apply(webhook: Webhook): DeleteWebhookResult = {
    val __obj = js.Dynamic.literal(webhook = webhook.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteWebhookResult]
  }
  
  @scala.inline
  implicit class DeleteWebhookResultMutableBuilder[Self <: DeleteWebhookResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setWebhook(value: Webhook): Self = StObject.set(x, "webhook", value.asInstanceOf[js.Any])
  }
}
