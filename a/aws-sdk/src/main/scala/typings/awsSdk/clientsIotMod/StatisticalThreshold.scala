package typings.awsSdk.clientsIotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StatisticalThreshold extends StObject {
  
  /**
    * The percentile that resolves to a threshold value by which compliance with a behavior is determined. Metrics are collected over the specified period (durationSeconds) from all reporting devices in your account and statistical ranks are calculated. Then, the measurements from a device are collected over the same period. If the accumulated measurements from the device fall above or below (comparisonOperator) the value associated with the percentile specified, then the device is considered to be in compliance with the behavior, otherwise a violation occurs.
    */
  var statistic: js.UndefOr[EvaluationStatistic] = js.undefined
}
object StatisticalThreshold {
  
  inline def apply(): StatisticalThreshold = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StatisticalThreshold]
  }
  
  extension [Self <: StatisticalThreshold](x: Self) {
    
    inline def setStatistic(value: EvaluationStatistic): Self = StObject.set(x, "statistic", value.asInstanceOf[js.Any])
    
    inline def setStatisticUndefined: Self = StObject.set(x, "statistic", js.undefined)
  }
}
