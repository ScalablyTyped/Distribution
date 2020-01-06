package typings.awsDashSdk.clientsCodecommitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ApprovalRuleTemplate extends js.Object {
  /**
    * The content of the approval rule template.
    */
  var approvalRuleTemplateContent: js.UndefOr[ApprovalRuleTemplateContent] = js.native
  /**
    * The description of the approval rule template.
    */
  var approvalRuleTemplateDescription: js.UndefOr[ApprovalRuleTemplateDescription] = js.native
  /**
    * The system-generated ID of the approval rule template.
    */
  var approvalRuleTemplateId: js.UndefOr[ApprovalRuleTemplateId] = js.native
  /**
    * The name of the approval rule template.
    */
  var approvalRuleTemplateName: js.UndefOr[ApprovalRuleTemplateName] = js.native
  /**
    * The date the approval rule template was created, in timestamp format.
    */
  var creationDate: js.UndefOr[CreationDate] = js.native
  /**
    * The date the approval rule template was most recently changed, in timestamp format.
    */
  var lastModifiedDate: js.UndefOr[LastModifiedDate] = js.native
  /**
    * The Amazon Resource Name (ARN) of the user who made the most recent changes to the approval rule template.
    */
  var lastModifiedUser: js.UndefOr[Arn] = js.native
  /**
    * The SHA-256 hash signature for the content of the approval rule template.
    */
  var ruleContentSha256: js.UndefOr[RuleContentSha256] = js.native
}

object ApprovalRuleTemplate {
  @scala.inline
  def apply(
    approvalRuleTemplateContent: ApprovalRuleTemplateContent = null,
    approvalRuleTemplateDescription: ApprovalRuleTemplateDescription = null,
    approvalRuleTemplateId: ApprovalRuleTemplateId = null,
    approvalRuleTemplateName: ApprovalRuleTemplateName = null,
    creationDate: CreationDate = null,
    lastModifiedDate: LastModifiedDate = null,
    lastModifiedUser: Arn = null,
    ruleContentSha256: RuleContentSha256 = null
  ): ApprovalRuleTemplate = {
    val __obj = js.Dynamic.literal()
    if (approvalRuleTemplateContent != null) __obj.updateDynamic("approvalRuleTemplateContent")(approvalRuleTemplateContent.asInstanceOf[js.Any])
    if (approvalRuleTemplateDescription != null) __obj.updateDynamic("approvalRuleTemplateDescription")(approvalRuleTemplateDescription.asInstanceOf[js.Any])
    if (approvalRuleTemplateId != null) __obj.updateDynamic("approvalRuleTemplateId")(approvalRuleTemplateId.asInstanceOf[js.Any])
    if (approvalRuleTemplateName != null) __obj.updateDynamic("approvalRuleTemplateName")(approvalRuleTemplateName.asInstanceOf[js.Any])
    if (creationDate != null) __obj.updateDynamic("creationDate")(creationDate.asInstanceOf[js.Any])
    if (lastModifiedDate != null) __obj.updateDynamic("lastModifiedDate")(lastModifiedDate.asInstanceOf[js.Any])
    if (lastModifiedUser != null) __obj.updateDynamic("lastModifiedUser")(lastModifiedUser.asInstanceOf[js.Any])
    if (ruleContentSha256 != null) __obj.updateDynamic("ruleContentSha256")(ruleContentSha256.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApprovalRuleTemplate]
  }
}

