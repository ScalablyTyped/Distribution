package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateEdgePackagingJobRequest extends StObject {
  
  /**
    * The name of the SageMaker Neo compilation job that will be used to locate model artifacts for packaging.
    */
  var CompilationJobName: EntityName
  
  /**
    * The name of the edge packaging job.
    */
  var EdgePackagingJobName: EntityName
  
  /**
    * The name of the model.
    */
  var ModelName: EntityName
  
  /**
    * The version of the model.
    */
  var ModelVersion: EdgeVersion
  
  /**
    * Provides information about the output location for the packaged model.
    */
  var OutputConfig: EdgeOutputConfig
  
  /**
    * The Amazon Web Services KMS key to use when encrypting the EBS volume the edge packaging job runs on.
    */
  var ResourceKey: js.UndefOr[KmsKeyId] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of an IAM role that enables Amazon SageMaker to download and upload the model, and to contact SageMaker Neo.
    */
  var RoleArn: typings.awsSdk.clientsSagemakerMod.RoleArn
  
  /**
    * Creates tags for the packaging job.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
}
object CreateEdgePackagingJobRequest {
  
  inline def apply(
    CompilationJobName: EntityName,
    EdgePackagingJobName: EntityName,
    ModelName: EntityName,
    ModelVersion: EdgeVersion,
    OutputConfig: EdgeOutputConfig,
    RoleArn: RoleArn
  ): CreateEdgePackagingJobRequest = {
    val __obj = js.Dynamic.literal(CompilationJobName = CompilationJobName.asInstanceOf[js.Any], EdgePackagingJobName = EdgePackagingJobName.asInstanceOf[js.Any], ModelName = ModelName.asInstanceOf[js.Any], ModelVersion = ModelVersion.asInstanceOf[js.Any], OutputConfig = OutputConfig.asInstanceOf[js.Any], RoleArn = RoleArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateEdgePackagingJobRequest]
  }
  
  extension [Self <: CreateEdgePackagingJobRequest](x: Self) {
    
    inline def setCompilationJobName(value: EntityName): Self = StObject.set(x, "CompilationJobName", value.asInstanceOf[js.Any])
    
    inline def setEdgePackagingJobName(value: EntityName): Self = StObject.set(x, "EdgePackagingJobName", value.asInstanceOf[js.Any])
    
    inline def setModelName(value: EntityName): Self = StObject.set(x, "ModelName", value.asInstanceOf[js.Any])
    
    inline def setModelVersion(value: EdgeVersion): Self = StObject.set(x, "ModelVersion", value.asInstanceOf[js.Any])
    
    inline def setOutputConfig(value: EdgeOutputConfig): Self = StObject.set(x, "OutputConfig", value.asInstanceOf[js.Any])
    
    inline def setResourceKey(value: KmsKeyId): Self = StObject.set(x, "ResourceKey", value.asInstanceOf[js.Any])
    
    inline def setResourceKeyUndefined: Self = StObject.set(x, "ResourceKey", js.undefined)
    
    inline def setRoleArn(value: RoleArn): Self = StObject.set(x, "RoleArn", value.asInstanceOf[js.Any])
    
    inline def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
  }
}
