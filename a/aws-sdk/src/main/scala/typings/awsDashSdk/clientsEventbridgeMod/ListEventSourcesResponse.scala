package typings.awsDashSdk.clientsEventbridgeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListEventSourcesResponse extends js.Object {
  /**
    * The list of event sources.
    */
  var EventSources: js.UndefOr[EventSourceList] = js.native
  /**
    * A token you can use in a subsequent operation to retrieve the next set of results.
    */
  var NextToken: js.UndefOr[typings.awsDashSdk.clientsEventbridgeMod.NextToken] = js.native
}

object ListEventSourcesResponse {
  @scala.inline
  def apply(EventSources: EventSourceList = null, NextToken: NextToken = null): ListEventSourcesResponse = {
    val __obj = js.Dynamic.literal()
    if (EventSources != null) __obj.updateDynamic("EventSources")(EventSources.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListEventSourcesResponse]
  }
}

