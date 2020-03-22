package typings.antDesignProLayout

import typings.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonChildren extends js.Object {
  var children: js.Any
  var className: js.UndefOr[String] = js.undefined
  var isChildrenLayout: js.UndefOr[Boolean] = js.undefined
  var location: js.UndefOr[js.Any] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
}

object AnonChildren {
  @scala.inline
  def apply(
    children: js.Any,
    className: String = null,
    isChildrenLayout: js.UndefOr[Boolean] = js.undefined,
    location: js.Any = null,
    style: CSSProperties = null
  ): AnonChildren = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(isChildrenLayout)) __obj.updateDynamic("isChildrenLayout")(isChildrenLayout.asInstanceOf[js.Any])
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonChildren]
  }
}

