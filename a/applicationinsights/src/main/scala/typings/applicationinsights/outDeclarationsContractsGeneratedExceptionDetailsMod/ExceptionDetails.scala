package typings.applicationinsights.outDeclarationsContractsGeneratedExceptionDetailsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Exception details of the exception in a chain.
  */
trait ExceptionDetails extends js.Object {
  /**
    * Indicates if full exception stack is provided in the exception. The stack may be trimmed, such as in the case of a StackOverflow exception.
    */
  var hasFullStack: Boolean
  /**
    * In case exception is nested (outer exception contains inner one), the id and outerId properties are used to represent the nesting.
    */
  var id: Double
  /**
    * Exception message.
    */
  var message: String
  /**
    * The value of outerId is a reference to an element in ExceptionDetails that represents the outer exception
    */
  var outerId: Double
  /**
    * List of stack frames. Either stack or parsedStack should have a value.
    */
  var parsedStack: js.Array[typings.applicationinsights.outDeclarationsContractsGeneratedStackFrameMod.^]
  /**
    * Text describing the stack. Either stack or parsedStack should have a value.
    */
  var stack: String
  /**
    * Exception type name.
    */
  var typeName: String
}

object ExceptionDetails {
  @scala.inline
  def apply(
    hasFullStack: Boolean,
    id: Double,
    message: String,
    outerId: Double,
    parsedStack: js.Array[typings.applicationinsights.outDeclarationsContractsGeneratedStackFrameMod.^],
    stack: String,
    typeName: String
  ): ExceptionDetails = {
    val __obj = js.Dynamic.literal(hasFullStack = hasFullStack.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], outerId = outerId.asInstanceOf[js.Any], parsedStack = parsedStack.asInstanceOf[js.Any], stack = stack.asInstanceOf[js.Any], typeName = typeName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ExceptionDetails]
  }
}

