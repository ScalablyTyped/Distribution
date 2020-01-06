package typings.awsDashSdk.clientsOrganizationsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Policy extends js.Object {
  /**
    * The text content of the policy.
    */
  var Content: js.UndefOr[PolicyContent] = js.native
  /**
    * A structure that contains additional details about the policy.
    */
  var PolicySummary: js.UndefOr[typings.awsDashSdk.clientsOrganizationsMod.PolicySummary] = js.native
}

object Policy {
  @scala.inline
  def apply(Content: PolicyContent = null, PolicySummary: PolicySummary = null): Policy = {
    val __obj = js.Dynamic.literal()
    if (Content != null) __obj.updateDynamic("Content")(Content.asInstanceOf[js.Any])
    if (PolicySummary != null) __obj.updateDynamic("PolicySummary")(PolicySummary.asInstanceOf[js.Any])
    __obj.asInstanceOf[Policy]
  }
}

