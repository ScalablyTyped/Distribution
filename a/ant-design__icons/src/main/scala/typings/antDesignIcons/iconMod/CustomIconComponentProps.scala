package typings.antDesignIcons.iconMod

import typings.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomIconComponentProps extends js.Object {
  var className: js.UndefOr[String] = js.undefined
  var fill: String
  var height: String | Double
  var style: js.UndefOr[CSSProperties] = js.undefined
  var viewBox: js.UndefOr[String] = js.undefined
  var width: String | Double
}

object CustomIconComponentProps {
  @scala.inline
  def apply(
    fill: String,
    height: String | Double,
    width: String | Double,
    className: String = null,
    style: CSSProperties = null,
    viewBox: String = null
  ): CustomIconComponentProps = {
    val __obj = js.Dynamic.literal(fill = fill.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (viewBox != null) __obj.updateDynamic("viewBox")(viewBox.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomIconComponentProps]
  }
}

