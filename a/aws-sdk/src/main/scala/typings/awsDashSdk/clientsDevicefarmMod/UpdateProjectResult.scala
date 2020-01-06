package typings.awsDashSdk.clientsDevicefarmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateProjectResult extends js.Object {
  /**
    * The project to update.
    */
  var project: js.UndefOr[Project] = js.native
}

object UpdateProjectResult {
  @scala.inline
  def apply(project: Project = null): UpdateProjectResult = {
    val __obj = js.Dynamic.literal()
    if (project != null) __obj.updateDynamic("project")(project.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateProjectResult]
  }
}

