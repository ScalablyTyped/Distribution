package typings.awsSdk.clientsCodepipelineMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdatePipelineOutput extends StObject {
  
  /**
    * The structure of the updated pipeline.
    */
  var pipeline: js.UndefOr[PipelineDeclaration] = js.undefined
}
object UpdatePipelineOutput {
  
  inline def apply(): UpdatePipelineOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdatePipelineOutput]
  }
  
  extension [Self <: UpdatePipelineOutput](x: Self) {
    
    inline def setPipeline(value: PipelineDeclaration): Self = StObject.set(x, "pipeline", value.asInstanceOf[js.Any])
    
    inline def setPipelineUndefined: Self = StObject.set(x, "pipeline", js.undefined)
  }
}
