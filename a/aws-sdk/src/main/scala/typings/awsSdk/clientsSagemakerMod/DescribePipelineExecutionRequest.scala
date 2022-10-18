package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribePipelineExecutionRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the pipeline execution.
    */
  var PipelineExecutionArn: typings.awsSdk.clientsSagemakerMod.PipelineExecutionArn
}
object DescribePipelineExecutionRequest {
  
  inline def apply(PipelineExecutionArn: PipelineExecutionArn): DescribePipelineExecutionRequest = {
    val __obj = js.Dynamic.literal(PipelineExecutionArn = PipelineExecutionArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribePipelineExecutionRequest]
  }
  
  extension [Self <: DescribePipelineExecutionRequest](x: Self) {
    
    inline def setPipelineExecutionArn(value: PipelineExecutionArn): Self = StObject.set(x, "PipelineExecutionArn", value.asInstanceOf[js.Any])
  }
}
