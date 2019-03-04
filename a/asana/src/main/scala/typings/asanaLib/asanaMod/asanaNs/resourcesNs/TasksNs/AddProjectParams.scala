package typings
package asanaLib.asanaMod.asanaNs.resourcesNs.TasksNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AddProjectParams extends js.Object {
  var insertAfter: js.UndefOr[scala.Double] = js.undefined
  var insertBefore: js.UndefOr[scala.Double] = js.undefined
  var project: scala.Double
  var section: js.UndefOr[scala.Double] = js.undefined
}

object AddProjectParams {
  @scala.inline
  def apply(
    project: scala.Double,
    insertAfter: scala.Int | scala.Double = null,
    insertBefore: scala.Int | scala.Double = null,
    section: scala.Int | scala.Double = null
  ): AddProjectParams = {
    val __obj = js.Dynamic.literal(project = project)
    if (insertAfter != null) __obj.updateDynamic("insertAfter")(insertAfter.asInstanceOf[js.Any])
    if (insertBefore != null) __obj.updateDynamic("insertBefore")(insertBefore.asInstanceOf[js.Any])
    if (section != null) __obj.updateDynamic("section")(section.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddProjectParams]
  }
}

