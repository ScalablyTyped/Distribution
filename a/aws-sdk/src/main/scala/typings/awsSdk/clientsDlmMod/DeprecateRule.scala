package typings.awsSdk.clientsDlmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeprecateRule extends StObject {
  
  /**
    * If the schedule has a count-based retention rule, this parameter specifies the number of oldest AMIs to deprecate. The count must be less than or equal to the schedule's retention count, and it can't be greater than 1000.
    */
  var Count: js.UndefOr[typings.awsSdk.clientsDlmMod.Count] = js.undefined
  
  /**
    * If the schedule has an age-based retention rule, this parameter specifies the period after which to deprecate AMIs created by the schedule. The period must be less than or equal to the schedule's retention period, and it can't be greater than 10 years. This is equivalent to 120 months, 520 weeks, or 3650 days.
    */
  var Interval: js.UndefOr[typings.awsSdk.clientsDlmMod.Interval] = js.undefined
  
  /**
    * The unit of time in which to measure the Interval.
    */
  var IntervalUnit: js.UndefOr[RetentionIntervalUnitValues] = js.undefined
}
object DeprecateRule {
  
  inline def apply(): DeprecateRule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeprecateRule]
  }
  
  extension [Self <: DeprecateRule](x: Self) {
    
    inline def setCount(value: Count): Self = StObject.set(x, "Count", value.asInstanceOf[js.Any])
    
    inline def setCountUndefined: Self = StObject.set(x, "Count", js.undefined)
    
    inline def setInterval(value: Interval): Self = StObject.set(x, "Interval", value.asInstanceOf[js.Any])
    
    inline def setIntervalUndefined: Self = StObject.set(x, "Interval", js.undefined)
    
    inline def setIntervalUnit(value: RetentionIntervalUnitValues): Self = StObject.set(x, "IntervalUnit", value.asInstanceOf[js.Any])
    
    inline def setIntervalUnitUndefined: Self = StObject.set(x, "IntervalUnit", js.undefined)
  }
}
