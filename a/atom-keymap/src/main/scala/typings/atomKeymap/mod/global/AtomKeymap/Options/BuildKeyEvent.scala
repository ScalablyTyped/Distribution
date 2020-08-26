package typings.atomKeymap.mod.global.AtomKeymap.Options

import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BuildKeyEvent extends js.Object {
  var alt: js.UndefOr[Boolean] = js.native
  var cmd: js.UndefOr[Boolean] = js.native
  var ctrl: js.UndefOr[Boolean] = js.native
  var shift: js.UndefOr[Boolean] = js.native
  var target: js.UndefOr[Element] = js.native
  var which: js.UndefOr[Double] = js.native
}

object BuildKeyEvent {
  @scala.inline
  def apply(): BuildKeyEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BuildKeyEvent]
  }
  @scala.inline
  implicit class BuildKeyEventOps[Self <: BuildKeyEvent] (val x: Self) extends AnyVal {
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
    def setAlt(value: Boolean): Self = this.set("alt", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlt: Self = this.set("alt", js.undefined)
    @scala.inline
    def setCmd(value: Boolean): Self = this.set("cmd", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCmd: Self = this.set("cmd", js.undefined)
    @scala.inline
    def setCtrl(value: Boolean): Self = this.set("ctrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCtrl: Self = this.set("ctrl", js.undefined)
    @scala.inline
    def setShift(value: Boolean): Self = this.set("shift", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShift: Self = this.set("shift", js.undefined)
    @scala.inline
    def setTarget(value: Element): Self = this.set("target", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTarget: Self = this.set("target", js.undefined)
    @scala.inline
    def setWhich(value: Double): Self = this.set("which", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWhich: Self = this.set("which", js.undefined)
  }
  
}

