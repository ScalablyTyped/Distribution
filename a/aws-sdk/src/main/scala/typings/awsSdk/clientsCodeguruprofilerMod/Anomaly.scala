package typings.awsSdk.clientsCodeguruprofilerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Anomaly extends StObject {
  
  /**
    *  A list of the instances of the detected anomalies during the requested period. 
    */
  var instances: AnomalyInstances
  
  /**
    *  Details about the metric that the analysis used when it detected the anomaly. The metric includes the name of the frame that was analyzed with the type and thread states used to derive the metric value for that frame. 
    */
  var metric: Metric
  
  /**
    * The reason for which metric was flagged as anomalous.
    */
  var reason: String
}
object Anomaly {
  
  inline def apply(instances: AnomalyInstances, metric: Metric, reason: String): Anomaly = {
    val __obj = js.Dynamic.literal(instances = instances.asInstanceOf[js.Any], metric = metric.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anomaly]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Anomaly] (val x: Self) extends AnyVal {
    
    inline def setInstances(value: AnomalyInstances): Self = StObject.set(x, "instances", value.asInstanceOf[js.Any])
    
    inline def setInstancesVarargs(value: AnomalyInstance*): Self = StObject.set(x, "instances", js.Array(value*))
    
    inline def setMetric(value: Metric): Self = StObject.set(x, "metric", value.asInstanceOf[js.Any])
    
    inline def setReason(value: String): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
  }
}
