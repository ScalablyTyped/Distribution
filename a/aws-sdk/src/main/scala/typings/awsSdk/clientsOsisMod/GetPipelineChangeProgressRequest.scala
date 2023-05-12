package typings.awsSdk.clientsOsisMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetPipelineChangeProgressRequest extends StObject {
  
  /**
    * The name of the pipeline.
    */
  var PipelineName: typings.awsSdk.clientsOsisMod.PipelineName
}
object GetPipelineChangeProgressRequest {
  
  inline def apply(PipelineName: PipelineName): GetPipelineChangeProgressRequest = {
    val __obj = js.Dynamic.literal(PipelineName = PipelineName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetPipelineChangeProgressRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetPipelineChangeProgressRequest] (val x: Self) extends AnyVal {
    
    inline def setPipelineName(value: PipelineName): Self = StObject.set(x, "PipelineName", value.asInstanceOf[js.Any])
  }
}
