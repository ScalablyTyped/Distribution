package typings.awsSdk.clientsChimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SipRule extends StObject {
  
  /**
    * The time at which the SIP rule was created, in ISO 8601 format.
    */
  var CreatedTimestamp: js.UndefOr[js.Date] = js.undefined
  
  /**
    * Indicates whether the SIP rule is enabled or disabled. You must disable a rule before you can delete it.
    */
  var Disabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The name of the SIP rule.
    */
  var Name: js.UndefOr[SipRuleName] = js.undefined
  
  /**
    * The SIP rule ID.
    */
  var SipRuleId: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * Target SIP media application and other details, such as priority and AWS Region, to be specified in the SIP rule. Only one SIP rule per AWS Region can be provided.
    */
  var TargetApplications: js.UndefOr[SipRuleTargetApplicationList] = js.undefined
  
  /**
    * The type of trigger assigned to the SIP rule in TriggerValue, currently RequestUriHostname or ToPhoneNumber.
    */
  var TriggerType: js.UndefOr[SipRuleTriggerType] = js.undefined
  
  /**
    * If TriggerType is RequestUriHostname, then the value can be the outbound host name of the Amazon Chime Voice Connector. If TriggerType is ToPhoneNumber, then the value can be a customer-owned phone number in E164 format. SipRule is triggered when a SIP rule requests host name or ToPhoneNumber matches in the incoming SIP request.
    */
  var TriggerValue: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The time at which the SIP rule was last updated, in ISO 8601 format.
    */
  var UpdatedTimestamp: js.UndefOr[js.Date] = js.undefined
}
object SipRule {
  
  inline def apply(): SipRule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SipRule]
  }
  
  extension [Self <: SipRule](x: Self) {
    
    inline def setCreatedTimestamp(value: js.Date): Self = StObject.set(x, "CreatedTimestamp", value.asInstanceOf[js.Any])
    
    inline def setCreatedTimestampUndefined: Self = StObject.set(x, "CreatedTimestamp", js.undefined)
    
    inline def setDisabled(value: Boolean): Self = StObject.set(x, "Disabled", value.asInstanceOf[js.Any])
    
    inline def setDisabledUndefined: Self = StObject.set(x, "Disabled", js.undefined)
    
    inline def setName(value: SipRuleName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setSipRuleId(value: NonEmptyString): Self = StObject.set(x, "SipRuleId", value.asInstanceOf[js.Any])
    
    inline def setSipRuleIdUndefined: Self = StObject.set(x, "SipRuleId", js.undefined)
    
    inline def setTargetApplications(value: SipRuleTargetApplicationList): Self = StObject.set(x, "TargetApplications", value.asInstanceOf[js.Any])
    
    inline def setTargetApplicationsUndefined: Self = StObject.set(x, "TargetApplications", js.undefined)
    
    inline def setTargetApplicationsVarargs(value: SipRuleTargetApplication*): Self = StObject.set(x, "TargetApplications", js.Array(value*))
    
    inline def setTriggerType(value: SipRuleTriggerType): Self = StObject.set(x, "TriggerType", value.asInstanceOf[js.Any])
    
    inline def setTriggerTypeUndefined: Self = StObject.set(x, "TriggerType", js.undefined)
    
    inline def setTriggerValue(value: NonEmptyString): Self = StObject.set(x, "TriggerValue", value.asInstanceOf[js.Any])
    
    inline def setTriggerValueUndefined: Self = StObject.set(x, "TriggerValue", js.undefined)
    
    inline def setUpdatedTimestamp(value: js.Date): Self = StObject.set(x, "UpdatedTimestamp", value.asInstanceOf[js.Any])
    
    inline def setUpdatedTimestampUndefined: Self = StObject.set(x, "UpdatedTimestamp", js.undefined)
  }
}
