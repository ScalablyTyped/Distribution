package typings.awsDashSdk.clientsIoteventsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListInputsResponse extends js.Object {
  /**
    * Summary information about the inputs.
    */
  var inputSummaries: js.UndefOr[InputSummaries] = js.native
  /**
    * A token to retrieve the next set of results, or null if there are no additional results.
    */
  var nextToken: js.UndefOr[NextToken] = js.native
}

object ListInputsResponse {
  @scala.inline
  def apply(inputSummaries: InputSummaries = null, nextToken: NextToken = null): ListInputsResponse = {
    val __obj = js.Dynamic.literal()
    if (inputSummaries != null) __obj.updateDynamic("inputSummaries")(inputSummaries.asInstanceOf[js.Any])
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListInputsResponse]
  }
}

