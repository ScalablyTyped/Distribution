package typings.awsDashSdk.clientsMobileMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProjectSummary extends js.Object {
  /**
    *  Name of the project. 
    */
  var name: js.UndefOr[ProjectName] = js.undefined
  /**
    *  Unique project identifier. 
    */
  var projectId: js.UndefOr[ProjectId] = js.undefined
}

object ProjectSummary {
  @scala.inline
  def apply(name: ProjectName = null, projectId: ProjectId = null): ProjectSummary = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name)
    if (projectId != null) __obj.updateDynamic("projectId")(projectId)
    __obj.asInstanceOf[ProjectSummary]
  }
}

