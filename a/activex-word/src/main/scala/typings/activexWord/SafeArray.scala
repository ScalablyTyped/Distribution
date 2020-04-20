package typings.activexWord

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SafeArray[T] extends js.Object {
  var _brand: SafeArray[T]
}

object SafeArray {
  @scala.inline
  def apply[T](_brand: SafeArray[T]): SafeArray[T] = {
    val __obj = js.Dynamic.literal(_brand = _brand.asInstanceOf[js.Any])
    __obj.asInstanceOf[SafeArray[T]]
  }
}

