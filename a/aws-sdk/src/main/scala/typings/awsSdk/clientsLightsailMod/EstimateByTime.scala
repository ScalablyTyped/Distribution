package typings.awsSdk.clientsLightsailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EstimateByTime extends StObject {
  
  /**
    * The currency of the estimate in USD.
    */
  var currency: js.UndefOr[Currency] = js.undefined
  
  /**
    * The unit of measurement that's used for the cost estimate.
    */
  var pricingUnit: js.UndefOr[PricingUnit] = js.undefined
  
  /**
    * The period of time, in days, that an estimate covers. The period has a start date and an end date. The start date must come before the end date.
    */
  var timePeriod: js.UndefOr[TimePeriod] = js.undefined
  
  /**
    * The number of pricing units used to calculate the total number of hours. For example, 1 unit equals 1 hour.
    */
  var unit: js.UndefOr[double] = js.undefined
  
  /**
    * The amount of cost or usage that's measured for the cost estimate.
    */
  var usageCost: js.UndefOr[double] = js.undefined
}
object EstimateByTime {
  
  inline def apply(): EstimateByTime = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EstimateByTime]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EstimateByTime] (val x: Self) extends AnyVal {
    
    inline def setCurrency(value: Currency): Self = StObject.set(x, "currency", value.asInstanceOf[js.Any])
    
    inline def setCurrencyUndefined: Self = StObject.set(x, "currency", js.undefined)
    
    inline def setPricingUnit(value: PricingUnit): Self = StObject.set(x, "pricingUnit", value.asInstanceOf[js.Any])
    
    inline def setPricingUnitUndefined: Self = StObject.set(x, "pricingUnit", js.undefined)
    
    inline def setTimePeriod(value: TimePeriod): Self = StObject.set(x, "timePeriod", value.asInstanceOf[js.Any])
    
    inline def setTimePeriodUndefined: Self = StObject.set(x, "timePeriod", js.undefined)
    
    inline def setUnit(value: double): Self = StObject.set(x, "unit", value.asInstanceOf[js.Any])
    
    inline def setUnitUndefined: Self = StObject.set(x, "unit", js.undefined)
    
    inline def setUsageCost(value: double): Self = StObject.set(x, "usageCost", value.asInstanceOf[js.Any])
    
    inline def setUsageCostUndefined: Self = StObject.set(x, "usageCost", js.undefined)
  }
}
