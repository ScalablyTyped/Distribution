package typings
package awsDashSdkLib.clientsSagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateCompilationJobRequest extends js.Object {
  /**
    * A name for the model compilation job. The name must be unique within the AWS Region and within your AWS account. 
    */
  var CompilationJobName: EntityName
  /**
    * Provides information about the location of input model artifacts, the name and shape of the expected data inputs, and the framework in which the model was trained.
    */
  var InputConfig: awsDashSdkLib.clientsSagemakerMod.InputConfig
  /**
    * Provides information about the output location for the compiled model and the target device the model runs on.
    */
  var OutputConfig: awsDashSdkLib.clientsSagemakerMod.OutputConfig
  /**
    * The Amazon Resource Name (ARN) of an IIAMAM role that enables Amazon SageMaker to perform tasks on your behalf.  During model compilation, Amazon SageMaker needs your permission to:   Read input data from an S3 bucket   Write model artifacts to an S3 bucket   Write logs to Amazon CloudWatch Logs   Publish metrics to Amazon CloudWatch   You grant permissions for all of these tasks to an IAM role. To pass this role to Amazon SageMaker, the caller of this API must have the iam:PassRole permission. For more information, see Amazon SageMaker Roles. 
    */
  var RoleArn: awsDashSdkLib.clientsSagemakerMod.RoleArn
  /**
    * The duration allowed for model compilation.
    */
  var StoppingCondition: awsDashSdkLib.clientsSagemakerMod.StoppingCondition
}

object CreateCompilationJobRequest {
  @scala.inline
  def apply(
    CompilationJobName: EntityName,
    InputConfig: InputConfig,
    OutputConfig: OutputConfig,
    RoleArn: RoleArn,
    StoppingCondition: StoppingCondition
  ): CreateCompilationJobRequest = {
    val __obj = js.Dynamic.literal(CompilationJobName = CompilationJobName, InputConfig = InputConfig, OutputConfig = OutputConfig, RoleArn = RoleArn, StoppingCondition = StoppingCondition)
  
    __obj.asInstanceOf[CreateCompilationJobRequest]
  }
}

