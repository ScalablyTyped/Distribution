package typings.awsSdk.clientsOsisMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StopPipelineRequest extends StObject {
  
  /**
    * The name of the pipeline to stop.
    */
  var PipelineName: typings.awsSdk.clientsOsisMod.PipelineName
}
object StopPipelineRequest {
  
  inline def apply(PipelineName: PipelineName): StopPipelineRequest = {
    val __obj = js.Dynamic.literal(PipelineName = PipelineName.asInstanceOf[js.Any])
    __obj.asInstanceOf[StopPipelineRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StopPipelineRequest] (val x: Self) extends AnyVal {
    
    inline def setPipelineName(value: PipelineName): Self = StObject.set(x, "PipelineName", value.asInstanceOf[js.Any])
  }
}
