package typings.awsDashSdk.clientsCodecommitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetApprovalRuleTemplateOutput extends js.Object {
  /**
    * The content and structure of the approval rule template.
    */
  var approvalRuleTemplate: ApprovalRuleTemplate = js.native
}

object GetApprovalRuleTemplateOutput {
  @scala.inline
  def apply(approvalRuleTemplate: ApprovalRuleTemplate): GetApprovalRuleTemplateOutput = {
    val __obj = js.Dynamic.literal(approvalRuleTemplate = approvalRuleTemplate.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetApprovalRuleTemplateOutput]
  }
}

