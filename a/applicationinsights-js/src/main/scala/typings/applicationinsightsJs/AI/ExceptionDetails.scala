package typings.applicationinsightsJs.AI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExceptionDetails extends js.Object {
  var hasFullStack: Boolean = js.native
  var id: Double = js.native
  var message: String = js.native
  var outerId: Double = js.native
  var parsedStack: js.Array[StackFrame] = js.native
  var stack: String = js.native
  var typeName: String = js.native
}

object ExceptionDetails {
  @scala.inline
  def apply(
    hasFullStack: Boolean,
    id: Double,
    message: String,
    outerId: Double,
    parsedStack: js.Array[StackFrame],
    stack: String,
    typeName: String
  ): ExceptionDetails = {
    val __obj = js.Dynamic.literal(hasFullStack = hasFullStack.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], outerId = outerId.asInstanceOf[js.Any], parsedStack = parsedStack.asInstanceOf[js.Any], stack = stack.asInstanceOf[js.Any], typeName = typeName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExceptionDetails]
  }
  @scala.inline
  implicit class ExceptionDetailsOps[Self <: ExceptionDetails] (val x: Self) extends AnyVal {
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
    def setHasFullStack(value: Boolean): Self = this.set("hasFullStack", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: Double): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setMessage(value: String): Self = this.set("message", value.asInstanceOf[js.Any])
    @scala.inline
    def setOuterId(value: Double): Self = this.set("outerId", value.asInstanceOf[js.Any])
    @scala.inline
    def setParsedStackVarargs(value: StackFrame*): Self = this.set("parsedStack", js.Array(value :_*))
    @scala.inline
    def setParsedStack(value: js.Array[StackFrame]): Self = this.set("parsedStack", value.asInstanceOf[js.Any])
    @scala.inline
    def setStack(value: String): Self = this.set("stack", value.asInstanceOf[js.Any])
    @scala.inline
    def setTypeName(value: String): Self = this.set("typeName", value.asInstanceOf[js.Any])
  }
  
}

