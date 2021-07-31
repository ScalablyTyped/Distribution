package typings.awsSdk.autoscalingMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeLoadBalancerTargetGroupsResponse extends StObject {
  
  /**
    * Information about the target groups.
    */
  var LoadBalancerTargetGroups: js.UndefOr[LoadBalancerTargetGroupStates] = js.undefined
  
  /**
    * A string that indicates that the response contains more items than can be returned in a single response. To receive additional items, specify this string for the NextToken value when requesting the next set of items. This value is null when there are no more items to return.
    */
  var NextToken: js.UndefOr[XmlString] = js.undefined
}
object DescribeLoadBalancerTargetGroupsResponse {
  
  @scala.inline
  def apply(): DescribeLoadBalancerTargetGroupsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeLoadBalancerTargetGroupsResponse]
  }
  
  @scala.inline
  implicit class DescribeLoadBalancerTargetGroupsResponseMutableBuilder[Self <: DescribeLoadBalancerTargetGroupsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLoadBalancerTargetGroups(value: LoadBalancerTargetGroupStates): Self = StObject.set(x, "LoadBalancerTargetGroups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoadBalancerTargetGroupsUndefined: Self = StObject.set(x, "LoadBalancerTargetGroups", js.undefined)
    
    @scala.inline
    def setLoadBalancerTargetGroupsVarargs(value: LoadBalancerTargetGroupState*): Self = StObject.set(x, "LoadBalancerTargetGroups", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: XmlString): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
