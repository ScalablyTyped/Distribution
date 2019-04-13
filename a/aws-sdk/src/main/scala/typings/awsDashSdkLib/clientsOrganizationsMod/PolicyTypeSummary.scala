package typings
package awsDashSdkLib.clientsOrganizationsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PolicyTypeSummary extends js.Object {
  /**
    * The status of the policy type as it relates to the associated root. To attach a policy of the specified type to a root or to an OU or account in that root, it must be available in the organization and enabled for that root.
    */
  var Status: js.UndefOr[PolicyTypeStatus] = js.undefined
  /**
    * The name of the policy type.
    */
  var Type: js.UndefOr[PolicyType] = js.undefined
}

object PolicyTypeSummary {
  @scala.inline
  def apply(Status: PolicyTypeStatus = null, Type: PolicyType = null): PolicyTypeSummary = {
    val __obj = js.Dynamic.literal()
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    if (Type != null) __obj.updateDynamic("Type")(Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[PolicyTypeSummary]
  }
}

