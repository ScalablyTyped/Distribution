package typings.awsDashSdk.clientsCloudwatcheventsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListEventBusesResponse extends js.Object {
  /**
    * This list of event buses.
    */
  var EventBuses: js.UndefOr[EventBusList] = js.native
  /**
    * A token you can use in a subsequent operation to retrieve the next set of results.
    */
  var NextToken: js.UndefOr[typings.awsDashSdk.clientsCloudwatcheventsMod.NextToken] = js.native
}

object ListEventBusesResponse {
  @scala.inline
  def apply(EventBuses: EventBusList = null, NextToken: NextToken = null): ListEventBusesResponse = {
    val __obj = js.Dynamic.literal()
    if (EventBuses != null) __obj.updateDynamic("EventBuses")(EventBuses.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListEventBusesResponse]
  }
}

