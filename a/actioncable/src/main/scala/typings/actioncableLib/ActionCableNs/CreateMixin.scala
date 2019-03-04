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
    connected: js.Function0[scala.Unit],
    disconnected: js.Function0[scala.Unit],
    received: js.Function1[js.Any, scala.Unit],
    StringDictionary: /* key */ org.scalablytyped.runtime.StringDictionary[js.Function] = null
  ): CreateMixin = {
    val __obj = js.Dynamic.literal(connected = connected, disconnected = disconnected, received = received)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[CreateMixin]
  }
}

