package typings.awsDashSdk.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListStreamsRequest extends js.Object {
  /**
    * Set to true to return the list of streams in ascending order.
    */
  var ascendingOrder: js.UndefOr[AscendingOrder] = js.native
  /**
    * The maximum number of results to return at a time.
    */
  var maxResults: js.UndefOr[MaxResults] = js.native
  /**
    * A token used to get the next set of results.
    */
  var nextToken: js.UndefOr[NextToken] = js.native
}

object ListStreamsRequest {
  @scala.inline
  def apply(
    ascendingOrder: js.UndefOr[scala.Boolean] = js.undefined,
    maxResults: Int | Double = null,
    nextToken: NextToken = null
  ): ListStreamsRequest = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(ascendingOrder)) __obj.updateDynamic("ascendingOrder")(ascendingOrder.asInstanceOf[js.Any])
    if (maxResults != null) __obj.updateDynamic("maxResults")(maxResults.asInstanceOf[js.Any])
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListStreamsRequest]
  }
}

