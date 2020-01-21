package typings.atom

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonNewValue[T] extends js.Object {
  var newValue: T
  var oldValue: T
}

object AnonNewValue {
  @scala.inline
  def apply[T](newValue: T, oldValue: T): AnonNewValue[T] = {
    val __obj = js.Dynamic.literal(newValue = newValue.asInstanceOf[js.Any], oldValue = oldValue.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonNewValue[T]]
  }
}

