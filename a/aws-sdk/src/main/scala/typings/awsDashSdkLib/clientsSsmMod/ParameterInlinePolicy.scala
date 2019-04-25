package typings
package awsDashSdkLib.clientsSsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParameterInlinePolicy extends js.Object {
  /**
    * The status of the policy. Policies report the following statuses: Pending (the policy has not been enforced or applied yet), Finished (the policy was applied), Failed (the policy was not applied), or InProgress (the policy is being applied now). 
    */
  var PolicyStatus: js.UndefOr[String] = js.undefined
  /**
    * The JSON text of the policy.
    */
  var PolicyText: js.UndefOr[String] = js.undefined
  /**
    * The type of policy. Parameter Store supports the following policy types: Expiration, ExpirationNotification, and NoChangeNotification. 
    */
  var PolicyType: js.UndefOr[String] = js.undefined
}

object ParameterInlinePolicy {
  @scala.inline
  def apply(PolicyStatus: String = null, PolicyText: String = null, PolicyType: String = null): ParameterInlinePolicy = {
    val __obj = js.Dynamic.literal()
    if (PolicyStatus != null) __obj.updateDynamic("PolicyStatus")(PolicyStatus)
    if (PolicyText != null) __obj.updateDynamic("PolicyText")(PolicyText)
    if (PolicyType != null) __obj.updateDynamic("PolicyType")(PolicyType)
    __obj.asInstanceOf[ParameterInlinePolicy]
  }
}

