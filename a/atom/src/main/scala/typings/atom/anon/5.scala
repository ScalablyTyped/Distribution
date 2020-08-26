package typings.atom.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait `5` extends js.Object {
  var newValue: String | Null = js.native
  var oldValue: js.UndefOr[String | Null] = js.native
}

object `5` {
  @scala.inline
  def apply(): `5` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`5`]
  }
  @scala.inline
  implicit class `5Ops`[Self <: `5`] (val x: Self) extends AnyVal {
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
    def setNewValue(value: String): Self = this.set("newValue", value.asInstanceOf[js.Any])
    @scala.inline
    def setNewValueNull: Self = this.set("newValue", null)
    @scala.inline
    def setOldValue(value: String): Self = this.set("oldValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOldValue: Self = this.set("oldValue", js.undefined)
    @scala.inline
    def setOldValueNull: Self = this.set("oldValue", null)
  }
  
}

