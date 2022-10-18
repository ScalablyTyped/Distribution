package typings.awsSdk.clientsCostexplorerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateAnomalyMonitorResponse extends StObject {
  
  /**
    * The unique identifier of your newly created cost anomaly detection monitor.
    */
  var MonitorArn: GenericString
}
object CreateAnomalyMonitorResponse {
  
  inline def apply(MonitorArn: GenericString): CreateAnomalyMonitorResponse = {
    val __obj = js.Dynamic.literal(MonitorArn = MonitorArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateAnomalyMonitorResponse]
  }
  
  extension [Self <: CreateAnomalyMonitorResponse](x: Self) {
    
    inline def setMonitorArn(value: GenericString): Self = StObject.set(x, "MonitorArn", value.asInstanceOf[js.Any])
  }
}
