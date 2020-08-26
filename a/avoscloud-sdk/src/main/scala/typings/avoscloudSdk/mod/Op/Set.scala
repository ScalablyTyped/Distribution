package typings.avoscloudSdk.mod.Op

import typings.avoscloudSdk.mod.IBaseObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Set extends IBaseObject {
  def value(): js.Any = js.native
}

object Set {
  @scala.inline
  def apply(toJSON: () => js.Any, value: () => js.Any): Set = {
    val __obj = js.Dynamic.literal(toJSON = js.Any.fromFunction0(toJSON), value = js.Any.fromFunction0(value))
    __obj.asInstanceOf[Set]
  }
  @scala.inline
  implicit class SetOps[Self <: Set] (val x: Self) extends AnyVal {
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
    def setValue(value: () => js.Any): Self = this.set("value", js.Any.fromFunction0(value))
  }
  
}

