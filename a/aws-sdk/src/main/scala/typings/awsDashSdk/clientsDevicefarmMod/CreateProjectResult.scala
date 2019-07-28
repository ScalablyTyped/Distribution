package typings.awsDashSdk.clientsDevicefarmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateProjectResult extends js.Object {
  /**
    * The newly created project.
    */
  var project: js.UndefOr[Project] = js.undefined
}

object CreateProjectResult {
  @scala.inline
  def apply(project: Project = null): CreateProjectResult = {
    val __obj = js.Dynamic.literal()
    if (project != null) __obj.updateDynamic("project")(project)
    __obj.asInstanceOf[CreateProjectResult]
  }
}

