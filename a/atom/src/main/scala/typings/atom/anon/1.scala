package typings.atom.anon

import typings.atom.atomStrings.always
import typings.atom.atomStrings.no
import typings.atom.atomStrings.yes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait `1` extends js.Object {
  var newValue: no | yes | always = js.native
  var oldValue: js.UndefOr[no | yes | always] = js.native
}

object `1` {
  @scala.inline
  def apply(newValue: no | yes | always): `1` = {
    val __obj = js.Dynamic.literal(newValue = newValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[`1`]
  }
  @scala.inline
  implicit class `1Ops`[Self <: `1`] (val x: Self) extends AnyVal {
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
    def setNewValue(value: no | yes | always): Self = this.set("newValue", value.asInstanceOf[js.Any])
    @scala.inline
    def setOldValue(value: no | yes | always): Self = this.set("oldValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOldValue: Self = this.set("oldValue", js.undefined)
  }
  
}

