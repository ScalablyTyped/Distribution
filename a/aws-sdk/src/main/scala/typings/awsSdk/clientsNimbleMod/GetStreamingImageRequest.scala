package typings.awsSdk.clientsNimbleMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetStreamingImageRequest extends StObject {
  
  /**
    * The streaming image ID.
    */
  var streamingImageId: String
  
  /**
    * The studio ID. 
    */
  var studioId: String
}
object GetStreamingImageRequest {
  
  inline def apply(streamingImageId: String, studioId: String): GetStreamingImageRequest = {
    val __obj = js.Dynamic.literal(streamingImageId = streamingImageId.asInstanceOf[js.Any], studioId = studioId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetStreamingImageRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetStreamingImageRequest] (val x: Self) extends AnyVal {
    
    inline def setStreamingImageId(value: String): Self = StObject.set(x, "streamingImageId", value.asInstanceOf[js.Any])
    
    inline def setStudioId(value: String): Self = StObject.set(x, "studioId", value.asInstanceOf[js.Any])
  }
}
