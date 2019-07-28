package typings.awsDashSdk.clientsCodebuildMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateProjectOutput extends js.Object {
  /**
    * Information about the build project that was created.
    */
  var project: js.UndefOr[Project] = js.undefined
}

object CreateProjectOutput {
  @scala.inline
  def apply(project: Project = null): CreateProjectOutput = {
    val __obj = js.Dynamic.literal()
    if (project != null) __obj.updateDynamic("project")(project)
    __obj.asInstanceOf[CreateProjectOutput]
  }
}

