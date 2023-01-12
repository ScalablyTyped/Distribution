package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribePipelineRequest extends StObject {
  
  /**
    * The name of the pipeline to describe.
    */
  var PipelineName: typings.awsSdk.clientsSagemakerMod.PipelineName
}
object DescribePipelineRequest {
  
  inline def apply(PipelineName: PipelineName): DescribePipelineRequest = {
    val __obj = js.Dynamic.literal(PipelineName = PipelineName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribePipelineRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribePipelineRequest] (val x: Self) extends AnyVal {
    
    inline def setPipelineName(value: PipelineName): Self = StObject.set(x, "PipelineName", value.asInstanceOf[js.Any])
  }
}
