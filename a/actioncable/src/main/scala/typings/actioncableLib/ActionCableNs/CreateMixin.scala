package typings
package actioncableLib.ActionCableNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateMixin
  extends /* key */ org.scalablytyped.runtime.StringDictionary[js.Function] {
  def connected(): scala.Unit
  def disconnected(): scala.Unit
  def received(obj: js.Any): scala.Unit
}

object CreateMixin {
  @scala.inline
  def apply(
    connected: () => scala.Unit,
    disconnected: () => scala.Unit,
    received: js.Any => scala.Unit,
    StringDictionary: /* key */ org.scalablytyped.runtime.StringDictionary[js.Function] = null
  ): CreateMixin = {
    val __obj = js.Dynamic.literal(connected = js.Any.fromFunction0(connected), disconnected = js.Any.fromFunction0(disconnected), received = js.Any.fromFunction1(received))
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[CreateMixin]
  }
}

