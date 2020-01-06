package typings.awsDashSdk.clientsCodecommitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AssociateApprovalRuleTemplateWithRepositoryInput extends js.Object {
  /**
    * The name for the approval rule template. 
    */
  var approvalRuleTemplateName: ApprovalRuleTemplateName = js.native
  /**
    * The name of the repository that you want to associate with the template.
    */
  var repositoryName: RepositoryName = js.native
}

object AssociateApprovalRuleTemplateWithRepositoryInput {
  @scala.inline
  def apply(approvalRuleTemplateName: ApprovalRuleTemplateName, repositoryName: RepositoryName): AssociateApprovalRuleTemplateWithRepositoryInput = {
    val __obj = js.Dynamic.literal(approvalRuleTemplateName = approvalRuleTemplateName.asInstanceOf[js.Any], repositoryName = repositoryName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AssociateApprovalRuleTemplateWithRepositoryInput]
  }
}

