package typings.awsDashSdk.clientsAugmentedairuntimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListHumanLoopsResponse extends js.Object {
  /**
    * An array of objects containing information about the human loops.
    */
  var HumanLoopSummaries: typings.awsDashSdk.clientsAugmentedairuntimeMod.HumanLoopSummaries = js.native
  /**
    * A token to resume pagination.
    */
  var NextToken: js.UndefOr[typings.awsDashSdk.clientsAugmentedairuntimeMod.NextToken] = js.native
}

object ListHumanLoopsResponse {
  @scala.inline
  def apply(HumanLoopSummaries: HumanLoopSummaries, NextToken: NextToken = null): ListHumanLoopsResponse = {
    val __obj = js.Dynamic.literal(HumanLoopSummaries = HumanLoopSummaries.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListHumanLoopsResponse]
  }
}

