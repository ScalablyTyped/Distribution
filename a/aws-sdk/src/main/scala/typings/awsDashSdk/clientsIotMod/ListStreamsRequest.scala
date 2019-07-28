package typings.awsDashSdk.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListStreamsRequest extends js.Object {
  /**
    * Set to true to return the list of streams in ascending order.
    */
  var ascendingOrder: js.UndefOr[AscendingOrder] = js.undefined
  /**
    * The maximum number of results to return at a time.
    */
  var maxResults: js.UndefOr[MaxResults] = js.undefined
  /**
    * A token used to get the next set of results.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
}

object ListStreamsRequest {
  @scala.inline
  def apply(
    ascendingOrder: js.UndefOr[AscendingOrder] = js.undefined,
    maxResults: js.UndefOr[MaxResults] = js.undefined,
    nextToken: NextToken = null
  ): ListStreamsRequest = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(ascendingOrder)) __obj.updateDynamic("ascendingOrder")(ascendingOrder)
    if (!js.isUndefined(maxResults)) __obj.updateDynamic("maxResults")(maxResults)
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken)
    __obj.asInstanceOf[ListStreamsRequest]
  }
}

