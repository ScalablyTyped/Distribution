package typings.awsDashSdk.clientsIot1clickdevicesserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListDeviceEventsResponse extends js.Object {
  /**
    * An array of zero or more elements describing the event(s) associated with the
    device.
    */
  var Events: js.UndefOr[__listOfDeviceEvent] = js.undefined
  /**
    * The token to retrieve the next set of results.
    */
  var NextToken: js.UndefOr[__string] = js.undefined
}

object ListDeviceEventsResponse {
  @scala.inline
  def apply(Events: __listOfDeviceEvent = null, NextToken: __string = null): ListDeviceEventsResponse = {
    val __obj = js.Dynamic.literal()
    if (Events != null) __obj.updateDynamic("Events")(Events)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[ListDeviceEventsResponse]
  }
}

