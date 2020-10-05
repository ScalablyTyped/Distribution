package typings.angularCompiler.srcUtilMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Console extends js.Object {
  def log(message: String): Unit = js.native
  def warn(message: String): Unit = js.native
}

object Console {
  @scala.inline
  def apply(log: String => Unit, warn: String => Unit): Console = {
    val __obj = js.Dynamic.literal(log = js.Any.fromFunction1(log), warn = js.Any.fromFunction1(warn))
    __obj.asInstanceOf[Console]
  }
  @scala.inline
  implicit class ConsoleOps[Self <: Console] (val x: Self) extends AnyVal {
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
    def setLog(value: String => Unit): Self = this.set("log", js.Any.fromFunction1(value))
    @scala.inline
    def setWarn(value: String => Unit): Self = this.set("warn", js.Any.fromFunction1(value))
  }
  
}

