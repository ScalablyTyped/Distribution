package typings.awsDashSdk.clientsPinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventsRequest extends js.Object {
  /**
    * The batch of events to process. For each item in a batch, the endpoint ID acts as a key that has an EventsBatch object as its value.
    */
  var BatchItem: MapOfEventsBatch
}

object EventsRequest {
  @scala.inline
  def apply(BatchItem: MapOfEventsBatch): EventsRequest = {
    val __obj = js.Dynamic.literal(BatchItem = BatchItem)
  
    __obj.asInstanceOf[EventsRequest]
  }
}

