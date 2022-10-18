package typings.awsSdk.clientsCodepipelineMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetPipelineExecutionOutput extends StObject {
  
  /**
    * Represents information about the execution of a pipeline.
    */
  var pipelineExecution: js.UndefOr[PipelineExecution] = js.undefined
}
object GetPipelineExecutionOutput {
  
  inline def apply(): GetPipelineExecutionOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetPipelineExecutionOutput]
  }
  
  extension [Self <: GetPipelineExecutionOutput](x: Self) {
    
    inline def setPipelineExecution(value: PipelineExecution): Self = StObject.set(x, "pipelineExecution", value.asInstanceOf[js.Any])
    
    inline def setPipelineExecutionUndefined: Self = StObject.set(x, "pipelineExecution", js.undefined)
  }
}
