package typings.awsSdk.chimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateSipRuleRequest extends js.Object {
  
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
  implicit class CreateSipRuleRequestOps[Self <: CreateSipRuleRequest] (val x: Self) extends AnyVal {
    
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
    def setTargetApplicationsVarargs(value: SipRuleTargetApplication*): Self = this.set("TargetApplications", js.Array(value :_*))
    
    @scala.inline
    def setTargetApplications(value: SipRuleTargetApplicationList): Self = this.set("TargetApplications", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTriggerType(value: SipRuleTriggerType): Self = this.set("TriggerType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTriggerValue(value: NonEmptyString): Self = this.set("TriggerValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisabled(value: NullableBoolean): Self = this.set("Disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisabled: Self = this.set("Disabled", js.undefined)
  }
}
