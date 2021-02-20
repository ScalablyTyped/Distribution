package typings.awsSdk.chimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateSipRuleRequest extends StObject {
  
  /**
    * Enables or disables a rule. You must disable rules before you can delete them.
    */
  var Disabled: js.UndefOr[NullableBoolean] = js.native
  
  /**
    * The name of the SIP rule.
    */
  var Name: SipRuleName = js.native
  
  /**
    * List of SIP media applications with priority and AWS Region. Only one SIP application per AWS Region can be used.
    */
  var TargetApplications: SipRuleTargetApplicationList = js.native
  
  /**
    * The type of trigger whose value is assigned to the SIP rule in TriggerValue. Allowed trigger values are RequestUriHostname and ToPhoneNumber.
    */
  var TriggerType: SipRuleTriggerType = js.native
  
  /**
    * If TriggerType is RequestUriHostname then the value can be the outbound host name of an Amazon Chime Voice Connector. If TriggerType is ToPhoneNumber then the value can be a customer-owned phone number in E164 format. SipRule is triggered if the SIP application requests a host name, or a If TriggerType is RequestUriHostname, then the value can be the outbound hostname of an Amazon Chime Voice Connector. If TriggerType is ToPhoneNumber, then the value can be a customer-owned phone number in E164 format. SipRule is triggered if the SIP application requests a host name, or a ToPhoneNumber value matches the incoming SIP request.
    */
  var TriggerValue: NonEmptyString = js.native
}
object CreateSipRuleRequest {
  
  @scala.inline
  def apply(
    Name: SipRuleName,
    TargetApplications: SipRuleTargetApplicationList,
    TriggerType: SipRuleTriggerType,
    TriggerValue: NonEmptyString
  ): CreateSipRuleRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], TargetApplications = TargetApplications.asInstanceOf[js.Any], TriggerType = TriggerType.asInstanceOf[js.Any], TriggerValue = TriggerValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateSipRuleRequest]
  }
  
  @scala.inline
  implicit class CreateSipRuleRequestMutableBuilder[Self <: CreateSipRuleRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDisabled(value: NullableBoolean): Self = StObject.set(x, "Disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisabledUndefined: Self = StObject.set(x, "Disabled", js.undefined)
    
    @scala.inline
    def setName(value: SipRuleName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetApplications(value: SipRuleTargetApplicationList): Self = StObject.set(x, "TargetApplications", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetApplicationsVarargs(value: SipRuleTargetApplication*): Self = StObject.set(x, "TargetApplications", js.Array(value :_*))
    
    @scala.inline
    def setTriggerType(value: SipRuleTriggerType): Self = StObject.set(x, "TriggerType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTriggerValue(value: NonEmptyString): Self = StObject.set(x, "TriggerValue", value.asInstanceOf[js.Any])
  }
}
