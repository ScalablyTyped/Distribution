package typings.actionsOnGoogle.v2Mod

import typings.actionsOnGoogle.requirementsMod.TransactionRequirementsArgument
import org.scalablytyped.runtime.StObject
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
  implicit class GoogleActionsTransactionsV3TransactionRequirementsCheckResultMutableBuilder[Self <: GoogleActionsTransactionsV3TransactionRequirementsCheckResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setResultType(value: GoogleActionsTransactionsV3TransactionRequirementsCheckResultResultType): Self = StObject.set(x, "resultType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResultTypeUndefined: Self = StObject.set(x, "resultType", js.undefined)
  }
}
