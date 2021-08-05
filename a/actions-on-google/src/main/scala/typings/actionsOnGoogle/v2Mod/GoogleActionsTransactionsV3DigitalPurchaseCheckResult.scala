package typings.actionsOnGoogle.v2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleActionsTransactionsV3DigitalPurchaseCheckResult extends StObject {
  
  /**
    * Result type for digital purchase check result.
    */
  var resultType: js.UndefOr[GoogleActionsTransactionsV3DigitalPurchaseCheckResultResultType] = js.undefined
}
object GoogleActionsTransactionsV3DigitalPurchaseCheckResult {
  
  inline def apply(): GoogleActionsTransactionsV3DigitalPurchaseCheckResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleActionsTransactionsV3DigitalPurchaseCheckResult]
  }
  
  extension [Self <: GoogleActionsTransactionsV3DigitalPurchaseCheckResult](x: Self) {
    
    inline def setResultType(value: GoogleActionsTransactionsV3DigitalPurchaseCheckResultResultType): Self = StObject.set(x, "resultType", value.asInstanceOf[js.Any])
    
    inline def setResultTypeUndefined: Self = StObject.set(x, "resultType", js.undefined)
  }
}
