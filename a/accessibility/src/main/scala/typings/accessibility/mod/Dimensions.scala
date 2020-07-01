package typings.accessibility.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Dimensions extends js.Object {
  var height: js.UndefOr[SizeOrPosition] = js.undefined
  var width: js.UndefOr[SizeOrPosition] = js.undefined
}

object Dimensions {
  @scala.inline
  def apply(height: SizeOrPosition = null, width: SizeOrPosition = null): Dimensions = {
    val __obj = js.Dynamic.literal()
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Dimensions]
  }
}

