package typings.awsSdk.clientsAmplifyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateWebhookResult extends StObject {
  
  /**
    *  Describes a webhook that connects repository events to an Amplify app. 
    */
  var webhook: Webhook
}
object UpdateWebhookResult {
  
  inline def apply(webhook: Webhook): UpdateWebhookResult = {
    val __obj = js.Dynamic.literal(webhook = webhook.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateWebhookResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateWebhookResult] (val x: Self) extends AnyVal {
    
    inline def setWebhook(value: Webhook): Self = StObject.set(x, "webhook", value.asInstanceOf[js.Any])
  }
}
