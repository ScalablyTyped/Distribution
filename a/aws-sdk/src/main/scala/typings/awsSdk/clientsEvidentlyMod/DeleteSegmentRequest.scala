package typings.awsSdk.clientsEvidentlyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteSegmentRequest extends StObject {
  
  /**
    * Specifies the segment to delete.
    */
  var segment: SegmentRef
}
object DeleteSegmentRequest {
  
  inline def apply(segment: SegmentRef): DeleteSegmentRequest = {
    val __obj = js.Dynamic.literal(segment = segment.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteSegmentRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteSegmentRequest] (val x: Self) extends AnyVal {
    
    inline def setSegment(value: SegmentRef): Self = StObject.set(x, "segment", value.asInstanceOf[js.Any])
  }
}
