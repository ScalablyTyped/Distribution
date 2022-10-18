package typings.awsSdk.clientsElastictranscoderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdatePipelineStatusRequest extends StObject {
  
  /**
    * The identifier of the pipeline to update.
    */
  var Id: typings.awsSdk.clientsElastictranscoderMod.Id
  
  /**
    * The desired status of the pipeline:    Active: The pipeline is processing jobs.    Paused: The pipeline is not currently processing jobs.  
    */
  var Status: PipelineStatus
}
object UpdatePipelineStatusRequest {
  
  inline def apply(Id: Id, Status: PipelineStatus): UpdatePipelineStatusRequest = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any], Status = Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdatePipelineStatusRequest]
  }
  
  extension [Self <: UpdatePipelineStatusRequest](x: Self) {
    
    inline def setId(value: Id): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: PipelineStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
  }
}
