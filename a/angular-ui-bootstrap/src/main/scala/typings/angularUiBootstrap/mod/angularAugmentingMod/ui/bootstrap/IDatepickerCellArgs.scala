package typings.angularUiBootstrap.mod.angularAugmentingMod.ui.bootstrap

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDatepickerCellArgs extends js.Object {
  var date: Date
  var mode: DatepickerMode
}

object IDatepickerCellArgs {
  @scala.inline
  def apply(date: Date, mode: DatepickerMode): IDatepickerCellArgs = {
    val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IDatepickerCellArgs]
  }
}

