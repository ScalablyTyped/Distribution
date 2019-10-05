package typings.awsDashSdk.clientsSagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListSubscribedWorkteamsRequest extends js.Object {
  /**
    * The maximum number of work teams to return in each page of the response.
    */
  var MaxResults: js.UndefOr[typings.awsDashSdk.clientsSagemakerMod.MaxResults] = js.undefined
  /**
    * A string in the work team name. This filter returns only work teams whose name contains the specified string.
    */
  var NameContains: js.UndefOr[WorkteamName] = js.undefined
  /**
    * If the result of the previous ListSubscribedWorkteams request was truncated, the response includes a NextToken. To retrieve the next set of labeling jobs, use the token in the next request.
    */
  var NextToken: js.UndefOr[typings.awsDashSdk.clientsSagemakerMod.NextToken] = js.undefined
}

object ListSubscribedWorkteamsRequest {
  @scala.inline
  def apply(MaxResults: Int | Double = null, NameContains: WorkteamName = null, NextToken: NextToken = null): ListSubscribedWorkteamsRequest = {
    val __obj = js.Dynamic.literal()
    if (MaxResults != null) __obj.updateDynamic("MaxResults")(MaxResults.asInstanceOf[js.Any])
    if (NameContains != null) __obj.updateDynamic("NameContains")(NameContains)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[ListSubscribedWorkteamsRequest]
  }
}

