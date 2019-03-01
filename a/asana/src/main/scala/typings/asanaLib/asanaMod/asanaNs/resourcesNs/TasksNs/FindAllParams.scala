package typings
package asanaLib.asanaMod.asanaNs.resourcesNs.TasksNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FindAllParams
  extends asanaLib.asanaMod.asanaNs.resourcesNs.PaginationParams {
  var assignee: js.UndefOr[scala.Double] = js.undefined
  var completed_since: js.UndefOr[java.lang.String] = js.undefined
  var modified_since: js.UndefOr[java.lang.String] = js.undefined
  var workspace: scala.Double
}

object FindAllParams {
  @scala.inline
  def apply(
    workspace: scala.Double,
    assignee: scala.Int | scala.Double = null,
    completed_since: java.lang.String = null,
    limit: scala.Int | scala.Double = null,
    modified_since: java.lang.String = null,
    offset: java.lang.String = null,
    opt_expand: java.lang.String = null,
    opt_fields: java.lang.String = null
  ): FindAllParams = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("workspace")(workspace)
    if (assignee != null) __obj.updateDynamic("assignee")(assignee.asInstanceOf[js.Any])
    if (completed_since != null) __obj.updateDynamic("completed_since")(completed_since)
    if (limit != null) __obj.updateDynamic("limit")(limit.asInstanceOf[js.Any])
    if (modified_since != null) __obj.updateDynamic("modified_since")(modified_since)
    if (offset != null) __obj.updateDynamic("offset")(offset)
    if (opt_expand != null) __obj.updateDynamic("opt_expand")(opt_expand)
    if (opt_fields != null) __obj.updateDynamic("opt_fields")(opt_fields)
    __obj.asInstanceOf[FindAllParams]
  }
}

