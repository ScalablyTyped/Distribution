package typings.awsSdk.clientsPinpointsmsvoicev2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteVoiceMessageSpendLimitOverrideResult extends StObject {
  
  /**
    * The current monthly limit, in US dollars.
    */
  var MonthlyLimit: js.UndefOr[typings.awsSdk.clientsPinpointsmsvoicev2Mod.MonthlyLimit] = js.undefined
}
object DeleteVoiceMessageSpendLimitOverrideResult {
  
  inline def apply(): DeleteVoiceMessageSpendLimitOverrideResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteVoiceMessageSpendLimitOverrideResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteVoiceMessageSpendLimitOverrideResult] (val x: Self) extends AnyVal {
    
    inline def setMonthlyLimit(value: MonthlyLimit): Self = StObject.set(x, "MonthlyLimit", value.asInstanceOf[js.Any])
    
    inline def setMonthlyLimitUndefined: Self = StObject.set(x, "MonthlyLimit", js.undefined)
  }
}
