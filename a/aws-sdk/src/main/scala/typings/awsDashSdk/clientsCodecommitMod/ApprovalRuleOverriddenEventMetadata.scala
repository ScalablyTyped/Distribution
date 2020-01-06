package typings.awsDashSdk.clientsCodecommitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ApprovalRuleOverriddenEventMetadata extends js.Object {
  /**
    * The status of the override event.
    */
  var overrideStatus: js.UndefOr[OverrideStatus] = js.native
  /**
    * The revision ID of the pull request when the override event occurred.
    */
  var revisionId: js.UndefOr[RevisionId] = js.native
}

object ApprovalRuleOverriddenEventMetadata {
  @scala.inline
  def apply(overrideStatus: OverrideStatus = null, revisionId: RevisionId = null): ApprovalRuleOverriddenEventMetadata = {
    val __obj = js.Dynamic.literal()
    if (overrideStatus != null) __obj.updateDynamic("overrideStatus")(overrideStatus.asInstanceOf[js.Any])
    if (revisionId != null) __obj.updateDynamic("revisionId")(revisionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApprovalRuleOverriddenEventMetadata]
  }
}

