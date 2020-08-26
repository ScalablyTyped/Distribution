package typings.autobahn.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IUtil extends js.Object {
  def assert(condition: Boolean, message: String): Unit = js.native
}

object IUtil {
  @scala.inline
  def apply(assert: (Boolean, String) => Unit): IUtil = {
    val __obj = js.Dynamic.literal(assert = js.Any.fromFunction2(assert))
    __obj.asInstanceOf[IUtil]
  }
  @scala.inline
  implicit class IUtilOps[Self <: IUtil] (val x: Self) extends AnyVal {
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
    def setAssert(value: (Boolean, String) => Unit): Self = this.set("assert", js.Any.fromFunction2(value))
  }
  
}

