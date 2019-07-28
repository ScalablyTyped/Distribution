package typings.awsDashSdk.clientsMobileMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListProjectsResult extends js.Object {
  var nextToken: js.UndefOr[NextToken] = js.undefined
  var projects: js.UndefOr[ProjectSummaries] = js.undefined
}

object ListProjectsResult {
  @scala.inline
  def apply(nextToken: NextToken = null, projects: ProjectSummaries = null): ListProjectsResult = {
    val __obj = js.Dynamic.literal()
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken)
    if (projects != null) __obj.updateDynamic("projects")(projects)
    __obj.asInstanceOf[ListProjectsResult]
  }
}

