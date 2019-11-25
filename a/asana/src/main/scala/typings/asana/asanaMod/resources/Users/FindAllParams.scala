package typings.asana.asanaMod.resources.Users

import typings.asana.asanaMod.resources.PaginationParams
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FindAllParams extends PaginationParams {
  var workspace: Double
}

object FindAllParams {
  @scala.inline
  def apply(
    workspace: Double,
    limit: Int | Double = null,
    offset: String = null,
    opt_expand: String = null,
    opt_fields: String = null
  ): FindAllParams = {
    val __obj = js.Dynamic.literal(workspace = workspace.asInstanceOf[js.Any])
    if (limit != null) __obj.updateDynamic("limit")(limit.asInstanceOf[js.Any])
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (opt_expand != null) __obj.updateDynamic("opt_expand")(opt_expand.asInstanceOf[js.Any])
    if (opt_fields != null) __obj.updateDynamic("opt_fields")(opt_fields.asInstanceOf[js.Any])
    __obj.asInstanceOf[FindAllParams]
  }
}

