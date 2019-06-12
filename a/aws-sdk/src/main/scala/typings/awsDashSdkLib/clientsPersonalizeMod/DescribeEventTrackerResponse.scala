package typings
package awsDashSdkLib.clientsPersonalizeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeEventTrackerResponse extends js.Object {
  /**
    * An object that describes the event tracker.
    */
  var eventTracker: js.UndefOr[EventTracker] = js.undefined
}

object DescribeEventTrackerResponse {
  @scala.inline
  def apply(eventTracker: EventTracker = null): DescribeEventTrackerResponse = {
    val __obj = js.Dynamic.literal()
    if (eventTracker != null) __obj.updateDynamic("eventTracker")(eventTracker)
    __obj.asInstanceOf[DescribeEventTrackerResponse]
  }
}

