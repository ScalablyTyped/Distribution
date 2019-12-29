package typings.angularDashHotkeys.angularDashHotkeysMod.angularMod.hotkeys

import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HotkeysProviderChained extends js.Object {
  def add(
    combo: String,
    description: String,
    callback: js.Function2[/* event */ Event, /* hotkeys */ Hotkey, Unit]
  ): HotkeysProviderChained = js.native
  def add(
    combo: js.Array[String],
    description: String,
    callback: js.Function2[/* event */ Event, /* hotkeys */ Hotkey, Unit]
  ): HotkeysProviderChained = js.native
  def add(hotkeyObj: Hotkey): HotkeysProviderChained = js.native
}

