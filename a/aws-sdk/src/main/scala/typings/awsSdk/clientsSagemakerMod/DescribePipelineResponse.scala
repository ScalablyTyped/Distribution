package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribePipelineResponse extends StObject {
  
  var CreatedBy: js.UndefOr[UserContext] = js.undefined
  
  /**
    * The time when the pipeline was created.
    */
  var CreationTime: js.UndefOr[js.Date] = js.undefined
  
  var LastModifiedBy: js.UndefOr[UserContext] = js.undefined
  
  /**
    * The time when the pipeline was last modified.
    */
  var LastModifiedTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The time when the pipeline was last run.
    */
  var LastRunTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * Lists the parallelism configuration applied to the pipeline.
    */
  var ParallelismConfiguration: js.UndefOr[typings.awsSdk.clientsSagemakerMod.ParallelismConfiguration] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the pipeline.
    */
  var PipelineArn: js.UndefOr[typings.awsSdk.clientsSagemakerMod.PipelineArn] = js.undefined
  
  /**
    * The JSON pipeline definition.
    */
  var PipelineDefinition: js.UndefOr[typings.awsSdk.clientsSagemakerMod.PipelineDefinition] = js.undefined
  
  /**
    * The description of the pipeline.
    */
  var PipelineDescription: js.UndefOr[typings.awsSdk.clientsSagemakerMod.PipelineDescription] = js.undefined
  
  /**
    * The display name of the pipeline.
    */
  var PipelineDisplayName: js.UndefOr[PipelineName] = js.undefined
  
  /**
    * The name of the pipeline.
    */
  var PipelineName: js.UndefOr[typings.awsSdk.clientsSagemakerMod.PipelineName] = js.undefined
  
  /**
    * The status of the pipeline execution.
    */
  var PipelineStatus: js.UndefOr[typings.awsSdk.clientsSagemakerMod.PipelineStatus] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) that the pipeline uses to execute.
    */
  var RoleArn: js.UndefOr[typings.awsSdk.clientsSagemakerMod.RoleArn] = js.undefined
}
object DescribePipelineResponse {
  
  inline def apply(): DescribePipelineResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribePipelineResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribePipelineResponse] (val x: Self) extends AnyVal {
    
    inline def setCreatedBy(value: UserContext): Self = StObject.set(x, "CreatedBy", value.asInstanceOf[js.Any])
    
    inline def setCreatedByUndefined: Self = StObject.set(x, "CreatedBy", js.undefined)
    
    inline def setCreationTime(value: js.Date): Self = StObject.set(x, "CreationTime", value.asInstanceOf[js.Any])
    
    inline def setCreationTimeUndefined: Self = StObject.set(x, "CreationTime", js.undefined)
    
    inline def setLastModifiedBy(value: UserContext): Self = StObject.set(x, "LastModifiedBy", value.asInstanceOf[js.Any])
    
    inline def setLastModifiedByUndefined: Self = StObject.set(x, "LastModifiedBy", js.undefined)
    
    inline def setLastModifiedTime(value: js.Date): Self = StObject.set(x, "LastModifiedTime", value.asInstanceOf[js.Any])
    
    inline def setLastModifiedTimeUndefined: Self = StObject.set(x, "LastModifiedTime", js.undefined)
    
    inline def setLastRunTime(value: js.Date): Self = StObject.set(x, "LastRunTime", value.asInstanceOf[js.Any])
    
    inline def setLastRunTimeUndefined: Self = StObject.set(x, "LastRunTime", js.undefined)
    
    inline def setParallelismConfiguration(value: ParallelismConfiguration): Self = StObject.set(x, "ParallelismConfiguration", value.asInstanceOf[js.Any])
    
    inline def setParallelismConfigurationUndefined: Self = StObject.set(x, "ParallelismConfiguration", js.undefined)
    
    inline def setPipelineArn(value: PipelineArn): Self = StObject.set(x, "PipelineArn", value.asInstanceOf[js.Any])
    
    inline def setPipelineArnUndefined: Self = StObject.set(x, "PipelineArn", js.undefined)
    
    inline def setPipelineDefinition(value: PipelineDefinition): Self = StObject.set(x, "PipelineDefinition", value.asInstanceOf[js.Any])
    
    inline def setPipelineDefinitionUndefined: Self = StObject.set(x, "PipelineDefinition", js.undefined)
    
    inline def setPipelineDescription(value: PipelineDescription): Self = StObject.set(x, "PipelineDescription", value.asInstanceOf[js.Any])
    
    inline def setPipelineDescriptionUndefined: Self = StObject.set(x, "PipelineDescription", js.undefined)
    
    inline def setPipelineDisplayName(value: PipelineName): Self = StObject.set(x, "PipelineDisplayName", value.asInstanceOf[js.Any])
    
    inline def setPipelineDisplayNameUndefined: Self = StObject.set(x, "PipelineDisplayName", js.undefined)
    
    inline def setPipelineName(value: PipelineName): Self = StObject.set(x, "PipelineName", value.asInstanceOf[js.Any])
    
    inline def setPipelineNameUndefined: Self = StObject.set(x, "PipelineName", js.undefined)
    
    inline def setPipelineStatus(value: PipelineStatus): Self = StObject.set(x, "PipelineStatus", value.asInstanceOf[js.Any])
    
    inline def setPipelineStatusUndefined: Self = StObject.set(x, "PipelineStatus", js.undefined)
    
    inline def setRoleArn(value: RoleArn): Self = StObject.set(x, "RoleArn", value.asInstanceOf[js.Any])
    
    inline def setRoleArnUndefined: Self = StObject.set(x, "RoleArn", js.undefined)
  }
}
