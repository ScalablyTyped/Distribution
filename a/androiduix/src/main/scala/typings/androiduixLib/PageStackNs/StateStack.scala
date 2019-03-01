package typings
package androiduixLib.PageStackNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StateStack extends js.Object {
  var isRoot: js.UndefOr[scala.Boolean] = js.undefined
  var pageId: java.lang.String
  var stack: js.Array[StateSaved]
}

object StateStack {
  @scala.inline
  def apply(
    pageId: java.lang.String,
    stack: js.Array[StateSaved],
    isRoot: js.UndefOr[scala.Boolean] = js.undefined
  ): StateStack = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("pageId")(pageId)
    __obj.updateDynamic("stack")(stack)
    if (!js.isUndefined(isRoot)) __obj.updateDynamic("isRoot")(isRoot)
    __obj.asInstanceOf[StateStack]
  }
}

