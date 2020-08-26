package typings.angularUiBootstrap.mod.angularAugmentingMod.ui.bootstrap

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IDatepickerCellArgs extends js.Object {
  var date: Date = js.native
  var mode: DatepickerMode = js.native
}

object IDatepickerCellArgs {
  @scala.inline
  def apply(date: Date, mode: DatepickerMode): IDatepickerCellArgs = {
    val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDatepickerCellArgs]
  }
  @scala.inline
  implicit class IDatepickerCellArgsOps[Self <: IDatepickerCellArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDate(value: Date): Self = this.set("date", value.asInstanceOf[js.Any])
    @scala.inline
    def setMode(value: DatepickerMode): Self = this.set("mode", value.asInstanceOf[js.Any])
  }
  
}

