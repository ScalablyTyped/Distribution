package typings.awsSdk.clientsCostexplorerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateAnomalyMonitorResponse extends StObject {
  
  /**
    * A cost anomaly monitor ARN. 
    */
  var MonitorArn: GenericString
}
object UpdateAnomalyMonitorResponse {
  
  inline def apply(MonitorArn: GenericString): UpdateAnomalyMonitorResponse = {
    val __obj = js.Dynamic.literal(MonitorArn = MonitorArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateAnomalyMonitorResponse]
  }
  
  extension [Self <: UpdateAnomalyMonitorResponse](x: Self) {
    
    inline def setMonitorArn(value: GenericString): Self = StObject.set(x, "MonitorArn", value.asInstanceOf[js.Any])
  }
}
