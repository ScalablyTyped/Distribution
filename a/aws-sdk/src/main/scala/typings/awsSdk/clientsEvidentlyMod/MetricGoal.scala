package typings.awsSdk.clientsEvidentlyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MetricGoal extends StObject {
  
  /**
    *  INCREASE means that a variation with a higher number for this metric is performing better.  DECREASE means that a variation with a lower number for this metric is performing better.
    */
  var desiredChange: js.UndefOr[ChangeDirectionEnum] = js.undefined
  
  /**
    * A structure that contains details about the metric.
    */
  var metricDefinition: MetricDefinition
}
object MetricGoal {
  
  inline def apply(metricDefinition: MetricDefinition): MetricGoal = {
    val __obj = js.Dynamic.literal(metricDefinition = metricDefinition.asInstanceOf[js.Any])
    __obj.asInstanceOf[MetricGoal]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MetricGoal] (val x: Self) extends AnyVal {
    
    inline def setDesiredChange(value: ChangeDirectionEnum): Self = StObject.set(x, "desiredChange", value.asInstanceOf[js.Any])
    
    inline def setDesiredChangeUndefined: Self = StObject.set(x, "desiredChange", js.undefined)
    
    inline def setMetricDefinition(value: MetricDefinition): Self = StObject.set(x, "metricDefinition", value.asInstanceOf[js.Any])
  }
}
