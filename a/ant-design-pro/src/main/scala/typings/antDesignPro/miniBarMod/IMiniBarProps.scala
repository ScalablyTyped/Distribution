package typings.antDesignPro.miniBarMod

import typings.antDesignPro.AnonY
import typings.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IMiniBarProps extends js.Object {
  var color: js.UndefOr[String] = js.undefined
  var data: js.Array[AnonY]
  var height: Double
  var style: js.UndefOr[CSSProperties] = js.undefined
}

object IMiniBarProps {
  @scala.inline
  def apply(data: js.Array[AnonY], height: Double, color: String = null, style: CSSProperties = null): IMiniBarProps = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMiniBarProps]
  }
}

