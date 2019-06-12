package typings
package awsDashSdkLib.clientsPersonalizeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListSolutionVersionsRequest extends js.Object {
  /**
    * The maximum number of solution versions to return.
    */
  var maxResults: js.UndefOr[MaxResults] = js.undefined
  /**
    * A token returned from the previous call to ListSolutionVersions for getting the next set of solution versions (if they exist).
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
  /**
    * The Amazon Resource Name (ARN) of the solution.
    */
  var solutionArn: js.UndefOr[Arn] = js.undefined
}

object ListSolutionVersionsRequest {
  @scala.inline
  def apply(
    maxResults: js.UndefOr[MaxResults] = js.undefined,
    nextToken: NextToken = null,
    solutionArn: Arn = null
  ): ListSolutionVersionsRequest = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(maxResults)) __obj.updateDynamic("maxResults")(maxResults)
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken)
    if (solutionArn != null) __obj.updateDynamic("solutionArn")(solutionArn)
    __obj.asInstanceOf[ListSolutionVersionsRequest]
  }
}

