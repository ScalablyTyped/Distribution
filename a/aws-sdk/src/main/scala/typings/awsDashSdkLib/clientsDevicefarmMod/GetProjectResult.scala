package typings
package awsDashSdkLib.clientsDevicefarmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetProjectResult extends js.Object {
  /**
    * The project you wish to get information about.
    */
  var project: js.UndefOr[Project] = js.undefined
}

object GetProjectResult {
  @scala.inline
  def apply(project: Project = null): GetProjectResult = {
    val __obj = js.Dynamic.literal()
    if (project != null) __obj.updateDynamic("project")(project)
    __obj.asInstanceOf[GetProjectResult]
  }
}

