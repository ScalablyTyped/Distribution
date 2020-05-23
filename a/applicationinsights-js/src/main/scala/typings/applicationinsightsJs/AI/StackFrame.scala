package typings.applicationinsightsJs.AI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StackFrame extends js.Object {
  var assembly: String
  var fileName: String
  var level: Double
  var line: Double
  var method: String
}

object StackFrame {
  @scala.inline
  def apply(assembly: String, fileName: String, level: Double, line: Double, method: String): StackFrame = {
    val __obj = js.Dynamic.literal(assembly = assembly.asInstanceOf[js.Any], fileName = fileName.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any])
    __obj.asInstanceOf[StackFrame]
  }
}

