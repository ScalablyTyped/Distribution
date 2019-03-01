package typings
package asanaLib.asanaMod.asanaNs.resourcesNs.TagsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FindAllParams
  extends asanaLib.asanaMod.asanaNs.resourcesNs.PaginationParams {
  var archived: js.UndefOr[scala.Boolean] = js.undefined
  var team: js.UndefOr[scala.Double] = js.undefined
}

object FindAllParams {
  @scala.inline
  def apply(
    archived: js.UndefOr[scala.Boolean] = js.undefined,
    limit: scala.Int | scala.Double = null,
    offset: java.lang.String = null,
    opt_expand: java.lang.String = null,
    opt_fields: java.lang.String = null,
    team: scala.Int | scala.Double = null
  ): FindAllParams = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(archived)) __obj.updateDynamic("archived")(archived)
    if (limit != null) __obj.updateDynamic("limit")(limit.asInstanceOf[js.Any])
    if (offset != null) __obj.updateDynamic("offset")(offset)
    if (opt_expand != null) __obj.updateDynamic("opt_expand")(opt_expand)
    if (opt_fields != null) __obj.updateDynamic("opt_fields")(opt_fields)
    if (team != null) __obj.updateDynamic("team")(team.asInstanceOf[js.Any])
    __obj.asInstanceOf[FindAllParams]
  }
}

