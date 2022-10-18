package typings.awsSdk.clientsCodepipelineMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PipelineContext extends StObject {
  
  /**
    * The context of an action to a job worker in the stage of a pipeline.
    */
  var action: js.UndefOr[ActionContext] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the pipeline.
    */
  var pipelineArn: js.UndefOr[PipelineArn] = js.undefined
  
  /**
    * The execution ID of the pipeline.
    */
  var pipelineExecutionId: js.UndefOr[PipelineExecutionId] = js.undefined
  
  /**
    * The name of the pipeline. This is a user-specified value. Pipeline names must be unique across all pipeline names under an Amazon Web Services account.
    */
  var pipelineName: js.UndefOr[PipelineName] = js.undefined
  
  /**
    * The stage of the pipeline.
    */
  var stage: js.UndefOr[StageContext] = js.undefined
}
object PipelineContext {
  
  inline def apply(): PipelineContext = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PipelineContext]
  }
  
  extension [Self <: PipelineContext](x: Self) {
    
    inline def setAction(value: ActionContext): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
    
    inline def setPipelineArn(value: PipelineArn): Self = StObject.set(x, "pipelineArn", value.asInstanceOf[js.Any])
    
    inline def setPipelineArnUndefined: Self = StObject.set(x, "pipelineArn", js.undefined)
    
    inline def setPipelineExecutionId(value: PipelineExecutionId): Self = StObject.set(x, "pipelineExecutionId", value.asInstanceOf[js.Any])
    
    inline def setPipelineExecutionIdUndefined: Self = StObject.set(x, "pipelineExecutionId", js.undefined)
    
    inline def setPipelineName(value: PipelineName): Self = StObject.set(x, "pipelineName", value.asInstanceOf[js.Any])
    
    inline def setPipelineNameUndefined: Self = StObject.set(x, "pipelineName", js.undefined)
    
    inline def setStage(value: StageContext): Self = StObject.set(x, "stage", value.asInstanceOf[js.Any])
    
    inline def setStageUndefined: Self = StObject.set(x, "stage", js.undefined)
  }
}
