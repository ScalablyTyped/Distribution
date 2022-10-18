package typings.awsSdk.clientsAppintegrationsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListEventIntegrationAssociationsResponse extends StObject {
  
  /**
    * The event integration associations.
    */
  var EventIntegrationAssociations: js.UndefOr[EventIntegrationAssociationsList] = js.undefined
  
  /**
    * If there are additional results, this is the token for the next set of results.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsAppintegrationsMod.NextToken] = js.undefined
}
object ListEventIntegrationAssociationsResponse {
  
  inline def apply(): ListEventIntegrationAssociationsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListEventIntegrationAssociationsResponse]
  }
  
  extension [Self <: ListEventIntegrationAssociationsResponse](x: Self) {
    
    inline def setEventIntegrationAssociations(value: EventIntegrationAssociationsList): Self = StObject.set(x, "EventIntegrationAssociations", value.asInstanceOf[js.Any])
    
    inline def setEventIntegrationAssociationsUndefined: Self = StObject.set(x, "EventIntegrationAssociations", js.undefined)
    
    inline def setEventIntegrationAssociationsVarargs(value: EventIntegrationAssociation*): Self = StObject.set(x, "EventIntegrationAssociations", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
