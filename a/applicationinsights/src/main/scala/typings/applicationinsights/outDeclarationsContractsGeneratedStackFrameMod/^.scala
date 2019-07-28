package typings.applicationinsights.outDeclarationsContractsGeneratedStackFrameMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("applicationinsights/out/Declarations/Contracts/Generated/StackFrame", JSImport.Namespace)
@js.native
class ^ () extends StackFrame {
  /**
    * Name of the assembly (dll, jar, etc.) containing this function.
    */
  /* CompleteClass */
  override var assembly: String = js.native
  /**
    * File name or URL of the method implementation.
    */
  /* CompleteClass */
  override var fileName: String = js.native
  /**
    * Level in the call stack. For the long stacks SDK may not report every function in a call stack.
    */
  /* CompleteClass */
  override var level: Double = js.native
  /**
    * Line number of the code implementation.
    */
  /* CompleteClass */
  override var line: Double = js.native
  /**
    * Method name.
    */
  /* CompleteClass */
  override var method: String = js.native
}

