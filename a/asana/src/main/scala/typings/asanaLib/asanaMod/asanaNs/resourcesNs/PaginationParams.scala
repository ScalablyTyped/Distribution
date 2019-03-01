package typings
package asanaLib.asanaMod.asanaNs.resourcesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PaginationParams extends Params {
  var limit: js.UndefOr[scala.Double] = js.undefined
  var offset: js.UndefOr[java.lang.String] = js.undefined
}

object PaginationParams {
  @scala.inline
  def apply(
    limit: scala.Int | scala.Double = null,
    offset: java.lang.String = null,
    opt_expand: java.lang.String = null,
    opt_fields: java.lang.String = null
  ): PaginationParams = {
    val __obj = js.Dynamic.literal()
    if (limit != null) __obj.updateDynamic("limit")(limit.asInstanceOf[js.Any])
    if (offset != null) __obj.updateDynamic("offset")(offset)
    if (opt_expand != null) __obj.updateDynamic("opt_expand")(opt_expand)
    if (opt_fields != null) __obj.updateDynamic("opt_fields")(opt_fields)
    __obj.asInstanceOf[PaginationParams]
  }
}

