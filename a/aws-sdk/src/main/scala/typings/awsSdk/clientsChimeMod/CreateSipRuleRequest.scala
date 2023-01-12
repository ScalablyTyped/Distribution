package typings.awsSdk.clientsChimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateSipRuleRequest extends StObject {
  
  /**
    * Enables or disables a rule. You must disable rules before you can delete them.
    */
  var Disabled: js.UndefOr[NullableBoolean] = js.undefined
  
  /**
    * The name of the SIP rule.
    */
  var Name: SipRuleName
  
  /**
    * List of SIP media applications with priority and AWS Region. Only one SIP application per AWS Region can be used.
    */
  var TargetApplications: SipRuleTargetApplicationList
  
  /**
    * The type of trigger assigned to the SIP rule in TriggerValue, currently RequestUriHostname or ToPhoneNumber.
    */
  var TriggerType: SipRuleTriggerType
  
  /**
    * If TriggerType is RequestUriHostname, the value can be the outbound host name of an Amazon Chime Voice Connector. If TriggerType is ToPhoneNumber, the value can be a customer-owned phone number in the E164 format. The SipMediaApplication specified in the SipRule is triggered if the request URI in an incoming SIP request matches the RequestUriHostname, or if the To header in the incoming SIP request matches the ToPhoneNumber value.
    */
  var TriggerValue: NonEmptyString
}
object CreateSipRuleRequest {
  
  inline def apply(
    Name: SipRuleName,
    TargetApplications: SipRuleTargetApplicationList,
    TriggerType: SipRuleTriggerType,
    TriggerValue: NonEmptyString
  ): CreateSipRuleRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], TargetApplications = TargetApplications.asInstanceOf[js.Any], TriggerType = TriggerType.asInstanceOf[js.Any], TriggerValue = TriggerValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateSipRuleRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateSipRuleRequest] (val x: Self) extends AnyVal {
    
    inline def setDisabled(value: NullableBoolean): Self = StObject.set(x, "Disabled", value.asInstanceOf[js.Any])
    
    inline def setDisabledUndefined: Self = StObject.set(x, "Disabled", js.undefined)
    
    inline def setName(value: SipRuleName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setTargetApplications(value: SipRuleTargetApplicationList): Self = StObject.set(x, "TargetApplications", value.asInstanceOf[js.Any])
    
    inline def setTargetApplicationsVarargs(value: SipRuleTargetApplication*): Self = StObject.set(x, "TargetApplications", js.Array(value*))
    
    inline def setTriggerType(value: SipRuleTriggerType): Self = StObject.set(x, "TriggerType", value.asInstanceOf[js.Any])
    
    inline def setTriggerValue(value: NonEmptyString): Self = StObject.set(x, "TriggerValue", value.asInstanceOf[js.Any])
  }
}
