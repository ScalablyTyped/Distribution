package typings
package antdDashMobileLib.esSearchDashBarPropsTypeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SearchBarState extends js.Object {
  var focus: js.UndefOr[scala.Boolean] = js.undefined
  var focused: js.UndefOr[scala.Boolean] = js.undefined
  var value: js.UndefOr[java.lang.String] = js.undefined
}

object SearchBarState {
  @scala.inline
  def apply(
    focus: js.UndefOr[scala.Boolean] = js.undefined,
    focused: js.UndefOr[scala.Boolean] = js.undefined,
    value: java.lang.String = null
  ): SearchBarState = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(focus)) __obj.updateDynamic("focus")(focus)
    if (!js.isUndefined(focused)) __obj.updateDynamic("focused")(focused)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[SearchBarState]
  }
}

