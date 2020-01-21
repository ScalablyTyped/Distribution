package typings.agGrid.iLoggerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ILogger extends js.Object {
  def log(message: String): Unit
}

object ILogger {
  @scala.inline
  def apply(log: String => Unit): ILogger = {
    val __obj = js.Dynamic.literal(log = js.Any.fromFunction1(log))
  
    __obj.asInstanceOf[ILogger]
  }
}

