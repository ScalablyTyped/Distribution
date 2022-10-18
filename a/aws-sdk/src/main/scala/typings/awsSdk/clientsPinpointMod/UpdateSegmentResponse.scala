package typings.awsSdk.clientsPinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateSegmentResponse extends StObject {
  
  var SegmentResponse: typings.awsSdk.clientsPinpointMod.SegmentResponse
}
object UpdateSegmentResponse {
  
  inline def apply(SegmentResponse: SegmentResponse): UpdateSegmentResponse = {
    val __obj = js.Dynamic.literal(SegmentResponse = SegmentResponse.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateSegmentResponse]
  }
  
  extension [Self <: UpdateSegmentResponse](x: Self) {
    
    inline def setSegmentResponse(value: SegmentResponse): Self = StObject.set(x, "SegmentResponse", value.asInstanceOf[js.Any])
  }
}
