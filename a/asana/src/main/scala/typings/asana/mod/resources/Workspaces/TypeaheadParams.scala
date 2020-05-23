package typings.asana.mod.resources.Workspaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeaheadParams extends js.Object {
  var count: js.UndefOr[Double] = js.undefined
  var query: js.UndefOr[String] = js.undefined
  var `type`: String
}

object TypeaheadParams {
  @scala.inline
  def apply(`type`: String, count: js.UndefOr[Double] = js.undefined, query: String = null): TypeaheadParams = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(count)) __obj.updateDynamic("count")(count.get.asInstanceOf[js.Any])
    if (query != null) __obj.updateDynamic("query")(query.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeaheadParams]
  }
}

