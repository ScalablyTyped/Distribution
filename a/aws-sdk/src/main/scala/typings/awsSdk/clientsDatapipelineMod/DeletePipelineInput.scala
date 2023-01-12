package typings.awsSdk.clientsDatapipelineMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeletePipelineInput extends StObject {
  
  /**
    * The ID of the pipeline.
    */
  var pipelineId: id
}
object DeletePipelineInput {
  
  inline def apply(pipelineId: id): DeletePipelineInput = {
    val __obj = js.Dynamic.literal(pipelineId = pipelineId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeletePipelineInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeletePipelineInput] (val x: Self) extends AnyVal {
    
    inline def setPipelineId(value: id): Self = StObject.set(x, "pipelineId", value.asInstanceOf[js.Any])
  }
}
