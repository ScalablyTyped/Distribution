package typings.asana.mod.resources

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PaginationParams extends Params {
  var limit: js.UndefOr[Double] = js.undefined
  var offset: js.UndefOr[String] = js.undefined
}

object PaginationParams {
  @scala.inline
  def apply(
    limit: js.UndefOr[Double] = js.undefined,
    offset: String = null,
    opt_expand: String = null,
    opt_fields: String = null
  ): PaginationParams = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(limit)) __obj.updateDynamic("limit")(limit.get.asInstanceOf[js.Any])
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (opt_expand != null) __obj.updateDynamic("opt_expand")(opt_expand.asInstanceOf[js.Any])
    if (opt_fields != null) __obj.updateDynamic("opt_fields")(opt_fields.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaginationParams]
  }
}

