package typings.angularCompiler.srcUtilMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Console extends js.Object {
  def log(message: String): Unit
  def warn(message: String): Unit
}

object Console {
  @scala.inline
  def apply(log: String => Unit, warn: String => Unit): Console = {
    val __obj = js.Dynamic.literal(log = js.Any.fromFunction1(log), warn = js.Any.fromFunction1(warn))
  
    __obj.asInstanceOf[Console]
  }
}

