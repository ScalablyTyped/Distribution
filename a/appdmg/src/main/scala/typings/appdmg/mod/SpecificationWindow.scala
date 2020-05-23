package typings.appdmg.mod

import typings.appdmg.anon.Height
import typings.appdmg.anon.X
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SpecificationWindow extends js.Object {
  var position: js.UndefOr[X] = js.undefined
  var size: js.UndefOr[Height] = js.undefined
}

object SpecificationWindow {
  @scala.inline
  def apply(position: X = null, size: Height = null): SpecificationWindow = {
    val __obj = js.Dynamic.literal()
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpecificationWindow]
  }
}

