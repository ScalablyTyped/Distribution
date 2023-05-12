package typings.awsSdk.clientsInternetmonitorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Monitor extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the monitor.
    */
  var MonitorArn: typings.awsSdk.clientsInternetmonitorMod.MonitorArn
  
  /**
    * The name of the monitor.
    */
  var MonitorName: ResourceName
  
  /**
    * The health of data processing for the monitor.
    */
  var ProcessingStatus: js.UndefOr[MonitorProcessingStatusCode] = js.undefined
  
  /**
    * The status of a monitor.
    */
  var Status: MonitorConfigState
}
object Monitor {
  
  inline def apply(MonitorArn: MonitorArn, MonitorName: ResourceName, Status: MonitorConfigState): Monitor = {
    val __obj = js.Dynamic.literal(MonitorArn = MonitorArn.asInstanceOf[js.Any], MonitorName = MonitorName.asInstanceOf[js.Any], Status = Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[Monitor]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Monitor] (val x: Self) extends AnyVal {
    
    inline def setMonitorArn(value: MonitorArn): Self = StObject.set(x, "MonitorArn", value.asInstanceOf[js.Any])
    
    inline def setMonitorName(value: ResourceName): Self = StObject.set(x, "MonitorName", value.asInstanceOf[js.Any])
    
    inline def setProcessingStatus(value: MonitorProcessingStatusCode): Self = StObject.set(x, "ProcessingStatus", value.asInstanceOf[js.Any])
    
    inline def setProcessingStatusUndefined: Self = StObject.set(x, "ProcessingStatus", js.undefined)
    
    inline def setStatus(value: MonitorConfigState): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
  }
}
