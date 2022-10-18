package typings.awsSdk.clientsApprunnerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListOperationsRequest extends StObject {
  
  /**
    * The maximum number of results to include in each response (result page). It's used for a paginated request. If you don't specify MaxResults, the request retrieves all available results in a single response.
    */
  var MaxResults: js.UndefOr[ListOperationsMaxResults] = js.undefined
  
  /**
    * A token from a previous result page. It's used for a paginated request. The request retrieves the next result page. All other parameter values must be identical to the ones specified in the initial request. If you don't specify NextToken, the request retrieves the first result page.
    */
  var NextToken: js.UndefOr[String] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the App Runner service that you want a list of operations for.
    */
  var ServiceArn: AppRunnerResourceArn
}
object ListOperationsRequest {
  
  inline def apply(ServiceArn: AppRunnerResourceArn): ListOperationsRequest = {
    val __obj = js.Dynamic.literal(ServiceArn = ServiceArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListOperationsRequest]
  }
  
  extension [Self <: ListOperationsRequest](x: Self) {
    
    inline def setMaxResults(value: ListOperationsMaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setServiceArn(value: AppRunnerResourceArn): Self = StObject.set(x, "ServiceArn", value.asInstanceOf[js.Any])
  }
}
