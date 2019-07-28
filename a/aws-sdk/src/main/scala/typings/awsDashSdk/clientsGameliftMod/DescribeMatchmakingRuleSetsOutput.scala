package typings.awsDashSdk.clientsGameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeMatchmakingRuleSetsOutput extends js.Object {
  /**
    * Token that indicates where to resume retrieving results on the next call to this action. If no token is returned, these results represent the end of the list.
    */
  var NextToken: js.UndefOr[NonZeroAndMaxString] = js.undefined
  /**
    * Collection of requested matchmaking rule set objects. 
    */
  var RuleSets: MatchmakingRuleSetList
}

object DescribeMatchmakingRuleSetsOutput {
  @scala.inline
  def apply(RuleSets: MatchmakingRuleSetList, NextToken: NonZeroAndMaxString = null): DescribeMatchmakingRuleSetsOutput = {
    val __obj = js.Dynamic.literal(RuleSets = RuleSets)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[DescribeMatchmakingRuleSetsOutput]
  }
}

