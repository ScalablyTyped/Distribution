package typings.awsSdk.clientsAmplifyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateWebhookResult extends StObject {
  
  /**
    *  Describes a webhook that connects repository events to an Amplify app. 
    */
  var webhook: Webhook
}
object CreateWebhookResult {
  
  inline def apply(webhook: Webhook): CreateWebhookResult = {
    val __obj = js.Dynamic.literal(webhook = webhook.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateWebhookResult]
  }
  
  extension [Self <: CreateWebhookResult](x: Self) {
    
    inline def setWebhook(value: Webhook): Self = StObject.set(x, "webhook", value.asInstanceOf[js.Any])
  }
}
