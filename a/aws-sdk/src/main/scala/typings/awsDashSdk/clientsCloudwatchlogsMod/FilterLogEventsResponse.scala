package typings.awsDashSdk.clientsCloudwatchlogsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FilterLogEventsResponse extends js.Object {
  /**
    * The matched events.
    */
  var events: js.UndefOr[FilteredLogEvents] = js.undefined
  /**
    * The token to use when requesting the next set of items. The token expires after 24 hours.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
  /**
    * Indicates which log streams have been searched and whether each has been searched completely.
    */
  var searchedLogStreams: js.UndefOr[SearchedLogStreams] = js.undefined
}

object FilterLogEventsResponse {
  @scala.inline
  def apply(
    events: FilteredLogEvents = null,
    nextToken: NextToken = null,
    searchedLogStreams: SearchedLogStreams = null
  ): FilterLogEventsResponse = {
    val __obj = js.Dynamic.literal()
    if (events != null) __obj.updateDynamic("events")(events)
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken)
    if (searchedLogStreams != null) __obj.updateDynamic("searchedLogStreams")(searchedLogStreams)
    __obj.asInstanceOf[FilterLogEventsResponse]
  }
}

