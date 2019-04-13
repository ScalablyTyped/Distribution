package typings
package awsDashSdkLib.clientsCodebuildMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BatchDeleteBuildsOutput extends js.Object {
  /**
    * The IDs of the builds that were successfully deleted.
    */
  var buildsDeleted: js.UndefOr[BuildIds] = js.undefined
  /**
    * Information about any builds that could not be successfully deleted.
    */
  var buildsNotDeleted: js.UndefOr[BuildsNotDeleted] = js.undefined
}

object BatchDeleteBuildsOutput {
  @scala.inline
  def apply(buildsDeleted: BuildIds = null, buildsNotDeleted: BuildsNotDeleted = null): BatchDeleteBuildsOutput = {
    val __obj = js.Dynamic.literal()
    if (buildsDeleted != null) __obj.updateDynamic("buildsDeleted")(buildsDeleted)
    if (buildsNotDeleted != null) __obj.updateDynamic("buildsNotDeleted")(buildsNotDeleted)
    __obj.asInstanceOf[BatchDeleteBuildsOutput]
  }
}

