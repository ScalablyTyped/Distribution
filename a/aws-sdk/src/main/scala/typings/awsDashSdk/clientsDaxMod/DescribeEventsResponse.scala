package typings.awsDashSdk.clientsDaxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeEventsResponse extends js.Object {
  /**
    * An array of events. Each element in the array represents one event.
    */
  var Events: js.UndefOr[EventList] = js.undefined
  /**
    * Provides an identifier to allow retrieval of paginated results.
    */
  var NextToken: js.UndefOr[String] = js.undefined
}

object DescribeEventsResponse {
  @scala.inline
  def apply(Events: EventList = null, NextToken: String = null): DescribeEventsResponse = {
    val __obj = js.Dynamic.literal()
    if (Events != null) __obj.updateDynamic("Events")(Events)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[DescribeEventsResponse]
  }
}

