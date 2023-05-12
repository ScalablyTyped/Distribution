package typings.awsSdk.clientsInternetmonitorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateMonitorOutput extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the monitor.
    */
  var MonitorArn: typings.awsSdk.clientsInternetmonitorMod.MonitorArn
  
  /**
    * The status of a monitor.
    */
  var Status: MonitorConfigState
}
object UpdateMonitorOutput {
  
  inline def apply(MonitorArn: MonitorArn, Status: MonitorConfigState): UpdateMonitorOutput = {
    val __obj = js.Dynamic.literal(MonitorArn = MonitorArn.asInstanceOf[js.Any], Status = Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateMonitorOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateMonitorOutput] (val x: Self) extends AnyVal {
    
    inline def setMonitorArn(value: MonitorArn): Self = StObject.set(x, "MonitorArn", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: MonitorConfigState): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
  }
}
