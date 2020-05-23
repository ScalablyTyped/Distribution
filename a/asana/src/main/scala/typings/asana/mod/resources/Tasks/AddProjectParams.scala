package typings.asana.mod.resources.Tasks

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
    insertAfter: js.UndefOr[Double] = js.undefined,
    insertBefore: js.UndefOr[Double] = js.undefined,
    section: js.UndefOr[Double] = js.undefined
  ): AddProjectParams = {
    val __obj = js.Dynamic.literal(project = project.asInstanceOf[js.Any])
    if (!js.isUndefined(insertAfter)) __obj.updateDynamic("insertAfter")(insertAfter.get.asInstanceOf[js.Any])
    if (!js.isUndefined(insertBefore)) __obj.updateDynamic("insertBefore")(insertBefore.get.asInstanceOf[js.Any])
    if (!js.isUndefined(section)) __obj.updateDynamic("section")(section.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddProjectParams]
  }
}

