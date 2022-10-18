package typings.awsSdk.clientsAutoscalingMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProcessType extends StObject {
  
  /**
    * One of the following processes:    Launch     Terminate     AddToLoadBalancer     AlarmNotification     AZRebalance     HealthCheck     InstanceRefresh     ReplaceUnhealthy     ScheduledActions   
    */
  var ProcessName: XmlStringMaxLen255
}
object ProcessType {
  
  inline def apply(ProcessName: XmlStringMaxLen255): ProcessType = {
    val __obj = js.Dynamic.literal(ProcessName = ProcessName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProcessType]
  }
  
  extension [Self <: ProcessType](x: Self) {
    
    inline def setProcessName(value: XmlStringMaxLen255): Self = StObject.set(x, "ProcessName", value.asInstanceOf[js.Any])
  }
}
