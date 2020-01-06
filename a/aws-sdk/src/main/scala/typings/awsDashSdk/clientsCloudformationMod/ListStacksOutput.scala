package typings.awsDashSdk.clientsCloudformationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListStacksOutput extends js.Object {
  /**
    * If the output exceeds 1 MB in size, a string that identifies the next page of stacks. If no additional page exists, this value is null.
    */
  var NextToken: js.UndefOr[typings.awsDashSdk.clientsCloudformationMod.NextToken] = js.native
  /**
    * A list of StackSummary structures containing information about the specified stacks.
    */
  var StackSummaries: js.UndefOr[typings.awsDashSdk.clientsCloudformationMod.StackSummaries] = js.native
}

object ListStacksOutput {
  @scala.inline
  def apply(NextToken: NextToken = null, StackSummaries: StackSummaries = null): ListStacksOutput = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (StackSummaries != null) __obj.updateDynamic("StackSummaries")(StackSummaries.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListStacksOutput]
  }
}

