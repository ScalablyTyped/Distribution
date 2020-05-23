package typings.asana.mod.resources.Tasks

import typings.asana.mod.resources.PaginationParams
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FindAllParams extends PaginationParams {
  var assignee: js.UndefOr[Double] = js.undefined
  var completed_since: js.UndefOr[String] = js.undefined
  var modified_since: js.UndefOr[String] = js.undefined
  var workspace: Double
}

object FindAllParams {
  @scala.inline
  def apply(
    workspace: Double,
    assignee: js.UndefOr[Double] = js.undefined,
    completed_since: String = null,
    limit: js.UndefOr[Double] = js.undefined,
    modified_since: String = null,
    offset: String = null,
    opt_expand: String = null,
    opt_fields: String = null
  ): FindAllParams = {
    val __obj = js.Dynamic.literal(workspace = workspace.asInstanceOf[js.Any])
    if (!js.isUndefined(assignee)) __obj.updateDynamic("assignee")(assignee.get.asInstanceOf[js.Any])
    if (completed_since != null) __obj.updateDynamic("completed_since")(completed_since.asInstanceOf[js.Any])
    if (!js.isUndefined(limit)) __obj.updateDynamic("limit")(limit.get.asInstanceOf[js.Any])
    if (modified_since != null) __obj.updateDynamic("modified_since")(modified_since.asInstanceOf[js.Any])
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (opt_expand != null) __obj.updateDynamic("opt_expand")(opt_expand.asInstanceOf[js.Any])
    if (opt_fields != null) __obj.updateDynamic("opt_fields")(opt_fields.asInstanceOf[js.Any])
    __obj.asInstanceOf[FindAllParams]
  }
}

