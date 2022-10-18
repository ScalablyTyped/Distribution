package typings.awsSdk.clientsCustomerprofilesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListAccountIntegrationsResponse extends StObject {
  
  /**
    * The list of ListAccountIntegration instances.
    */
  var Items: js.UndefOr[IntegrationList] = js.undefined
  
  /**
    * The pagination token from the previous ListAccountIntegrations API call.
    */
  var NextToken: js.UndefOr[token] = js.undefined
}
object ListAccountIntegrationsResponse {
  
  inline def apply(): ListAccountIntegrationsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListAccountIntegrationsResponse]
  }
  
  extension [Self <: ListAccountIntegrationsResponse](x: Self) {
    
    inline def setItems(value: IntegrationList): Self = StObject.set(x, "Items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "Items", js.undefined)
    
    inline def setItemsVarargs(value: ListIntegrationItem*): Self = StObject.set(x, "Items", js.Array(value*))
    
    inline def setNextToken(value: token): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
