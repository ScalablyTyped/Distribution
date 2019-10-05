package typings.amapDashJsDashApiDashControlDashBar.AMap.ControlBar

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Position extends js.Object {
  var bottom: js.UndefOr[String] = js.undefined
  var left: js.UndefOr[String] = js.undefined
  var right: js.UndefOr[String] = js.undefined
  var top: js.UndefOr[String] = js.undefined
}

object Position {
  @scala.inline
  def apply(bottom: String = null, left: String = null, right: String = null, top: String = null): Position = {
    val __obj = js.Dynamic.literal()
    if (bottom != null) __obj.updateDynamic("bottom")(bottom)
    if (left != null) __obj.updateDynamic("left")(left)
    if (right != null) __obj.updateDynamic("right")(right)
    if (top != null) __obj.updateDynamic("top")(top)
    __obj.asInstanceOf[Position]
  }
}

