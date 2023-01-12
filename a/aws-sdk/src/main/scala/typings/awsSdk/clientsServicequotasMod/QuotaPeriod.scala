package typings.awsSdk.clientsServicequotasMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QuotaPeriod extends StObject {
  
  /**
    * The time unit.
    */
  var PeriodUnit: js.UndefOr[typings.awsSdk.clientsServicequotasMod.PeriodUnit] = js.undefined
  
  /**
    * The value.
    */
  var PeriodValue: js.UndefOr[typings.awsSdk.clientsServicequotasMod.PeriodValue] = js.undefined
}
object QuotaPeriod {
  
  inline def apply(): QuotaPeriod = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QuotaPeriod]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: QuotaPeriod] (val x: Self) extends AnyVal {
    
    inline def setPeriodUnit(value: PeriodUnit): Self = StObject.set(x, "PeriodUnit", value.asInstanceOf[js.Any])
    
    inline def setPeriodUnitUndefined: Self = StObject.set(x, "PeriodUnit", js.undefined)
    
    inline def setPeriodValue(value: PeriodValue): Self = StObject.set(x, "PeriodValue", value.asInstanceOf[js.Any])
    
    inline def setPeriodValueUndefined: Self = StObject.set(x, "PeriodValue", js.undefined)
  }
}
