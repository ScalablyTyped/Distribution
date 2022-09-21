package typings.awsSdk.chimesdkmediapipelinesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetMediaPipelineRequest extends StObject {
  
  /**
    * The ID of the pipeline that you want to get.
    */
  var MediaPipelineId: GuidString
}
object GetMediaPipelineRequest {
  
  inline def apply(MediaPipelineId: GuidString): GetMediaPipelineRequest = {
    val __obj = js.Dynamic.literal(MediaPipelineId = MediaPipelineId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetMediaPipelineRequest]
  }
  
  extension [Self <: GetMediaPipelineRequest](x: Self) {
    
    inline def setMediaPipelineId(value: GuidString): Self = StObject.set(x, "MediaPipelineId", value.asInstanceOf[js.Any])
  }
}
