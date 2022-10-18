package typings.awsSdk.clientsAutoscalingplansMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeScalingPlanResourcesResponse extends StObject {
  
  /**
    * The token required to get the next set of results. This value is null if there are no more results to return.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsAutoscalingplansMod.NextToken] = js.undefined
  
  /**
    * Information about the scalable resources.
    */
  var ScalingPlanResources: js.UndefOr[typings.awsSdk.clientsAutoscalingplansMod.ScalingPlanResources] = js.undefined
}
object DescribeScalingPlanResourcesResponse {
  
  inline def apply(): DescribeScalingPlanResourcesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeScalingPlanResourcesResponse]
  }
  
  extension [Self <: DescribeScalingPlanResourcesResponse](x: Self) {
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setScalingPlanResources(value: ScalingPlanResources): Self = StObject.set(x, "ScalingPlanResources", value.asInstanceOf[js.Any])
    
    inline def setScalingPlanResourcesUndefined: Self = StObject.set(x, "ScalingPlanResources", js.undefined)
    
    inline def setScalingPlanResourcesVarargs(value: ScalingPlanResource*): Self = StObject.set(x, "ScalingPlanResources", js.Array(value*))
  }
}
