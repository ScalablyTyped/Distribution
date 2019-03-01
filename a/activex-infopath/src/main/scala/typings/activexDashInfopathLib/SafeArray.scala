package typings
package activexDashInfopathLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SafeArray[T] extends js.Object {
  var _brand: SafeArray[T]
}

object SafeArray {
  @scala.inline
  def apply[T](_brand: SafeArray[T]): SafeArray[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("_brand")(_brand)
    __obj.asInstanceOf[SafeArray[T]]
  }
}

