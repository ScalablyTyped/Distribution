package typings.awsDashSdk.clientsFmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SecurityServicePolicyData extends js.Object {
  /**
    * Details about the service. This contains WAF data in JSON format, as shown in the following example:  ManagedServiceData": "{\"type\": \"WAF\", \"ruleGroups\": [{\"id\": \"12345678-1bcd-9012-efga-0987654321ab\", \"overrideAction\" : {\"type\": \"COUNT\"}}], \"defaultAction\": {\"type\": \"BLOCK\"}}  If this is a Shield Advanced policy, this string will be empty.
    */
  var ManagedServiceData: js.UndefOr[typings.awsDashSdk.clientsFmsMod.ManagedServiceData] = js.undefined
  /**
    * The service that the policy is using to protect the resources. This specifies the type of policy that is created, either a WAF policy or Shield Advanced policy.
    */
  var Type: SecurityServiceType
}

object SecurityServicePolicyData {
  @scala.inline
  def apply(Type: SecurityServiceType, ManagedServiceData: ManagedServiceData = null): SecurityServicePolicyData = {
    val __obj = js.Dynamic.literal(Type = Type.asInstanceOf[js.Any])
    if (ManagedServiceData != null) __obj.updateDynamic("ManagedServiceData")(ManagedServiceData)
    __obj.asInstanceOf[SecurityServicePolicyData]
  }
}

