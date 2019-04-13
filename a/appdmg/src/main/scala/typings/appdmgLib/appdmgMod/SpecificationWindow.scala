package typings
package appdmgLib.appdmgMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SpecificationWindow extends js.Object {
  var position: js.UndefOr[appdmgLib.Anon_X] = js.undefined
  var size: js.UndefOr[appdmgLib.Anon_Height] = js.undefined
}

object SpecificationWindow {
  @scala.inline
  def apply(position: appdmgLib.Anon_X = null, size: appdmgLib.Anon_Height = null): SpecificationWindow = {
    val __obj = js.Dynamic.literal()
    if (position != null) __obj.updateDynamic("position")(position)
    if (size != null) __obj.updateDynamic("size")(size)
    __obj.asInstanceOf[SpecificationWindow]
  }
}

