package typings.awsSdk.chimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SipRule extends StObject {
  
  /**
    * The SIP rule created timestamp, in ISO 8601 format.
    */
  var CreatedTimestamp: js.UndefOr[Iso8601Timestamp] = js.native
  
  /**
    * Indicates if the SIP rule is enabled or disabled. You must disable a rule before you can delete it.
    */
  var Disabled: js.UndefOr[Boolean] = js.native
  
  /**
    * The name of the SIP rule.
    */
  var Name: js.UndefOr[SipRuleName] = js.native
  
  /**
    * The SIP rule ID.
    */
  var SipRuleId: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * List of SIP media applications with priority and AWS Region. You can only use one SIP application per AWS Region and priority combination.
    */
  var TargetApplications: js.UndefOr[SipRuleTargetApplicationList] = js.native
  
  /**
    * The type of trigger whose value is assigned to the SIP rule in TriggerValue.
    */
  var TriggerType: js.UndefOr[SipRuleTriggerType] = js.native
  
  /**
    * If TriggerType is RequestUriHostname, then the value can be the outbound host name of the Amazon Chime Voice Connector. If TriggerType is ToPhoneNumber, then the value can be a customer-owned phone number in E164 format. SipRule is triggered when a SIP rule requests host name or ToPhoneNumber matches in the incoming SIP request.
    */
  var TriggerValue: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * The SIP rule updated timestamp, in ISO 8601 format.
    */
  var UpdatedTimestamp: js.UndefOr[Iso8601Timestamp] = js.native
}
object SipRule {
  
  @scala.inline
  def apply(): SipRule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SipRule]
  }
  
  @scala.inline
  implicit class SipRuleMutableBuilder[Self <: SipRule] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreatedTimestamp(value: Iso8601Timestamp): Self = StObject.set(x, "CreatedTimestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedTimestampUndefined: Self = StObject.set(x, "CreatedTimestamp", js.undefined)
    
    @scala.inline
    def setDisabled(value: Boolean): Self = StObject.set(x, "Disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisabledUndefined: Self = StObject.set(x, "Disabled", js.undefined)
    
    @scala.inline
    def setName(value: SipRuleName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    @scala.inline
    def setSipRuleId(value: NonEmptyString): Self = StObject.set(x, "SipRuleId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSipRuleIdUndefined: Self = StObject.set(x, "SipRuleId", js.undefined)
    
    @scala.inline
    def setTargetApplications(value: SipRuleTargetApplicationList): Self = StObject.set(x, "TargetApplications", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetApplicationsUndefined: Self = StObject.set(x, "TargetApplications", js.undefined)
    
    @scala.inline
    def setTargetApplicationsVarargs(value: SipRuleTargetApplication*): Self = StObject.set(x, "TargetApplications", js.Array(value :_*))
    
    @scala.inline
    def setTriggerType(value: SipRuleTriggerType): Self = StObject.set(x, "TriggerType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTriggerTypeUndefined: Self = StObject.set(x, "TriggerType", js.undefined)
    
    @scala.inline
    def setTriggerValue(value: NonEmptyString): Self = StObject.set(x, "TriggerValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTriggerValueUndefined: Self = StObject.set(x, "TriggerValue", js.undefined)
    
    @scala.inline
    def setUpdatedTimestamp(value: Iso8601Timestamp): Self = StObject.set(x, "UpdatedTimestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdatedTimestampUndefined: Self = StObject.set(x, "UpdatedTimestamp", js.undefined)
  }
}
