package typings.awsDashSdk.clientsCodecommitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchAssociateApprovalRuleTemplateWithRepositoriesError extends js.Object {
  /**
    * An error code that specifies whether the repository name was not valid or not found.
    */
  var errorCode: js.UndefOr[ErrorCode] = js.native
  /**
    * An error message that provides details about why the repository name was not found or not valid.
    */
  var errorMessage: js.UndefOr[ErrorMessage] = js.native
  /**
    * The name of the repository where the association was not made.
    */
  var repositoryName: js.UndefOr[RepositoryName] = js.native
}

object BatchAssociateApprovalRuleTemplateWithRepositoriesError {
  @scala.inline
  def apply(
    errorCode: ErrorCode = null,
    errorMessage: ErrorMessage = null,
    repositoryName: RepositoryName = null
  ): BatchAssociateApprovalRuleTemplateWithRepositoriesError = {
    val __obj = js.Dynamic.literal()
    if (errorCode != null) __obj.updateDynamic("errorCode")(errorCode.asInstanceOf[js.Any])
    if (errorMessage != null) __obj.updateDynamic("errorMessage")(errorMessage.asInstanceOf[js.Any])
    if (repositoryName != null) __obj.updateDynamic("repositoryName")(repositoryName.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchAssociateApprovalRuleTemplateWithRepositoriesError]
  }
}

