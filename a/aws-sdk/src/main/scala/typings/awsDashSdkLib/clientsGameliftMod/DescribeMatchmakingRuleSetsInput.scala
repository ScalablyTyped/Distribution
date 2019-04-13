package typings
package awsDashSdkLib.clientsGameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeMatchmakingRuleSetsInput extends js.Object {
  /**
    * Maximum number of results to return. Use this parameter with NextToken to get results as a set of sequential pages.
    */
  var Limit: js.UndefOr[RuleSetLimit] = js.undefined
  /**
    * List of one or more matchmaking rule set names to retrieve details for. (Note: The rule set name is different from the optional "name" field in the rule set body.) 
    */
  var Names: js.UndefOr[MatchmakingRuleSetNameList] = js.undefined
  /**
    * Token that indicates the start of the next sequential page of results. Use the token that is returned with a previous call to this action. To start at the beginning of the result set, do not specify a value.
    */
  var NextToken: js.UndefOr[NonZeroAndMaxString] = js.undefined
}

object DescribeMatchmakingRuleSetsInput {
  @scala.inline
  def apply(
    Limit: js.UndefOr[RuleSetLimit] = js.undefined,
    Names: MatchmakingRuleSetNameList = null,
    NextToken: NonZeroAndMaxString = null
  ): DescribeMatchmakingRuleSetsInput = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(Limit)) __obj.updateDynamic("Limit")(Limit)
    if (Names != null) __obj.updateDynamic("Names")(Names)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[DescribeMatchmakingRuleSetsInput]
  }
}

