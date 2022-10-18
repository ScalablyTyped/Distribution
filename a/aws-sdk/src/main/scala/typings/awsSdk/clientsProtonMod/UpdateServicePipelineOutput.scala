package typings.awsSdk.clientsProtonMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateServicePipelineOutput extends StObject {
  
  /**
    * The pipeline details that are returned by Proton.
    */
  var pipeline: ServicePipeline
}
object UpdateServicePipelineOutput {
  
  inline def apply(pipeline: ServicePipeline): UpdateServicePipelineOutput = {
    val __obj = js.Dynamic.literal(pipeline = pipeline.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateServicePipelineOutput]
  }
  
  extension [Self <: UpdateServicePipelineOutput](x: Self) {
    
    inline def setPipeline(value: ServicePipeline): Self = StObject.set(x, "pipeline", value.asInstanceOf[js.Any])
  }
}
