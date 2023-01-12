package typings.actionsOnGoogle.distServiceActionssdkApiV2Mod

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
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GoogleActionsTransactionsV3DigitalPurchaseCheckResult] (val x: Self) extends AnyVal {
    
    inline def setResultType(value: GoogleActionsTransactionsV3DigitalPurchaseCheckResultResultType): Self = StObject.set(x, "resultType", value.asInstanceOf[js.Any])
    
    inline def setResultTypeUndefined: Self = StObject.set(x, "resultType", js.undefined)
  }
}
