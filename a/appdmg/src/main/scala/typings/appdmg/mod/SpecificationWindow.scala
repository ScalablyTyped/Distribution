package typings.appdmg.mod

import typings.appdmg.anon.Height
import typings.appdmg.anon.X
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SpecificationWindow extends js.Object {
  var position: js.UndefOr[X] = js.native
  var size: js.UndefOr[Height] = js.native
}

object SpecificationWindow {
  @scala.inline
  def apply(): SpecificationWindow = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SpecificationWindow]
  }
  @scala.inline
  implicit class SpecificationWindowOps[Self <: SpecificationWindow] (val x: Self) extends AnyVal {
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
    def setPosition(value: X): Self = this.set("position", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePosition: Self = this.set("position", js.undefined)
    @scala.inline
    def setSize(value: Height): Self = this.set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
  }
  
}

