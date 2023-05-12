package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModelDashboardMonitoringSchedule extends StObject {
  
  /**
    * A timestamp that indicates when the monitoring schedule was created.
    */
  var CreationTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The endpoint which is monitored.
    */
  var EndpointName: js.UndefOr[typings.awsSdk.clientsSagemakerMod.EndpointName] = js.undefined
  
  /**
    * If a monitoring job failed, provides the reason.
    */
  var FailureReason: js.UndefOr[typings.awsSdk.clientsSagemakerMod.FailureReason] = js.undefined
  
  /**
    * A timestamp that indicates when the monitoring schedule was last updated.
    */
  var LastModifiedTime: js.UndefOr[js.Date] = js.undefined
  
  var LastMonitoringExecutionSummary: js.UndefOr[MonitoringExecutionSummary] = js.undefined
  
  /**
    * A JSON array where each element is a summary for a monitoring alert.
    */
  var MonitoringAlertSummaries: js.UndefOr[MonitoringAlertSummaryList] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of a monitoring schedule.
    */
  var MonitoringScheduleArn: js.UndefOr[typings.awsSdk.clientsSagemakerMod.MonitoringScheduleArn] = js.undefined
  
  var MonitoringScheduleConfig: js.UndefOr[typings.awsSdk.clientsSagemakerMod.MonitoringScheduleConfig] = js.undefined
  
  /**
    * The name of a monitoring schedule.
    */
  var MonitoringScheduleName: js.UndefOr[typings.awsSdk.clientsSagemakerMod.MonitoringScheduleName] = js.undefined
  
  /**
    * The status of the monitoring schedule.
    */
  var MonitoringScheduleStatus: js.UndefOr[ScheduleStatus] = js.undefined
  
  /**
    * The monitor type of a model monitor.
    */
  var MonitoringType: js.UndefOr[typings.awsSdk.clientsSagemakerMod.MonitoringType] = js.undefined
}
object ModelDashboardMonitoringSchedule {
  
  inline def apply(): ModelDashboardMonitoringSchedule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModelDashboardMonitoringSchedule]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ModelDashboardMonitoringSchedule] (val x: Self) extends AnyVal {
    
    inline def setCreationTime(value: js.Date): Self = StObject.set(x, "CreationTime", value.asInstanceOf[js.Any])
    
    inline def setCreationTimeUndefined: Self = StObject.set(x, "CreationTime", js.undefined)
    
    inline def setEndpointName(value: EndpointName): Self = StObject.set(x, "EndpointName", value.asInstanceOf[js.Any])
    
    inline def setEndpointNameUndefined: Self = StObject.set(x, "EndpointName", js.undefined)
    
    inline def setFailureReason(value: FailureReason): Self = StObject.set(x, "FailureReason", value.asInstanceOf[js.Any])
    
    inline def setFailureReasonUndefined: Self = StObject.set(x, "FailureReason", js.undefined)
    
    inline def setLastModifiedTime(value: js.Date): Self = StObject.set(x, "LastModifiedTime", value.asInstanceOf[js.Any])
    
    inline def setLastModifiedTimeUndefined: Self = StObject.set(x, "LastModifiedTime", js.undefined)
    
    inline def setLastMonitoringExecutionSummary(value: MonitoringExecutionSummary): Self = StObject.set(x, "LastMonitoringExecutionSummary", value.asInstanceOf[js.Any])
    
    inline def setLastMonitoringExecutionSummaryUndefined: Self = StObject.set(x, "LastMonitoringExecutionSummary", js.undefined)
    
    inline def setMonitoringAlertSummaries(value: MonitoringAlertSummaryList): Self = StObject.set(x, "MonitoringAlertSummaries", value.asInstanceOf[js.Any])
    
    inline def setMonitoringAlertSummariesUndefined: Self = StObject.set(x, "MonitoringAlertSummaries", js.undefined)
    
    inline def setMonitoringAlertSummariesVarargs(value: MonitoringAlertSummary*): Self = StObject.set(x, "MonitoringAlertSummaries", js.Array(value*))
    
    inline def setMonitoringScheduleArn(value: MonitoringScheduleArn): Self = StObject.set(x, "MonitoringScheduleArn", value.asInstanceOf[js.Any])
    
    inline def setMonitoringScheduleArnUndefined: Self = StObject.set(x, "MonitoringScheduleArn", js.undefined)
    
    inline def setMonitoringScheduleConfig(value: MonitoringScheduleConfig): Self = StObject.set(x, "MonitoringScheduleConfig", value.asInstanceOf[js.Any])
    
    inline def setMonitoringScheduleConfigUndefined: Self = StObject.set(x, "MonitoringScheduleConfig", js.undefined)
    
    inline def setMonitoringScheduleName(value: MonitoringScheduleName): Self = StObject.set(x, "MonitoringScheduleName", value.asInstanceOf[js.Any])
    
    inline def setMonitoringScheduleNameUndefined: Self = StObject.set(x, "MonitoringScheduleName", js.undefined)
    
    inline def setMonitoringScheduleStatus(value: ScheduleStatus): Self = StObject.set(x, "MonitoringScheduleStatus", value.asInstanceOf[js.Any])
    
    inline def setMonitoringScheduleStatusUndefined: Self = StObject.set(x, "MonitoringScheduleStatus", js.undefined)
    
    inline def setMonitoringType(value: MonitoringType): Self = StObject.set(x, "MonitoringType", value.asInstanceOf[js.Any])
    
    inline def setMonitoringTypeUndefined: Self = StObject.set(x, "MonitoringType", js.undefined)
  }
}
