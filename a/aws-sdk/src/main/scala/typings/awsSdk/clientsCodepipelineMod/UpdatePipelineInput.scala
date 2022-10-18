package typings.awsSdk.clientsCodepipelineMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdatePipelineInput extends StObject {
  
  /**
    * The name of the pipeline to be updated.
    */
  var pipeline: PipelineDeclaration
}
object UpdatePipelineInput {
  
  inline def apply(pipeline: PipelineDeclaration): UpdatePipelineInput = {
    val __obj = js.Dynamic.literal(pipeline = pipeline.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdatePipelineInput]
  }
  
  extension [Self <: UpdatePipelineInput](x: Self) {
    
    inline def setPipeline(value: PipelineDeclaration): Self = StObject.set(x, "pipeline", value.asInstanceOf[js.Any])
  }
}
