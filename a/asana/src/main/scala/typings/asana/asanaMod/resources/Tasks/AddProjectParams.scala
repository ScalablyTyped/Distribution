package typings.asana.asanaMod.resources.Tasks

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AddProjectParams extends js.Object {
  var insertAfter: js.UndefOr[Double] = js.undefined
  var insertBefore: js.UndefOr[Double] = js.undefined
  var project: String | Double
  var section: js.UndefOr[Double] = js.undefined
}

object AddProjectParams {
  @scala.inline
  def apply(
    project: String | Double,
    insertAfter: Int | Double = null,
    insertBefore: Int | Double = null,
    section: Int | Double = null
  ): AddProjectParams = {
    val __obj = js.Dynamic.literal(project = project.asInstanceOf[js.Any])
    if (insertAfter != null) __obj.updateDynamic("insertAfter")(insertAfter.asInstanceOf[js.Any])
    if (insertBefore != null) __obj.updateDynamic("insertBefore")(insertBefore.asInstanceOf[js.Any])
    if (section != null) __obj.updateDynamic("section")(section.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddProjectParams]
  }
}

