package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateModelExplainabilityJobDefinitionRequest extends StObject {
  
  /**
    *  The name of the model explainability job definition. The name must be unique within an Amazon Web Services Region in the Amazon Web Services account.
    */
  var JobDefinitionName: MonitoringJobDefinitionName
  
  var JobResources: MonitoringResources
  
  /**
    * Configures the model explainability job to run a specified Docker container image.
    */
  var ModelExplainabilityAppSpecification: typings.awsSdk.clientsSagemakerMod.ModelExplainabilityAppSpecification
  
  /**
    * The baseline configuration for a model explainability job.
    */
  var ModelExplainabilityBaselineConfig: js.UndefOr[typings.awsSdk.clientsSagemakerMod.ModelExplainabilityBaselineConfig] = js.undefined
  
  /**
    * Inputs for the model explainability job.
    */
  var ModelExplainabilityJobInput: typings.awsSdk.clientsSagemakerMod.ModelExplainabilityJobInput
  
  var ModelExplainabilityJobOutputConfig: MonitoringOutputConfig
  
  /**
    * Networking options for a model explainability job.
    */
  var NetworkConfig: js.UndefOr[MonitoringNetworkConfig] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of an IAM role that Amazon SageMaker can assume to perform tasks on your behalf.
    */
  var RoleArn: typings.awsSdk.clientsSagemakerMod.RoleArn
  
  var StoppingCondition: js.UndefOr[MonitoringStoppingCondition] = js.undefined
  
  /**
    * (Optional) An array of key-value pairs. For more information, see Using Cost Allocation Tags in the Amazon Web Services Billing and Cost Management User Guide.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
}
object CreateModelExplainabilityJobDefinitionRequest {
  
  inline def apply(
    JobDefinitionName: MonitoringJobDefinitionName,
    JobResources: MonitoringResources,
    ModelExplainabilityAppSpecification: ModelExplainabilityAppSpecification,
    ModelExplainabilityJobInput: ModelExplainabilityJobInput,
    ModelExplainabilityJobOutputConfig: MonitoringOutputConfig,
    RoleArn: RoleArn
  ): CreateModelExplainabilityJobDefinitionRequest = {
    val __obj = js.Dynamic.literal(JobDefinitionName = JobDefinitionName.asInstanceOf[js.Any], JobResources = JobResources.asInstanceOf[js.Any], ModelExplainabilityAppSpecification = ModelExplainabilityAppSpecification.asInstanceOf[js.Any], ModelExplainabilityJobInput = ModelExplainabilityJobInput.asInstanceOf[js.Any], ModelExplainabilityJobOutputConfig = ModelExplainabilityJobOutputConfig.asInstanceOf[js.Any], RoleArn = RoleArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateModelExplainabilityJobDefinitionRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateModelExplainabilityJobDefinitionRequest] (val x: Self) extends AnyVal {
    
    inline def setJobDefinitionName(value: MonitoringJobDefinitionName): Self = StObject.set(x, "JobDefinitionName", value.asInstanceOf[js.Any])
    
    inline def setJobResources(value: MonitoringResources): Self = StObject.set(x, "JobResources", value.asInstanceOf[js.Any])
    
    inline def setModelExplainabilityAppSpecification(value: ModelExplainabilityAppSpecification): Self = StObject.set(x, "ModelExplainabilityAppSpecification", value.asInstanceOf[js.Any])
    
    inline def setModelExplainabilityBaselineConfig(value: ModelExplainabilityBaselineConfig): Self = StObject.set(x, "ModelExplainabilityBaselineConfig", value.asInstanceOf[js.Any])
    
    inline def setModelExplainabilityBaselineConfigUndefined: Self = StObject.set(x, "ModelExplainabilityBaselineConfig", js.undefined)
    
    inline def setModelExplainabilityJobInput(value: ModelExplainabilityJobInput): Self = StObject.set(x, "ModelExplainabilityJobInput", value.asInstanceOf[js.Any])
    
    inline def setModelExplainabilityJobOutputConfig(value: MonitoringOutputConfig): Self = StObject.set(x, "ModelExplainabilityJobOutputConfig", value.asInstanceOf[js.Any])
    
    inline def setNetworkConfig(value: MonitoringNetworkConfig): Self = StObject.set(x, "NetworkConfig", value.asInstanceOf[js.Any])
    
    inline def setNetworkConfigUndefined: Self = StObject.set(x, "NetworkConfig", js.undefined)
    
    inline def setRoleArn(value: RoleArn): Self = StObject.set(x, "RoleArn", value.asInstanceOf[js.Any])
    
    inline def setStoppingCondition(value: MonitoringStoppingCondition): Self = StObject.set(x, "StoppingCondition", value.asInstanceOf[js.Any])
    
    inline def setStoppingConditionUndefined: Self = StObject.set(x, "StoppingCondition", js.undefined)
    
    inline def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
  }
}
