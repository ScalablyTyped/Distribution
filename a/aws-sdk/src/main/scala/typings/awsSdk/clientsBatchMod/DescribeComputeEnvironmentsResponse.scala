package typings.awsSdk.clientsBatchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeComputeEnvironmentsResponse extends StObject {
  
  /**
    * The list of compute environments.
    */
  var computeEnvironments: js.UndefOr[ComputeEnvironmentDetailList] = js.undefined
  
  /**
    * The nextToken value to include in a future DescribeComputeEnvironments request. When the results of a DescribeComputeEnvironments request exceed maxResults, this value can be used to retrieve the next page of results. This value is null when there are no more results to return.
    */
  var nextToken: js.UndefOr[String] = js.undefined
}
object DescribeComputeEnvironmentsResponse {
  
  inline def apply(): DescribeComputeEnvironmentsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeComputeEnvironmentsResponse]
  }
  
  extension [Self <: DescribeComputeEnvironmentsResponse](x: Self) {
    
    inline def setComputeEnvironments(value: ComputeEnvironmentDetailList): Self = StObject.set(x, "computeEnvironments", value.asInstanceOf[js.Any])
    
    inline def setComputeEnvironmentsUndefined: Self = StObject.set(x, "computeEnvironments", js.undefined)
    
    inline def setComputeEnvironmentsVarargs(value: ComputeEnvironmentDetail*): Self = StObject.set(x, "computeEnvironments", js.Array(value*))
    
    inline def setNextToken(value: String): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
