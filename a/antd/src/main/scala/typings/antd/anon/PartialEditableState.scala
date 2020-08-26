package typings.antd.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<antd.antd/lib/typography/Editable.EditableState> */
@js.native
trait PartialEditableState extends js.Object {
  var current: js.UndefOr[String] = js.native
  var prevValue: js.UndefOr[String] = js.native
}

object PartialEditableState {
  @scala.inline
  def apply(): PartialEditableState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialEditableState]
  }
  @scala.inline
  implicit class PartialEditableStateOps[Self <: PartialEditableState] (val x: Self) extends AnyVal {
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
    def setCurrent(value: String): Self = this.set("current", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCurrent: Self = this.set("current", js.undefined)
    @scala.inline
    def setPrevValue(value: String): Self = this.set("prevValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrevValue: Self = this.set("prevValue", js.undefined)
  }
  
}

