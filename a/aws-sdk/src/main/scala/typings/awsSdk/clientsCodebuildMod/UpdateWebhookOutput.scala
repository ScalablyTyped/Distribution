package typings.awsSdk.clientsCodebuildMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateWebhookOutput extends StObject {
  
  /**
    *  Information about a repository's webhook that is associated with a project in CodeBuild. 
    */
  var webhook: js.UndefOr[Webhook] = js.undefined
}
object UpdateWebhookOutput {
  
  inline def apply(): UpdateWebhookOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateWebhookOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateWebhookOutput] (val x: Self) extends AnyVal {
    
    inline def setWebhook(value: Webhook): Self = StObject.set(x, "webhook", value.asInstanceOf[js.Any])
    
    inline def setWebhookUndefined: Self = StObject.set(x, "webhook", js.undefined)
  }
}
