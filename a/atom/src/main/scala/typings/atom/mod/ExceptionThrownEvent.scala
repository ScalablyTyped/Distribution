package typings.atom.mod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExceptionThrownEvent extends js.Object {
  var column: Double
  var line: Double
  var message: String
  var originalError: Error
  var url: String
}

object ExceptionThrownEvent {
  @scala.inline
  def apply(column: Double, line: Double, message: String, originalError: Error, url: String): ExceptionThrownEvent = {
    val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], originalError = originalError.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ExceptionThrownEvent]
  }
}

