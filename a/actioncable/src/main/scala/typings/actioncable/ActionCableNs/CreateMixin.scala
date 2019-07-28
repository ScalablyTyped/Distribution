package typings.actioncable.ActionCableNs

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateMixin
  extends /* key */ StringDictionary[js.Function] {
  def connected(): Unit
  def disconnected(): Unit
  def received(obj: js.Any): Unit
}

object CreateMixin {
  @scala.inline
  def apply(
    connected: () => Unit,
    disconnected: () => Unit,
    received: js.Any => Unit,
    StringDictionary: /* key */ StringDictionary[js.Function] = null
  ): CreateMixin = {
    val __obj = js.Dynamic.literal(connected = js.Any.fromFunction0(connected), disconnected = js.Any.fromFunction0(disconnected), received = js.Any.fromFunction1(received))
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[CreateMixin]
  }
}

