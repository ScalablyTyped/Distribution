package typings.awsDashSdk.clientsCodecommitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DisassociateApprovalRuleTemplateFromRepositoryInput extends js.Object {
  /**
    * The name of the approval rule template to disassociate from a specified repository.
    */
  var approvalRuleTemplateName: ApprovalRuleTemplateName = js.native
  /**
    * The name of the repository you want to disassociate from the template.
    */
  var repositoryName: RepositoryName = js.native
}

object DisassociateApprovalRuleTemplateFromRepositoryInput {
  @scala.inline
  def apply(approvalRuleTemplateName: ApprovalRuleTemplateName, repositoryName: RepositoryName): DisassociateApprovalRuleTemplateFromRepositoryInput = {
    val __obj = js.Dynamic.literal(approvalRuleTemplateName = approvalRuleTemplateName.asInstanceOf[js.Any], repositoryName = repositoryName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DisassociateApprovalRuleTemplateFromRepositoryInput]
  }
}

