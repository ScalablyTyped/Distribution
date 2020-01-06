package typings.awsDashSdk.clientsCodecommitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateApprovalRuleTemplateDescriptionOutput extends js.Object {
  /**
    * The structure and content of the updated approval rule template.
    */
  var approvalRuleTemplate: ApprovalRuleTemplate = js.native
}

object UpdateApprovalRuleTemplateDescriptionOutput {
  @scala.inline
  def apply(approvalRuleTemplate: ApprovalRuleTemplate): UpdateApprovalRuleTemplateDescriptionOutput = {
    val __obj = js.Dynamic.literal(approvalRuleTemplate = approvalRuleTemplate.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[UpdateApprovalRuleTemplateDescriptionOutput]
  }
}

