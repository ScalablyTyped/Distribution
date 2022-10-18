package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeModelExplainabilityJobDefinitionResponse extends StObject {
  
  /**
    * The time at which the model explainability job was created.
    */
  var CreationTime: js.Date
  
  /**
    * The Amazon Resource Name (ARN) of the model explainability job.
    */
  var JobDefinitionArn: MonitoringJobDefinitionArn
  
  /**
    * The name of the explainability job definition. The name must be unique within an Amazon Web Services Region in the Amazon Web Services account.
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
    * The Amazon Resource Name (ARN) of the Amazon Web Services Identity and Access Management (IAM) role that has read permission to the input data location and write permission to the output data location in Amazon S3.
    */
  var RoleArn: typings.awsSdk.clientsSagemakerMod.RoleArn
  
  var StoppingCondition: js.UndefOr[MonitoringStoppingCondition] = js.undefined
}
object DescribeModelExplainabilityJobDefinitionResponse {
  
  inline def apply(
    CreationTime: js.Date,
    JobDefinitionArn: MonitoringJobDefinitionArn,
    JobDefinitionName: MonitoringJobDefinitionName,
    JobResources: MonitoringResources,
    ModelExplainabilityAppSpecification: ModelExplainabilityAppSpecification,
    ModelExplainabilityJobInput: ModelExplainabilityJobInput,
    ModelExplainabilityJobOutputConfig: MonitoringOutputConfig,
    RoleArn: RoleArn
  ): DescribeModelExplainabilityJobDefinitionResponse = {
    val __obj = js.Dynamic.literal(CreationTime = CreationTime.asInstanceOf[js.Any], JobDefinitionArn = JobDefinitionArn.asInstanceOf[js.Any], JobDefinitionName = JobDefinitionName.asInstanceOf[js.Any], JobResources = JobResources.asInstanceOf[js.Any], ModelExplainabilityAppSpecification = ModelExplainabilityAppSpecification.asInstanceOf[js.Any], ModelExplainabilityJobInput = ModelExplainabilityJobInput.asInstanceOf[js.Any], ModelExplainabilityJobOutputConfig = ModelExplainabilityJobOutputConfig.asInstanceOf[js.Any], RoleArn = RoleArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeModelExplainabilityJobDefinitionResponse]
  }
  
  extension [Self <: DescribeModelExplainabilityJobDefinitionResponse](x: Self) {
    
    inline def setCreationTime(value: js.Date): Self = StObject.set(x, "CreationTime", value.asInstanceOf[js.Any])
    
    inline def setJobDefinitionArn(value: MonitoringJobDefinitionArn): Self = StObject.set(x, "JobDefinitionArn", value.asInstanceOf[js.Any])
    
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
  }
}
