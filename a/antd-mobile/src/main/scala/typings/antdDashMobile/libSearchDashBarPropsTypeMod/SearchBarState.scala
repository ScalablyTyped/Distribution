package typings.antdDashMobile.libSearchDashBarPropsTypeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SearchBarState extends js.Object {
  var focus: js.UndefOr[Boolean] = js.undefined
  var focused: js.UndefOr[Boolean] = js.undefined
  var value: js.UndefOr[String] = js.undefined
}

object SearchBarState {
  @scala.inline
  def apply(
    focus: js.UndefOr[Boolean] = js.undefined,
    focused: js.UndefOr[Boolean] = js.undefined,
    value: String = null
  ): SearchBarState = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(focus)) __obj.updateDynamic("focus")(focus)
    if (!js.isUndefined(focused)) __obj.updateDynamic("focused")(focused)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[SearchBarState]
  }
}

