package typings.awsSdk.clientsApprunnerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeCustomDomainsRequest extends StObject {
  
  /**
    * The maximum number of results that each response (result page) can include. It's used for a paginated request. If you don't specify MaxResults, the request retrieves all available results in a single response.
    */
  var MaxResults: js.UndefOr[DescribeCustomDomainsMaxResults] = js.undefined
  
  /**
    * A token from a previous result page. It's used for a paginated request. The request retrieves the next result page. All other parameter values must be identical to the ones that are specified in the initial request. If you don't specify NextToken, the request retrieves the first result page.
    */
  var NextToken: js.UndefOr[String] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the App Runner service that you want associated custom domain names to be described for.
    */
  var ServiceArn: AppRunnerResourceArn
}
object DescribeCustomDomainsRequest {
  
  inline def apply(ServiceArn: AppRunnerResourceArn): DescribeCustomDomainsRequest = {
    val __obj = js.Dynamic.literal(ServiceArn = ServiceArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeCustomDomainsRequest]
  }
  
  extension [Self <: DescribeCustomDomainsRequest](x: Self) {
    
    inline def setMaxResults(value: DescribeCustomDomainsMaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setServiceArn(value: AppRunnerResourceArn): Self = StObject.set(x, "ServiceArn", value.asInstanceOf[js.Any])
  }
}
