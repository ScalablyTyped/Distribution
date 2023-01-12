package typings.awsSdk.clientsKafkaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OpenMonitoring extends StObject {
  
  /**
    * 
    Prometheus settings.
    
    */
  var Prometheus: typings.awsSdk.clientsKafkaMod.Prometheus
}
object OpenMonitoring {
  
  inline def apply(Prometheus: Prometheus): OpenMonitoring = {
    val __obj = js.Dynamic.literal(Prometheus = Prometheus.asInstanceOf[js.Any])
    __obj.asInstanceOf[OpenMonitoring]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OpenMonitoring] (val x: Self) extends AnyVal {
    
    inline def setPrometheus(value: Prometheus): Self = StObject.set(x, "Prometheus", value.asInstanceOf[js.Any])
  }
}
