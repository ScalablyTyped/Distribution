package typings.avoscloudSdk.mod.Op

import typings.avoscloudSdk.mod.IBaseObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Increment extends IBaseObject {
  var amount: Double = js.native
}

object Increment {
  @scala.inline
  def apply(amount: Double, toJSON: () => js.Any): Increment = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON))
    __obj.asInstanceOf[Increment]
  }
  @scala.inline
  implicit class IncrementOps[Self <: Increment] (val x: Self) extends AnyVal {
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
    def setAmount(value: Double): Self = this.set("amount", value.asInstanceOf[js.Any])
  }
  
}

