package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateProcessingJobRequest extends StObject {
  
  /**
    * Configures the processing job to run a specified Docker container image.
    */
  var AppSpecification: typings.awsSdk.clientsSagemakerMod.AppSpecification
  
  /**
    * The environment variables to set in the Docker container. Up to 100 key and values entries in the map are supported.
    */
  var Environment: js.UndefOr[ProcessingEnvironmentMap] = js.undefined
  
  var ExperimentConfig: js.UndefOr[typings.awsSdk.clientsSagemakerMod.ExperimentConfig] = js.undefined
  
  /**
    * Networking options for a processing job, such as whether to allow inbound and outbound network calls to and from processing containers, and the VPC subnets and security groups to use for VPC-enabled processing jobs.
    */
  var NetworkConfig: js.UndefOr[typings.awsSdk.clientsSagemakerMod.NetworkConfig] = js.undefined
  
  /**
    * An array of inputs configuring the data to download into the processing container.
    */
  var ProcessingInputs: js.UndefOr[typings.awsSdk.clientsSagemakerMod.ProcessingInputs] = js.undefined
  
  /**
    *  The name of the processing job. The name must be unique within an Amazon Web Services Region in the Amazon Web Services account.
    */
  var ProcessingJobName: typings.awsSdk.clientsSagemakerMod.ProcessingJobName
  
  /**
    * Output configuration for the processing job.
    */
  var ProcessingOutputConfig: js.UndefOr[typings.awsSdk.clientsSagemakerMod.ProcessingOutputConfig] = js.undefined
  
  /**
    * Identifies the resources, ML compute instances, and ML storage volumes to deploy for a processing job. In distributed training, you specify more than one instance.
    */
  var ProcessingResources: typings.awsSdk.clientsSagemakerMod.ProcessingResources
  
  /**
    * The Amazon Resource Name (ARN) of an IAM role that Amazon SageMaker can assume to perform tasks on your behalf.
    */
  var RoleArn: typings.awsSdk.clientsSagemakerMod.RoleArn
  
  /**
    * The time limit for how long the processing job is allowed to run.
    */
  var StoppingCondition: js.UndefOr[ProcessingStoppingCondition] = js.undefined
  
  /**
    * (Optional) An array of key-value pairs. For more information, see Using Cost Allocation Tags in the Amazon Web Services Billing and Cost Management User Guide.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
}
object CreateProcessingJobRequest {
  
  inline def apply(
    AppSpecification: AppSpecification,
    ProcessingJobName: ProcessingJobName,
    ProcessingResources: ProcessingResources,
    RoleArn: RoleArn
  ): CreateProcessingJobRequest = {
    val __obj = js.Dynamic.literal(AppSpecification = AppSpecification.asInstanceOf[js.Any], ProcessingJobName = ProcessingJobName.asInstanceOf[js.Any], ProcessingResources = ProcessingResources.asInstanceOf[js.Any], RoleArn = RoleArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateProcessingJobRequest]
  }
  
  extension [Self <: CreateProcessingJobRequest](x: Self) {
    
    inline def setAppSpecification(value: AppSpecification): Self = StObject.set(x, "AppSpecification", value.asInstanceOf[js.Any])
    
    inline def setEnvironment(value: ProcessingEnvironmentMap): Self = StObject.set(x, "Environment", value.asInstanceOf[js.Any])
    
    inline def setEnvironmentUndefined: Self = StObject.set(x, "Environment", js.undefined)
    
    inline def setExperimentConfig(value: ExperimentConfig): Self = StObject.set(x, "ExperimentConfig", value.asInstanceOf[js.Any])
    
    inline def setExperimentConfigUndefined: Self = StObject.set(x, "ExperimentConfig", js.undefined)
    
    inline def setNetworkConfig(value: NetworkConfig): Self = StObject.set(x, "NetworkConfig", value.asInstanceOf[js.Any])
    
    inline def setNetworkConfigUndefined: Self = StObject.set(x, "NetworkConfig", js.undefined)
    
    inline def setProcessingInputs(value: ProcessingInputs): Self = StObject.set(x, "ProcessingInputs", value.asInstanceOf[js.Any])
    
    inline def setProcessingInputsUndefined: Self = StObject.set(x, "ProcessingInputs", js.undefined)
    
    inline def setProcessingInputsVarargs(value: ProcessingInput*): Self = StObject.set(x, "ProcessingInputs", js.Array(value*))
    
    inline def setProcessingJobName(value: ProcessingJobName): Self = StObject.set(x, "ProcessingJobName", value.asInstanceOf[js.Any])
    
    inline def setProcessingOutputConfig(value: ProcessingOutputConfig): Self = StObject.set(x, "ProcessingOutputConfig", value.asInstanceOf[js.Any])
    
    inline def setProcessingOutputConfigUndefined: Self = StObject.set(x, "ProcessingOutputConfig", js.undefined)
    
    inline def setProcessingResources(value: ProcessingResources): Self = StObject.set(x, "ProcessingResources", value.asInstanceOf[js.Any])
    
    inline def setRoleArn(value: RoleArn): Self = StObject.set(x, "RoleArn", value.asInstanceOf[js.Any])
    
    inline def setStoppingCondition(value: ProcessingStoppingCondition): Self = StObject.set(x, "StoppingCondition", value.asInstanceOf[js.Any])
    
    inline def setStoppingConditionUndefined: Self = StObject.set(x, "StoppingCondition", js.undefined)
    
    inline def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
  }
}
