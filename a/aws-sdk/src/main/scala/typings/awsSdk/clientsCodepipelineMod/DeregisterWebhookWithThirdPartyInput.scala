package typings.awsSdk.clientsCodepipelineMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeregisterWebhookWithThirdPartyInput extends StObject {
  
  /**
    * The name of the webhook you want to deregister.
    */
  var webhookName: js.UndefOr[WebhookName] = js.undefined
}
object DeregisterWebhookWithThirdPartyInput {
  
  inline def apply(): DeregisterWebhookWithThirdPartyInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeregisterWebhookWithThirdPartyInput]
  }
  
  extension [Self <: DeregisterWebhookWithThirdPartyInput](x: Self) {
    
    inline def setWebhookName(value: WebhookName): Self = StObject.set(x, "webhookName", value.asInstanceOf[js.Any])
    
    inline def setWebhookNameUndefined: Self = StObject.set(x, "webhookName", js.undefined)
  }
}
