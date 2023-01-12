package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MonitoringExecutionSummary extends StObject {
  
  /**
    * The time at which the monitoring job was created.
    */
  var CreationTime: js.Date
  
  /**
    * The name of the endpoint used to run the monitoring job.
    */
  var EndpointName: js.UndefOr[typings.awsSdk.clientsSagemakerMod.EndpointName] = js.undefined
  
  /**
    * Contains the reason a monitoring job failed, if it failed.
    */
  var FailureReason: js.UndefOr[typings.awsSdk.clientsSagemakerMod.FailureReason] = js.undefined
  
  /**
    * A timestamp that indicates the last time the monitoring job was modified.
    */
  var LastModifiedTime: js.Date
  
  /**
    * The status of the monitoring job.
    */
  var MonitoringExecutionStatus: ExecutionStatus
  
  /**
    * The name of the monitoring job.
    */
  var MonitoringJobDefinitionName: js.UndefOr[typings.awsSdk.clientsSagemakerMod.MonitoringJobDefinitionName] = js.undefined
  
  /**
    * The name of the monitoring schedule.
    */
  var MonitoringScheduleName: typings.awsSdk.clientsSagemakerMod.MonitoringScheduleName
  
  /**
    * The type of the monitoring job.
    */
  var MonitoringType: js.UndefOr[typings.awsSdk.clientsSagemakerMod.MonitoringType] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the monitoring job.
    */
  var ProcessingJobArn: js.UndefOr[typings.awsSdk.clientsSagemakerMod.ProcessingJobArn] = js.undefined
  
  /**
    * The time the monitoring job was scheduled.
    */
  var ScheduledTime: js.Date
}
object MonitoringExecutionSummary {
  
  inline def apply(
    CreationTime: js.Date,
    LastModifiedTime: js.Date,
    MonitoringExecutionStatus: ExecutionStatus,
    MonitoringScheduleName: MonitoringScheduleName,
    ScheduledTime: js.Date
  ): MonitoringExecutionSummary = {
    val __obj = js.Dynamic.literal(CreationTime = CreationTime.asInstanceOf[js.Any], LastModifiedTime = LastModifiedTime.asInstanceOf[js.Any], MonitoringExecutionStatus = MonitoringExecutionStatus.asInstanceOf[js.Any], MonitoringScheduleName = MonitoringScheduleName.asInstanceOf[js.Any], ScheduledTime = ScheduledTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[MonitoringExecutionSummary]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MonitoringExecutionSummary] (val x: Self) extends AnyVal {
    
    inline def setCreationTime(value: js.Date): Self = StObject.set(x, "CreationTime", value.asInstanceOf[js.Any])
    
    inline def setEndpointName(value: EndpointName): Self = StObject.set(x, "EndpointName", value.asInstanceOf[js.Any])
    
    inline def setEndpointNameUndefined: Self = StObject.set(x, "EndpointName", js.undefined)
    
    inline def setFailureReason(value: FailureReason): Self = StObject.set(x, "FailureReason", value.asInstanceOf[js.Any])
    
    inline def setFailureReasonUndefined: Self = StObject.set(x, "FailureReason", js.undefined)
    
    inline def setLastModifiedTime(value: js.Date): Self = StObject.set(x, "LastModifiedTime", value.asInstanceOf[js.Any])
    
    inline def setMonitoringExecutionStatus(value: ExecutionStatus): Self = StObject.set(x, "MonitoringExecutionStatus", value.asInstanceOf[js.Any])
    
    inline def setMonitoringJobDefinitionName(value: MonitoringJobDefinitionName): Self = StObject.set(x, "MonitoringJobDefinitionName", value.asInstanceOf[js.Any])
    
    inline def setMonitoringJobDefinitionNameUndefined: Self = StObject.set(x, "MonitoringJobDefinitionName", js.undefined)
    
    inline def setMonitoringScheduleName(value: MonitoringScheduleName): Self = StObject.set(x, "MonitoringScheduleName", value.asInstanceOf[js.Any])
    
    inline def setMonitoringType(value: MonitoringType): Self = StObject.set(x, "MonitoringType", value.asInstanceOf[js.Any])
    
    inline def setMonitoringTypeUndefined: Self = StObject.set(x, "MonitoringType", js.undefined)
    
    inline def setProcessingJobArn(value: ProcessingJobArn): Self = StObject.set(x, "ProcessingJobArn", value.asInstanceOf[js.Any])
    
    inline def setProcessingJobArnUndefined: Self = StObject.set(x, "ProcessingJobArn", js.undefined)
    
    inline def setScheduledTime(value: js.Date): Self = StObject.set(x, "ScheduledTime", value.asInstanceOf[js.Any])
  }
}
