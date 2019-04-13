package typings
package awsDashSdkLib.clientsIotanalyticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListChannelsResponse extends js.Object {
  /**
    * A list of "ChannelSummary" objects.
    */
  var channelSummaries: js.UndefOr[ChannelSummaries] = js.undefined
  /**
    * The token to retrieve the next set of results, or null if there are no more results.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
}

object ListChannelsResponse {
  @scala.inline
  def apply(channelSummaries: ChannelSummaries = null, nextToken: NextToken = null): ListChannelsResponse = {
    val __obj = js.Dynamic.literal()
    if (channelSummaries != null) __obj.updateDynamic("channelSummaries")(channelSummaries)
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken)
    __obj.asInstanceOf[ListChannelsResponse]
  }
}

