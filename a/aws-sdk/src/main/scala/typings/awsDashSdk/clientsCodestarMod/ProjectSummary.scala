package typings.awsDashSdk.clientsCodestarMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProjectSummary extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the project.
    */
  var projectArn: js.UndefOr[ProjectArn] = js.undefined
  /**
    * The ID of the project.
    */
  var projectId: js.UndefOr[ProjectId] = js.undefined
}

object ProjectSummary {
  @scala.inline
  def apply(projectArn: ProjectArn = null, projectId: ProjectId = null): ProjectSummary = {
    val __obj = js.Dynamic.literal()
    if (projectArn != null) __obj.updateDynamic("projectArn")(projectArn)
    if (projectId != null) __obj.updateDynamic("projectId")(projectId)
    __obj.asInstanceOf[ProjectSummary]
  }
}

