package typings.awsSdk.clientsAmplifyMod

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
  
  inline def apply(webhook: Webhook): DeleteWebhookResult = {
    val __obj = js.Dynamic.literal(webhook = webhook.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteWebhookResult]
  }
  
  extension [Self <: DeleteWebhookResult](x: Self) {
    
    inline def setWebhook(value: Webhook): Self = StObject.set(x, "webhook", value.asInstanceOf[js.Any])
  }
}
