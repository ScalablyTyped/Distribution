package typings
package atomLib.atomMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExceptionThrownEvent extends js.Object {
  var column: scala.Double
  var line: scala.Double
  var message: java.lang.String
  var originalError: nodeLib.Error
  var url: java.lang.String
}

object ExceptionThrownEvent {
  @scala.inline
  def apply(
    column: scala.Double,
    line: scala.Double,
    message: java.lang.String,
    originalError: nodeLib.Error,
    url: java.lang.String
  ): ExceptionThrownEvent = {
    val __obj = js.Dynamic.literal(column = column, line = line, message = message, originalError = originalError, url = url)
  
    __obj.asInstanceOf[ExceptionThrownEvent]
  }
}

