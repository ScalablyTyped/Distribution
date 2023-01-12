package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProcessingJob extends StObject {
  
  var AppSpecification: js.UndefOr[typings.awsSdk.clientsSagemakerMod.AppSpecification] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the AutoML job associated with this processing job.
    */
  var AutoMLJobArn: js.UndefOr[typings.awsSdk.clientsSagemakerMod.AutoMLJobArn] = js.undefined
  
  /**
    * The time the processing job was created.
    */
  var CreationTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * Sets the environment variables in the Docker container.
    */
  var Environment: js.UndefOr[ProcessingEnvironmentMap] = js.undefined
  
  /**
    * A string, up to one KB in size, that contains metadata from the processing container when the processing job exits.
    */
  var ExitMessage: js.UndefOr[typings.awsSdk.clientsSagemakerMod.ExitMessage] = js.undefined
  
  var ExperimentConfig: js.UndefOr[typings.awsSdk.clientsSagemakerMod.ExperimentConfig] = js.undefined
  
  /**
    * A string, up to one KB in size, that contains the reason a processing job failed, if it failed.
    */
  var FailureReason: js.UndefOr[typings.awsSdk.clientsSagemakerMod.FailureReason] = js.undefined
  
  /**
    * The time the processing job was last modified.
    */
  var LastModifiedTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The ARN of a monitoring schedule for an endpoint associated with this processing job.
    */
  var MonitoringScheduleArn: js.UndefOr[typings.awsSdk.clientsSagemakerMod.MonitoringScheduleArn] = js.undefined
  
  var NetworkConfig: js.UndefOr[typings.awsSdk.clientsSagemakerMod.NetworkConfig] = js.undefined
  
  /**
    * The time that the processing job ended.
    */
  var ProcessingEndTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * List of input configurations for the processing job.
    */
  var ProcessingInputs: js.UndefOr[typings.awsSdk.clientsSagemakerMod.ProcessingInputs] = js.undefined
  
  /**
    * The ARN of the processing job.
    */
  var ProcessingJobArn: js.UndefOr[typings.awsSdk.clientsSagemakerMod.ProcessingJobArn] = js.undefined
  
  /**
    * The name of the processing job.
    */
  var ProcessingJobName: js.UndefOr[typings.awsSdk.clientsSagemakerMod.ProcessingJobName] = js.undefined
  
  /**
    * The status of the processing job.
    */
  var ProcessingJobStatus: js.UndefOr[typings.awsSdk.clientsSagemakerMod.ProcessingJobStatus] = js.undefined
  
  var ProcessingOutputConfig: js.UndefOr[typings.awsSdk.clientsSagemakerMod.ProcessingOutputConfig] = js.undefined
  
  var ProcessingResources: js.UndefOr[typings.awsSdk.clientsSagemakerMod.ProcessingResources] = js.undefined
  
  /**
    * The time that the processing job started.
    */
  var ProcessingStartTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The ARN of the role used to create the processing job.
    */
  var RoleArn: js.UndefOr[typings.awsSdk.clientsSagemakerMod.RoleArn] = js.undefined
  
  var StoppingCondition: js.UndefOr[ProcessingStoppingCondition] = js.undefined
  
  /**
    * An array of key-value pairs. For more information, see Using Cost Allocation Tags in the Amazon Web Services Billing and Cost Management User Guide.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
  
  /**
    * The ARN of the training job associated with this processing job.
    */
  var TrainingJobArn: js.UndefOr[typings.awsSdk.clientsSagemakerMod.TrainingJobArn] = js.undefined
}
object ProcessingJob {
  
