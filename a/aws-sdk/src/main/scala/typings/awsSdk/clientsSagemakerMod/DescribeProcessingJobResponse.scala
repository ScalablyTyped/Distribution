package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeProcessingJobResponse extends StObject {
  
  /**
    * Configures the processing job to run a specified container image.
    */
  var AppSpecification: typings.awsSdk.clientsSagemakerMod.AppSpecification
  
  /**
    * The ARN of an AutoML job associated with this processing job.
    */
  var AutoMLJobArn: js.UndefOr[typings.awsSdk.clientsSagemakerMod.AutoMLJobArn] = js.undefined
  
  /**
    * The time at which the processing job was created.
    */
  var CreationTime: js.Date
  
  /**
    * The environment variables set in the Docker container.
    */
  var Environment: js.UndefOr[ProcessingEnvironmentMap] = js.undefined
  
  /**
    * An optional string, up to one KB in size, that contains metadata from the processing container when the processing job exits.
    */
  var ExitMessage: js.UndefOr[typings.awsSdk.clientsSagemakerMod.ExitMessage] = js.undefined
  
  /**
    * The configuration information used to create an experiment.
    */
  var ExperimentConfig: js.UndefOr[typings.awsSdk.clientsSagemakerMod.ExperimentConfig] = js.undefined
  
  /**
    * A string, up to one KB in size, that contains the reason a processing job failed, if it failed.
    */
  var FailureReason: js.UndefOr[typings.awsSdk.clientsSagemakerMod.FailureReason] = js.undefined
  
  /**
    * The time at which the processing job was last modified.
    */
  var LastModifiedTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The ARN of a monitoring schedule for an endpoint associated with this processing job.
    */
  var MonitoringScheduleArn: js.UndefOr[typings.awsSdk.clientsSagemakerMod.MonitoringScheduleArn] = js.undefined
  
  /**
    * Networking options for a processing job.
    */
  var NetworkConfig: js.UndefOr[typings.awsSdk.clientsSagemakerMod.NetworkConfig] = js.undefined
  
  /**
    * The time at which the processing job completed.
    */
  var ProcessingEndTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The inputs for a processing job.
    */
  var ProcessingInputs: js.UndefOr[typings.awsSdk.clientsSagemakerMod.ProcessingInputs] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the processing job.
    */
  var ProcessingJobArn: typings.awsSdk.clientsSagemakerMod.ProcessingJobArn
  
  /**
    * The name of the processing job. The name must be unique within an Amazon Web Services Region in the Amazon Web Services account.
    */
  var ProcessingJobName: typings.awsSdk.clientsSagemakerMod.ProcessingJobName
  
  /**
    * Provides the status of a processing job.
    */
  var ProcessingJobStatus: typings.awsSdk.clientsSagemakerMod.ProcessingJobStatus
  
  /**
    * Output configuration for the processing job.
    */
  var ProcessingOutputConfig: js.UndefOr[typings.awsSdk.clientsSagemakerMod.ProcessingOutputConfig] = js.undefined
  
  /**
    * Identifies the resources, ML compute instances, and ML storage volumes to deploy for a processing job. In distributed training, you specify more than one instance.
    */
  var ProcessingResources: typings.awsSdk.clientsSagemakerMod.ProcessingResources
  
  /**
    * The time at which the processing job started.
    */
  var ProcessingStartTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of an IAM role that Amazon SageMaker can assume to perform tasks on your behalf.
    */
  var RoleArn: js.UndefOr[typings.awsSdk.clientsSagemakerMod.RoleArn] = js.undefined
  
  /**
    * The time limit for how long the processing job is allowed to run.
    */
  var StoppingCondition: js.UndefOr[ProcessingStoppingCondition] = js.undefined
  
  /**
    * The ARN of a training job associated with this processing job.
    */
  var TrainingJobArn: js.UndefOr[typings.awsSdk.clientsSagemakerMod.TrainingJobArn] = js.undefined
}
object DescribeProcessingJobResponse {
  
  inline def apply(
    AppSpecification: AppSpecification,
    CreationTime: js.Date,
    ProcessingJobArn: ProcessingJobArn,
    ProcessingJobName: ProcessingJobName,
    ProcessingJobStatus: ProcessingJobStatus,
    ProcessingResources: ProcessingResources
  ): DescribeProcessingJobResponse = {
    val __obj = js.Dynamic.literal(AppSpecification = AppSpecification.asInstanceOf[js.Any], CreationTime = CreationTime.asInstanceOf[js.Any], ProcessingJobArn = ProcessingJobArn.asInstanceOf[js.Any], ProcessingJobName = ProcessingJobName.asInstanceOf[js.Any], ProcessingJobStatus = ProcessingJobStatus.asInstanceOf[js.Any], ProcessingResources = ProcessingResources.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeProcessingJobResponse]
  }
  
  extension [Self <: DescribeProcessingJobResponse](x: Self) {
    
    inline def setAppSpecification(value: AppSpecification): Self = StObject.set(x, "AppSpecification", value.asInstanceOf[js.Any])
    
    inline def setAutoMLJobArn(value: AutoMLJobArn): Self = StObject.set(x, "AutoMLJobArn", value.asInstanceOf[js.Any])
    
    inline def setAutoMLJobArnUndefined: Self = StObject.set(x, "AutoMLJobArn", js.undefined)
    
    inline def setCreationTime(value: js.Date): Self = StObject.set(x, "CreationTime", value.asInstanceOf[js.Any])
    
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
    
    inline def setProcessingJobName(value: ProcessingJobName): Self = StObject.set(x, "ProcessingJobName", value.asInstanceOf[js.Any])
    
    inline def setProcessingJobStatus(value: ProcessingJobStatus): Self = StObject.set(x, "ProcessingJobStatus", value.asInstanceOf[js.Any])
    
    inline def setProcessingOutputConfig(value: ProcessingOutputConfig): Self = StObject.set(x, "ProcessingOutputConfig", value.asInstanceOf[js.Any])
    
    inline def setProcessingOutputConfigUndefined: Self = StObject.set(x, "ProcessingOutputConfig", js.undefined)
    
    inline def setProcessingResources(value: ProcessingResources): Self = StObject.set(x, "ProcessingResources", value.asInstanceOf[js.Any])
    
    inline def setProcessingStartTime(value: js.Date): Self = StObject.set(x, "ProcessingStartTime", value.asInstanceOf[js.Any])
    
    inline def setProcessingStartTimeUndefined: Self = StObject.set(x, "ProcessingStartTime", js.undefined)
    
    inline def setRoleArn(value: RoleArn): Self = StObject.set(x, "RoleArn", value.asInstanceOf[js.Any])
    
    inline def setRoleArnUndefined: Self = StObject.set(x, "RoleArn", js.undefined)
    
    inline def setStoppingCondition(value: ProcessingStoppingCondition): Self = StObject.set(x, "StoppingCondition", value.asInstanceOf[js.Any])
    
    inline def setStoppingConditionUndefined: Self = StObject.set(x, "StoppingCondition", js.undefined)
    
    inline def setTrainingJobArn(value: TrainingJobArn): Self = StObject.set(x, "TrainingJobArn", value.asInstanceOf[js.Any])
    
    inline def setTrainingJobArnUndefined: Self = StObject.set(x, "TrainingJobArn", js.undefined)
  }
}
