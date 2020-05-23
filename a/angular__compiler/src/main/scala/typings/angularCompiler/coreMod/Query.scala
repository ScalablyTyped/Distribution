package typings.angularCompiler.coreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Query extends js.Object {
  var descendants: Boolean
  var first: Boolean
  var isViewQuery: Boolean
  var read: js.Any
  var selector: js.Any
  var static: js.UndefOr[Boolean] = js.undefined
}

object Query {
  @scala.inline
  def apply(
    descendants: Boolean,
    first: Boolean,
    isViewQuery: Boolean,
    read: js.Any,
    selector: js.Any,
    static: js.UndefOr[Boolean] = js.undefined
  ): Query = {
    val __obj = js.Dynamic.literal(descendants = descendants.asInstanceOf[js.Any], first = first.asInstanceOf[js.Any], isViewQuery = isViewQuery.asInstanceOf[js.Any], read = read.asInstanceOf[js.Any], selector = selector.asInstanceOf[js.Any])
    if (!js.isUndefined(static)) __obj.updateDynamic("static")(static.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Query]
  }
}

