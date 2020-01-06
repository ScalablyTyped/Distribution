package typings.awsDashSdk.clientsCodestarMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListProjectsResult extends js.Object {
  /**
    * The continuation token to use when requesting the next set of results, if there are more results to be returned.
    */
  var nextToken: js.UndefOr[PaginationToken] = js.native
  /**
    * A list of projects.
    */
  var projects: ProjectsList = js.native
}

object ListProjectsResult {
  @scala.inline
  def apply(projects: ProjectsList, nextToken: PaginationToken = null): ListProjectsResult = {
    val __obj = js.Dynamic.literal(projects = projects.asInstanceOf[js.Any])
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListProjectsResult]
  }
}

