package typings.awsDashSdk.clientsPersonalizeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListSolutionVersionsResponse extends js.Object {
  /**
    * A token for getting the next set of solution versions (if they exist).
    */
  var nextToken: js.UndefOr[NextToken] = js.native
  /**
    * A list of solution versions describing the version properties.
    */
  var solutionVersions: js.UndefOr[SolutionVersions] = js.native
}

object ListSolutionVersionsResponse {
  @scala.inline
  def apply(nextToken: NextToken = null, solutionVersions: SolutionVersions = null): ListSolutionVersionsResponse = {
    val __obj = js.Dynamic.literal()
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken.asInstanceOf[js.Any])
    if (solutionVersions != null) __obj.updateDynamic("solutionVersions")(solutionVersions.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListSolutionVersionsResponse]
  }
}

