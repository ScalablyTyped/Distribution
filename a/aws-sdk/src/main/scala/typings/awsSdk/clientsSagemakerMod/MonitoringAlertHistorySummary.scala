package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MonitoringAlertHistorySummary extends StObject {
  
  /**
    * The current alert status of an alert.
    */
  var AlertStatus: MonitoringAlertStatus
  
  /**
    * A timestamp that indicates when the first alert transition occurred in an alert history. An alert transition can be from status InAlert to OK, or from OK to InAlert.
    */
  var CreationTime: js.Date
  
  /**
    * The name of a monitoring alert.
    */
  var MonitoringAlertName: typings.awsSdk.clientsSagemakerMod.MonitoringAlertName
  
  /**
    * The name of a monitoring schedule.
    */
  var MonitoringScheduleName: typings.awsSdk.clientsSagemakerMod.MonitoringScheduleName
}
object MonitoringAlertHistorySummary {
  
  inline def apply(
    AlertStatus: MonitoringAlertStatus,
    CreationTime: js.Date,
    MonitoringAlertName: MonitoringAlertName,
    MonitoringScheduleName: MonitoringScheduleName
  ): MonitoringAlertHistorySummary = {
    val __obj = js.Dynamic.literal(AlertStatus = AlertStatus.asInstanceOf[js.Any], CreationTime = CreationTime.asInstanceOf[js.Any], MonitoringAlertName = MonitoringAlertName.asInstanceOf[js.Any], MonitoringScheduleName = MonitoringScheduleName.asInstanceOf[js.Any])
    __obj.asInstanceOf[MonitoringAlertHistorySummary]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MonitoringAlertHistorySummary] (val x: Self) extends AnyVal {
    
    inline def setAlertStatus(value: MonitoringAlertStatus): Self = StObject.set(x, "AlertStatus", value.asInstanceOf[js.Any])
    
    inline def setCreationTime(value: js.Date): Self = StObject.set(x, "CreationTime", value.asInstanceOf[js.Any])
    
    inline def setMonitoringAlertName(value: MonitoringAlertName): Self = StObject.set(x, "MonitoringAlertName", value.asInstanceOf[js.Any])
    
    inline def setMonitoringScheduleName(value: MonitoringScheduleName): Self = StObject.set(x, "MonitoringScheduleName", value.asInstanceOf[js.Any])
  }
}
