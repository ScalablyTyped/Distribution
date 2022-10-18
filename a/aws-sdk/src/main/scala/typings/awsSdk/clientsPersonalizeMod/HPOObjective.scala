package typings.awsSdk.clientsPersonalizeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HPOObjective extends StObject {
  
  /**
    * The name of the metric.
    */
  var metricName: js.UndefOr[MetricName] = js.undefined
  
  /**
    * A regular expression for finding the metric in the training job logs.
    */
  var metricRegex: js.UndefOr[MetricRegex] = js.undefined
  
  /**
    * The type of the metric. Valid values are Maximize and Minimize.
    */
  var `type`: js.UndefOr[HPOObjectiveType] = js.undefined
}
object HPOObjective {
  
  inline def apply(): HPOObjective = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HPOObjective]
  }
  
  extension [Self <: HPOObjective](x: Self) {
    
    inline def setMetricName(value: MetricName): Self = StObject.set(x, "metricName", value.asInstanceOf[js.Any])
    
    inline def setMetricNameUndefined: Self = StObject.set(x, "metricName", js.undefined)
    
    inline def setMetricRegex(value: MetricRegex): Self = StObject.set(x, "metricRegex", value.asInstanceOf[js.Any])
    
    inline def setMetricRegexUndefined: Self = StObject.set(x, "metricRegex", js.undefined)
    
    inline def setType(value: HPOObjectiveType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
