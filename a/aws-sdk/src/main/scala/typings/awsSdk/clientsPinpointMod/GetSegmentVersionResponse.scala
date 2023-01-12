package typings.awsSdk.clientsPinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetSegmentVersionResponse extends StObject {
  
  var SegmentResponse: typings.awsSdk.clientsPinpointMod.SegmentResponse
}
object GetSegmentVersionResponse {
  
  inline def apply(SegmentResponse: SegmentResponse): GetSegmentVersionResponse = {
    val __obj = js.Dynamic.literal(SegmentResponse = SegmentResponse.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetSegmentVersionResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetSegmentVersionResponse] (val x: Self) extends AnyVal {
    
    inline def setSegmentResponse(value: SegmentResponse): Self = StObject.set(x, "SegmentResponse", value.asInstanceOf[js.Any])
  }
}
