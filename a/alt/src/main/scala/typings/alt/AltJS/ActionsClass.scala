package typings.alt.AltJS

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ActionsClass extends js.Object {
  var actions: js.UndefOr[Actions] = js.native
  var generateActions: js.UndefOr[js.Function1[/* repeated */ String, Unit]] = js.native
  def dispatch(payload: js.Any*): Unit = js.native
}

object ActionsClass {
  @scala.inline
  def apply(dispatch: /* repeated */ js.Any => Unit): ActionsClass = {
    val __obj = js.Dynamic.literal(dispatch = js.Any.fromFunction1(dispatch))
    __obj.asInstanceOf[ActionsClass]
  }
  @scala.inline
  implicit class ActionsClassOps[Self <: ActionsClass] (val x: Self) extends AnyVal {
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
    def setDispatch(value: /* repeated */ js.Any => Unit): Self = this.set("dispatch", js.Any.fromFunction1(value))
    @scala.inline
    def setActions(value: Actions): Self = this.set("actions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteActions: Self = this.set("actions", js.undefined)
    @scala.inline
    def setGenerateActions(value: /* repeated */ String => Unit): Self = this.set("generateActions", js.Any.fromFunction1(value))
    @scala.inline
    def deleteGenerateActions: Self = this.set("generateActions", js.undefined)
  }
  
}

