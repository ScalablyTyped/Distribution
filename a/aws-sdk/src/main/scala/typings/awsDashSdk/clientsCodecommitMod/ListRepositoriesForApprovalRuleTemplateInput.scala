package typings.awsDashSdk.clientsCodecommitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListRepositoriesForApprovalRuleTemplateInput extends js.Object {
  /**
    * The name of the approval rule template for which you want to list repositories that are associated with that template.
    */
  var approvalRuleTemplateName: ApprovalRuleTemplateName = js.native
  /**
    * A non-zero, non-negative integer used to limit the number of returned results.
    */
  var maxResults: js.UndefOr[MaxResults] = js.native
  /**
    * An enumeration token that, when provided in a request, returns the next batch of the results.
    */
  var nextToken: js.UndefOr[NextToken] = js.native
}

object ListRepositoriesForApprovalRuleTemplateInput {
  @scala.inline
  def apply(
    approvalRuleTemplateName: ApprovalRuleTemplateName,
    maxResults: Int | Double = null,
    nextToken: NextToken = null
  ): ListRepositoriesForApprovalRuleTemplateInput = {
    val __obj = js.Dynamic.literal(approvalRuleTemplateName = approvalRuleTemplateName.asInstanceOf[js.Any])
    if (maxResults != null) __obj.updateDynamic("maxResults")(maxResults.asInstanceOf[js.Any])
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListRepositoriesForApprovalRuleTemplateInput]
  }
}

