package typings.awsSdk.clientsProtonMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CancelServicePipelineDeploymentOutput extends StObject {
  
  /**
    * The service pipeline detail data that's returned by Proton.
    */
  var pipeline: ServicePipeline
}
object CancelServicePipelineDeploymentOutput {
  
  inline def apply(pipeline: ServicePipeline): CancelServicePipelineDeploymentOutput = {
    val __obj = js.Dynamic.literal(pipeline = pipeline.asInstanceOf[js.Any])
    __obj.asInstanceOf[CancelServicePipelineDeploymentOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CancelServicePipelineDeploymentOutput] (val x: Self) extends AnyVal {
    
    inline def setPipeline(value: ServicePipeline): Self = StObject.set(x, "pipeline", value.asInstanceOf[js.Any])
  }
}
