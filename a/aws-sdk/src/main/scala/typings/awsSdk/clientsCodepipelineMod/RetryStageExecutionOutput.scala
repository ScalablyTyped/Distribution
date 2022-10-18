package typings.awsSdk.clientsCodepipelineMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RetryStageExecutionOutput extends StObject {
  
  /**
    * The ID of the current workflow execution in the failed stage.
    */
  var pipelineExecutionId: js.UndefOr[PipelineExecutionId] = js.undefined
}
object RetryStageExecutionOutput {
  
  inline def apply(): RetryStageExecutionOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RetryStageExecutionOutput]
  }
  
  extension [Self <: RetryStageExecutionOutput](x: Self) {
    
    inline def setPipelineExecutionId(value: PipelineExecutionId): Self = StObject.set(x, "pipelineExecutionId", value.asInstanceOf[js.Any])
    
    inline def setPipelineExecutionIdUndefined: Self = StObject.set(x, "pipelineExecutionId", js.undefined)
  }
}
