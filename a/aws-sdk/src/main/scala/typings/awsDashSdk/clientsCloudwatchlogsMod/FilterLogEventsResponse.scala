package typings.awsDashSdk.clientsCloudwatchlogsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FilterLogEventsResponse extends js.Object {
  /**
    * The matched events.
    */
  var events: js.UndefOr[FilteredLogEvents] = js.native
  /**
    * The token to use when requesting the next set of items. The token expires after 24 hours.
    */
  var nextToken: js.UndefOr[NextToken] = js.native
  /**
    * Indicates which log streams have been searched and whether each has been searched completely.
    */
  var searchedLogStreams: js.UndefOr[SearchedLogStreams] = js.native
}

object FilterLogEventsResponse {
  @scala.inline
  def apply(
    events: FilteredLogEvents = null,
    nextToken: NextToken = null,
    searchedLogStreams: SearchedLogStreams = null
  ): FilterLogEventsResponse = {
    val __obj = js.Dynamic.literal()
    if (events != null) __obj.updateDynamic("events")(events.asInstanceOf[js.Any])
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken.asInstanceOf[js.Any])
    if (searchedLogStreams != null) __obj.updateDynamic("searchedLogStreams")(searchedLogStreams.asInstanceOf[js.Any])
    __obj.asInstanceOf[FilterLogEventsResponse]
  }
}

