package typings.applicationinsightsJs.AI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExceptionDetails extends js.Object {
  var hasFullStack: Boolean
  var id: Double
  var message: String
  var outerId: Double
  var parsedStack: js.Array[StackFrame]
  var stack: String
  var typeName: String
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
}

