package typings.awsDashSdk.clientsSagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListSubscribedWorkteamsResponse extends js.Object {
  /**
    * If the response is truncated, Amazon SageMaker returns this token. To retrieve the next set of work teams, use it in the subsequent request.
    */
  var NextToken: js.UndefOr[typings.awsDashSdk.clientsSagemakerMod.NextToken] = js.undefined
  /**
    * An array of Workteam objects, each describing a work team.
    */
  var SubscribedWorkteams: typings.awsDashSdk.clientsSagemakerMod.SubscribedWorkteams
}

object ListSubscribedWorkteamsResponse {
  @scala.inline
  def apply(SubscribedWorkteams: SubscribedWorkteams, NextToken: NextToken = null): ListSubscribedWorkteamsResponse = {
    val __obj = js.Dynamic.literal(SubscribedWorkteams = SubscribedWorkteams)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[ListSubscribedWorkteamsResponse]
  }
}

