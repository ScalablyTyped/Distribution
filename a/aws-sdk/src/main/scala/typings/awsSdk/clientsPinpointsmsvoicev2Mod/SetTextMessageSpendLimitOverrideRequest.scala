package typings.awsSdk.clientsPinpointsmsvoicev2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SetTextMessageSpendLimitOverrideRequest extends StObject {
  
  /**
    * The new monthly limit to enforce on text messages.
    */
  var MonthlyLimit: typings.awsSdk.clientsPinpointsmsvoicev2Mod.MonthlyLimit
}
object SetTextMessageSpendLimitOverrideRequest {
  
  inline def apply(MonthlyLimit: MonthlyLimit): SetTextMessageSpendLimitOverrideRequest = {
    val __obj = js.Dynamic.literal(MonthlyLimit = MonthlyLimit.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetTextMessageSpendLimitOverrideRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SetTextMessageSpendLimitOverrideRequest] (val x: Self) extends AnyVal {
    
    inline def setMonthlyLimit(value: MonthlyLimit): Self = StObject.set(x, "MonthlyLimit", value.asInstanceOf[js.Any])
  }
}
