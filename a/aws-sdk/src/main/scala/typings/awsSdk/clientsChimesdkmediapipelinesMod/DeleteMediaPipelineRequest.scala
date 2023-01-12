package typings.awsSdk.clientsChimesdkmediapipelinesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteMediaPipelineRequest extends StObject {
  
  /**
    * The ID of the media pipeline to delete.
    */
  var MediaPipelineId: GuidString
}
object DeleteMediaPipelineRequest {
  
  inline def apply(MediaPipelineId: GuidString): DeleteMediaPipelineRequest = {
    val __obj = js.Dynamic.literal(MediaPipelineId = MediaPipelineId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteMediaPipelineRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteMediaPipelineRequest] (val x: Self) extends AnyVal {
    
    inline def setMediaPipelineId(value: GuidString): Self = StObject.set(x, "MediaPipelineId", value.asInstanceOf[js.Any])
  }
}
