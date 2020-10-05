package typings.antd.editableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EditableState extends js.Object {
  var current: String = js.native
  var prevValue: js.UndefOr[String] = js.native
}

object EditableState {
  @scala.inline
  def apply(current: String): EditableState = {
    val __obj = js.Dynamic.literal(current = current.asInstanceOf[js.Any])
    __obj.asInstanceOf[EditableState]
  }
  @scala.inline
  implicit class EditableStateOps[Self <: EditableState] (val x: Self) extends AnyVal {
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
    def setPrevValue(value: String): Self = this.set("prevValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrevValue: Self = this.set("prevValue", js.undefined)
  }
  
}

