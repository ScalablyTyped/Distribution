package typings.awsSdk.autoscalingMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribePoliciesType extends StObject {
  
  /**
    * The name of the Auto Scaling group.
    */
  var AutoScalingGroupName: js.UndefOr[ResourceName] = js.native
  
  /**
    * The maximum number of items to be returned with each call. The default value is 50 and the maximum value is 100.
    */
  var MaxRecords: js.UndefOr[typings.awsSdk.autoscalingMod.MaxRecords] = js.native
  
  /**
    * The token for the next set of items to return. (You received this token from a previous call.)
    */
  var NextToken: js.UndefOr[XmlString] = js.native
  
  /**
    * The names of one or more policies. If you omit this parameter, all policies are described. If a group name is provided, the results are limited to that group. This list is limited to 50 items. If you specify an unknown policy name, it is ignored with no error.
    */
  var PolicyNames: js.UndefOr[typings.awsSdk.autoscalingMod.PolicyNames] = js.native
  
  /**
    * One or more policy types. The valid values are SimpleScaling, StepScaling, and TargetTrackingScaling.
    */
  var PolicyTypes: js.UndefOr[typings.awsSdk.autoscalingMod.PolicyTypes] = js.native
}
object DescribePoliciesType {
  
  @scala.inline
  def apply(): DescribePoliciesType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribePoliciesType]
  }
  
  @scala.inline
  implicit class DescribePoliciesTypeMutableBuilder[Self <: DescribePoliciesType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAutoScalingGroupName(value: ResourceName): Self = StObject.set(x, "AutoScalingGroupName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoScalingGroupNameUndefined: Self = StObject.set(x, "AutoScalingGroupName", js.undefined)
    
    @scala.inline
    def setMaxRecords(value: MaxRecords): Self = StObject.set(x, "MaxRecords", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxRecordsUndefined: Self = StObject.set(x, "MaxRecords", js.undefined)
    
    @scala.inline
    def setNextToken(value: XmlString): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setPolicyNames(value: PolicyNames): Self = StObject.set(x, "PolicyNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPolicyNamesUndefined: Self = StObject.set(x, "PolicyNames", js.undefined)
    
    @scala.inline
    def setPolicyNamesVarargs(value: ResourceName*): Self = StObject.set(x, "PolicyNames", js.Array(value :_*))
    
    @scala.inline
    def setPolicyTypes(value: PolicyTypes): Self = StObject.set(x, "PolicyTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPolicyTypesUndefined: Self = StObject.set(x, "PolicyTypes", js.undefined)
    
    @scala.inline
    def setPolicyTypesVarargs(value: XmlStringMaxLen64*): Self = StObject.set(x, "PolicyTypes", js.Array(value :_*))
  }
}
