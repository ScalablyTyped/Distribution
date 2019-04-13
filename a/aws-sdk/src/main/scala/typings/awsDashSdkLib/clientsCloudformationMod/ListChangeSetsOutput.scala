package typings
package awsDashSdkLib.clientsCloudformationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListChangeSetsOutput extends js.Object {
  /**
    * If the output exceeds 1 MB, a string that identifies the next page of change sets. If there is no additional page, this value is null.
    */
  var NextToken: js.UndefOr[NextToken] = js.undefined
  /**
    * A list of ChangeSetSummary structures that provides the ID and status of each change set for the specified stack.
    */
  var Summaries: js.UndefOr[ChangeSetSummaries] = js.undefined
}

object ListChangeSetsOutput {
  @scala.inline
  def apply(NextToken: NextToken = null, Summaries: ChangeSetSummaries = null): ListChangeSetsOutput = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    if (Summaries != null) __obj.updateDynamic("Summaries")(Summaries)
    __obj.asInstanceOf[ListChangeSetsOutput]
  }
}

