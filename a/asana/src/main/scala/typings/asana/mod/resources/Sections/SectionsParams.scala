package typings.asana.mod.resources.Sections

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SectionsParams extends js.Object {
  var insert_after: js.UndefOr[String] = js.undefined
  var insert_before: js.UndefOr[String] = js.undefined
  var task: Double | String
}

object SectionsParams {
  @scala.inline
  def apply(task: Double | String, insert_after: String = null, insert_before: String = null): SectionsParams = {
    val __obj = js.Dynamic.literal(task = task.asInstanceOf[js.Any])
    if (insert_after != null) __obj.updateDynamic("insert_after")(insert_after.asInstanceOf[js.Any])
    if (insert_before != null) __obj.updateDynamic("insert_before")(insert_before.asInstanceOf[js.Any])
    __obj.asInstanceOf[SectionsParams]
  }
}