  inline def apply(): ProcessingJob = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProcessingJob]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ProcessingJob] (val x: Self) extends AnyVal {
    
    inline def setAppSpecification(value: AppSpecification): Self = StObject.set(x, "AppSpecification", value.asInstanceOf[js.Any])
    
    inline def setAppSpecificationUndefined: Self = StObject.set(x, "AppSpecification", js.undefined)
    
    inline def setAutoMLJobArn(value: AutoMLJobArn): Self = StObject.set(x, "AutoMLJobArn", value.asInstanceOf[js.Any])
    
    inline def setAutoMLJobArnUndefined: Self = StObject.set(x, "AutoMLJobArn", js.undefined)
    
    inline def setCreationTime(value: js.Date): Self = StObject.set(x, "CreationTime", value.asInstanceOf[js.Any])
    
    inline def setCreationTimeUndefined: Self = StObject.set(x, "CreationTime", js.undefined)
    
    inline def setEnvironment(value: ProcessingEnvironmentMap): Self = StObject.set(x, "Environment", value.asInstanceOf[js.Any])
    
    inline def setEnvironmentUndefined: Self = StObject.set(x, "Environment", js.undefined)
    
    inline def setExitMessage(value: ExitMessage): Self = StObject.set(x, "ExitMessage", value.asInstanceOf[js.Any])
    
    inline def setExitMessageUndefined: Self = StObject.set(x, "ExitMessage", js.undefined)
    
    inline def setExperimentConfig(value: ExperimentConfig): Self = StObject.set(x, "ExperimentConfig", value.asInstanceOf[js.Any])
    
    inline def setExperimentConfigUndefined: Self = StObject.set(x, "ExperimentConfig", js.undefined)
    
    inline def setFailureReason(value: FailureReason): Self = StObject.set(x, "FailureReason", value.asInstanceOf[js.Any])
    
    inline def setFailureReasonUndefined: Self = StObject.set(x, "FailureReason", js.undefined)
    
    inline def setLastModifiedTime(value: js.Date): Self = StObject.set(x, "LastModifiedTime", value.asInstanceOf[js.Any])
    
    inline def setLastModifiedTimeUndefined: Self = StObject.set(x, "LastModifiedTime", js.undefined)
    
    inline def setMonitoringScheduleArn(value: MonitoringScheduleArn): Self = StObject.set(x, "MonitoringScheduleArn", value.asInstanceOf[js.Any])
    
    inline def setMonitoringScheduleArnUndefined: Self = StObject.set(x, "MonitoringScheduleArn", js.undefined)
    
    inline def setNetworkConfig(value: NetworkConfig): Self = StObject.set(x, "NetworkConfig", value.asInstanceOf[js.Any])
    
    inline def setNetworkConfigUndefined: Self = StObject.set(x, "NetworkConfig", js.undefined)
    
    inline def setProcessingEndTime(value: js.Date): Self = StObject.set(x, "ProcessingEndTime", value.asInstanceOf[js.Any])
    
    inline def setProcessingEndTimeUndefined: Self = StObject.set(x, "ProcessingEndTime", js.undefined)
    
    inline def setProcessingInputs(value: ProcessingInputs): Self = StObject.set(x, "ProcessingInputs", value.asInstanceOf[js.Any])
    
    inline def setProcessingInputsUndefined: Self = StObject.set(x, "ProcessingInputs", js.undefined)
    
    inline def setProcessingInputsVarargs(value: ProcessingInput*): Self = StObject.set(x, "ProcessingInputs", js.Array(value*))
    
    inline def setProcessingJobArn(value: ProcessingJobArn): Self = StObject.set(x, "ProcessingJobArn", value.asInstanceOf[js.Any])
    
    inline def setProcessingJobArnUndefined: Self = StObject.set(x, "ProcessingJobArn", js.undefined)
    
    inline def setProcessingJobName(value: ProcessingJobName): Self = StObject.set(x, "ProcessingJobName", value.asInstanceOf[js.Any])
    
    inline def setProcessingJobNameUndefined: Self = StObject.set(x, "ProcessingJobName", js.undefined)
    
    inline def setProcessingJobStatus(value: ProcessingJobStatus): Self = StObject.set(x, "ProcessingJobStatus", value.asInstanceOf[js.Any])
    
    inline def setProcessingJobStatusUndefined: Self = StObject.set(x, "ProcessingJobStatus", js.undefined)
    
    inline def setProcessingOutputConfig(value: ProcessingOutputConfig): Self = StObject.set(x, "ProcessingOutputConfig", value.asInstanceOf[js.Any])
    
    inline def setProcessingOutputConfigUndefined: Self = StObject.set(x, "ProcessingOutputConfig", js.undefined)
    
    inline def setProcessingResources(value: ProcessingResources): Self = StObject.set(x, "ProcessingResources", value.asInstanceOf[js.Any])
    
    inline def setProcessingResourcesUndefined: Self = StObject.set(x, "ProcessingResources", js.undefined)
    
    inline def setProcessingStartTime(value: js.Date): Self = StObject.set(x, "ProcessingStartTime", value.asInstanceOf[js.Any])
    
    inline def setProcessingStartTimeUndefined: Self = StObject.set(x, "ProcessingStartTime", js.undefined)
    
    inline def setRoleArn(value: RoleArn): Self = StObject.set(x, "RoleArn", value.asInstanceOf[js.Any])
    
    inline def setRoleArnUndefined: Self = StObject.set(x, "RoleArn", js.undefined)
    
    inline def setStoppingCondition(value: ProcessingStoppingCondition): Self = StObject.set(x, "StoppingCondition", value.asInstanceOf[js.Any])
    
    inline def setStoppingConditionUndefined: Self = StObject.set(x, "StoppingCondition", js.undefined)
    
    inline def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
    
    inline def setTrainingJobArn(value: TrainingJobArn): Self = StObject.set(x, "TrainingJobArn", value.asInstanceOf[js.Any])
    
    inline def setTrainingJobArnUndefined: Self = StObject.set(x, "TrainingJobArn", js.undefined)
  }
}
