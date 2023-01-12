package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeCompilationJobResponse extends StObject {
  
  /**
    * The time when the model compilation job on a compilation job instance ended. For a successful or stopped job, this is when the job's model artifacts have finished uploading. For a failed job, this is when Amazon SageMaker detected that the job failed. 
    */
  var CompilationEndTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the model compilation job.
    */
  var CompilationJobArn: typings.awsSdk.clientsSagemakerMod.CompilationJobArn
  
  /**
    * The name of the model compilation job.
    */
  var CompilationJobName: EntityName
  
  /**
    * The status of the model compilation job.
    */
  var CompilationJobStatus: typings.awsSdk.clientsSagemakerMod.CompilationJobStatus
  
  /**
    * The time when the model compilation job started the CompilationJob instances.  You are billed for the time between this timestamp and the timestamp in the DescribeCompilationJobResponse$CompilationEndTime field. In Amazon CloudWatch Logs, the start time might be later than this time. That's because it takes time to download the compilation job, which depends on the size of the compilation job container. 
    */
  var CompilationStartTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The time that the model compilation job was created.
    */
  var CreationTime: js.Date
  
  /**
    * If a model compilation job failed, the reason it failed. 
    */
  var FailureReason: typings.awsSdk.clientsSagemakerMod.FailureReason
  
  /**
    * The inference image to use when compiling a model. Specify an image only if the target device is a cloud instance.
    */
  var InferenceImage: js.UndefOr[typings.awsSdk.clientsSagemakerMod.InferenceImage] = js.undefined
  
  /**
    * Information about the location in Amazon S3 of the input model artifacts, the name and shape of the expected data inputs, and the framework in which the model was trained.
    */
  var InputConfig: typings.awsSdk.clientsSagemakerMod.InputConfig
  
  /**
    * The time that the status of the model compilation job was last modified.
    */
  var LastModifiedTime: js.Date
  
  /**
    * Information about the location in Amazon S3 that has been configured for storing the model artifacts used in the compilation job.
    */
  var ModelArtifacts: typings.awsSdk.clientsSagemakerMod.ModelArtifacts
  
  /**
    * Provides a BLAKE2 hash value that identifies the compiled model artifacts in Amazon S3.
    */
  var ModelDigests: js.UndefOr[typings.awsSdk.clientsSagemakerMod.ModelDigests] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the versioned model package that was provided to SageMaker Neo when you initiated a compilation job.
    */
  var ModelPackageVersionArn: js.UndefOr[ModelPackageArn] = js.undefined
  
  /**
    * Information about the output location for the compiled model and the target device that the model runs on.
    */
  var OutputConfig: typings.awsSdk.clientsSagemakerMod.OutputConfig
  
  /**
    * The Amazon Resource Name (ARN) of an IAM role that Amazon SageMaker assumes to perform the model compilation job.
    */
  var RoleArn: typings.awsSdk.clientsSagemakerMod.RoleArn
  
  /**
    * Specifies a limit to how long a model compilation job can run. When the job reaches the time limit, Amazon SageMaker ends the compilation job. Use this API to cap model training costs.
    */
  var StoppingCondition: typings.awsSdk.clientsSagemakerMod.StoppingCondition
  
  /**
    * A VpcConfig object that specifies the VPC that you want your compilation job to connect to. Control access to your models by configuring the VPC. For more information, see Protect Compilation Jobs by Using an Amazon Virtual Private Cloud.
    */
  var VpcConfig: js.UndefOr[NeoVpcConfig] = js.undefined
}
object DescribeCompilationJobResponse {
  
