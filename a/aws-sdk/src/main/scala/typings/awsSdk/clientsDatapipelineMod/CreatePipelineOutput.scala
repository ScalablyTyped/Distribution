package typings.awsSdk.clientsDatapipelineMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreatePipelineOutput extends StObject {
  
  /**
    * The ID that AWS Data Pipeline assigns the newly created pipeline. For example, df-06372391ZG65EXAMPLE.
    */
  var pipelineId: id
}
object CreatePipelineOutput {
  
  inline def apply(pipelineId: id): CreatePipelineOutput = {
    val __obj = js.Dynamic.literal(pipelineId = pipelineId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreatePipelineOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreatePipelineOutput] (val x: Self) extends AnyVal {
    
    inline def setPipelineId(value: id): Self = StObject.set(x, "pipelineId", value.asInstanceOf[js.Any])
  }
}
