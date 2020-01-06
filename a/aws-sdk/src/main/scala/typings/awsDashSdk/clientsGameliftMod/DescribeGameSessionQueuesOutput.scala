package typings.awsDashSdk.clientsGameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeGameSessionQueuesOutput extends js.Object {
  /**
    * A collection of objects that describe the requested game session queues.
    */
  var GameSessionQueues: js.UndefOr[GameSessionQueueList] = js.native
  /**
    * A token that indicates where to resume retrieving results on the next call to this action. If no token is returned, these results represent the end of the list.
    */
  var NextToken: js.UndefOr[NonZeroAndMaxString] = js.native
}

object DescribeGameSessionQueuesOutput {
  @scala.inline
  def apply(GameSessionQueues: GameSessionQueueList = null, NextToken: NonZeroAndMaxString = null): DescribeGameSessionQueuesOutput = {
    val __obj = js.Dynamic.literal()
    if (GameSessionQueues != null) __obj.updateDynamic("GameSessionQueues")(GameSessionQueues.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeGameSessionQueuesOutput]
  }
}

