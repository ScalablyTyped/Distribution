package typings.alexaSdk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ErrorCause extends js.Object {
  var requestId: String = js.native
}

object ErrorCause {
  @scala.inline
  def apply(requestId: String): ErrorCause = {
    val __obj = js.Dynamic.literal(requestId = requestId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ErrorCause]
  }
  @scala.inline
  implicit class ErrorCauseOps[Self <: ErrorCause] (val x: Self) extends AnyVal {
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
    def setRequestId(value: String): Self = this.set("requestId", value.asInstanceOf[js.Any])
  }
  
}

