package typings.awsDashSdk.clientsCloudformationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListStackResourcesOutput extends js.Object {
  /**
    * If the output exceeds 1 MB, a string that identifies the next page of stack resources. If no additional page exists, this value is null.
    */
  var NextToken: js.UndefOr[typings.awsDashSdk.clientsCloudformationMod.NextToken] = js.undefined
  /**
    * A list of StackResourceSummary structures.
    */
  var StackResourceSummaries: js.UndefOr[typings.awsDashSdk.clientsCloudformationMod.StackResourceSummaries] = js.undefined
}

object ListStackResourcesOutput {
  @scala.inline
  def apply(NextToken: NextToken = null, StackResourceSummaries: StackResourceSummaries = null): ListStackResourcesOutput = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    if (StackResourceSummaries != null) __obj.updateDynamic("StackResourceSummaries")(StackResourceSummaries)
    __obj.asInstanceOf[ListStackResourcesOutput]
  }
}

