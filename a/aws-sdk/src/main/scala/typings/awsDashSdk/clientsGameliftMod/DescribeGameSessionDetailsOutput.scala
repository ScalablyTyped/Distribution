package typings.awsDashSdk.clientsGameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeGameSessionDetailsOutput extends js.Object {
  /**
    * Collection of objects containing game session properties and the protection policy currently in force for each session matching the request.
    */
  var GameSessionDetails: js.UndefOr[GameSessionDetailList] = js.undefined
  /**
    * Token that indicates where to resume retrieving results on the next call to this action. If no token is returned, these results represent the end of the list.
    */
  var NextToken: js.UndefOr[NonZeroAndMaxString] = js.undefined
}

object DescribeGameSessionDetailsOutput {
  @scala.inline
  def apply(GameSessionDetails: GameSessionDetailList = null, NextToken: NonZeroAndMaxString = null): DescribeGameSessionDetailsOutput = {
    val __obj = js.Dynamic.literal()
    if (GameSessionDetails != null) __obj.updateDynamic("GameSessionDetails")(GameSessionDetails)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[DescribeGameSessionDetailsOutput]
  }
}

