package typings.awsDashSdk.clientsGameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeGameSessionQueuesInput extends js.Object {
  /**
    * Maximum number of results to return. Use this parameter with NextToken to get results as a set of sequential pages.
    */
  var Limit: js.UndefOr[PositiveInteger] = js.undefined
  /**
    * List of queue names to retrieve information for. To request settings for all queues, leave this parameter empty.
    */
  var Names: js.UndefOr[GameSessionQueueNameList] = js.undefined
  /**
    * Token that indicates the start of the next sequential page of results. Use the token that is returned with a previous call to this action. To start at the beginning of the result set, do not specify a value.
    */
  var NextToken: js.UndefOr[NonZeroAndMaxString] = js.undefined
}

object DescribeGameSessionQueuesInput {
  @scala.inline
  def apply(
    Limit: js.UndefOr[PositiveInteger] = js.undefined,
    Names: GameSessionQueueNameList = null,
    NextToken: NonZeroAndMaxString = null
  ): DescribeGameSessionQueuesInput = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(Limit)) __obj.updateDynamic("Limit")(Limit)
    if (Names != null) __obj.updateDynamic("Names")(Names)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[DescribeGameSessionQueuesInput]
  }
}

