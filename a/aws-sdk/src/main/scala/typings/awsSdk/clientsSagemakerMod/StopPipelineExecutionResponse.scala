package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StopPipelineExecutionResponse extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the pipeline execution.
    */
  var PipelineExecutionArn: js.UndefOr[typings.awsSdk.clientsSagemakerMod.PipelineExecutionArn] = js.undefined
}
object StopPipelineExecutionResponse {
  
  inline def apply(): StopPipelineExecutionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StopPipelineExecutionResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StopPipelineExecutionResponse] (val x: Self) extends AnyVal {
    
    inline def setPipelineExecutionArn(value: PipelineExecutionArn): Self = StObject.set(x, "PipelineExecutionArn", value.asInstanceOf[js.Any])
    
    inline def setPipelineExecutionArnUndefined: Self = StObject.set(x, "PipelineExecutionArn", js.undefined)
  }
}
