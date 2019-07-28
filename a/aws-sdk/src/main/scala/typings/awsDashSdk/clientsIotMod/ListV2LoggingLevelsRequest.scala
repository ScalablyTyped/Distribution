package typings.awsDashSdk.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListV2LoggingLevelsRequest extends js.Object {
  /**
    * The maximum number of results to return at one time.
    */
  var maxResults: js.UndefOr[SkyfallMaxResults] = js.undefined
  /**
    * The token used to get the next set of results, or null if there are no additional results.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
  /**
    * The type of resource for which you are configuring logging. Must be THING_Group.
    */
  var targetType: js.UndefOr[LogTargetType] = js.undefined
}

object ListV2LoggingLevelsRequest {
  @scala.inline
  def apply(
    maxResults: js.UndefOr[SkyfallMaxResults] = js.undefined,
    nextToken: NextToken = null,
    targetType: LogTargetType = null
  ): ListV2LoggingLevelsRequest = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(maxResults)) __obj.updateDynamic("maxResults")(maxResults)
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken)
    if (targetType != null) __obj.updateDynamic("targetType")(targetType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListV2LoggingLevelsRequest]
  }
}

