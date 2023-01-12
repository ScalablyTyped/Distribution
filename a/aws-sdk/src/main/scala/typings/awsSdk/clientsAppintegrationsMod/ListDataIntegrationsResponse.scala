package typings.awsSdk.clientsAppintegrationsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListDataIntegrationsResponse extends StObject {
  
  /**
    * The DataIntegrations associated with this account.
    */
  var DataIntegrations: js.UndefOr[DataIntegrationsList] = js.undefined
  
  /**
    * If there are additional results, this is the token for the next set of results.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsAppintegrationsMod.NextToken] = js.undefined
}
object ListDataIntegrationsResponse {
  
  inline def apply(): ListDataIntegrationsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListDataIntegrationsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListDataIntegrationsResponse] (val x: Self) extends AnyVal {
    
    inline def setDataIntegrations(value: DataIntegrationsList): Self = StObject.set(x, "DataIntegrations", value.asInstanceOf[js.Any])
    
    inline def setDataIntegrationsUndefined: Self = StObject.set(x, "DataIntegrations", js.undefined)
    
    inline def setDataIntegrationsVarargs(value: DataIntegrationSummary*): Self = StObject.set(x, "DataIntegrations", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
