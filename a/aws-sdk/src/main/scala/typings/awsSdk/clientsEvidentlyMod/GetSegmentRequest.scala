package typings.awsSdk.clientsEvidentlyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetSegmentRequest extends StObject {
  
  /**
    * The ARN of the segment to return information for.
    */
  var segment: SegmentRef
}
object GetSegmentRequest {
  
  inline def apply(segment: SegmentRef): GetSegmentRequest = {
    val __obj = js.Dynamic.literal(segment = segment.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetSegmentRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetSegmentRequest] (val x: Self) extends AnyVal {
    
    inline def setSegment(value: SegmentRef): Self = StObject.set(x, "segment", value.asInstanceOf[js.Any])
  }
}
