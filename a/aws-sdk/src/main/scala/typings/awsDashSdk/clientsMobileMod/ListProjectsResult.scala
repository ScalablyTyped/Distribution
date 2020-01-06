package typings.awsDashSdk.clientsMobileMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListProjectsResult extends js.Object {
  var nextToken: js.UndefOr[NextToken] = js.native
  var projects: js.UndefOr[ProjectSummaries] = js.native
}

object ListProjectsResult {
  @scala.inline
  def apply(nextToken: NextToken = null, projects: ProjectSummaries = null): ListProjectsResult = {
    val __obj = js.Dynamic.literal()
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken.asInstanceOf[js.Any])
    if (projects != null) __obj.updateDynamic("projects")(projects.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListProjectsResult]
  }
}

