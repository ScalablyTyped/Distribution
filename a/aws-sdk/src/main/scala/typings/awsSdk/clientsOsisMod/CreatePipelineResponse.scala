package typings.awsSdk.clientsOsisMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreatePipelineResponse extends StObject {
  
  /**
    * Container for information about the created pipeline.
    */
  var Pipeline: js.UndefOr[typings.awsSdk.clientsOsisMod.Pipeline] = js.undefined
}
object CreatePipelineResponse {
  
  inline def apply(): CreatePipelineResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreatePipelineResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreatePipelineResponse] (val x: Self) extends AnyVal {
    
    inline def setPipeline(value: Pipeline): Self = StObject.set(x, "Pipeline", value.asInstanceOf[js.Any])
    
    inline def setPipelineUndefined: Self = StObject.set(x, "Pipeline", js.undefined)
  }
}
