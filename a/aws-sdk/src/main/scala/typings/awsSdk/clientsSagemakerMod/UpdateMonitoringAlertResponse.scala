package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateMonitoringAlertResponse extends StObject {
  
  /**
    * The name of a monitoring alert.
    */
  var MonitoringAlertName: js.UndefOr[typings.awsSdk.clientsSagemakerMod.MonitoringAlertName] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the monitoring schedule.
    */
  var MonitoringScheduleArn: typings.awsSdk.clientsSagemakerMod.MonitoringScheduleArn
}
object UpdateMonitoringAlertResponse {
  
  inline def apply(MonitoringScheduleArn: MonitoringScheduleArn): UpdateMonitoringAlertResponse = {
    val __obj = js.Dynamic.literal(MonitoringScheduleArn = MonitoringScheduleArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateMonitoringAlertResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateMonitoringAlertResponse] (val x: Self) extends AnyVal {
    
    inline def setMonitoringAlertName(value: MonitoringAlertName): Self = StObject.set(x, "MonitoringAlertName", value.asInstanceOf[js.Any])
    
    inline def setMonitoringAlertNameUndefined: Self = StObject.set(x, "MonitoringAlertName", js.undefined)
    
    inline def setMonitoringScheduleArn(value: MonitoringScheduleArn): Self = StObject.set(x, "MonitoringScheduleArn", value.asInstanceOf[js.Any])
  }
}
