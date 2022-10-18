package typings.awsSdk.clientsAutoscalingplansMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeScalingPlansResponse extends StObject {
  
  /**
    * The token required to get the next set of results. This value is null if there are no more results to return.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsAutoscalingplansMod.NextToken] = js.undefined
  
  /**
    * Information about the scaling plans.
    */
  var ScalingPlans: js.UndefOr[typings.awsSdk.clientsAutoscalingplansMod.ScalingPlans] = js.undefined
}
object DescribeScalingPlansResponse {
  
  inline def apply(): DescribeScalingPlansResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeScalingPlansResponse]
  }
  
  extension [Self <: DescribeScalingPlansResponse](x: Self) {
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setScalingPlans(value: ScalingPlans): Self = StObject.set(x, "ScalingPlans", value.asInstanceOf[js.Any])
    
    inline def setScalingPlansUndefined: Self = StObject.set(x, "ScalingPlans", js.undefined)
    
    inline def setScalingPlansVarargs(value: ScalingPlan*): Self = StObject.set(x, "ScalingPlans", js.Array(value*))
  }
}
