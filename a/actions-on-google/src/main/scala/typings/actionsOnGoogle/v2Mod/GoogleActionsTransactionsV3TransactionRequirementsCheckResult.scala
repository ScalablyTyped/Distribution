package typings.actionsOnGoogle.v2Mod

import typings.actionsOnGoogle.requirementsMod.TransactionRequirementsArgument
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleActionsTransactionsV3TransactionRequirementsCheckResult extends TransactionRequirementsArgument {
  
  /**
    * Result type for transaction requirements check.
    */
  var resultType: js.UndefOr[GoogleActionsTransactionsV3TransactionRequirementsCheckResultResultType] = js.native
}
object GoogleActionsTransactionsV3TransactionRequirementsCheckResult {
  
  @scala.inline
  def apply(): GoogleActionsTransactionsV3TransactionRequirementsCheckResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleActionsTransactionsV3TransactionRequirementsCheckResult]
  }
  
  @scala.inline
  implicit class GoogleActionsTransactionsV3TransactionRequirementsCheckResultOps[Self <: GoogleActionsTransactionsV3TransactionRequirementsCheckResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setResultType(value: GoogleActionsTransactionsV3TransactionRequirementsCheckResultResultType): Self = this.set("resultType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResultType: Self = this.set("resultType", js.undefined)
  }
}
