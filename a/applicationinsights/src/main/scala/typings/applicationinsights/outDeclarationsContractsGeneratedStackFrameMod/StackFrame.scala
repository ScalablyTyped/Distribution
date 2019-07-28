package typings.applicationinsights.outDeclarationsContractsGeneratedStackFrameMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StackFrame extends js.Object {
  /**
    * Name of the assembly (dll, jar, etc.) containing this function.
    */
  var assembly: String
  /**
    * File name or URL of the method implementation.
    */
  var fileName: String
  /**
    * Level in the call stack. For the long stacks SDK may not report every function in a call stack.
    */
  var level: Double
  /**
    * Line number of the code implementation.
    */
  var line: Double
  /**
    * Method name.
    */
  var method: String
}

object StackFrame {
  @scala.inline
  def apply(assembly: String, fileName: String, level: Double, line: Double, method: String): StackFrame = {
    val __obj = js.Dynamic.literal(assembly = assembly, fileName = fileName, level = level, line = line, method = method)
  
    __obj.asInstanceOf[StackFrame]
  }
}