  inline def apply(
    CompilationJobArn: CompilationJobArn,
    CompilationJobName: EntityName,
    CompilationJobStatus: CompilationJobStatus,
    CreationTime: js.Date,
    FailureReason: FailureReason,
    InputConfig: InputConfig,
    LastModifiedTime: js.Date,
    ModelArtifacts: ModelArtifacts,
    OutputConfig: OutputConfig,
    RoleArn: RoleArn,
    StoppingCondition: StoppingCondition
  ): DescribeCompilationJobResponse = {
    val __obj = js.Dynamic.literal(CompilationJobArn = CompilationJobArn.asInstanceOf[js.Any], CompilationJobName = CompilationJobName.asInstanceOf[js.Any], CompilationJobStatus = CompilationJobStatus.asInstanceOf[js.Any], CreationTime = CreationTime.asInstanceOf[js.Any], FailureReason = FailureReason.asInstanceOf[js.Any], InputConfig = InputConfig.asInstanceOf[js.Any], LastModifiedTime = LastModifiedTime.asInstanceOf[js.Any], ModelArtifacts = ModelArtifacts.asInstanceOf[js.Any], OutputConfig = OutputConfig.asInstanceOf[js.Any], RoleArn = RoleArn.asInstanceOf[js.Any], StoppingCondition = StoppingCondition.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeCompilationJobResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeCompilationJobResponse] (val x: Self) extends AnyVal {
    
    inline def setCompilationEndTime(value: js.Date): Self = StObject.set(x, "CompilationEndTime", value.asInstanceOf[js.Any])
    
    inline def setCompilationEndTimeUndefined: Self = StObject.set(x, "CompilationEndTime", js.undefined)
    
    inline def setCompilationJobArn(value: CompilationJobArn): Self = StObject.set(x, "CompilationJobArn", value.asInstanceOf[js.Any])
    
    inline def setCompilationJobName(value: EntityName): Self = StObject.set(x, "CompilationJobName", value.asInstanceOf[js.Any])
    
    inline def setCompilationJobStatus(value: CompilationJobStatus): Self = StObject.set(x, "CompilationJobStatus", value.asInstanceOf[js.Any])
    
    inline def setCompilationStartTime(value: js.Date): Self = StObject.set(x, "CompilationStartTime", value.asInstanceOf[js.Any])
    
    inline def setCompilationStartTimeUndefined: Self = StObject.set(x, "CompilationStartTime", js.undefined)
    
    inline def setCreationTime(value: js.Date): Self = StObject.set(x, "CreationTime", value.asInstanceOf[js.Any])
    
    inline def setFailureReason(value: FailureReason): Self = StObject.set(x, "FailureReason", value.asInstanceOf[js.Any])
    
    inline def setInferenceImage(value: InferenceImage): Self = StObject.set(x, "InferenceImage", value.asInstanceOf[js.Any])
    
    inline def setInferenceImageUndefined: Self = StObject.set(x, "InferenceImage", js.undefined)
    
    inline def setInputConfig(value: InputConfig): Self = StObject.set(x, "InputConfig", value.asInstanceOf[js.Any])
    
    inline def setLastModifiedTime(value: js.Date): Self = StObject.set(x, "LastModifiedTime", value.asInstanceOf[js.Any])
    
    inline def setModelArtifacts(value: ModelArtifacts): Self = StObject.set(x, "ModelArtifacts", value.asInstanceOf[js.Any])
    
    inline def setModelDigests(value: ModelDigests): Self = StObject.set(x, "ModelDigests", value.asInstanceOf[js.Any])
    
    inline def setModelDigestsUndefined: Self = StObject.set(x, "ModelDigests", js.undefined)
    
    inline def setModelPackageVersionArn(value: ModelPackageArn): Self = StObject.set(x, "ModelPackageVersionArn", value.asInstanceOf[js.Any])
    
    inline def setModelPackageVersionArnUndefined: Self = StObject.set(x, "ModelPackageVersionArn", js.undefined)
    
    inline def setOutputConfig(value: OutputConfig): Self = StObject.set(x, "OutputConfig", value.asInstanceOf[js.Any])
    
    inline def setRoleArn(value: RoleArn): Self = StObject.set(x, "RoleArn", value.asInstanceOf[js.Any])
    
    inline def setStoppingCondition(value: StoppingCondition): Self = StObject.set(x, "StoppingCondition", value.asInstanceOf[js.Any])
    
    inline def setVpcConfig(value: NeoVpcConfig): Self = StObject.set(x, "VpcConfig", value.asInstanceOf[js.Any])
    
    inline def setVpcConfigUndefined: Self = StObject.set(x, "VpcConfig", js.undefined)
  }
}
