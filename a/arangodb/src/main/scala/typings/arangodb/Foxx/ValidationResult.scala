package typings.arangodb.Foxx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ValidationResult[T] extends js.Object {
  var error: js.Any
  var value: T
}

object ValidationResult {
  @scala.inline
  def apply[T](error: js.Any, value: T): ValidationResult[T] = {
    val __obj = js.Dynamic.literal(error = error, value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ValidationResult[T]]
  }
}

