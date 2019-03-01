package typings
package applicationinsightsLib.outDeclarationsContractsGeneratedStackFrameMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StackFrame extends js.Object {
  /**
    * Name of the assembly (dll, jar, etc.) containing this function.
    */
  var assembly: java.lang.String
  /**
    * File name or URL of the method implementation.
    */
  var fileName: java.lang.String
  /**
    * Level in the call stack. For the long stacks SDK may not report every function in a call stack.
    */
  var level: scala.Double
  /**
    * Line number of the code implementation.
    */
  var line: scala.Double
  /**
    * Method name.
    */
  var method: java.lang.String
}

object StackFrame {
  @scala.inline
  def apply(
    assembly: java.lang.String,
    fileName: java.lang.String,
    level: scala.Double,
    line: scala.Double,
    method: java.lang.String
  ): StackFrame = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("assembly")(assembly)
    __obj.updateDynamic("fileName")(fileName)
    __obj.updateDynamic("level")(level)
    __obj.updateDynamic("line")(line)
    __obj.updateDynamic("method")(method)
    __obj.asInstanceOf[StackFrame]
  }
}

