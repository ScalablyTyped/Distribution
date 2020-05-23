package typings.atom.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NewValue[T] extends js.Object {
  var newValue: T
  var oldValue: T
}

object NewValue {
  @scala.inline
  def apply[T](newValue: T, oldValue: T): NewValue[T] = {
    val __obj = js.Dynamic.literal(newValue = newValue.asInstanceOf[js.Any], oldValue = oldValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[NewValue[T]]
  }
}

