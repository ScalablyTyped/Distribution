package typings.actionsOnGoogle.v2Mod

import typings.actionsOnGoogle.requirementsMod.TransactionRequirementsArgument
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleActionsV2TransactionRequirementsCheckResult extends TransactionRequirementsArgument {
  
  /**
    * Result of the operation.
    */
  var resultType: js.UndefOr[GoogleActionsV2TransactionRequirementsCheckResultResultType] = js.native
}
object GoogleActionsV2TransactionRequirementsCheckResult {
  
  @scala.inline
  def apply(): GoogleActionsV2TransactionRequirementsCheckResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleActionsV2TransactionRequirementsCheckResult]
  }
  
  @scala.inline
  implicit class GoogleActionsV2TransactionRequirementsCheckResultMutableBuilder[Self <: GoogleActionsV2TransactionRequirementsCheckResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setResultType(value: GoogleActionsV2TransactionRequirementsCheckResultResultType): Self = StObject.set(x, "resultType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResultTypeUndefined: Self = StObject.set(x, "resultType", js.undefined)
  }
}
