package typings.awsSdk.appintegrationsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListEventIntegrationsResponse extends StObject {
  
  /**
    * The event integrations.
    */
  var EventIntegrations: js.UndefOr[EventIntegrationsList] = js.undefined
  
  /**
    * If there are additional results, this is the token for the next set of results.
    */
  var NextToken: js.UndefOr[typings.awsSdk.appintegrationsMod.NextToken] = js.undefined
}
object ListEventIntegrationsResponse {
  
  inline def apply(): ListEventIntegrationsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListEventIntegrationsResponse]
  }
  
  extension [Self <: ListEventIntegrationsResponse](x: Self) {
    
    inline def setEventIntegrations(value: EventIntegrationsList): Self = StObject.set(x, "EventIntegrations", value.asInstanceOf[js.Any])
    
    inline def setEventIntegrationsUndefined: Self = StObject.set(x, "EventIntegrations", js.undefined)
    
    inline def setEventIntegrationsVarargs(value: EventIntegration*): Self = StObject.set(x, "EventIntegrations", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
