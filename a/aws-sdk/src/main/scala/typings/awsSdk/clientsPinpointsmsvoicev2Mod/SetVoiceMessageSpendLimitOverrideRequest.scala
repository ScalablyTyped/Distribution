package typings.awsSdk.clientsPinpointsmsvoicev2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SetVoiceMessageSpendLimitOverrideRequest extends StObject {
  
  /**
    * The new monthly limit to enforce on voice messages.
    */
  var MonthlyLimit: typings.awsSdk.clientsPinpointsmsvoicev2Mod.MonthlyLimit
}
object SetVoiceMessageSpendLimitOverrideRequest {
  
  inline def apply(MonthlyLimit: MonthlyLimit): SetVoiceMessageSpendLimitOverrideRequest = {
    val __obj = js.Dynamic.literal(MonthlyLimit = MonthlyLimit.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetVoiceMessageSpendLimitOverrideRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SetVoiceMessageSpendLimitOverrideRequest] (val x: Self) extends AnyVal {
    
    inline def setMonthlyLimit(value: MonthlyLimit): Self = StObject.set(x, "MonthlyLimit", value.asInstanceOf[js.Any])
  }
}
