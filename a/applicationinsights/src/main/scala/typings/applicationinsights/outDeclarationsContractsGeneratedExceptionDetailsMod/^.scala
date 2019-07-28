package typings.applicationinsights.outDeclarationsContractsGeneratedExceptionDetailsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Exception details of the exception in a chain.
  */
@JSImport("applicationinsights/out/Declarations/Contracts/Generated/ExceptionDetails", JSImport.Namespace)
@js.native
class ^ () extends ExceptionDetails {
  /**
    * Indicates if full exception stack is provided in the exception. The stack may be trimmed, such as in the case of a StackOverflow exception.
    */
  /* CompleteClass */
  override var hasFullStack: Boolean = js.native
  /**
    * In case exception is nested (outer exception contains inner one), the id and outerId properties are used to represent the nesting.
    */
  /* CompleteClass */
  override var id: Double = js.native
  /**
    * Exception message.
    */
  /* CompleteClass */
  override var message: String = js.native
  /**
    * The value of outerId is a reference to an element in ExceptionDetails that represents the outer exception
    */
  /* CompleteClass */
  override var outerId: Double = js.native
  /**
    * List of stack frames. Either stack or parsedStack should have a value.
    */
  /* CompleteClass */
  override var parsedStack: js.Array[typings.applicationinsights.outDeclarationsContractsGeneratedStackFrameMod.^] = js.native
  /**
    * Text describing the stack. Either stack or parsedStack should have a value.
    */
  /* CompleteClass */
  override var stack: String = js.native
  /**
    * Exception type name.
    */
  /* CompleteClass */
  override var typeName: String = js.native
}

