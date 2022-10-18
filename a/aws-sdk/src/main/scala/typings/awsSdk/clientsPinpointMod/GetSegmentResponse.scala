package typings.awsSdk.clientsPinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetSegmentResponse extends StObject {
  
  var SegmentResponse: typings.awsSdk.clientsPinpointMod.SegmentResponse
}
object GetSegmentResponse {
  
  inline def apply(SegmentResponse: SegmentResponse): GetSegmentResponse = {
    val __obj = js.Dynamic.literal(SegmentResponse = SegmentResponse.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetSegmentResponse]
  }
  
  extension [Self <: GetSegmentResponse](x: Self) {
    
    inline def setSegmentResponse(value: SegmentResponse): Self = StObject.set(x, "SegmentResponse", value.asInstanceOf[js.Any])
  }
}
