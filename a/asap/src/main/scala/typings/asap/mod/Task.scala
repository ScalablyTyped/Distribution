package typings.asap.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Task extends js.Object {
  def call(args: js.Any*): js.Any
}

object Task {
  @scala.inline
  def apply(call: /* repeated */ js.Any => js.Any): Task = {
    val __obj = js.Dynamic.literal(call = js.Any.fromFunction1(call))
  
    __obj.asInstanceOf[Task]
  }
}

