package typings.awsDashSdk.clientsCodecommitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateApprovalRuleTemplateContentInput extends js.Object {
  /**
    * The name of the approval rule template where you want to update the content of the rule. 
    */
  var approvalRuleTemplateName: ApprovalRuleTemplateName = js.native
  /**
    * The SHA-256 hash signature for the content of the approval rule. You can retrieve this information by using GetPullRequest.
    */
  var existingRuleContentSha256: js.UndefOr[RuleContentSha256] = js.native
  /**
    * The content that replaces the existing content of the rule. Content statements must be complete. You cannot provide only the changes.
    */
  var newRuleContent: ApprovalRuleTemplateContent = js.native
}

object UpdateApprovalRuleTemplateContentInput {
  @scala.inline
  def apply(
    approvalRuleTemplateName: ApprovalRuleTemplateName,
    newRuleContent: ApprovalRuleTemplateContent,
    existingRuleContentSha256: RuleContentSha256 = null
  ): UpdateApprovalRuleTemplateContentInput = {
    val __obj = js.Dynamic.literal(approvalRuleTemplateName = approvalRuleTemplateName.asInstanceOf[js.Any], newRuleContent = newRuleContent.asInstanceOf[js.Any])
    if (existingRuleContentSha256 != null) __obj.updateDynamic("existingRuleContentSha256")(existingRuleContentSha256.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateApprovalRuleTemplateContentInput]
  }
}

