package typings.awsDashSdk.clientsMobileMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProjectSummary extends js.Object {
  /**
    *  Name of the project. 
    */
  var name: js.UndefOr[ProjectName] = js.native
  /**
    *  Unique project identifier. 
    */
  var projectId: js.UndefOr[ProjectId] = js.native
}

object ProjectSummary {
  @scala.inline
  def apply(name: ProjectName = null, projectId: ProjectId = null): ProjectSummary = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (projectId != null) __obj.updateDynamic("projectId")(projectId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProjectSummary]
  }
}

