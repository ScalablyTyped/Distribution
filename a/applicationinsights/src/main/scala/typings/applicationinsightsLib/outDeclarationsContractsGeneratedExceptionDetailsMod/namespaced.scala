package typings
package applicationinsightsLib.outDeclarationsContractsGeneratedExceptionDetailsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
 * Exception details of the exception in a chain.
 */
@JSImport("applicationinsights/out/Declarations/Contracts/Generated/ExceptionDetails", JSImport.Namespace)
@js.native
class namespaced () extends ExceptionDetails {
  /**
       * Indicates if full exception stack is provided in the exception. The stack may be trimmed, such as in the case of a StackOverflow exception.
       */
  /* CompleteClass */
  override var hasFullStack: scala.Boolean = js.native
  /**
       * In case exception is nested (outer exception contains inner one), the id and outerId properties are used to represent the nesting.
       */
  /* CompleteClass */
  override var id: scala.Double = js.native
  /**
       * Exception message.
       */
  /* CompleteClass */
  override var message: java.lang.String = js.native
  /**
       * The value of outerId is a reference to an element in ExceptionDetails that represents the outer exception
       */
  /* CompleteClass */
  override var outerId: scala.Double = js.native
  /**
       * List of stack frames. Either stack or parsedStack should have a value.
       */
  /* CompleteClass */
  override var parsedStack: js.Array[applicationinsightsLib.outDeclarationsContractsGeneratedStackFrameMod.namespaced] = js.native
  /**
       * Text describing the stack. Either stack or parsedStack should have a value.
       */
  /* CompleteClass */
  override var stack: java.lang.String = js.native
  /**
       * Exception type name.
       */
  /* CompleteClass */
  override var typeName: java.lang.String = js.native
}

