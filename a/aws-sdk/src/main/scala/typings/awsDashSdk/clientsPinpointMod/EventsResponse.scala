package typings.awsDashSdk.clientsPinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventsResponse extends js.Object {
  /**
    * A map that contains a multipart response for each endpoint. For each item in this object, the endpoint ID is the key and the item response is the value. If no item response exists, the value can also be one of the following: 202, the request was processed successfully; or 400, the payload wasn't valid or required fields were missing.
    */
  var Results: js.UndefOr[MapOfItemResponse] = js.undefined
}

object EventsResponse {
  @scala.inline
  def apply(Results: MapOfItemResponse = null): EventsResponse = {
    val __obj = js.Dynamic.literal()
    if (Results != null) __obj.updateDynamic("Results")(Results)
    __obj.asInstanceOf[EventsResponse]
  }
}

