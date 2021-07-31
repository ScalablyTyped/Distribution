package typings.awsSdk.applicationautoscalingMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeScalingPoliciesResponse extends StObject {
  
  /**
    * The token required to get the next set of results. This value is null if there are no more results to return.
    */
  var NextToken: js.UndefOr[XmlString] = js.undefined
  
  /**
    * Information about the scaling policies.
    */
  var ScalingPolicies: js.UndefOr[typings.awsSdk.applicationautoscalingMod.ScalingPolicies] = js.undefined
}
object DescribeScalingPoliciesResponse {
  
  @scala.inline
  def apply(): DescribeScalingPoliciesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeScalingPoliciesResponse]
  }
  
  @scala.inline
  implicit class DescribeScalingPoliciesResponseMutableBuilder[Self <: DescribeScalingPoliciesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextToken(value: XmlString): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setScalingPolicies(value: ScalingPolicies): Self = StObject.set(x, "ScalingPolicies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScalingPoliciesUndefined: Self = StObject.set(x, "ScalingPolicies", js.undefined)
    
    @scala.inline
    def setScalingPoliciesVarargs(value: ScalingPolicy*): Self = StObject.set(x, "ScalingPolicies", js.Array(value :_*))
  }
}
