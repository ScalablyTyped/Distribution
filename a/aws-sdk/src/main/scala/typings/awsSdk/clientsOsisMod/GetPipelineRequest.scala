package typings.awsSdk.clientsOsisMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetPipelineRequest extends StObject {
  
  /**
    * The name of the pipeline to get information about.
    */
  var PipelineName: typings.awsSdk.clientsOsisMod.PipelineName
}
object GetPipelineRequest {
  
  inline def apply(PipelineName: PipelineName): GetPipelineRequest = {
    val __obj = js.Dynamic.literal(PipelineName = PipelineName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetPipelineRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetPipelineRequest] (val x: Self) extends AnyVal {
    
    inline def setPipelineName(value: PipelineName): Self = StObject.set(x, "PipelineName", value.asInstanceOf[js.Any])
  }
}
