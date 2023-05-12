package typings.awsSdk.clientsOsisMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeletePipelineRequest extends StObject {
  
  /**
    * The name of the pipeline to delete.
    */
  var PipelineName: typings.awsSdk.clientsOsisMod.PipelineName
}
object DeletePipelineRequest {
  
  inline def apply(PipelineName: PipelineName): DeletePipelineRequest = {
    val __obj = js.Dynamic.literal(PipelineName = PipelineName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeletePipelineRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeletePipelineRequest] (val x: Self) extends AnyVal {
    
    inline def setPipelineName(value: PipelineName): Self = StObject.set(x, "PipelineName", value.asInstanceOf[js.Any])
  }
}
