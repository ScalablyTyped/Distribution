package typings.awsSdk.chimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateSipRuleRequest extends js.Object {
  
  /**
    * The new value specified to indicate whether the rule is disabled.
    */
  var Disabled: js.UndefOr[NullableBoolean] = js.native
  
  /**
    * The new name for the specified SIP rule.
    */
  var Name: SipRuleName = js.native
  
  /**
    * The SIP rule ID.
    */
  var SipRuleId: NonEmptyString = js.native
  
  /**
    * The new value of the list of target applications.
    */
  var TargetApplications: js.UndefOr[SipRuleTargetApplicationList] = js.native
}
object UpdateSipRuleRequest {
  
  @scala.inline
  def apply(Name: SipRuleName, SipRuleId: NonEmptyString): UpdateSipRuleRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], SipRuleId = SipRuleId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateSipRuleRequest]
  }
  
  @scala.inline
  implicit class UpdateSipRuleRequestOps[Self <: UpdateSipRuleRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setName(value: SipRuleName): Self = this.set("Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSipRuleId(value: NonEmptyString): Self = this.set("SipRuleId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisabled(value: NullableBoolean): Self = this.set("Disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisabled: Self = this.set("Disabled", js.undefined)
    
    @scala.inline
    def setTargetApplicationsVarargs(value: SipRuleTargetApplication*): Self = this.set("TargetApplications", js.Array(value :_*))
    
    @scala.inline
    def setTargetApplications(value: SipRuleTargetApplicationList): Self = this.set("TargetApplications", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTargetApplications: Self = this.set("TargetApplications", js.undefined)
  }
}
