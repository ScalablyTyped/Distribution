package typings.awsDashSdk.clientsXrayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PutTraceSegmentsRequest extends js.Object {
  /**
    * A string containing a JSON document defining one or more segments or subsegments.
    */
  var TraceSegmentDocuments: TraceSegmentDocumentList = js.native
}

object PutTraceSegmentsRequest {
  @scala.inline
  def apply(TraceSegmentDocuments: TraceSegmentDocumentList): PutTraceSegmentsRequest = {
    val __obj = js.Dynamic.literal(TraceSegmentDocuments = TraceSegmentDocuments.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PutTraceSegmentsRequest]
  }
}

