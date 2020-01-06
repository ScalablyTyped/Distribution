package typings.awsDashSdk.clientsCodebuildMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateProjectOutput extends js.Object {
  /**
    * Information about the build project that was changed.
    */
  var project: js.UndefOr[Project] = js.native
}

object UpdateProjectOutput {
  @scala.inline
  def apply(project: Project = null): UpdateProjectOutput = {
    val __obj = js.Dynamic.literal()
    if (project != null) __obj.updateDynamic("project")(project.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateProjectOutput]
  }
}

