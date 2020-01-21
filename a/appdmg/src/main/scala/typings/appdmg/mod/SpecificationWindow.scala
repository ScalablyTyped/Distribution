package typings.appdmg.mod

import typings.appdmg.AnonHeight
import typings.appdmg.AnonX
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SpecificationWindow extends js.Object {
  var position: js.UndefOr[AnonX] = js.undefined
  var size: js.UndefOr[AnonHeight] = js.undefined
}

object SpecificationWindow {
  @scala.inline
  def apply(position: AnonX = null, size: AnonHeight = null): SpecificationWindow = {
    val __obj = js.Dynamic.literal()
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpecificationWindow]
  }
}

