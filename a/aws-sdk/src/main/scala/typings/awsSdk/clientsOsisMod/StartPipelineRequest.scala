package typings.awsSdk.clientsOsisMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartPipelineRequest extends StObject {
  
  /**
    * The name of the pipeline to start.
    */
  var PipelineName: typings.awsSdk.clientsOsisMod.PipelineName
}
object StartPipelineRequest {
  
  inline def apply(PipelineName: PipelineName): StartPipelineRequest = {
    val __obj = js.Dynamic.literal(PipelineName = PipelineName.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartPipelineRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StartPipelineRequest] (val x: Self) extends AnyVal {
    
    inline def setPipelineName(value: PipelineName): Self = StObject.set(x, "PipelineName", value.asInstanceOf[js.Any])
  }
}
