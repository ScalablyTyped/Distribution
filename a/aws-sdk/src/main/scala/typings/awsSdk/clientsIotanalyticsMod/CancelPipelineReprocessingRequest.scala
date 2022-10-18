package typings.awsSdk.clientsIotanalyticsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CancelPipelineReprocessingRequest extends StObject {
  
  /**
    * The name of pipeline for which data reprocessing is canceled.
    */
  var pipelineName: PipelineName
  
  /**
    * The ID of the reprocessing task (returned by StartPipelineReprocessing).
    */
  var reprocessingId: ReprocessingId
}
object CancelPipelineReprocessingRequest {
  
  inline def apply(pipelineName: PipelineName, reprocessingId: ReprocessingId): CancelPipelineReprocessingRequest = {
    val __obj = js.Dynamic.literal(pipelineName = pipelineName.asInstanceOf[js.Any], reprocessingId = reprocessingId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CancelPipelineReprocessingRequest]
  }
  
  extension [Self <: CancelPipelineReprocessingRequest](x: Self) {
    
    inline def setPipelineName(value: PipelineName): Self = StObject.set(x, "pipelineName", value.asInstanceOf[js.Any])
    
    inline def setReprocessingId(value: ReprocessingId): Self = StObject.set(x, "reprocessingId", value.asInstanceOf[js.Any])
  }
}
