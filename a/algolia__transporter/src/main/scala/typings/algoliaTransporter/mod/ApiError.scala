package typings.algoliaTransporter.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Error & { readonly status :number,  readonly transporterStackTrace :std.Array<@algolia/transporter.@algolia/transporter.StackFrame>} */
@js.native
trait ApiError extends js.Object {
  var message: String = js.native
  var name: String = js.native
  var stack: js.UndefOr[String] = js.native
  /**
    * The http status code.
    */
  val status: Double = js.native
  /**
    * Contains report of stack frames of the
    * execution of a certain request.
    */
  val transporterStackTrace: js.Array[StackFrame] = js.native
}

object ApiError {
  @scala.inline
  def apply(message: String, name: String, status: Double, transporterStackTrace: js.Array[StackFrame]): ApiError = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], transporterStackTrace = transporterStackTrace.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApiError]
  }
  @scala.inline
  implicit class ApiErrorOps[Self <: ApiError] (val x: Self) extends AnyVal {
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
    def setMessage(value: String): Self = this.set("message", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setStatus(value: Double): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def setTransporterStackTraceVarargs(value: StackFrame*): Self = this.set("transporterStackTrace", js.Array(value :_*))
    @scala.inline
    def setTransporterStackTrace(value: js.Array[StackFrame]): Self = this.set("transporterStackTrace", value.asInstanceOf[js.Any])
    @scala.inline
    def setStack(value: String): Self = this.set("stack", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStack: Self = this.set("stack", js.undefined)
  }
  
}

