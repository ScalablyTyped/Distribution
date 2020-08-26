package typings.applicationinsightsJs.AI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StackFrame extends js.Object {
  var assembly: String = js.native
  var fileName: String = js.native
  var level: Double = js.native
  var line: Double = js.native
  var method: String = js.native
}

object StackFrame {
  @scala.inline
  def apply(assembly: String, fileName: String, level: Double, line: Double, method: String): StackFrame = {
    val __obj = js.Dynamic.literal(assembly = assembly.asInstanceOf[js.Any], fileName = fileName.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any])
    __obj.asInstanceOf[StackFrame]
  }
  @scala.inline
  implicit class StackFrameOps[Self <: StackFrame] (val x: Self) extends AnyVal {
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
    def setAssembly(value: String): Self = this.set("assembly", value.asInstanceOf[js.Any])
    @scala.inline
    def setFileName(value: String): Self = this.set("fileName", value.asInstanceOf[js.Any])
    @scala.inline
    def setLevel(value: Double): Self = this.set("level", value.asInstanceOf[js.Any])
    @scala.inline
    def setLine(value: Double): Self = this.set("line", value.asInstanceOf[js.Any])
    @scala.inline
    def setMethod(value: String): Self = this.set("method", value.asInstanceOf[js.Any])
  }
  
}

