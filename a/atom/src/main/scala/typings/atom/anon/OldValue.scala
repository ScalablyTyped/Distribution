package typings.atom.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OldValue extends js.Object {
  var newValue: js.Array[String] = js.native
  var oldValue: js.UndefOr[js.Array[String]] = js.native
}

object OldValue {
  @scala.inline
  def apply(newValue: js.Array[String]): OldValue = {
    val __obj = js.Dynamic.literal(newValue = newValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[OldValue]
  }
  @scala.inline
  implicit class OldValueOps[Self <: OldValue] (val x: Self) extends AnyVal {
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
    def setNewValueVarargs(value: String*): Self = this.set("newValue", js.Array(value :_*))
    @scala.inline
    def setNewValue(value: js.Array[String]): Self = this.set("newValue", value.asInstanceOf[js.Any])
    @scala.inline
    def setOldValueVarargs(value: String*): Self = this.set("oldValue", js.Array(value :_*))
    @scala.inline
    def setOldValue(value: js.Array[String]): Self = this.set("oldValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOldValue: Self = this.set("oldValue", js.undefined)
  }
  
}

