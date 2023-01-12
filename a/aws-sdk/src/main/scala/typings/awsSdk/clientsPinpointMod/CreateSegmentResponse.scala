package typings.awsSdk.clientsPinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateSegmentResponse extends StObject {
  
  var SegmentResponse: typings.awsSdk.clientsPinpointMod.SegmentResponse
}
object CreateSegmentResponse {
  
  inline def apply(SegmentResponse: SegmentResponse): CreateSegmentResponse = {
    val __obj = js.Dynamic.literal(SegmentResponse = SegmentResponse.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateSegmentResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateSegmentResponse] (val x: Self) extends AnyVal {
    
    inline def setSegmentResponse(value: SegmentResponse): Self = StObject.set(x, "SegmentResponse", value.asInstanceOf[js.Any])
  }
}
