package typings.activexPowerpoint

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SafeArray[T] extends js.Object {
  var _brand: SafeArray[T] = js.native
}

object SafeArray {
  @scala.inline
  def apply[T](_brand: SafeArray[T]): SafeArray[T] = {
    val __obj = js.Dynamic.literal(_brand = _brand.asInstanceOf[js.Any])
    __obj.asInstanceOf[SafeArray[T]]
  }
  @scala.inline
  implicit class SafeArrayOps[Self <: SafeArray[_], T] (val x: Self with SafeArray[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def set_brand(value: SafeArray[T]): Self = this.set("_brand", value.asInstanceOf[js.Any])
  }
  
}

