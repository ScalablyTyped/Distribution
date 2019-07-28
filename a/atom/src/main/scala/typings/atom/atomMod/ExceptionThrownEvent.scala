package typings.atom.atomMod

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
    val __obj = js.Dynamic.literal(column = column, line = line, message = message, originalError = originalError, url = url)
  
    __obj.asInstanceOf[ExceptionThrownEvent]
  }
}

