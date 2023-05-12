package typings.awsSdk.clientsOsisMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetPipelineResponse extends StObject {
  
  /**
    * Detailed information about the requested pipeline.
    */
  var Pipeline: js.UndefOr[typings.awsSdk.clientsOsisMod.Pipeline] = js.undefined
}
object GetPipelineResponse {
  
  inline def apply(): GetPipelineResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetPipelineResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetPipelineResponse] (val x: Self) extends AnyVal {
    
    inline def setPipeline(value: Pipeline): Self = StObject.set(x, "Pipeline", value.asInstanceOf[js.Any])
    
    inline def setPipelineUndefined: Self = StObject.set(x, "Pipeline", js.undefined)
  }
}
