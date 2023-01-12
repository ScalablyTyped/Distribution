package typings.awsSdk.clientsChimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteMediaCapturePipelineRequest extends StObject {
  
  /**
    * The ID of the media capture pipeline being deleted. 
    */
  var MediaPipelineId: GuidString
}
object DeleteMediaCapturePipelineRequest {
  
  inline def apply(MediaPipelineId: GuidString): DeleteMediaCapturePipelineRequest = {
    val __obj = js.Dynamic.literal(MediaPipelineId = MediaPipelineId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteMediaCapturePipelineRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteMediaCapturePipelineRequest] (val x: Self) extends AnyVal {
    
    inline def setMediaPipelineId(value: GuidString): Self = StObject.set(x, "MediaPipelineId", value.asInstanceOf[js.Any])
  }
}
