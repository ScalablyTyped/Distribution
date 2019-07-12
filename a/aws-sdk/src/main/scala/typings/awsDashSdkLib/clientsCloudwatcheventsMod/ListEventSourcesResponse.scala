package typings
package awsDashSdkLib.clientsCloudwatcheventsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListEventSourcesResponse extends js.Object {
  /**
    * The list of event sources.
    */
  var EventSources: js.UndefOr[EventSourceList] = js.undefined
  /**
    * A token you can use in a subsequent operation to retrieve the next set of results.
    */
  var NextToken: js.UndefOr[NextToken] = js.undefined
}

object ListEventSourcesResponse {
  @scala.inline
  def apply(EventSources: EventSourceList = null, NextToken: NextToken = null): ListEventSourcesResponse = {
    val __obj = js.Dynamic.literal()
    if (EventSources != null) __obj.updateDynamic("EventSources")(EventSources)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[ListEventSourcesResponse]
  }
}

