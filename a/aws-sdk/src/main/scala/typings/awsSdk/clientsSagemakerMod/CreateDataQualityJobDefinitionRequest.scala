package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateDataQualityJobDefinitionRequest extends StObject {
  
  /**
    * Specifies the container that runs the monitoring job.
    */
  var DataQualityAppSpecification: typings.awsSdk.clientsSagemakerMod.DataQualityAppSpecification
  
  /**
    * Configures the constraints and baselines for the monitoring job.
    */
  var DataQualityBaselineConfig: js.UndefOr[typings.awsSdk.clientsSagemakerMod.DataQualityBaselineConfig] = js.undefined
  
  /**
    * A list of inputs for the monitoring job. Currently endpoints are supported as monitoring inputs.
    */
  var DataQualityJobInput: typings.awsSdk.clientsSagemakerMod.DataQualityJobInput
  
  var DataQualityJobOutputConfig: MonitoringOutputConfig
  
  /**
    * The name for the monitoring job definition.
    */
  var JobDefinitionName: MonitoringJobDefinitionName
  
  var JobResources: MonitoringResources
  
  /**
    * Specifies networking configuration for the monitoring job.
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
object CreateDataQualityJobDefinitionRequest {
  
  inline def apply(
    DataQualityAppSpecification: DataQualityAppSpecification,
    DataQualityJobInput: DataQualityJobInput,
    DataQualityJobOutputConfig: MonitoringOutputConfig,
    JobDefinitionName: MonitoringJobDefinitionName,
    JobResources: MonitoringResources,
    RoleArn: RoleArn
  ): CreateDataQualityJobDefinitionRequest = {
    val __obj = js.Dynamic.literal(DataQualityAppSpecification = DataQualityAppSpecification.asInstanceOf[js.Any], DataQualityJobInput = DataQualityJobInput.asInstanceOf[js.Any], DataQualityJobOutputConfig = DataQualityJobOutputConfig.asInstanceOf[js.Any], JobDefinitionName = JobDefinitionName.asInstanceOf[js.Any], JobResources = JobResources.asInstanceOf[js.Any], RoleArn = RoleArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateDataQualityJobDefinitionRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateDataQualityJobDefinitionRequest] (val x: Self) extends AnyVal {
    
    inline def setDataQualityAppSpecification(value: DataQualityAppSpecification): Self = StObject.set(x, "DataQualityAppSpecification", value.asInstanceOf[js.Any])
    
    inline def setDataQualityBaselineConfig(value: DataQualityBaselineConfig): Self = StObject.set(x, "DataQualityBaselineConfig", value.asInstanceOf[js.Any])
    
    inline def setDataQualityBaselineConfigUndefined: Self = StObject.set(x, "DataQualityBaselineConfig", js.undefined)
    
    inline def setDataQualityJobInput(value: DataQualityJobInput): Self = StObject.set(x, "DataQualityJobInput", value.asInstanceOf[js.Any])
    
    inline def setDataQualityJobOutputConfig(value: MonitoringOutputConfig): Self = StObject.set(x, "DataQualityJobOutputConfig", value.asInstanceOf[js.Any])
    
    inline def setJobDefinitionName(value: MonitoringJobDefinitionName): Self = StObject.set(x, "JobDefinitionName", value.asInstanceOf[js.Any])
    
    inline def setJobResources(value: MonitoringResources): Self = StObject.set(x, "JobResources", value.asInstanceOf[js.Any])
    
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
