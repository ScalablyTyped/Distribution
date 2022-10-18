package typings.actionsOnGoogle.distServiceActionssdkApiV2Mod

import typings.actionsOnGoogle.distServiceActionssdkConversationHelperTransactionRequirementsMod.TransactionRequirementsArgument
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleActionsV2TransactionRequirementsCheckResult
  extends StObject
     with TransactionRequirementsArgument {
  
  /**
    * Result of the operation.
    */
  var resultType: js.UndefOr[GoogleActionsV2TransactionRequirementsCheckResultResultType] = js.undefined
}
object GoogleActionsV2TransactionRequirementsCheckResult {
  
  inline def apply(): GoogleActionsV2TransactionRequirementsCheckResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleActionsV2TransactionRequirementsCheckResult]
  }
  
  extension [Self <: GoogleActionsV2TransactionRequirementsCheckResult](x: Self) {
    
    inline def setResultType(value: GoogleActionsV2TransactionRequirementsCheckResultResultType): Self = StObject.set(x, "resultType", value.asInstanceOf[js.Any])
    
    inline def setResultTypeUndefined: Self = StObject.set(x, "resultType", js.undefined)
  }
}
