package typings.asana.mod.resources.Projects

import typings.asana.mod.resources.PaginationParams
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
    limit: js.UndefOr[Double] = js.undefined,
    offset: String = null,
    opt_expand: String = null,
    opt_fields: String = null
  ): FindByParams = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(archived)) __obj.updateDynamic("archived")(archived.get.asInstanceOf[js.Any])
    if (!js.isUndefined(limit)) __obj.updateDynamic("limit")(limit.get.asInstanceOf[js.Any])
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (opt_expand != null) __obj.updateDynamic("opt_expand")(opt_expand.asInstanceOf[js.Any])
    if (opt_fields != null) __obj.updateDynamic("opt_fields")(opt_fields.asInstanceOf[js.Any])
    __obj.asInstanceOf[FindByParams]
  }
}

