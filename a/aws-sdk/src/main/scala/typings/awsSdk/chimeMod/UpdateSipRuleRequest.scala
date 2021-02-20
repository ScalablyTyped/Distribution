package typings.awsSdk.chimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateSipRuleRequest extends StObject {
  
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
  implicit class UpdateSipRuleRequestMutableBuilder[Self <: UpdateSipRuleRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDisabled(value: NullableBoolean): Self = StObject.set(x, "Disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisabledUndefined: Self = StObject.set(x, "Disabled", js.undefined)
    
    @scala.inline
    def setName(value: SipRuleName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSipRuleId(value: NonEmptyString): Self = StObject.set(x, "SipRuleId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetApplications(value: SipRuleTargetApplicationList): Self = StObject.set(x, "TargetApplications", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetApplicationsUndefined: Self = StObject.set(x, "TargetApplications", js.undefined)
    
    @scala.inline
    def setTargetApplicationsVarargs(value: SipRuleTargetApplication*): Self = StObject.set(x, "TargetApplications", js.Array(value :_*))
  }
}
