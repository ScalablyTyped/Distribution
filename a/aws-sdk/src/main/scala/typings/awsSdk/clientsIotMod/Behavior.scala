package typings.awsSdk.clientsIotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Behavior extends StObject {
  
  /**
    * The criteria that determine if a device is behaving normally in regard to the metric.
    */
  var criteria: js.UndefOr[BehaviorCriteria] = js.undefined
  
  /**
    * What is measured by the behavior.
    */
  var metric: js.UndefOr[BehaviorMetric] = js.undefined
  
  /**
    * The dimension for a metric in your behavior. For example, using a TOPIC_FILTER dimension, you can narrow down the scope of the metric to only MQTT topics where the name matches the pattern specified in the dimension. This can't be used with custom metrics.
    */
  var metricDimension: js.UndefOr[MetricDimension] = js.undefined
  
  /**
    * The name you've given to the behavior.
    */
  var name: BehaviorName
  
  /**
    *  Suppresses alerts. 
    */
  var suppressAlerts: js.UndefOr[SuppressAlerts] = js.undefined
}
object Behavior {
  
  inline def apply(name: BehaviorName): Behavior = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Behavior]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Behavior] (val x: Self) extends AnyVal {
    
    inline def setCriteria(value: BehaviorCriteria): Self = StObject.set(x, "criteria", value.asInstanceOf[js.Any])
    
    inline def setCriteriaUndefined: Self = StObject.set(x, "criteria", js.undefined)
    
    inline def setMetric(value: BehaviorMetric): Self = StObject.set(x, "metric", value.asInstanceOf[js.Any])
    
    inline def setMetricDimension(value: MetricDimension): Self = StObject.set(x, "metricDimension", value.asInstanceOf[js.Any])
    
    inline def setMetricDimensionUndefined: Self = StObject.set(x, "metricDimension", js.undefined)
    
    inline def setMetricUndefined: Self = StObject.set(x, "metric", js.undefined)
    
    inline def setName(value: BehaviorName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setSuppressAlerts(value: SuppressAlerts): Self = StObject.set(x, "suppressAlerts", value.asInstanceOf[js.Any])
    
    inline def setSuppressAlertsUndefined: Self = StObject.set(x, "suppressAlerts", js.undefined)
  }
}
