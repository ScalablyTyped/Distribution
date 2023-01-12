package typings.awsSdk.clientsAmplifyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListWebhooksResult extends StObject {
  
  /**
    *  A pagination token. If non-null, the pagination token is returned in a result. Pass its value in another request to retrieve more entries. 
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
  
  /**
    *  A list of webhooks. 
    */
  var webhooks: Webhooks
}
object ListWebhooksResult {
  
  inline def apply(webhooks: Webhooks): ListWebhooksResult = {
    val __obj = js.Dynamic.literal(webhooks = webhooks.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListWebhooksResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListWebhooksResult] (val x: Self) extends AnyVal {
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setWebhooks(value: Webhooks): Self = StObject.set(x, "webhooks", value.asInstanceOf[js.Any])
    
    inline def setWebhooksVarargs(value: Webhook*): Self = StObject.set(x, "webhooks", js.Array(value*))
  }
}
