package typings.awsSdk.autoscalingplansMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeScalingPlanResourcesResponse extends StObject {
  
  /**
    * The token required to get the next set of results. This value is null if there are no more results to return.
    */
  var NextToken: js.UndefOr[typings.awsSdk.autoscalingplansMod.NextToken] = js.native
  
  /**
    * Information about the scalable resources.
    */
  var ScalingPlanResources: js.UndefOr[typings.awsSdk.autoscalingplansMod.ScalingPlanResources] = js.native
}
object DescribeScalingPlanResourcesResponse {
  
  @scala.inline
  def apply(): DescribeScalingPlanResourcesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeScalingPlanResourcesResponse]
  }
  
  @scala.inline
  implicit class DescribeScalingPlanResourcesResponseMutableBuilder[Self <: DescribeScalingPlanResourcesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setScalingPlanResources(value: ScalingPlanResources): Self = StObject.set(x, "ScalingPlanResources", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScalingPlanResourcesUndefined: Self = StObject.set(x, "ScalingPlanResources", js.undefined)
    
    @scala.inline
    def setScalingPlanResourcesVarargs(value: ScalingPlanResource*): Self = StObject.set(x, "ScalingPlanResources", js.Array(value :_*))
  }
}
