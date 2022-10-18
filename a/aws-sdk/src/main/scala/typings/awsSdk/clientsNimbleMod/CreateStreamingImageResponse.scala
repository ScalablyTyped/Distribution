package typings.awsSdk.clientsNimbleMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateStreamingImageResponse extends StObject {
  
  /**
    * The streaming image.
    */
  var streamingImage: js.UndefOr[StreamingImage] = js.undefined
}
object CreateStreamingImageResponse {
  
  inline def apply(): CreateStreamingImageResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateStreamingImageResponse]
  }
  
  extension [Self <: CreateStreamingImageResponse](x: Self) {
    
    inline def setStreamingImage(value: StreamingImage): Self = StObject.set(x, "streamingImage", value.asInstanceOf[js.Any])
    
    inline def setStreamingImageUndefined: Self = StObject.set(x, "streamingImage", js.undefined)
  }
}
