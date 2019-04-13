package typings
package awsDashSdkLib.clientsDevicefarmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateProjectRequest extends js.Object {
  /**
    * Sets the execution timeout value (in minutes) for a project. All test runs in this project will use the specified execution timeout value unless overridden when scheduling a run.
    */
  var defaultJobTimeoutMinutes: js.UndefOr[JobTimeoutMinutes] = js.undefined
  /**
    * The project's name.
    */
  var name: Name
}

object CreateProjectRequest {
  @scala.inline
  def apply(name: Name, defaultJobTimeoutMinutes: js.UndefOr[JobTimeoutMinutes] = js.undefined): CreateProjectRequest = {
    val __obj = js.Dynamic.literal(name = name)
    if (!js.isUndefined(defaultJobTimeoutMinutes)) __obj.updateDynamic("defaultJobTimeoutMinutes")(defaultJobTimeoutMinutes)
    __obj.asInstanceOf[CreateProjectRequest]
  }
}

