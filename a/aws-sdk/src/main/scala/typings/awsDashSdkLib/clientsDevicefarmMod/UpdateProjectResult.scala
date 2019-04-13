package typings
package awsDashSdkLib.clientsDevicefarmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateProjectResult extends js.Object {
  /**
    * The project you wish to update.
    */
  var project: js.UndefOr[Project] = js.undefined
}

object UpdateProjectResult {
  @scala.inline
  def apply(project: Project = null): UpdateProjectResult = {
    val __obj = js.Dynamic.literal()
    if (project != null) __obj.updateDynamic("project")(project)
    __obj.asInstanceOf[UpdateProjectResult]
  }
}

