package typings.awsDashSdk.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListStreamsResponse extends js.Object {
  /**
    * A token used to get the next set of results.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
  /**
    * A list of streams.
    */
  var streams: js.UndefOr[StreamsSummary] = js.undefined
}

object ListStreamsResponse {
  @scala.inline
  def apply(nextToken: NextToken = null, streams: StreamsSummary = null): ListStreamsResponse = {
    val __obj = js.Dynamic.literal()
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken)
    if (streams != null) __obj.updateDynamic("streams")(streams)
    __obj.asInstanceOf[ListStreamsResponse]
  }
}

