package typings
package asanaLib.asanaMod.asanaNs.resourcesNs.UsersNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FindAllParams
  extends asanaLib.asanaMod.asanaNs.resourcesNs.PaginationParams {
  var workspace: scala.Double
}

object FindAllParams {
  @scala.inline
  def apply(
    workspace: scala.Double,
    limit: scala.Int | scala.Double = null,
    offset: java.lang.String = null,
    opt_expand: java.lang.String = null,
    opt_fields: java.lang.String = null
  ): FindAllParams = {
    val __obj = js.Dynamic.literal(workspace = workspace)
    if (limit != null) __obj.updateDynamic("limit")(limit.asInstanceOf[js.Any])
    if (offset != null) __obj.updateDynamic("offset")(offset)
    if (opt_expand != null) __obj.updateDynamic("opt_expand")(opt_expand)
    if (opt_fields != null) __obj.updateDynamic("opt_fields")(opt_fields)
    __obj.asInstanceOf[FindAllParams]
  }
}

