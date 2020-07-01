package typings.accessibility.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Position extends js.Object {
  var bottom: js.UndefOr[SizeOrPosition] = js.undefined
  var left: js.UndefOr[SizeOrPosition] = js.undefined
  var right: js.UndefOr[SizeOrPosition] = js.undefined
  var top: js.UndefOr[SizeOrPosition] = js.undefined
  var `type`: String
}

object Position {
  @scala.inline
  def apply(
    `type`: String,
    bottom: SizeOrPosition = null,
    left: SizeOrPosition = null,
    right: SizeOrPosition = null,
    top: SizeOrPosition = null
  ): Position = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (bottom != null) __obj.updateDynamic("bottom")(bottom.asInstanceOf[js.Any])
    if (left != null) __obj.updateDynamic("left")(left.asInstanceOf[js.Any])
    if (right != null) __obj.updateDynamic("right")(right.asInstanceOf[js.Any])
    if (top != null) __obj.updateDynamic("top")(top.asInstanceOf[js.Any])
    __obj.asInstanceOf[Position]
  }
}

