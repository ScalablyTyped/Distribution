package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeModelOutput extends StObject {
  
  /**
    * The containers in the inference pipeline.
    */
  var Containers: js.UndefOr[ContainerDefinitionList] = js.undefined
  
  /**
    * A timestamp that shows when the model was created.
    */
  var CreationTime: js.Date
  
  /**
    * If True, no inbound or outbound network calls can be made to or from the model container.
    */
  var EnableNetworkIsolation: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the IAM role that you specified for the model.
    */
  var ExecutionRoleArn: RoleArn
  
  /**
    * Specifies details of how containers in a multi-container endpoint are called.
    */
  var InferenceExecutionConfig: js.UndefOr[typings.awsSdk.clientsSagemakerMod.InferenceExecutionConfig] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the model.
    */
  var ModelArn: typings.awsSdk.clientsSagemakerMod.ModelArn
  
  /**
    * Name of the SageMaker model.
    */
  var ModelName: typings.awsSdk.clientsSagemakerMod.ModelName
  
  /**
    * The location of the primary inference code, associated artifacts, and custom environment map that the inference code uses when it is deployed in production. 
    */
  var PrimaryContainer: js.UndefOr[ContainerDefinition] = js.undefined
  
  /**
    * A VpcConfig object that specifies the VPC that this model has access to. For more information, see Protect Endpoints by Using an Amazon Virtual Private Cloud 
    */
  var VpcConfig: js.UndefOr[typings.awsSdk.clientsSagemakerMod.VpcConfig] = js.undefined
}
object DescribeModelOutput {
  
  inline def apply(CreationTime: js.Date, ExecutionRoleArn: RoleArn, ModelArn: ModelArn, ModelName: ModelName): DescribeModelOutput = {
    val __obj = js.Dynamic.literal(CreationTime = CreationTime.asInstanceOf[js.Any], ExecutionRoleArn = ExecutionRoleArn.asInstanceOf[js.Any], ModelArn = ModelArn.asInstanceOf[js.Any], ModelName = ModelName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeModelOutput]
  }
  
  extension [Self <: DescribeModelOutput](x: Self) {
    
    inline def setContainers(value: ContainerDefinitionList): Self = StObject.set(x, "Containers", value.asInstanceOf[js.Any])
    
    inline def setContainersUndefined: Self = StObject.set(x, "Containers", js.undefined)
    
    inline def setContainersVarargs(value: ContainerDefinition*): Self = StObject.set(x, "Containers", js.Array(value*))
    
    inline def setCreationTime(value: js.Date): Self = StObject.set(x, "CreationTime", value.asInstanceOf[js.Any])
    
    inline def setEnableNetworkIsolation(value: Boolean): Self = StObject.set(x, "EnableNetworkIsolation", value.asInstanceOf[js.Any])
    
    inline def setEnableNetworkIsolationUndefined: Self = StObject.set(x, "EnableNetworkIsolation", js.undefined)
    
    inline def setExecutionRoleArn(value: RoleArn): Self = StObject.set(x, "ExecutionRoleArn", value.asInstanceOf[js.Any])
    
    inline def setInferenceExecutionConfig(value: InferenceExecutionConfig): Self = StObject.set(x, "InferenceExecutionConfig", value.asInstanceOf[js.Any])
    
    inline def setInferenceExecutionConfigUndefined: Self = StObject.set(x, "InferenceExecutionConfig", js.undefined)
    
    inline def setModelArn(value: ModelArn): Self = StObject.set(x, "ModelArn", value.asInstanceOf[js.Any])
    
    inline def setModelName(value: ModelName): Self = StObject.set(x, "ModelName", value.asInstanceOf[js.Any])
    
    inline def setPrimaryContainer(value: ContainerDefinition): Self = StObject.set(x, "PrimaryContainer", value.asInstanceOf[js.Any])
    
    inline def setPrimaryContainerUndefined: Self = StObject.set(x, "PrimaryContainer", js.undefined)
    
    inline def setVpcConfig(value: VpcConfig): Self = StObject.set(x, "VpcConfig", value.asInstanceOf[js.Any])
    
    inline def setVpcConfigUndefined: Self = StObject.set(x, "VpcConfig", js.undefined)
  }
}
