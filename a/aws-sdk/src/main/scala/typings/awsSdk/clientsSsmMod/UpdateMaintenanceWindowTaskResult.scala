package typings.awsSdk.clientsSsmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateMaintenanceWindowTaskResult extends StObject {
  
  /**
    * The details for the CloudWatch alarm you applied to your maintenance window task.
    */
  var AlarmConfiguration: js.UndefOr[typings.awsSdk.clientsSsmMod.AlarmConfiguration] = js.undefined
  
  /**
    * The specification for whether tasks should continue to run after the cutoff time specified in the maintenance windows is reached. 
    */
  var CutoffBehavior: js.UndefOr[MaintenanceWindowTaskCutoffBehavior] = js.undefined
  
  /**
    * The updated task description.
    */
  var Description: js.UndefOr[MaintenanceWindowDescription] = js.undefined
  
  /**
    * The updated logging information in Amazon S3.   LoggingInfo has been deprecated. To specify an Amazon Simple Storage Service (Amazon S3) bucket to contain logs, instead use the OutputS3BucketName and OutputS3KeyPrefix options in the TaskInvocationParameters structure. For information about how Amazon Web Services Systems Manager handles these options for the supported maintenance window task types, see MaintenanceWindowTaskInvocationParameters. 
    */
  var LoggingInfo: js.UndefOr[typings.awsSdk.clientsSsmMod.LoggingInfo] = js.undefined
  
  /**
    * The updated MaxConcurrency value.
    */
  var MaxConcurrency: js.UndefOr[typings.awsSdk.clientsSsmMod.MaxConcurrency] = js.undefined
  
  /**
    * The updated MaxErrors value.
    */
  var MaxErrors: js.UndefOr[typings.awsSdk.clientsSsmMod.MaxErrors] = js.undefined
  
  /**
    * The updated task name.
    */
  var Name: js.UndefOr[MaintenanceWindowName] = js.undefined
  
  /**
    * The updated priority value.
    */
  var Priority: js.UndefOr[MaintenanceWindowTaskPriority] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the Identity and Access Management (IAM) service role to use to publish Amazon Simple Notification Service (Amazon SNS) notifications for maintenance window Run Command tasks.
    */
  var ServiceRoleArn: js.UndefOr[ServiceRole] = js.undefined
  
  /**
    * The updated target values.
    */
  var Targets: js.UndefOr[typings.awsSdk.clientsSsmMod.Targets] = js.undefined
  
  /**
    * The updated task ARN value.
    */
  var TaskArn: js.UndefOr[MaintenanceWindowTaskArn] = js.undefined
  
  /**
    * The updated parameter values.
    */
  var TaskInvocationParameters: js.UndefOr[MaintenanceWindowTaskInvocationParameters] = js.undefined
  
  /**
    * The updated parameter values.   TaskParameters has been deprecated. To specify parameters to pass to a task when it runs, instead use the Parameters option in the TaskInvocationParameters structure. For information about how Systems Manager handles these options for the supported maintenance window task types, see MaintenanceWindowTaskInvocationParameters. 
    */
  var TaskParameters: js.UndefOr[MaintenanceWindowTaskParameters] = js.undefined
  
  /**
    * The ID of the maintenance window that was updated.
    */
  var WindowId: js.UndefOr[MaintenanceWindowId] = js.undefined
  
  /**
    * The task ID of the maintenance window that was updated.
    */
  var WindowTaskId: js.UndefOr[MaintenanceWindowTaskId] = js.undefined
}
object UpdateMaintenanceWindowTaskResult {
  
  inline def apply(): UpdateMaintenanceWindowTaskResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateMaintenanceWindowTaskResult]
  }
  
  extension [Self <: UpdateMaintenanceWindowTaskResult](x: Self) {
    
    inline def setAlarmConfiguration(value: AlarmConfiguration): Self = StObject.set(x, "AlarmConfiguration", value.asInstanceOf[js.Any])
    
    inline def setAlarmConfigurationUndefined: Self = StObject.set(x, "AlarmConfiguration", js.undefined)
    
    inline def setCutoffBehavior(value: MaintenanceWindowTaskCutoffBehavior): Self = StObject.set(x, "CutoffBehavior", value.asInstanceOf[js.Any])
    
    inline def setCutoffBehaviorUndefined: Self = StObject.set(x, "CutoffBehavior", js.undefined)
    
    inline def setDescription(value: MaintenanceWindowDescription): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setLoggingInfo(value: LoggingInfo): Self = StObject.set(x, "LoggingInfo", value.asInstanceOf[js.Any])
    
    inline def setLoggingInfoUndefined: Self = StObject.set(x, "LoggingInfo", js.undefined)
    
    inline def setMaxConcurrency(value: MaxConcurrency): Self = StObject.set(x, "MaxConcurrency", value.asInstanceOf[js.Any])
    
    inline def setMaxConcurrencyUndefined: Self = StObject.set(x, "MaxConcurrency", js.undefined)
    
    inline def setMaxErrors(value: MaxErrors): Self = StObject.set(x, "MaxErrors", value.asInstanceOf[js.Any])
    
    inline def setMaxErrorsUndefined: Self = StObject.set(x, "MaxErrors", js.undefined)
    
    inline def setName(value: MaintenanceWindowName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setPriority(value: MaintenanceWindowTaskPriority): Self = StObject.set(x, "Priority", value.asInstanceOf[js.Any])
    
    inline def setPriorityUndefined: Self = StObject.set(x, "Priority", js.undefined)
    
    inline def setServiceRoleArn(value: ServiceRole): Self = StObject.set(x, "ServiceRoleArn", value.asInstanceOf[js.Any])
    
    inline def setServiceRoleArnUndefined: Self = StObject.set(x, "ServiceRoleArn", js.undefined)
    
    inline def setTargets(value: Targets): Self = StObject.set(x, "Targets", value.asInstanceOf[js.Any])
    
    inline def setTargetsUndefined: Self = StObject.set(x, "Targets", js.undefined)
    
    inline def setTargetsVarargs(value: Target*): Self = StObject.set(x, "Targets", js.Array(value*))
    
    inline def setTaskArn(value: MaintenanceWindowTaskArn): Self = StObject.set(x, "TaskArn", value.asInstanceOf[js.Any])
    
    inline def setTaskArnUndefined: Self = StObject.set(x, "TaskArn", js.undefined)
    
    inline def setTaskInvocationParameters(value: MaintenanceWindowTaskInvocationParameters): Self = StObject.set(x, "TaskInvocationParameters", value.asInstanceOf[js.Any])
    
    inline def setTaskInvocationParametersUndefined: Self = StObject.set(x, "TaskInvocationParameters", js.undefined)
    
    inline def setTaskParameters(value: MaintenanceWindowTaskParameters): Self = StObject.set(x, "TaskParameters", value.asInstanceOf[js.Any])
    
    inline def setTaskParametersUndefined: Self = StObject.set(x, "TaskParameters", js.undefined)
    
    inline def setWindowId(value: MaintenanceWindowId): Self = StObject.set(x, "WindowId", value.asInstanceOf[js.Any])
    
    inline def setWindowIdUndefined: Self = StObject.set(x, "WindowId", js.undefined)
    
    inline def setWindowTaskId(value: MaintenanceWindowTaskId): Self = StObject.set(x, "WindowTaskId", value.asInstanceOf[js.Any])
    
    inline def setWindowTaskIdUndefined: Self = StObject.set(x, "WindowTaskId", js.undefined)
  }
}
