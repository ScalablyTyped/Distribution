package typings.actioncable.ActionCable

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateMixin
  extends /* key */ StringDictionary[js.Any] {
  var connected: js.UndefOr[js.Function0[Unit]] = js.undefined
  var disconnected: js.UndefOr[js.Function0[Unit]] = js.undefined
  var received: js.UndefOr[js.Function1[/* obj */ js.Any, Unit]] = js.undefined
}

object CreateMixin {
  @scala.inline
  def apply(
    StringDictionary: /* name */ StringDictionary[js.Any] = null,
    connected: () => Unit = null,
    disconnected: () => Unit = null,
    received: /* obj */ js.Any => Unit = null
  ): CreateMixin = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (connected != null) __obj.updateDynamic("connected")(js.Any.fromFunction0(connected))
    if (disconnected != null) __obj.updateDynamic("disconnected")(js.Any.fromFunction0(disconnected))
    if (received != null) __obj.updateDynamic("received")(js.Any.fromFunction1(received))
    __obj.asInstanceOf[CreateMixin]
  }
}

