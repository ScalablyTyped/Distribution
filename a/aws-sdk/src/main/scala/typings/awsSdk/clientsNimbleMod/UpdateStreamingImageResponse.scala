package typings.awsSdk.clientsNimbleMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateStreamingImageResponse extends StObject {
  
  var streamingImage: js.UndefOr[StreamingImage] = js.undefined
}
object UpdateStreamingImageResponse {
  
  inline def apply(): UpdateStreamingImageResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateStreamingImageResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateStreamingImageResponse] (val x: Self) extends AnyVal {
    
    inline def setStreamingImage(value: StreamingImage): Self = StObject.set(x, "streamingImage", value.asInstanceOf[js.Any])
    
    inline def setStreamingImageUndefined: Self = StObject.set(x, "streamingImage", js.undefined)
  }
}
