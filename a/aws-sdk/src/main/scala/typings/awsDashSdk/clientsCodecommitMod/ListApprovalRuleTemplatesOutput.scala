package typings.awsDashSdk.clientsCodecommitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListApprovalRuleTemplatesOutput extends js.Object {
  /**
    * The names of all the approval rule templates found in the AWS Region for your AWS account.
    */
  var approvalRuleTemplateNames: js.UndefOr[ApprovalRuleTemplateNameList] = js.native
  /**
    * An enumeration token that allows the operation to batch the next results of the operation.
    */
  var nextToken: js.UndefOr[NextToken] = js.native
}

object ListApprovalRuleTemplatesOutput {
  @scala.inline
  def apply(approvalRuleTemplateNames: ApprovalRuleTemplateNameList = null, nextToken: NextToken = null): ListApprovalRuleTemplatesOutput = {
    val __obj = js.Dynamic.literal()
    if (approvalRuleTemplateNames != null) __obj.updateDynamic("approvalRuleTemplateNames")(approvalRuleTemplateNames.asInstanceOf[js.Any])
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListApprovalRuleTemplatesOutput]
  }
}

