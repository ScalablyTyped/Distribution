package typings
package agDashGridLib.distLibILoggerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ILogger extends js.Object {
  def log(message: java.lang.String): scala.Unit
}

object ILogger {
  @scala.inline
  def apply(log: java.lang.String => scala.Unit): ILogger = {
    val __obj = js.Dynamic.literal(log = js.Any.fromFunction1(log))
  
    __obj.asInstanceOf[ILogger]
  }
}

