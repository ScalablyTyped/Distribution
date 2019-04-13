package typings
package awsDashSdkLib.clientsGameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeMatchmakingConfigurationsOutput extends js.Object {
  /**
    * Collection of requested matchmaking configuration objects.
    */
  var Configurations: js.UndefOr[MatchmakingConfigurationList] = js.undefined
  /**
    * Token that indicates where to resume retrieving results on the next call to this action. If no token is returned, these results represent the end of the list.
    */
  var NextToken: js.UndefOr[NonZeroAndMaxString] = js.undefined
}

object DescribeMatchmakingConfigurationsOutput {
  @scala.inline
  def apply(Configurations: MatchmakingConfigurationList = null, NextToken: NonZeroAndMaxString = null): DescribeMatchmakingConfigurationsOutput = {
    val __obj = js.Dynamic.literal()
    if (Configurations != null) __obj.updateDynamic("Configurations")(Configurations)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[DescribeMatchmakingConfigurationsOutput]
  }
}

