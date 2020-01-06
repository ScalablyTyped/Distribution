package typings.awsDashSdk.clientsCodecommitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ApprovalRuleEventMetadata extends js.Object {
  /**
    * The content of the approval rule.
    */
  var approvalRuleContent: js.UndefOr[ApprovalRuleContent] = js.native
  /**
    * The system-generated ID of the approval rule.
    */
  var approvalRuleId: js.UndefOr[ApprovalRuleId] = js.native
  /**
    * The name of the approval rule.
    */
  var approvalRuleName: js.UndefOr[ApprovalRuleName] = js.native
}

object ApprovalRuleEventMetadata {
  @scala.inline
  def apply(
    approvalRuleContent: ApprovalRuleContent = null,
    approvalRuleId: ApprovalRuleId = null,
    approvalRuleName: ApprovalRuleName = null
  ): ApprovalRuleEventMetadata = {
    val __obj = js.Dynamic.literal()
    if (approvalRuleContent != null) __obj.updateDynamic("approvalRuleContent")(approvalRuleContent.asInstanceOf[js.Any])
    if (approvalRuleId != null) __obj.updateDynamic("approvalRuleId")(approvalRuleId.asInstanceOf[js.Any])
    if (approvalRuleName != null) __obj.updateDynamic("approvalRuleName")(approvalRuleName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApprovalRuleEventMetadata]
  }
}

