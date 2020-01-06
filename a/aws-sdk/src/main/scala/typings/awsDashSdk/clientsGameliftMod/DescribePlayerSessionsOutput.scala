package typings.awsDashSdk.clientsGameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribePlayerSessionsOutput extends js.Object {
  /**
    * Token that indicates where to resume retrieving results on the next call to this action. If no token is returned, these results represent the end of the list.
    */
  var NextToken: js.UndefOr[NonZeroAndMaxString] = js.native
  /**
    * A collection of objects containing properties for each player session that matches the request.
    */
  var PlayerSessions: js.UndefOr[PlayerSessionList] = js.native
}

object DescribePlayerSessionsOutput {
  @scala.inline
  def apply(NextToken: NonZeroAndMaxString = null, PlayerSessions: PlayerSessionList = null): DescribePlayerSessionsOutput = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (PlayerSessions != null) __obj.updateDynamic("PlayerSessions")(PlayerSessions.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribePlayerSessionsOutput]
  }
}

