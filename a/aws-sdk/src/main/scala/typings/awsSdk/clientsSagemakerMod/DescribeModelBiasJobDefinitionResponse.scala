package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeModelBiasJobDefinitionResponse extends StObject {
  
  /**
    * The time at which the model bias job was created.
    */
  var CreationTime: js.Date
  
  /**
    * The Amazon Resource Name (ARN) of the model bias job.
    */
  var JobDefinitionArn: MonitoringJobDefinitionArn
  
  /**
    * The name of the bias job definition. The name must be unique within an Amazon Web Services Region in the Amazon Web Services account.
    */
  var JobDefinitionName: MonitoringJobDefinitionName
  
  var JobResources: MonitoringResources
  
  /**
    * Configures the model bias job to run a specified Docker container image.
    */
  var ModelBiasAppSpecification: typings.awsSdk.clientsSagemakerMod.ModelBiasAppSpecification
  
  /**
    * The baseline configuration for a model bias job.
    */
  var ModelBiasBaselineConfig: js.UndefOr[typings.awsSdk.clientsSagemakerMod.ModelBiasBaselineConfig] = js.undefined
  
  /**
    * Inputs for the model bias job.
    */
  var ModelBiasJobInput: typings.awsSdk.clientsSagemakerMod.ModelBiasJobInput
  
  var ModelBiasJobOutputConfig: MonitoringOutputConfig
  
  /**
    * Networking options for a model bias job.
    */
  var NetworkConfig: js.UndefOr[MonitoringNetworkConfig] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the Amazon Web Services Identity and Access Management (IAM) role that has read permission to the input data location and write permission to the output data location in Amazon S3.
    */
  var RoleArn: typings.awsSdk.clientsSagemakerMod.RoleArn
  
  var StoppingCondition: js.UndefOr[MonitoringStoppingCondition] = js.undefined
}
object DescribeModelBiasJobDefinitionResponse {
  
  inline def apply(
    CreationTime: js.Date,
    JobDefinitionArn: MonitoringJobDefinitionArn,
    JobDefinitionName: MonitoringJobDefinitionName,
    JobResources: MonitoringResources,
    ModelBiasAppSpecification: ModelBiasAppSpecification,
    ModelBiasJobInput: ModelBiasJobInput,
    ModelBiasJobOutputConfig: MonitoringOutputConfig,
    RoleArn: RoleArn
  ): DescribeModelBiasJobDefinitionResponse = {
    val __obj = js.Dynamic.literal(CreationTime = CreationTime.asInstanceOf[js.Any], JobDefinitionArn = JobDefinitionArn.asInstanceOf[js.Any], JobDefinitionName = JobDefinitionName.asInstanceOf[js.Any], JobResources = JobResources.asInstanceOf[js.Any], ModelBiasAppSpecification = ModelBiasAppSpecification.asInstanceOf[js.Any], ModelBiasJobInput = ModelBiasJobInput.asInstanceOf[js.Any], ModelBiasJobOutputConfig = ModelBiasJobOutputConfig.asInstanceOf[js.Any], RoleArn = RoleArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeModelBiasJobDefinitionResponse]
  }
  
  extension [Self <: DescribeModelBiasJobDefinitionResponse](x: Self) {
    
    inline def setCreationTime(value: js.Date): Self = StObject.set(x, "CreationTime", value.asInstanceOf[js.Any])
    
    inline def setJobDefinitionArn(value: MonitoringJobDefinitionArn): Self = StObject.set(x, "JobDefinitionArn", value.asInstanceOf[js.Any])
    
    inline def setJobDefinitionName(value: MonitoringJobDefinitionName): Self = StObject.set(x, "JobDefinitionName", value.asInstanceOf[js.Any])
    
    inline def setJobResources(value: MonitoringResources): Self = StObject.set(x, "JobResources", value.asInstanceOf[js.Any])
    
    inline def setModelBiasAppSpecification(value: ModelBiasAppSpecification): Self = StObject.set(x, "ModelBiasAppSpecification", value.asInstanceOf[js.Any])
    
    inline def setModelBiasBaselineConfig(value: ModelBiasBaselineConfig): Self = StObject.set(x, "ModelBiasBaselineConfig", value.asInstanceOf[js.Any])
    
    inline def setModelBiasBaselineConfigUndefined: Self = StObject.set(x, "ModelBiasBaselineConfig", js.undefined)
    
    inline def setModelBiasJobInput(value: ModelBiasJobInput): Self = StObject.set(x, "ModelBiasJobInput", value.asInstanceOf[js.Any])
    
    inline def setModelBiasJobOutputConfig(value: MonitoringOutputConfig): Self = StObject.set(x, "ModelBiasJobOutputConfig", value.asInstanceOf[js.Any])
    
    inline def setNetworkConfig(value: MonitoringNetworkConfig): Self = StObject.set(x, "NetworkConfig", value.asInstanceOf[js.Any])
    
    inline def setNetworkConfigUndefined: Self = StObject.set(x, "NetworkConfig", js.undefined)
    
    inline def setRoleArn(value: RoleArn): Self = StObject.set(x, "RoleArn", value.asInstanceOf[js.Any])
    
    inline def setStoppingCondition(value: MonitoringStoppingCondition): Self = StObject.set(x, "StoppingCondition", value.asInstanceOf[js.Any])
    
    inline def setStoppingConditionUndefined: Self = StObject.set(x, "StoppingCondition", js.undefined)
  }
}
