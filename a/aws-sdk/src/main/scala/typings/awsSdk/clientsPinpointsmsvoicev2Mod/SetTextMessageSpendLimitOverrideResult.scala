package typings.awsSdk.clientsPinpointsmsvoicev2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SetTextMessageSpendLimitOverrideResult extends StObject {
  
  /**
    * The current monthly limit to enforce on sending text messages.
    */
  var MonthlyLimit: js.UndefOr[typings.awsSdk.clientsPinpointsmsvoicev2Mod.MonthlyLimit] = js.undefined
}
object SetTextMessageSpendLimitOverrideResult {
  
  inline def apply(): SetTextMessageSpendLimitOverrideResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SetTextMessageSpendLimitOverrideResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SetTextMessageSpendLimitOverrideResult] (val x: Self) extends AnyVal {
    
    inline def setMonthlyLimit(value: MonthlyLimit): Self = StObject.set(x, "MonthlyLimit", value.asInstanceOf[js.Any])
    
    inline def setMonthlyLimitUndefined: Self = StObject.set(x, "MonthlyLimit", js.undefined)
  }
}
