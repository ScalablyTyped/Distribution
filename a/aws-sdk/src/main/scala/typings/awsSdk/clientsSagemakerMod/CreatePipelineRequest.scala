package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreatePipelineRequest extends StObject {
  
  /**
    * A unique, case-sensitive identifier that you provide to ensure the idempotency of the operation. An idempotent operation completes no more than one time.
    */
  var ClientRequestToken: IdempotencyToken
  
  /**
    * This is the configuration that controls the parallelism of the pipeline. If specified, it applies to all runs of this pipeline by default.
    */
  var ParallelismConfiguration: js.UndefOr[typings.awsSdk.clientsSagemakerMod.ParallelismConfiguration] = js.undefined
  
  /**
    * The JSON pipeline definition of the pipeline.
    */
  var PipelineDefinition: js.UndefOr[typings.awsSdk.clientsSagemakerMod.PipelineDefinition] = js.undefined
  
  /**
    * The location of the pipeline definition stored in Amazon S3. If specified, SageMaker will retrieve the pipeline definition from this location.
    */
  var PipelineDefinitionS3Location: js.UndefOr[typings.awsSdk.clientsSagemakerMod.PipelineDefinitionS3Location] = js.undefined
  
  /**
    * A description of the pipeline.
    */
  var PipelineDescription: js.UndefOr[typings.awsSdk.clientsSagemakerMod.PipelineDescription] = js.undefined
  
  /**
    * The display name of the pipeline.
    */
  var PipelineDisplayName: js.UndefOr[PipelineName] = js.undefined
  
  /**
    * The name of the pipeline.
    */
  var PipelineName: typings.awsSdk.clientsSagemakerMod.PipelineName
  
  /**
    * The Amazon Resource Name (ARN) of the role used by the pipeline to access and create resources.
    */
  var RoleArn: typings.awsSdk.clientsSagemakerMod.RoleArn
  
  /**
    * A list of tags to apply to the created pipeline.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
}
object CreatePipelineRequest {
  
  inline def apply(ClientRequestToken: IdempotencyToken, PipelineName: PipelineName, RoleArn: RoleArn): CreatePipelineRequest = {
    val __obj = js.Dynamic.literal(ClientRequestToken = ClientRequestToken.asInstanceOf[js.Any], PipelineName = PipelineName.asInstanceOf[js.Any], RoleArn = RoleArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreatePipelineRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreatePipelineRequest] (val x: Self) extends AnyVal {
    
    inline def setClientRequestToken(value: IdempotencyToken): Self = StObject.set(x, "ClientRequestToken", value.asInstanceOf[js.Any])
    
    inline def setParallelismConfiguration(value: ParallelismConfiguration): Self = StObject.set(x, "ParallelismConfiguration", value.asInstanceOf[js.Any])
    
    inline def setParallelismConfigurationUndefined: Self = StObject.set(x, "ParallelismConfiguration", js.undefined)
    
    inline def setPipelineDefinition(value: PipelineDefinition): Self = StObject.set(x, "PipelineDefinition", value.asInstanceOf[js.Any])
    
    inline def setPipelineDefinitionS3Location(value: PipelineDefinitionS3Location): Self = StObject.set(x, "PipelineDefinitionS3Location", value.asInstanceOf[js.Any])
    
    inline def setPipelineDefinitionS3LocationUndefined: Self = StObject.set(x, "PipelineDefinitionS3Location", js.undefined)
    
    inline def setPipelineDefinitionUndefined: Self = StObject.set(x, "PipelineDefinition", js.undefined)
    
    inline def setPipelineDescription(value: PipelineDescription): Self = StObject.set(x, "PipelineDescription", value.asInstanceOf[js.Any])
    
    inline def setPipelineDescriptionUndefined: Self = StObject.set(x, "PipelineDescription", js.undefined)
    
    inline def setPipelineDisplayName(value: PipelineName): Self = StObject.set(x, "PipelineDisplayName", value.asInstanceOf[js.Any])
    
    inline def setPipelineDisplayNameUndefined: Self = StObject.set(x, "PipelineDisplayName", js.undefined)
    
    inline def setPipelineName(value: PipelineName): Self = StObject.set(x, "PipelineName", value.asInstanceOf[js.Any])
    
    inline def setRoleArn(value: RoleArn): Self = StObject.set(x, "RoleArn", value.asInstanceOf[js.Any])
    
    inline def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
  }
}
