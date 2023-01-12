package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PipelineSummary extends StObject {
  
  /**
    * The creation time of the pipeline.
    */
  var CreationTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The last time that a pipeline execution began.
    */
  var LastExecutionTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The time that the pipeline was last modified.
    */
  var LastModifiedTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    *  The Amazon Resource Name (ARN) of the pipeline.
    */
  var PipelineArn: js.UndefOr[typings.awsSdk.clientsSagemakerMod.PipelineArn] = js.undefined
  
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
    * The Amazon Resource Name (ARN) that the pipeline used to execute.
    */
  var RoleArn: js.UndefOr[typings.awsSdk.clientsSagemakerMod.RoleArn] = js.undefined
}
object PipelineSummary {
  
  inline def apply(): PipelineSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PipelineSummary]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PipelineSummary] (val x: Self) extends AnyVal {
    
    inline def setCreationTime(value: js.Date): Self = StObject.set(x, "CreationTime", value.asInstanceOf[js.Any])
    
    inline def setCreationTimeUndefined: Self = StObject.set(x, "CreationTime", js.undefined)
    
    inline def setLastExecutionTime(value: js.Date): Self = StObject.set(x, "LastExecutionTime", value.asInstanceOf[js.Any])
    
    inline def setLastExecutionTimeUndefined: Self = StObject.set(x, "LastExecutionTime", js.undefined)
    
    inline def setLastModifiedTime(value: js.Date): Self = StObject.set(x, "LastModifiedTime", value.asInstanceOf[js.Any])
    
    inline def setLastModifiedTimeUndefined: Self = StObject.set(x, "LastModifiedTime", js.undefined)
    
    inline def setPipelineArn(value: PipelineArn): Self = StObject.set(x, "PipelineArn", value.asInstanceOf[js.Any])
    
    inline def setPipelineArnUndefined: Self = StObject.set(x, "PipelineArn", js.undefined)
    
    inline def setPipelineDescription(value: PipelineDescription): Self = StObject.set(x, "PipelineDescription", value.asInstanceOf[js.Any])
    
    inline def setPipelineDescriptionUndefined: Self = StObject.set(x, "PipelineDescription", js.undefined)
    
    inline def setPipelineDisplayName(value: PipelineName): Self = StObject.set(x, "PipelineDisplayName", value.asInstanceOf[js.Any])
    
    inline def setPipelineDisplayNameUndefined: Self = StObject.set(x, "PipelineDisplayName", js.undefined)
    
    inline def setPipelineName(value: PipelineName): Self = StObject.set(x, "PipelineName", value.asInstanceOf[js.Any])
    
    inline def setPipelineNameUndefined: Self = StObject.set(x, "PipelineName", js.undefined)
    
    inline def setRoleArn(value: RoleArn): Self = StObject.set(x, "RoleArn", value.asInstanceOf[js.Any])
    
    inline def setRoleArnUndefined: Self = StObject.set(x, "RoleArn", js.undefined)
  }
}
