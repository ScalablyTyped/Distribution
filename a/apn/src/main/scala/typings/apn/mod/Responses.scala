package typings.apn.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Responses extends js.Object {
  var failed: js.Array[ResponseFailure] = js.native
  var sent: js.Array[ResponseSent] = js.native
}

object Responses {
  @scala.inline
  def apply(failed: js.Array[ResponseFailure], sent: js.Array[ResponseSent]): Responses = {
    val __obj = js.Dynamic.literal(failed = failed.asInstanceOf[js.Any], sent = sent.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses]
  }
  @scala.inline
  implicit class ResponsesOps[Self <: Responses] (val x: Self) extends AnyVal {
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
    def setFailedVarargs(value: ResponseFailure*): Self = this.set("failed", js.Array(value :_*))
    @scala.inline
    def setFailed(value: js.Array[ResponseFailure]): Self = this.set("failed", value.asInstanceOf[js.Any])
    @scala.inline
    def setSentVarargs(value: ResponseSent*): Self = this.set("sent", js.Array(value :_*))
    @scala.inline
    def setSent(value: js.Array[ResponseSent]): Self = this.set("sent", value.asInstanceOf[js.Any])
  }
  
}

