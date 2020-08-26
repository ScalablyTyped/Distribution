package typings.alt.AltJS

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AltStore[S] extends js.Object {
  def emitChange(): Unit = js.native
  def getState(): S = js.native
  def listen(handler: js.Function1[/* state */ S, _]): js.Function0[Unit] = js.native
  def unlisten(handler: js.Function1[/* state */ S, _]): Unit = js.native
}

object AltStore {
  @scala.inline
  def apply[S](
    emitChange: () => Unit,
    getState: () => S,
    listen: js.Function1[/* state */ S, _] => js.Function0[Unit],
    unlisten: js.Function1[/* state */ S, _] => Unit
  ): AltStore[S] = {
    val __obj = js.Dynamic.literal(emitChange = js.Any.fromFunction0(emitChange), getState = js.Any.fromFunction0(getState), listen = js.Any.fromFunction1(listen), unlisten = js.Any.fromFunction1(unlisten))
    __obj.asInstanceOf[AltStore[S]]
  }
  @scala.inline
  implicit class AltStoreOps[Self <: AltStore[_], S] (val x: Self with AltStore[S]) extends AnyVal {
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
    def setEmitChange(value: () => Unit): Self = this.set("emitChange", js.Any.fromFunction0(value))
    @scala.inline
    def setGetState(value: () => S): Self = this.set("getState", js.Any.fromFunction0(value))
    @scala.inline
    def setListen(value: js.Function1[/* state */ S, _] => js.Function0[Unit]): Self = this.set("listen", js.Any.fromFunction1(value))
    @scala.inline
    def setUnlisten(value: js.Function1[/* state */ S, _] => Unit): Self = this.set("unlisten", js.Any.fromFunction1(value))
  }
  
}

