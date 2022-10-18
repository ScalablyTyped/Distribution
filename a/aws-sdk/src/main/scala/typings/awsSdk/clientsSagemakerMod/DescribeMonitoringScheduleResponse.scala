package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeMonitoringScheduleResponse extends StObject {
  
  /**
    * The time at which the monitoring job was created.
    */
  var CreationTime: js.Date
  
  /**
    *  The name of the endpoint for the monitoring job.
    */
  var EndpointName: js.UndefOr[typings.awsSdk.clientsSagemakerMod.EndpointName] = js.undefined
  
  /**
    * A string, up to one KB in size, that contains the reason a monitoring job failed, if it failed.
    */
  var FailureReason: js.UndefOr[typings.awsSdk.clientsSagemakerMod.FailureReason] = js.undefined
  
  /**
    * The time at which the monitoring job was last modified.
    */
  var LastModifiedTime: js.Date
  
  /**
    * Describes metadata on the last execution to run, if there was one.
    */
  var LastMonitoringExecutionSummary: js.UndefOr[MonitoringExecutionSummary] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the monitoring schedule.
    */
  var MonitoringScheduleArn: typings.awsSdk.clientsSagemakerMod.MonitoringScheduleArn
  
  /**
    * The configuration object that specifies the monitoring schedule and defines the monitoring job.
    */
  var MonitoringScheduleConfig: typings.awsSdk.clientsSagemakerMod.MonitoringScheduleConfig
  
  /**
    * Name of the monitoring schedule.
    */
  var MonitoringScheduleName: typings.awsSdk.clientsSagemakerMod.MonitoringScheduleName
  
  /**
    * The status of an monitoring job.
    */
  var MonitoringScheduleStatus: ScheduleStatus
  
  /**
    * The type of the monitoring job that this schedule runs. This is one of the following values.    DATA_QUALITY - The schedule is for a data quality monitoring job.    MODEL_QUALITY - The schedule is for a model quality monitoring job.    MODEL_BIAS - The schedule is for a bias monitoring job.    MODEL_EXPLAINABILITY - The schedule is for an explainability monitoring job.  
    */
  var MonitoringType: js.UndefOr[typings.awsSdk.clientsSagemakerMod.MonitoringType] = js.undefined
}
object DescribeMonitoringScheduleResponse {
  
  inline def apply(
    CreationTime: js.Date,
    LastModifiedTime: js.Date,
    MonitoringScheduleArn: MonitoringScheduleArn,
    MonitoringScheduleConfig: MonitoringScheduleConfig,
    MonitoringScheduleName: MonitoringScheduleName,
    MonitoringScheduleStatus: ScheduleStatus
  ): DescribeMonitoringScheduleResponse = {
    val __obj = js.Dynamic.literal(CreationTime = CreationTime.asInstanceOf[js.Any], LastModifiedTime = LastModifiedTime.asInstanceOf[js.Any], MonitoringScheduleArn = MonitoringScheduleArn.asInstanceOf[js.Any], MonitoringScheduleConfig = MonitoringScheduleConfig.asInstanceOf[js.Any], MonitoringScheduleName = MonitoringScheduleName.asInstanceOf[js.Any], MonitoringScheduleStatus = MonitoringScheduleStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeMonitoringScheduleResponse]
  }
  
  extension [Self <: DescribeMonitoringScheduleResponse](x: Self) {
    
    inline def setCreationTime(value: js.Date): Self = StObject.set(x, "CreationTime", value.asInstanceOf[js.Any])
    
    inline def setEndpointName(value: EndpointName): Self = StObject.set(x, "EndpointName", value.asInstanceOf[js.Any])
    
    inline def setEndpointNameUndefined: Self = StObject.set(x, "EndpointName", js.undefined)
    
    inline def setFailureReason(value: FailureReason): Self = StObject.set(x, "FailureReason", value.asInstanceOf[js.Any])
    
    inline def setFailureReasonUndefined: Self = StObject.set(x, "FailureReason", js.undefined)
    
    inline def setLastModifiedTime(value: js.Date): Self = StObject.set(x, "LastModifiedTime", value.asInstanceOf[js.Any])
    
    inline def setLastMonitoringExecutionSummary(value: MonitoringExecutionSummary): Self = StObject.set(x, "LastMonitoringExecutionSummary", value.asInstanceOf[js.Any])
    
    inline def setLastMonitoringExecutionSummaryUndefined: Self = StObject.set(x, "LastMonitoringExecutionSummary", js.undefined)
    
    inline def setMonitoringScheduleArn(value: MonitoringScheduleArn): Self = StObject.set(x, "MonitoringScheduleArn", value.asInstanceOf[js.Any])
    
    inline def setMonitoringScheduleConfig(value: MonitoringScheduleConfig): Self = StObject.set(x, "MonitoringScheduleConfig", value.asInstanceOf[js.Any])
    
    inline def setMonitoringScheduleName(value: MonitoringScheduleName): Self = StObject.set(x, "MonitoringScheduleName", value.asInstanceOf[js.Any])
    
    inline def setMonitoringScheduleStatus(value: ScheduleStatus): Self = StObject.set(x, "MonitoringScheduleStatus", value.asInstanceOf[js.Any])
    
    inline def setMonitoringType(value: MonitoringType): Self = StObject.set(x, "MonitoringType", value.asInstanceOf[js.Any])
    
    inline def setMonitoringTypeUndefined: Self = StObject.set(x, "MonitoringType", js.undefined)
  }
}
