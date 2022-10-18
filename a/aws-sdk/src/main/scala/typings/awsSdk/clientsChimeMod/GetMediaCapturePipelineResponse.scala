package typings.awsSdk.clientsChimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetMediaCapturePipelineResponse extends StObject {
  
  /**
    * The media capture pipeline object.
    */
  var MediaCapturePipeline: js.UndefOr[typings.awsSdk.clientsChimeMod.MediaCapturePipeline] = js.undefined
}
object GetMediaCapturePipelineResponse {
  
  inline def apply(): GetMediaCapturePipelineResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetMediaCapturePipelineResponse]
  }
  
  extension [Self <: GetMediaCapturePipelineResponse](x: Self) {
    
    inline def setMediaCapturePipeline(value: MediaCapturePipeline): Self = StObject.set(x, "MediaCapturePipeline", value.asInstanceOf[js.Any])
    
    inline def setMediaCapturePipelineUndefined: Self = StObject.set(x, "MediaCapturePipeline", js.undefined)
  }
}
