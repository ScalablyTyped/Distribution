package typings.awsSdk.clientsChimesdkmediapipelinesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateMediaCapturePipelineResponse extends StObject {
  
  /**
    * A media pipeline object, the ID, source type, source ARN, sink type, and sink ARN of a media pipeline object.
    */
  var MediaCapturePipeline: js.UndefOr[typings.awsSdk.clientsChimesdkmediapipelinesMod.MediaCapturePipeline] = js.undefined
}
object CreateMediaCapturePipelineResponse {
  
  inline def apply(): CreateMediaCapturePipelineResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateMediaCapturePipelineResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateMediaCapturePipelineResponse] (val x: Self) extends AnyVal {
    
    inline def setMediaCapturePipeline(value: MediaCapturePipeline): Self = StObject.set(x, "MediaCapturePipeline", value.asInstanceOf[js.Any])
    
    inline def setMediaCapturePipelineUndefined: Self = StObject.set(x, "MediaCapturePipeline", js.undefined)
  }
}
