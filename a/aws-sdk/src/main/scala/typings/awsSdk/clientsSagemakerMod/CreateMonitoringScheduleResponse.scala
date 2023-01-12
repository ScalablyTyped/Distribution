package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateMonitoringScheduleResponse extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the monitoring schedule.
    */
  var MonitoringScheduleArn: typings.awsSdk.clientsSagemakerMod.MonitoringScheduleArn
}
object CreateMonitoringScheduleResponse {
  
  inline def apply(MonitoringScheduleArn: MonitoringScheduleArn): CreateMonitoringScheduleResponse = {
    val __obj = js.Dynamic.literal(MonitoringScheduleArn = MonitoringScheduleArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateMonitoringScheduleResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateMonitoringScheduleResponse] (val x: Self) extends AnyVal {
    
    inline def setMonitoringScheduleArn(value: MonitoringScheduleArn): Self = StObject.set(x, "MonitoringScheduleArn", value.asInstanceOf[js.Any])
  }
}
