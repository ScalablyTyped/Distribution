package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StopMonitoringScheduleRequest extends StObject {
  
  /**
    * The name of the schedule to stop.
    */
  var MonitoringScheduleName: typings.awsSdk.clientsSagemakerMod.MonitoringScheduleName
}
object StopMonitoringScheduleRequest {
  
  inline def apply(MonitoringScheduleName: MonitoringScheduleName): StopMonitoringScheduleRequest = {
    val __obj = js.Dynamic.literal(MonitoringScheduleName = MonitoringScheduleName.asInstanceOf[js.Any])
    __obj.asInstanceOf[StopMonitoringScheduleRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StopMonitoringScheduleRequest] (val x: Self) extends AnyVal {
    
    inline def setMonitoringScheduleName(value: MonitoringScheduleName): Self = StObject.set(x, "MonitoringScheduleName", value.asInstanceOf[js.Any])
  }
}
