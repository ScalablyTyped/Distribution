package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdatePipelineExecutionRequest extends StObject {
  
  /**
    * This configuration, if specified, overrides the parallelism configuration of the parent pipeline for this specific run.
    */
  var ParallelismConfiguration: js.UndefOr[typings.awsSdk.clientsSagemakerMod.ParallelismConfiguration] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the pipeline execution.
    */
  var PipelineExecutionArn: typings.awsSdk.clientsSagemakerMod.PipelineExecutionArn
  
  /**
    * The description of the pipeline execution.
    */
  var PipelineExecutionDescription: js.UndefOr[typings.awsSdk.clientsSagemakerMod.PipelineExecutionDescription] = js.undefined
  
  /**
    * The display name of the pipeline execution.
    */
  var PipelineExecutionDisplayName: js.UndefOr[PipelineExecutionName] = js.undefined
}
object UpdatePipelineExecutionRequest {
  
  inline def apply(PipelineExecutionArn: PipelineExecutionArn): UpdatePipelineExecutionRequest = {
    val __obj = js.Dynamic.literal(PipelineExecutionArn = PipelineExecutionArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdatePipelineExecutionRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdatePipelineExecutionRequest] (val x: Self) extends AnyVal {
    
    inline def setParallelismConfiguration(value: ParallelismConfiguration): Self = StObject.set(x, "ParallelismConfiguration", value.asInstanceOf[js.Any])
    
    inline def setParallelismConfigurationUndefined: Self = StObject.set(x, "ParallelismConfiguration", js.undefined)
    
    inline def setPipelineExecutionArn(value: PipelineExecutionArn): Self = StObject.set(x, "PipelineExecutionArn", value.asInstanceOf[js.Any])
    
    inline def setPipelineExecutionDescription(value: PipelineExecutionDescription): Self = StObject.set(x, "PipelineExecutionDescription", value.asInstanceOf[js.Any])
    
    inline def setPipelineExecutionDescriptionUndefined: Self = StObject.set(x, "PipelineExecutionDescription", js.undefined)
    
    inline def setPipelineExecutionDisplayName(value: PipelineExecutionName): Self = StObject.set(x, "PipelineExecutionDisplayName", value.asInstanceOf[js.Any])
    
    inline def setPipelineExecutionDisplayNameUndefined: Self = StObject.set(x, "PipelineExecutionDisplayName", js.undefined)
  }
}
