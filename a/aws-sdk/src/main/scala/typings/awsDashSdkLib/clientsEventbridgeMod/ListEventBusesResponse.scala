package typings
package awsDashSdkLib.clientsEventbridgeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListEventBusesResponse extends js.Object {
  /**
    * This list of event buses.
    */
  var EventBuses: js.UndefOr[EventBusList] = js.undefined
  /**
    * A token you can use in a subsequent operation to retrieve the next set of results.
    */
  var NextToken: js.UndefOr[NextToken] = js.undefined
}

object ListEventBusesResponse {
  @scala.inline
  def apply(EventBuses: EventBusList = null, NextToken: NextToken = null): ListEventBusesResponse = {
    val __obj = js.Dynamic.literal()
    if (EventBuses != null) __obj.updateDynamic("EventBuses")(EventBuses)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[ListEventBusesResponse]
  }
}

