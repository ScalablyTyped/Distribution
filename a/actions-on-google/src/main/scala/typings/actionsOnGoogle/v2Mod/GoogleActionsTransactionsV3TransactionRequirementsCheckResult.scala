package typings.actionsOnGoogle.v2Mod

import typings.actionsOnGoogle.requirementsMod.TransactionRequirementsArgument
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GoogleActionsTransactionsV3TransactionRequirementsCheckResult extends TransactionRequirementsArgument {
  /**
    * Result type for transaction requirements check.
    */
  var resultType: js.UndefOr[GoogleActionsTransactionsV3TransactionRequirementsCheckResultResultType] = js.undefined
}

object GoogleActionsTransactionsV3TransactionRequirementsCheckResult {
  @scala.inline
  def apply(resultType: GoogleActionsTransactionsV3TransactionRequirementsCheckResultResultType = null): GoogleActionsTransactionsV3TransactionRequirementsCheckResult = {
    val __obj = js.Dynamic.literal()
    if (resultType != null) __obj.updateDynamic("resultType")(resultType.asInstanceOf[js.Any])
    __obj.asInstanceOf[GoogleActionsTransactionsV3TransactionRequirementsCheckResult]
  }
}

