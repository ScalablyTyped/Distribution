package typings.awsSdk.clientsChimesdkidentityMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListAppInstanceUserEndpointsResponse extends StObject {
  
  /**
    * The information for each requested AppInstanceUserEndpoint.
    */
  var AppInstanceUserEndpoints: js.UndefOr[AppInstanceUserEndpointSummaryList] = js.undefined
  
  /**
    * The token passed by previous API calls until all requested endpoints are returned.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsChimesdkidentityMod.NextToken] = js.undefined
}
object ListAppInstanceUserEndpointsResponse {
  
  inline def apply(): ListAppInstanceUserEndpointsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListAppInstanceUserEndpointsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListAppInstanceUserEndpointsResponse] (val x: Self) extends AnyVal {
    
    inline def setAppInstanceUserEndpoints(value: AppInstanceUserEndpointSummaryList): Self = StObject.set(x, "AppInstanceUserEndpoints", value.asInstanceOf[js.Any])
    
    inline def setAppInstanceUserEndpointsUndefined: Self = StObject.set(x, "AppInstanceUserEndpoints", js.undefined)
    
    inline def setAppInstanceUserEndpointsVarargs(value: AppInstanceUserEndpointSummary*): Self = StObject.set(x, "AppInstanceUserEndpoints", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
