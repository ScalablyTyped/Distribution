package typings
package awsDashSdkLib.clientsCodestarMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListProjectsResult extends js.Object {
  /**
    * The continuation token to use when requesting the next set of results, if there are more results to be returned.
    */
  var nextToken: js.UndefOr[PaginationToken] = js.undefined
  /**
    * A list of projects.
    */
  var projects: ProjectsList
}

object ListProjectsResult {
  @scala.inline
  def apply(projects: ProjectsList, nextToken: PaginationToken = null): ListProjectsResult = {
    val __obj = js.Dynamic.literal(projects = projects)
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken)
    __obj.asInstanceOf[ListProjectsResult]
  }
}

