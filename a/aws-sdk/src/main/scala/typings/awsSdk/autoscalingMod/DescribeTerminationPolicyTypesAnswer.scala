package typings.awsSdk.autoscalingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeTerminationPolicyTypesAnswer extends js.Object {
  
  /**
    * The termination policies supported by Amazon EC2 Auto Scaling: OldestInstance, OldestLaunchConfiguration, NewestInstance, ClosestToNextInstanceHour, Default, OldestLaunchTemplate, and AllocationStrategy.
    */
  var TerminationPolicyTypes: js.UndefOr[TerminationPolicies] = js.native
}
object DescribeTerminationPolicyTypesAnswer {
  
  @scala.inline
  def apply(): DescribeTerminationPolicyTypesAnswer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeTerminationPolicyTypesAnswer]
  }
  
  @scala.inline
  implicit class DescribeTerminationPolicyTypesAnswerOps[Self <: DescribeTerminationPolicyTypesAnswer] (val x: Self) extends AnyVal {
    
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
    def setTerminationPolicyTypesVarargs(value: XmlStringMaxLen1600*): Self = this.set("TerminationPolicyTypes", js.Array(value :_*))
    
    @scala.inline
    def setTerminationPolicyTypes(value: TerminationPolicies): Self = this.set("TerminationPolicyTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTerminationPolicyTypes: Self = this.set("TerminationPolicyTypes", js.undefined)
  }
}
