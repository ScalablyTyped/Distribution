package typings.awsSdk.chimesdkmediapipelinesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetMediaPipelineResponse extends StObject {
  
  /**
    * The media pipeline object.
    */
  var MediaPipeline: js.UndefOr[typings.awsSdk.chimesdkmediapipelinesMod.MediaPipeline] = js.undefined
}
object GetMediaPipelineResponse {
  
  inline def apply(): GetMediaPipelineResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetMediaPipelineResponse]
  }
  
  extension [Self <: GetMediaPipelineResponse](x: Self) {
    
    inline def setMediaPipeline(value: MediaPipeline): Self = StObject.set(x, "MediaPipeline", value.asInstanceOf[js.Any])
    
    inline def setMediaPipelineUndefined: Self = StObject.set(x, "MediaPipeline", js.undefined)
  }
}
