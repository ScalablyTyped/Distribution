package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Model extends StObject {
  
  /**
    * The containers in the inference pipeline.
    */
  var Containers: js.UndefOr[ContainerDefinitionList] = js.undefined
  
  /**
    * A timestamp that indicates when the model was created.
    */
  var CreationTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * Isolates the model container. No inbound or outbound network calls can be made to or from the model container.
    */
  var EnableNetworkIsolation: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the IAM role that you specified for the model.
    */
  var ExecutionRoleArn: js.UndefOr[RoleArn] = js.undefined
  
  var InferenceExecutionConfig: js.UndefOr[typings.awsSdk.clientsSagemakerMod.InferenceExecutionConfig] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the model.
    */
  var ModelArn: js.UndefOr[typings.awsSdk.clientsSagemakerMod.ModelArn] = js.undefined
  
  /**
    * The name of the model.
    */
  var ModelName: js.UndefOr[typings.awsSdk.clientsSagemakerMod.ModelName] = js.undefined
  
  var PrimaryContainer: js.UndefOr[ContainerDefinition] = js.undefined
  
  /**
    * A list of key-value pairs associated with the model. For more information, see Tagging Amazon Web Services resources in the Amazon Web Services General Reference Guide.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
  
  var VpcConfig: js.UndefOr[typings.awsSdk.clientsSagemakerMod.VpcConfig] = js.undefined
}
object Model {
  
  inline def apply(): Model = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Model]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Model] (val x: Self) extends AnyVal {
    
    inline def setContainers(value: ContainerDefinitionList): Self = StObject.set(x, "Containers", value.asInstanceOf[js.Any])
    
    inline def setContainersUndefined: Self = StObject.set(x, "Containers", js.undefined)
    
    inline def setContainersVarargs(value: ContainerDefinition*): Self = StObject.set(x, "Containers", js.Array(value*))
    
    inline def setCreationTime(value: js.Date): Self = StObject.set(x, "CreationTime", value.asInstanceOf[js.Any])
    
    inline def setCreationTimeUndefined: Self = StObject.set(x, "CreationTime", js.undefined)
    
    inline def setEnableNetworkIsolation(value: Boolean): Self = StObject.set(x, "EnableNetworkIsolation", value.asInstanceOf[js.Any])
    
    inline def setEnableNetworkIsolationUndefined: Self = StObject.set(x, "EnableNetworkIsolation", js.undefined)
    
    inline def setExecutionRoleArn(value: RoleArn): Self = StObject.set(x, "ExecutionRoleArn", value.asInstanceOf[js.Any])
    
    inline def setExecutionRoleArnUndefined: Self = StObject.set(x, "ExecutionRoleArn", js.undefined)
    
    inline def setInferenceExecutionConfig(value: InferenceExecutionConfig): Self = StObject.set(x, "InferenceExecutionConfig", value.asInstanceOf[js.Any])
    
    inline def setInferenceExecutionConfigUndefined: Self = StObject.set(x, "InferenceExecutionConfig", js.undefined)
    
    inline def setModelArn(value: ModelArn): Self = StObject.set(x, "ModelArn", value.asInstanceOf[js.Any])
    
    inline def setModelArnUndefined: Self = StObject.set(x, "ModelArn", js.undefined)
    
    inline def setModelName(value: ModelName): Self = StObject.set(x, "ModelName", value.asInstanceOf[js.Any])
    
    inline def setModelNameUndefined: Self = StObject.set(x, "ModelName", js.undefined)
    
    inline def setPrimaryContainer(value: ContainerDefinition): Self = StObject.set(x, "PrimaryContainer", value.asInstanceOf[js.Any])
    
    inline def setPrimaryContainerUndefined: Self = StObject.set(x, "PrimaryContainer", js.undefined)
    
    inline def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
    
    inline def setVpcConfig(value: VpcConfig): Self = StObject.set(x, "VpcConfig", value.asInstanceOf[js.Any])
    
    inline def setVpcConfigUndefined: Self = StObject.set(x, "VpcConfig", js.undefined)
  }
}
