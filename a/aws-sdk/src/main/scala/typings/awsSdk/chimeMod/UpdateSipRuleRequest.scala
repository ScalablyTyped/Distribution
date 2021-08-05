package typings.awsSdk.chimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateSipRuleRequest extends StObject {
  
  /**
    * The new value specified to indicate whether the rule is disabled.
    */
  var Disabled: js.UndefOr[NullableBoolean] = js.undefined
  
  /**
    * The new name for the specified SIP rule.
    */
  var Name: SipRuleName
  
  /**
    * The SIP rule ID.
    */
  var SipRuleId: NonEmptyString
  
  /**
    * The new value of the list of target applications.
    */
  var TargetApplications: js.UndefOr[SipRuleTargetApplicationList] = js.undefined
}
object UpdateSipRuleRequest {
  
  inline def apply(Name: SipRuleName, SipRuleId: NonEmptyString): UpdateSipRuleRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], SipRuleId = SipRuleId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateSipRuleRequest]
  }
  
  extension [Self <: UpdateSipRuleRequest](x: Self) {
    
    inline def setDisabled(value: NullableBoolean): Self = StObject.set(x, "Disabled", value.asInstanceOf[js.Any])
    
    inline def setDisabledUndefined: Self = StObject.set(x, "Disabled", js.undefined)
    
    inline def setName(value: SipRuleName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setSipRuleId(value: NonEmptyString): Self = StObject.set(x, "SipRuleId", value.asInstanceOf[js.Any])
    
    inline def setTargetApplications(value: SipRuleTargetApplicationList): Self = StObject.set(x, "TargetApplications", value.asInstanceOf[js.Any])
    
    inline def setTargetApplicationsUndefined: Self = StObject.set(x, "TargetApplications", js.undefined)
    
    inline def setTargetApplicationsVarargs(value: SipRuleTargetApplication*): Self = StObject.set(x, "TargetApplications", js.Array(value :_*))
  }
}
