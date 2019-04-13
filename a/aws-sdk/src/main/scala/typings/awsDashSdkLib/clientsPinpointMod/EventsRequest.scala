package typings
package awsDashSdkLib.clientsPinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventsRequest extends js.Object {
  /**
    * A batch of events to process. Each BatchItem consists of an endpoint ID as the key, and an EventsBatch object as the value.
    */
  var BatchItem: js.UndefOr[MapOfEventsBatch] = js.undefined
}

object EventsRequest {
  @scala.inline
  def apply(BatchItem: MapOfEventsBatch = null): EventsRequest = {
    val __obj = js.Dynamic.literal()
    if (BatchItem != null) __obj.updateDynamic("BatchItem")(BatchItem)
    __obj.asInstanceOf[EventsRequest]
  }
}

