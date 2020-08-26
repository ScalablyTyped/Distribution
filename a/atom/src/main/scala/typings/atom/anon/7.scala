package typings.atom.anon

import typings.atom.atomStrings.auto
import typings.atom.atomStrings.hard
import typings.atom.atomStrings.soft
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait `7` extends js.Object {
  var newValue: auto | soft | hard = js.native
  var oldValue: js.UndefOr[auto | soft | hard] = js.native
}

object `7` {
  @scala.inline
  def apply(newValue: auto | soft | hard): `7` = {
    val __obj = js.Dynamic.literal(newValue = newValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[`7`]
  }
  @scala.inline
  implicit class `7Ops`[Self <: `7`] (val x: Self) extends AnyVal {
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
    def setNewValue(value: auto | soft | hard): Self = this.set("newValue", value.asInstanceOf[js.Any])
    @scala.inline
    def setOldValue(value: auto | soft | hard): Self = this.set("oldValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOldValue: Self = this.set("oldValue", js.undefined)
  }
  
}

