package typings.awsSdk.chimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SipRule extends js.Object {
  
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
  implicit class SipRuleOps[Self <: SipRule] (val x: Self) extends AnyVal {
    
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
    def setCreatedTimestamp(value: Iso8601Timestamp): Self = this.set("CreatedTimestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreatedTimestamp: Self = this.set("CreatedTimestamp", js.undefined)
    
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("Disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisabled: Self = this.set("Disabled", js.undefined)
    
    @scala.inline
    def setName(value: SipRuleName): Self = this.set("Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("Name", js.undefined)
    
    @scala.inline
    def setSipRuleId(value: NonEmptyString): Self = this.set("SipRuleId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSipRuleId: Self = this.set("SipRuleId", js.undefined)
    
    @scala.inline
    def setTargetApplicationsVarargs(value: SipRuleTargetApplication*): Self = this.set("TargetApplications", js.Array(value :_*))
    
    @scala.inline
    def setTargetApplications(value: SipRuleTargetApplicationList): Self = this.set("TargetApplications", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTargetApplications: Self = this.set("TargetApplications", js.undefined)
    
    @scala.inline
    def setTriggerType(value: SipRuleTriggerType): Self = this.set("TriggerType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTriggerType: Self = this.set("TriggerType", js.undefined)
    
    @scala.inline
    def setTriggerValue(value: NonEmptyString): Self = this.set("TriggerValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTriggerValue: Self = this.set("TriggerValue", js.undefined)
    
    @scala.inline
    def setUpdatedTimestamp(value: Iso8601Timestamp): Self = this.set("UpdatedTimestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpdatedTimestamp: Self = this.set("UpdatedTimestamp", js.undefined)
  }
}
