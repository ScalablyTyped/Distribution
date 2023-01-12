package typings.awsSdk.clientsCodepipelineMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetPipelineStateOutput extends StObject {
  
  /**
    * The date and time the pipeline was created, in timestamp format.
    */
  var created: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The name of the pipeline for which you want to get the state.
    */
  var pipelineName: js.UndefOr[PipelineName] = js.undefined
  
  /**
    * The version number of the pipeline.  A newly created pipeline is always assigned a version number of 1. 
    */
  var pipelineVersion: js.UndefOr[PipelineVersion] = js.undefined
  
  /**
    * A list of the pipeline stage output information, including stage name, state, most recent run details, whether the stage is disabled, and other data.
    */
  var stageStates: js.UndefOr[StageStateList] = js.undefined
  
  /**
    * The date and time the pipeline was last updated, in timestamp format.
    */
  var updated: js.UndefOr[js.Date] = js.undefined
}
object GetPipelineStateOutput {
  
  inline def apply(): GetPipelineStateOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetPipelineStateOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetPipelineStateOutput] (val x: Self) extends AnyVal {
    
    inline def setCreated(value: js.Date): Self = StObject.set(x, "created", value.asInstanceOf[js.Any])
    
    inline def setCreatedUndefined: Self = StObject.set(x, "created", js.undefined)
    
    inline def setPipelineName(value: PipelineName): Self = StObject.set(x, "pipelineName", value.asInstanceOf[js.Any])
    
    inline def setPipelineNameUndefined: Self = StObject.set(x, "pipelineName", js.undefined)
    
    inline def setPipelineVersion(value: PipelineVersion): Self = StObject.set(x, "pipelineVersion", value.asInstanceOf[js.Any])
    
    inline def setPipelineVersionUndefined: Self = StObject.set(x, "pipelineVersion", js.undefined)
    
    inline def setStageStates(value: StageStateList): Self = StObject.set(x, "stageStates", value.asInstanceOf[js.Any])
    
    inline def setStageStatesUndefined: Self = StObject.set(x, "stageStates", js.undefined)
    
    inline def setStageStatesVarargs(value: StageState*): Self = StObject.set(x, "stageStates", js.Array(value*))
    
    inline def setUpdated(value: js.Date): Self = StObject.set(x, "updated", value.asInstanceOf[js.Any])
    
    inline def setUpdatedUndefined: Self = StObject.set(x, "updated", js.undefined)
  }
}
