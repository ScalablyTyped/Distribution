package typings.awsDashSdk.clientsGameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeFleetEventsOutput extends js.Object {
  /**
    * A collection of objects containing event log entries for the specified fleet.
    */
  var Events: js.UndefOr[EventList] = js.native
  /**
    * Token that indicates where to resume retrieving results on the next call to this action. If no token is returned, these results represent the end of the list.
    */
  var NextToken: js.UndefOr[NonZeroAndMaxString] = js.native
}

object DescribeFleetEventsOutput {
  @scala.inline
  def apply(Events: EventList = null, NextToken: NonZeroAndMaxString = null): DescribeFleetEventsOutput = {
    val __obj = js.Dynamic.literal()
    if (Events != null) __obj.updateDynamic("Events")(Events.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeFleetEventsOutput]
  }
}

