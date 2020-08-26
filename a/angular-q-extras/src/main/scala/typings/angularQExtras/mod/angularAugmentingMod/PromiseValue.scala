package typings.angularQExtras.mod.angularAugmentingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PromiseValue[T] extends js.Object {
  var reason: js.UndefOr[js.Any] = js.native
  var state: PromiseState = js.native
  var value: js.UndefOr[T] = js.native
}

object PromiseValue {
  @scala.inline
  def apply[T](state: PromiseState): PromiseValue[T] = {
    val __obj = js.Dynamic.literal(state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[PromiseValue[T]]
  }
  @scala.inline
  implicit class PromiseValueOps[Self <: PromiseValue[_], T] (val x: Self with PromiseValue[T]) extends AnyVal {
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
    def setState(value: PromiseState): Self = this.set("state", value.asInstanceOf[js.Any])
    @scala.inline
    def setReason(value: js.Any): Self = this.set("reason", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReason: Self = this.set("reason", js.undefined)
    @scala.inline
    def setValue(value: T): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
  
}

