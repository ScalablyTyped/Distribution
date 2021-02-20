package typings.awsSdk.batchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeComputeEnvironmentsResponse extends StObject {
  
  /**
    * The list of compute environments.
    */
  var computeEnvironments: js.UndefOr[ComputeEnvironmentDetailList] = js.native
  
  /**
    * The nextToken value to include in a future DescribeComputeEnvironments request. When the results of a DescribeJobDefinitions request exceed maxResults, this value can be used to retrieve the next page of results. This value is null when there are no more results to return.
    */
  var nextToken: js.UndefOr[String] = js.native
}
object DescribeComputeEnvironmentsResponse {
  
  @scala.inline
  def apply(): DescribeComputeEnvironmentsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeComputeEnvironmentsResponse]
  }
  
  @scala.inline
  implicit class DescribeComputeEnvironmentsResponseMutableBuilder[Self <: DescribeComputeEnvironmentsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComputeEnvironments(value: ComputeEnvironmentDetailList): Self = StObject.set(x, "computeEnvironments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComputeEnvironmentsUndefined: Self = StObject.set(x, "computeEnvironments", js.undefined)
    
    @scala.inline
    def setComputeEnvironmentsVarargs(value: ComputeEnvironmentDetail*): Self = StObject.set(x, "computeEnvironments", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: String): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
