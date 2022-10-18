package typings.awsSdk.clientsChimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetMediaCapturePipelineRequest extends StObject {
  
  /**
    * The ID of the pipeline that you want to get.
    */
  var MediaPipelineId: GuidString
}
object GetMediaCapturePipelineRequest {
  
  inline def apply(MediaPipelineId: GuidString): GetMediaCapturePipelineRequest = {
    val __obj = js.Dynamic.literal(MediaPipelineId = MediaPipelineId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetMediaCapturePipelineRequest]
  }
  
  extension [Self <: GetMediaCapturePipelineRequest](x: Self) {
    
    inline def setMediaPipelineId(value: GuidString): Self = StObject.set(x, "MediaPipelineId", value.asInstanceOf[js.Any])
  }
}
