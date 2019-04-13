package typings
package awsDashSdkLib.clientsGameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeFleetEventsOutput extends js.Object {
  /**
    * Collection of objects containing event log entries for the specified fleet.
    */
  var Events: js.UndefOr[EventList] = js.undefined
  /**
    * Token that indicates where to resume retrieving results on the next call to this action. If no token is returned, these results represent the end of the list.
    */
  var NextToken: js.UndefOr[NonZeroAndMaxString] = js.undefined
}

object DescribeFleetEventsOutput {
  @scala.inline
  def apply(Events: EventList = null, NextToken: NonZeroAndMaxString = null): DescribeFleetEventsOutput = {
    val __obj = js.Dynamic.literal()
    if (Events != null) __obj.updateDynamic("Events")(Events)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[DescribeFleetEventsOutput]
  }
}

