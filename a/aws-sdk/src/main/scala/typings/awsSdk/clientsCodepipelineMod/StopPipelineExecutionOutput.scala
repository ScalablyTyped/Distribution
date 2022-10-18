package typings.awsSdk.clientsCodepipelineMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StopPipelineExecutionOutput extends StObject {
  
  /**
    * The unique system-generated ID of the pipeline execution that was stopped.
    */
  var pipelineExecutionId: js.UndefOr[PipelineExecutionId] = js.undefined
}
object StopPipelineExecutionOutput {
  
  inline def apply(): StopPipelineExecutionOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StopPipelineExecutionOutput]
  }
  
  extension [Self <: StopPipelineExecutionOutput](x: Self) {
    
    inline def setPipelineExecutionId(value: PipelineExecutionId): Self = StObject.set(x, "pipelineExecutionId", value.asInstanceOf[js.Any])
    
    inline def setPipelineExecutionIdUndefined: Self = StObject.set(x, "pipelineExecutionId", js.undefined)
  }
}
