package typings.awsSdk.clientsIotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteCustomMetricRequest extends StObject {
  
  /**
    *  The name of the custom metric. 
    */
  var metricName: MetricName
}
object DeleteCustomMetricRequest {
  
  inline def apply(metricName: MetricName): DeleteCustomMetricRequest = {
    val __obj = js.Dynamic.literal(metricName = metricName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteCustomMetricRequest]
  }
  
  extension [Self <: DeleteCustomMetricRequest](x: Self) {
    
    inline def setMetricName(value: MetricName): Self = StObject.set(x, "metricName", value.asInstanceOf[js.Any])
  }
}
