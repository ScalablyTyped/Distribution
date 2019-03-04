package typings
package atomLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_NewValue[T] extends js.Object {
  var newValue: T
  var oldValue: T
}

object Anon_NewValue {
  @scala.inline
  def apply[T](newValue: T, oldValue: T): Anon_NewValue[T] = {
    val __obj = js.Dynamic.literal(newValue = newValue.asInstanceOf[js.Any], oldValue = oldValue.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_NewValue[T]]
  }
}

