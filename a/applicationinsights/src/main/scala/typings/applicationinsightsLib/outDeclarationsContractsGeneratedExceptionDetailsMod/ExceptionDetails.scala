package typings
package applicationinsightsLib.outDeclarationsContractsGeneratedExceptionDetailsMod

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
  var hasFullStack: scala.Boolean
  /**
    * In case exception is nested (outer exception contains inner one), the id and outerId properties are used to represent the nesting.
    */
  var id: scala.Double
  /**
    * Exception message.
    */
  var message: java.lang.String
  /**
    * The value of outerId is a reference to an element in ExceptionDetails that represents the outer exception
    */
  var outerId: scala.Double
  /**
    * List of stack frames. Either stack or parsedStack should have a value.
    */
  var parsedStack: js.Array[applicationinsightsLib.outDeclarationsContractsGeneratedStackFrameMod.namespaced]
  /**
    * Text describing the stack. Either stack or parsedStack should have a value.
    */
  var stack: java.lang.String
  /**
    * Exception type name.
    */
  var typeName: java.lang.String
}

object ExceptionDetails {
  @scala.inline
  def apply(
    hasFullStack: scala.Boolean,
    id: scala.Double,
    message: java.lang.String,
    outerId: scala.Double,
    parsedStack: js.Array[applicationinsightsLib.outDeclarationsContractsGeneratedStackFrameMod.namespaced],
    stack: java.lang.String,
    typeName: java.lang.String
  ): ExceptionDetails = {
    val __obj = js.Dynamic.literal(hasFullStack = hasFullStack, id = id, message = message, outerId = outerId, parsedStack = parsedStack, stack = stack, typeName = typeName)
  
    __obj.asInstanceOf[ExceptionDetails]
  }
}

