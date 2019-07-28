package typings.awsDashSdk.clientsIot1clickprojectsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListProjectsResponse extends js.Object {
  /**
    * The token used to retrieve the next set of results - will be effectively empty if there are no further results.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
  /**
    * An object containing the list of projects.
    */
  var projects: ProjectSummaryList
}

object ListProjectsResponse {
  @scala.inline
  def apply(projects: ProjectSummaryList, nextToken: NextToken = null): ListProjectsResponse = {
    val __obj = js.Dynamic.literal(projects = projects)
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken)
    __obj.asInstanceOf[ListProjectsResponse]
  }
}

