package typings
package awsDashSdkLib.clientsSagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeCompilationJobResponse extends js.Object {
  /**
    * The time when the model compilation job on a compilation job instance ended. For a successful or stopped job, this is when the job's model artifacts have finished uploading. For a failed job, this is when Amazon SageMaker detected that the job failed. 
    */
  var CompilationEndTime: js.UndefOr[Timestamp] = js.undefined
  /**
    * The Amazon Resource Name (ARN) of an IAM role that Amazon SageMaker assumes to perform the model compilation job.
    */
  var CompilationJobArn: awsDashSdkLib.clientsSagemakerMod.CompilationJobArn
  /**
    * The name of the model compilation job.
    */
  var CompilationJobName: EntityName
  /**
    * The status of the model compilation job.
    */
  var CompilationJobStatus: awsDashSdkLib.clientsSagemakerMod.CompilationJobStatus
  /**
    * The time when the model compilation job started the CompilationJob instances.  You are billed for the time between this timestamp and the timestamp in the DescribeCompilationJobResponse$CompilationEndTime field. In Amazon CloudWatch Logs, the start time might be later than this time. That's because it takes time to download the compilation job, which depends on the size of the compilation job container. 
    */
  var CompilationStartTime: js.UndefOr[Timestamp] = js.undefined
  /**
    * The time that the model compilation job was created.
    */
  var CreationTime: awsDashSdkLib.clientsSagemakerMod.CreationTime
  /**
    * If a model compilation job failed, the reason it failed. 
    */
  var FailureReason: awsDashSdkLib.clientsSagemakerMod.FailureReason
  /**
    * Information about the location in Amazon S3 of the input model artifacts, the name and shape of the expected data inputs, and the framework in which the model was trained.
    */
  var InputConfig: awsDashSdkLib.clientsSagemakerMod.InputConfig
  /**
    * The time that the status of the model compilation job was last modified.
    */
  var LastModifiedTime: awsDashSdkLib.clientsSagemakerMod.LastModifiedTime
  /**
    * Information about the location in Amazon S3 that has been configured for storing the model artifacts used in the compilation job.
    */
  var ModelArtifacts: awsDashSdkLib.clientsSagemakerMod.ModelArtifacts
  /**
    * Information about the output location for the compiled model and the target device that the model runs on.
    */
  var OutputConfig: awsDashSdkLib.clientsSagemakerMod.OutputConfig
  /**
    * The Amazon Resource Name (ARN) of the model compilation job.
    */
  var RoleArn: awsDashSdkLib.clientsSagemakerMod.RoleArn
  /**
    * The duration allowed for model compilation.
    */
  var StoppingCondition: awsDashSdkLib.clientsSagemakerMod.StoppingCondition
}

object DescribeCompilationJobResponse {
  @scala.inline
  def apply(
    CompilationJobArn: CompilationJobArn,
    CompilationJobName: EntityName,
    CompilationJobStatus: CompilationJobStatus,
    CreationTime: CreationTime,
    FailureReason: FailureReason,
    InputConfig: InputConfig,
    LastModifiedTime: LastModifiedTime,
    ModelArtifacts: ModelArtifacts,
    OutputConfig: OutputConfig,
    RoleArn: RoleArn,
    StoppingCondition: StoppingCondition,
    CompilationEndTime: Timestamp = null,
    CompilationStartTime: Timestamp = null
  ): DescribeCompilationJobResponse = {
    val __obj = js.Dynamic.literal(CompilationJobArn = CompilationJobArn, CompilationJobName = CompilationJobName, CompilationJobStatus = CompilationJobStatus.asInstanceOf[js.Any], CreationTime = CreationTime, FailureReason = FailureReason, InputConfig = InputConfig, LastModifiedTime = LastModifiedTime, ModelArtifacts = ModelArtifacts, OutputConfig = OutputConfig, RoleArn = RoleArn, StoppingCondition = StoppingCondition)
    if (CompilationEndTime != null) __obj.updateDynamic("CompilationEndTime")(CompilationEndTime)
    if (CompilationStartTime != null) __obj.updateDynamic("CompilationStartTime")(CompilationStartTime)
    __obj.asInstanceOf[DescribeCompilationJobResponse]
  }
}

