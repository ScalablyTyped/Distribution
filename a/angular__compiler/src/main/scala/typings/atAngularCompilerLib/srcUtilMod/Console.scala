package typings
package atAngularCompilerLib.srcUtilMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Console extends js.Object {
  def log(message: java.lang.String): scala.Unit
  def warn(message: java.lang.String): scala.Unit
}

object Console {
  @scala.inline
  def apply(log: java.lang.String => scala.Unit, warn: java.lang.String => scala.Unit): Console = {
    val __obj = js.Dynamic.literal(log = js.Any.fromFunction1(log), warn = js.Any.fromFunction1(warn))
  
    __obj.asInstanceOf[Console]
  }
}

