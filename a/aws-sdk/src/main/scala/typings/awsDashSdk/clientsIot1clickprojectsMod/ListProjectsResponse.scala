package typings.awsDashSdk.clientsIot1clickprojectsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListProjectsResponse extends js.Object {
  /**
    * The token used to retrieve the next set of results - will be effectively empty if there are no further results.
    */
  var nextToken: js.UndefOr[NextToken] = js.native
  /**
    * An object containing the list of projects.
    */
  var projects: ProjectSummaryList = js.native
}

object ListProjectsResponse {
  @scala.inline
  def apply(projects: ProjectSummaryList, nextToken: NextToken = null): ListProjectsResponse = {
    val __obj = js.Dynamic.literal(projects = projects.asInstanceOf[js.Any])
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListProjectsResponse]
  }
}

