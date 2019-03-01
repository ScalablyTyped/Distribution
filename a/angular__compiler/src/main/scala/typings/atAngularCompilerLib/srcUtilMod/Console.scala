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
  def apply(log: js.Function1[java.lang.String, scala.Unit], warn: js.Function1[java.lang.String, scala.Unit]): Console = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("log")(log)
    __obj.updateDynamic("warn")(warn)
    __obj.asInstanceOf[Console]
  }
}

