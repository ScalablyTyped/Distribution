package typings.awsSdk.autoscalingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribePoliciesType extends js.Object {
  
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
  implicit class DescribePoliciesTypeOps[Self <: DescribePoliciesType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAutoScalingGroupName(value: ResourceName): Self = this.set("AutoScalingGroupName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoScalingGroupName: Self = this.set("AutoScalingGroupName", js.undefined)
    
    @scala.inline
    def setMaxRecords(value: MaxRecords): Self = this.set("MaxRecords", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxRecords: Self = this.set("MaxRecords", js.undefined)
    
    @scala.inline
    def setNextToken(value: XmlString): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
    
    @scala.inline
    def setPolicyNamesVarargs(value: ResourceName*): Self = this.set("PolicyNames", js.Array(value :_*))
    
    @scala.inline
    def setPolicyNames(value: PolicyNames): Self = this.set("PolicyNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePolicyNames: Self = this.set("PolicyNames", js.undefined)
    
    @scala.inline
    def setPolicyTypesVarargs(value: XmlStringMaxLen64*): Self = this.set("PolicyTypes", js.Array(value :_*))
    
    @scala.inline
    def setPolicyTypes(value: PolicyTypes): Self = this.set("PolicyTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePolicyTypes: Self = this.set("PolicyTypes", js.undefined)
  }
}
