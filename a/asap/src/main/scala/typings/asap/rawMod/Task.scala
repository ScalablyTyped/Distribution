package typings.asap.rawMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Task extends js.Object {
  def call(args: js.Any*): js.Any = js.native
}

object Task {
  @scala.inline
  def apply(call: /* repeated */ js.Any => js.Any): Task = {
    val __obj = js.Dynamic.literal(call = js.Any.fromFunction1(call))
    __obj.asInstanceOf[Task]
  }
  @scala.inline
  implicit class TaskOps[Self <: Task] (val x: Self) extends AnyVal {
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
    def setCall(value: /* repeated */ js.Any => js.Any): Self = this.set("call", js.Any.fromFunction1(value))
  }
  
}

