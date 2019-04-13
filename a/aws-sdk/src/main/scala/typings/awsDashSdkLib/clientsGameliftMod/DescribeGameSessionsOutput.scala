package typings
package awsDashSdkLib.clientsGameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeGameSessionsOutput extends js.Object {
  /**
    * Collection of objects containing game session properties for each session matching the request.
    */
  var GameSessions: js.UndefOr[GameSessionList] = js.undefined
  /**
    * Token that indicates where to resume retrieving results on the next call to this action. If no token is returned, these results represent the end of the list.
    */
  var NextToken: js.UndefOr[NonZeroAndMaxString] = js.undefined
}

object DescribeGameSessionsOutput {
  @scala.inline
  def apply(GameSessions: GameSessionList = null, NextToken: NonZeroAndMaxString = null): DescribeGameSessionsOutput = {
    val __obj = js.Dynamic.literal()
    if (GameSessions != null) __obj.updateDynamic("GameSessions")(GameSessions)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[DescribeGameSessionsOutput]
  }
}

