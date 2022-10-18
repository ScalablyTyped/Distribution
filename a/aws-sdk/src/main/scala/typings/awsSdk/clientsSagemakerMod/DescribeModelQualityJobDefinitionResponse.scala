package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeModelQualityJobDefinitionResponse extends StObject {
  
  /**
    * The time at which the model quality job was created.
    */
  var CreationTime: js.Date
  
  /**
    * The Amazon Resource Name (ARN) of the model quality job.
    */
  var JobDefinitionArn: MonitoringJobDefinitionArn
  
  /**
    * The name of the quality job definition. The name must be unique within an Amazon Web Services Region in the Amazon Web Services account.
    */
  var JobDefinitionName: MonitoringJobDefinitionName
  
  var JobResources: MonitoringResources
  
  /**
    * Configures the model quality job to run a specified Docker container image.
    */
  var ModelQualityAppSpecification: typings.awsSdk.clientsSagemakerMod.ModelQualityAppSpecification
  
  /**
    * The baseline configuration for a model quality job.
    */
  var ModelQualityBaselineConfig: js.UndefOr[typings.awsSdk.clientsSagemakerMod.ModelQualityBaselineConfig] = js.undefined
  
  /**
    * Inputs for the model quality job.
    */
  var ModelQualityJobInput: typings.awsSdk.clientsSagemakerMod.ModelQualityJobInput
  
  var ModelQualityJobOutputConfig: MonitoringOutputConfig
  
  /**
    * Networking options for a model quality job.
    */
  var NetworkConfig: js.UndefOr[MonitoringNetworkConfig] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of an IAM role that Amazon SageMaker can assume to perform tasks on your behalf.
    */
  var RoleArn: typings.awsSdk.clientsSagemakerMod.RoleArn
  
  var StoppingCondition: js.UndefOr[MonitoringStoppingCondition] = js.undefined
}
object DescribeModelQualityJobDefinitionResponse {
  
  inline def apply(
    CreationTime: js.Date,
    JobDefinitionArn: MonitoringJobDefinitionArn,
    JobDefinitionName: MonitoringJobDefinitionName,
    JobResources: MonitoringResources,
    ModelQualityAppSpecification: ModelQualityAppSpecification,
    ModelQualityJobInput: ModelQualityJobInput,
    ModelQualityJobOutputConfig: MonitoringOutputConfig,
    RoleArn: RoleArn
  ): DescribeModelQualityJobDefinitionResponse = {
    val __obj = js.Dynamic.literal(CreationTime = CreationTime.asInstanceOf[js.Any], JobDefinitionArn = JobDefinitionArn.asInstanceOf[js.Any], JobDefinitionName = JobDefinitionName.asInstanceOf[js.Any], JobResources = JobResources.asInstanceOf[js.Any], ModelQualityAppSpecification = ModelQualityAppSpecification.asInstanceOf[js.Any], ModelQualityJobInput = ModelQualityJobInput.asInstanceOf[js.Any], ModelQualityJobOutputConfig = ModelQualityJobOutputConfig.asInstanceOf[js.Any], RoleArn = RoleArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeModelQualityJobDefinitionResponse]
  }
  
  extension [Self <: DescribeModelQualityJobDefinitionResponse](x: Self) {
    
    inline def setCreationTime(value: js.Date): Self = StObject.set(x, "CreationTime", value.asInstanceOf[js.Any])
    
    inline def setJobDefinitionArn(value: MonitoringJobDefinitionArn): Self = StObject.set(x, "JobDefinitionArn", value.asInstanceOf[js.Any])
    
    inline def setJobDefinitionName(value: MonitoringJobDefinitionName): Self = StObject.set(x, "JobDefinitionName", value.asInstanceOf[js.Any])
    
    inline def setJobResources(value: MonitoringResources): Self = StObject.set(x, "JobResources", value.asInstanceOf[js.Any])
    
    inline def setModelQualityAppSpecification(value: ModelQualityAppSpecification): Self = StObject.set(x, "ModelQualityAppSpecification", value.asInstanceOf[js.Any])
    
    inline def setModelQualityBaselineConfig(value: ModelQualityBaselineConfig): Self = StObject.set(x, "ModelQualityBaselineConfig", value.asInstanceOf[js.Any])
    
    inline def setModelQualityBaselineConfigUndefined: Self = StObject.set(x, "ModelQualityBaselineConfig", js.undefined)
    
    inline def setModelQualityJobInput(value: ModelQualityJobInput): Self = StObject.set(x, "ModelQualityJobInput", value.asInstanceOf[js.Any])
    
    inline def setModelQualityJobOutputConfig(value: MonitoringOutputConfig): Self = StObject.set(x, "ModelQualityJobOutputConfig", value.asInstanceOf[js.Any])
    
    inline def setNetworkConfig(value: MonitoringNetworkConfig): Self = StObject.set(x, "NetworkConfig", value.asInstanceOf[js.Any])
    
    inline def setNetworkConfigUndefined: Self = StObject.set(x, "NetworkConfig", js.undefined)
    
    inline def setRoleArn(value: RoleArn): Self = StObject.set(x, "RoleArn", value.asInstanceOf[js.Any])
    
    inline def setStoppingCondition(value: MonitoringStoppingCondition): Self = StObject.set(x, "StoppingCondition", value.asInstanceOf[js.Any])
    
    inline def setStoppingConditionUndefined: Self = StObject.set(x, "StoppingCondition", js.undefined)
  }
}
