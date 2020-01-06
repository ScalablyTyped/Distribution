package typings.awsDashSdk.clientsCodestarnotificationsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListEventTypesResult extends js.Object {
  /**
    * Information about each event, including service name, resource type, event ID, and event name.
    */
  var EventTypes: js.UndefOr[EventTypeBatch] = js.native
  /**
    * An enumeration token that can be used in a request to return the next batch of the results.
    */
  var NextToken: js.UndefOr[typings.awsDashSdk.clientsCodestarnotificationsMod.NextToken] = js.native
}

object ListEventTypesResult {
  @scala.inline
  def apply(EventTypes: EventTypeBatch = null, NextToken: NextToken = null): ListEventTypesResult = {
    val __obj = js.Dynamic.literal()
    if (EventTypes != null) __obj.updateDynamic("EventTypes")(EventTypes.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListEventTypesResult]
  }
}

