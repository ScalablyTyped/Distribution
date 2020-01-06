package typings.awsDashSdk.clientsCloudwatchlogsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetLogEventsResponse extends js.Object {
  /**
    * The events.
    */
  var events: js.UndefOr[OutputLogEvents] = js.native
  /**
    * The token for the next set of items in the backward direction. The token expires after 24 hours. This token will never be null. If you have reached the end of the stream, it will return the same token you passed in.
    */
  var nextBackwardToken: js.UndefOr[NextToken] = js.native
  /**
    * The token for the next set of items in the forward direction. The token expires after 24 hours. If you have reached the end of the stream, it will return the same token you passed in.
    */
  var nextForwardToken: js.UndefOr[NextToken] = js.native
}

object GetLogEventsResponse {
  @scala.inline
  def apply(
    events: OutputLogEvents = null,
    nextBackwardToken: NextToken = null,
    nextForwardToken: NextToken = null
  ): GetLogEventsResponse = {
    val __obj = js.Dynamic.literal()
    if (events != null) __obj.updateDynamic("events")(events.asInstanceOf[js.Any])
    if (nextBackwardToken != null) __obj.updateDynamic("nextBackwardToken")(nextBackwardToken.asInstanceOf[js.Any])
    if (nextForwardToken != null) __obj.updateDynamic("nextForwardToken")(nextForwardToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetLogEventsResponse]
  }
}

