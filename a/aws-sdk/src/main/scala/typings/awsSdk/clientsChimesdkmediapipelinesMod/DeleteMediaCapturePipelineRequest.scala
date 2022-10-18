package typings.awsSdk.clientsChimesdkmediapipelinesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteMediaCapturePipelineRequest extends StObject {
  
  /**
    * The ID of the media pipeline being deleted. 
    */
  var MediaPipelineId: GuidString
}
object DeleteMediaCapturePipelineRequest {
  
  inline def apply(MediaPipelineId: GuidString): DeleteMediaCapturePipelineRequest = {
    val __obj = js.Dynamic.literal(MediaPipelineId = MediaPipelineId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteMediaCapturePipelineRequest]
  }
  
  extension [Self <: DeleteMediaCapturePipelineRequest](x: Self) {
    
    inline def setMediaPipelineId(value: GuidString): Self = StObject.set(x, "MediaPipelineId", value.asInstanceOf[js.Any])
  }
}
