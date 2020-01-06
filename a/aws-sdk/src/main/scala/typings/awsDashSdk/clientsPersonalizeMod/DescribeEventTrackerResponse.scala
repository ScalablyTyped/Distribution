package typings.awsDashSdk.clientsPersonalizeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeEventTrackerResponse extends js.Object {
  /**
    * An object that describes the event tracker.
    */
  var eventTracker: js.UndefOr[EventTracker] = js.native
}

object DescribeEventTrackerResponse {
  @scala.inline
  def apply(eventTracker: EventTracker = null): DescribeEventTrackerResponse = {
    val __obj = js.Dynamic.literal()
    if (eventTracker != null) __obj.updateDynamic("eventTracker")(eventTracker.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeEventTrackerResponse]
  }
}

