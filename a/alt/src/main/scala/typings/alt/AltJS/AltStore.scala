package typings.alt.AltJS

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AltStore[S] extends js.Object {
  def emitChange(): Unit
  def getState(): S
  def listen(handler: js.Function1[/* state */ S, _]): js.Function0[Unit]
  def unlisten(handler: js.Function1[/* state */ S, _]): Unit
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
}

