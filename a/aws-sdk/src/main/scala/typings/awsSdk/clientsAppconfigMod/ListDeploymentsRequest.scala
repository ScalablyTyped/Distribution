package typings.awsSdk.clientsAppconfigMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListDeploymentsRequest extends StObject {
  
  /**
    * The application ID.
    */
  var ApplicationId: Id
  
  /**
    * The environment ID.
    */
  var EnvironmentId: Id
  
  /**
    * The maximum number of items that may be returned for this call. If there are items that have not yet been returned, the response will include a non-null NextToken that you can provide in a subsequent call to get the next set of results.
    */
  var MaxResults: js.UndefOr[typings.awsSdk.clientsAppconfigMod.MaxResults] = js.undefined
  
  /**
    * The token returned by a prior call to this operation indicating the next set of results to be returned. If not specified, the operation will return the first set of results.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsAppconfigMod.NextToken] = js.undefined
}
object ListDeploymentsRequest {
  
  inline def apply(ApplicationId: Id, EnvironmentId: Id): ListDeploymentsRequest = {
    val __obj = js.Dynamic.literal(ApplicationId = ApplicationId.asInstanceOf[js.Any], EnvironmentId = EnvironmentId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListDeploymentsRequest]
  }
  
  extension [Self <: ListDeploymentsRequest](x: Self) {
    
    inline def setApplicationId(value: Id): Self = StObject.set(x, "ApplicationId", value.asInstanceOf[js.Any])
    
    inline def setEnvironmentId(value: Id): Self = StObject.set(x, "EnvironmentId", value.asInstanceOf[js.Any])
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
