package typings.awsDashSdk.clientsGameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeMatchmakingRuleSetsOutput extends js.Object {
  /**
    * A token that indicates where to resume retrieving results on the next call to this action. If no token is returned, these results represent the end of the list.
    */
  var NextToken: js.UndefOr[NonZeroAndMaxString] = js.native
  /**
    * A collection of requested matchmaking rule set objects. 
    */
  var RuleSets: MatchmakingRuleSetList = js.native
}

object DescribeMatchmakingRuleSetsOutput {
  @scala.inline
  def apply(RuleSets: MatchmakingRuleSetList, NextToken: NonZeroAndMaxString = null): DescribeMatchmakingRuleSetsOutput = {
    val __obj = js.Dynamic.literal(RuleSets = RuleSets.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeMatchmakingRuleSetsOutput]
  }
}

