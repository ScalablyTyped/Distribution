package typings.awsSdk.clientsBatchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeComputeEnvironmentsRequest extends StObject {
  
  /**
    * A list of up to 100 compute environment names or full Amazon Resource Name (ARN) entries.
    */
  var computeEnvironments: js.UndefOr[StringList] = js.undefined
  
  /**
    * The maximum number of cluster results returned by DescribeComputeEnvironments in paginated output. When this parameter is used, DescribeComputeEnvironments only returns maxResults results in a single page along with a nextToken response element. The remaining results of the initial request can be seen by sending another DescribeComputeEnvironments request with the returned nextToken value. This value can be between 1 and 100. If this parameter isn't used, then DescribeComputeEnvironments returns up to 100 results and a nextToken value if applicable.
    */
  var maxResults: js.UndefOr[Integer] = js.undefined
  
  /**
    * The nextToken value returned from a previous paginated DescribeComputeEnvironments request where maxResults was used and the results exceeded the value of that parameter. Pagination continues from the end of the previous results that returned the nextToken value. This value is null when there are no more results to return.  Treat this token as an opaque identifier that's only used to retrieve the next items in a list and not for other programmatic purposes. 
    */
  var nextToken: js.UndefOr[String] = js.undefined
}
object DescribeComputeEnvironmentsRequest {
  
  inline def apply(): DescribeComputeEnvironmentsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeComputeEnvironmentsRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeComputeEnvironmentsRequest] (val x: Self) extends AnyVal {
    
    inline def setComputeEnvironments(value: StringList): Self = StObject.set(x, "computeEnvironments", value.asInstanceOf[js.Any])
    
    inline def setComputeEnvironmentsUndefined: Self = StObject.set(x, "computeEnvironments", js.undefined)
    
    inline def setComputeEnvironmentsVarargs(value: String*): Self = StObject.set(x, "computeEnvironments", js.Array(value*))
    
    inline def setMaxResults(value: Integer): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    inline def setNextToken(value: String): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
