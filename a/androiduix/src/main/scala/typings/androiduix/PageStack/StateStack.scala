package typings.androiduix.PageStack

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StateStack extends js.Object {
  var isRoot: js.UndefOr[Boolean] = js.undefined
  var pageId: String
  var stack: js.Array[StateSaved]
}

object StateStack {
  @scala.inline
  def apply(pageId: String, stack: js.Array[StateSaved], isRoot: js.UndefOr[Boolean] = js.undefined): StateStack = {
    val __obj = js.Dynamic.literal(pageId = pageId, stack = stack)
    if (!js.isUndefined(isRoot)) __obj.updateDynamic("isRoot")(isRoot)
    __obj.asInstanceOf[StateStack]
  }
}

