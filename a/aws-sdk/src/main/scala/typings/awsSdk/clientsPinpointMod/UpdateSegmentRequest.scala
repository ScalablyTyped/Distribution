package typings.awsSdk.clientsPinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateSegmentRequest extends StObject {
  
  /**
    * The unique identifier for the application. This identifier is displayed as the Project ID on the Amazon Pinpoint console.
    */
  var ApplicationId: string
  
  /**
    * The unique identifier for the segment.
    */
  var SegmentId: string
  
  var WriteSegmentRequest: typings.awsSdk.clientsPinpointMod.WriteSegmentRequest
}
object UpdateSegmentRequest {
  
  inline def apply(ApplicationId: string, SegmentId: string, WriteSegmentRequest: WriteSegmentRequest): UpdateSegmentRequest = {
    val __obj = js.Dynamic.literal(ApplicationId = ApplicationId.asInstanceOf[js.Any], SegmentId = SegmentId.asInstanceOf[js.Any], WriteSegmentRequest = WriteSegmentRequest.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateSegmentRequest]
  }
  
  extension [Self <: UpdateSegmentRequest](x: Self) {
    
    inline def setApplicationId(value: string): Self = StObject.set(x, "ApplicationId", value.asInstanceOf[js.Any])
    
    inline def setSegmentId(value: string): Self = StObject.set(x, "SegmentId", value.asInstanceOf[js.Any])
    
    inline def setWriteSegmentRequest(value: WriteSegmentRequest): Self = StObject.set(x, "WriteSegmentRequest", value.asInstanceOf[js.Any])
  }
}
