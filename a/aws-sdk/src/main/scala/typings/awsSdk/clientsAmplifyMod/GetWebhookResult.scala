package typings.awsSdk.clientsAmplifyMod

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
  
  inline def apply(webhook: Webhook): GetWebhookResult = {
    val __obj = js.Dynamic.literal(webhook = webhook.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetWebhookResult]
  }
  
  extension [Self <: GetWebhookResult](x: Self) {
    
    inline def setWebhook(value: Webhook): Self = StObject.set(x, "webhook", value.asInstanceOf[js.Any])
  }
}
