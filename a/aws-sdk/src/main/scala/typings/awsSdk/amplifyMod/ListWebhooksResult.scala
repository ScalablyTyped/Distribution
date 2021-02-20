package typings.awsSdk.amplifyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListWebhooksResult extends StObject {
  
  /**
    *  A pagination token. If non-null, the pagination token is returned in a result. Pass its value in another request to retrieve more entries. 
    */
  var nextToken: js.UndefOr[NextToken] = js.native
  
  /**
    *  A list of webhooks. 
    */
  var webhooks: Webhooks = js.native
}
object ListWebhooksResult {
  
  @scala.inline
  def apply(webhooks: Webhooks): ListWebhooksResult = {
    val __obj = js.Dynamic.literal(webhooks = webhooks.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListWebhooksResult]
  }
  
  @scala.inline
  implicit class ListWebhooksResultMutableBuilder[Self <: ListWebhooksResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    @scala.inline
    def setWebhooks(value: Webhooks): Self = StObject.set(x, "webhooks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebhooksVarargs(value: Webhook*): Self = StObject.set(x, "webhooks", js.Array(value :_*))
  }
}
