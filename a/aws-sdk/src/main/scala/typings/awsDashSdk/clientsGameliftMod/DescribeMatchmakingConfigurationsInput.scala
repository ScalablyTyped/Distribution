package typings.awsDashSdk.clientsGameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeMatchmakingConfigurationsInput extends js.Object {
  /**
    * Maximum number of results to return. Use this parameter with NextToken to get results as a set of sequential pages. This parameter is limited to 10.
    */
  var Limit: js.UndefOr[PositiveInteger] = js.undefined
  /**
    * Unique identifier for a matchmaking configuration(s) to retrieve. To request all existing configurations, leave this parameter empty.
    */
  var Names: js.UndefOr[MatchmakingIdList] = js.undefined
  /**
    * Token that indicates the start of the next sequential page of results. Use the token that is returned with a previous call to this action. To start at the beginning of the result set, do not specify a value.
    */
  var NextToken: js.UndefOr[NonZeroAndMaxString] = js.undefined
  /**
    * Unique identifier for a matchmaking rule set. Use this parameter to retrieve all matchmaking configurations that use this rule set.
    */
  var RuleSetName: js.UndefOr[MatchmakingIdStringModel] = js.undefined
}

object DescribeMatchmakingConfigurationsInput {
  @scala.inline
  def apply(
    Limit: Int | scala.Double = null,
    Names: MatchmakingIdList = null,
    NextToken: NonZeroAndMaxString = null,
    RuleSetName: MatchmakingIdStringModel = null
  ): DescribeMatchmakingConfigurationsInput = {
    val __obj = js.Dynamic.literal()
    if (Limit != null) __obj.updateDynamic("Limit")(Limit.asInstanceOf[js.Any])
    if (Names != null) __obj.updateDynamic("Names")(Names)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    if (RuleSetName != null) __obj.updateDynamic("RuleSetName")(RuleSetName)
    __obj.asInstanceOf[DescribeMatchmakingConfigurationsInput]
  }
}

