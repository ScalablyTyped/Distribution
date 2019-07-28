package typings.awsDashSdk.clientsDevicefarmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListProjectsResult extends js.Object {
  /**
    * If the number of items that are returned is significantly large, this is an identifier that is also returned, which can be used in a subsequent call to this operation to return the next set of items in the list.
    */
  var nextToken: js.UndefOr[PaginationToken] = js.undefined
  /**
    * Information about the projects.
    */
  var projects: js.UndefOr[Projects] = js.undefined
}

object ListProjectsResult {
  @scala.inline
  def apply(nextToken: PaginationToken = null, projects: Projects = null): ListProjectsResult = {
    val __obj = js.Dynamic.literal()
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken)
    if (projects != null) __obj.updateDynamic("projects")(projects)
    __obj.asInstanceOf[ListProjectsResult]
  }
}

