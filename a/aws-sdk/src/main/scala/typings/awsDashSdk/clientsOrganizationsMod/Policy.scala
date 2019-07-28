package typings.awsDashSdk.clientsOrganizationsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Policy extends js.Object {
  /**
    * The text content of the policy.
    */
  var Content: js.UndefOr[PolicyContent] = js.undefined
  /**
    * A structure that contains additional details about the policy.
    */
  var PolicySummary: js.UndefOr[typings.awsDashSdk.clientsOrganizationsMod.PolicySummary] = js.undefined
}

object Policy {
  @scala.inline
  def apply(Content: PolicyContent = null, PolicySummary: PolicySummary = null): Policy = {
    val __obj = js.Dynamic.literal()
    if (Content != null) __obj.updateDynamic("Content")(Content)
    if (PolicySummary != null) __obj.updateDynamic("PolicySummary")(PolicySummary)
    __obj.asInstanceOf[Policy]
  }
}

