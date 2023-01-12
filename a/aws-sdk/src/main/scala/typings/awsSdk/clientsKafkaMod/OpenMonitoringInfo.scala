package typings.awsSdk.clientsKafkaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OpenMonitoringInfo extends StObject {
  
  /**
    * 
    Prometheus settings.
    
    */
  var Prometheus: PrometheusInfo
}
object OpenMonitoringInfo {
  
  inline def apply(Prometheus: PrometheusInfo): OpenMonitoringInfo = {
    val __obj = js.Dynamic.literal(Prometheus = Prometheus.asInstanceOf[js.Any])
    __obj.asInstanceOf[OpenMonitoringInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OpenMonitoringInfo] (val x: Self) extends AnyVal {
    
    inline def setPrometheus(value: PrometheusInfo): Self = StObject.set(x, "Prometheus", value.asInstanceOf[js.Any])
  }
}
