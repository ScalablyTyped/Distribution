package typings.asana.asanaMod.resources.Projects

import typings.asana.asanaMod.resources.PaginationParams
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FindByParams extends PaginationParams {
  var archived: js.UndefOr[Boolean] = js.undefined
}

object FindByParams {
  @scala.inline
  def apply(
    archived: js.UndefOr[Boolean] = js.undefined,
    limit: Int | Double = null,
    offset: String = null,
    opt_expand: String = null,
    opt_fields: String = null
  ): FindByParams = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(archived)) __obj.updateDynamic("archived")(archived)
    if (limit != null) __obj.updateDynamic("limit")(limit.asInstanceOf[js.Any])
    if (offset != null) __obj.updateDynamic("offset")(offset)
    if (opt_expand != null) __obj.updateDynamic("opt_expand")(opt_expand)
    if (opt_fields != null) __obj.updateDynamic("opt_fields")(opt_fields)
    __obj.asInstanceOf[FindByParams]
  }
}

