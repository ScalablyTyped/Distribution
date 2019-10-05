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
    callback: js.Function2[
      /* event */ Event, 
      /* hotkeys */ typings.angularDashHotkeys.angularDashHotkeysMod.angularMod.hotkeys.Hotkey, 
      Unit
    ]
  ): typings.angularDashHotkeys.angularDashHotkeysMod.angularMod.hotkeys.HotkeysProviderChained = js.native
  def add(
    combo: js.Array[String],
    description: String,
    callback: js.Function2[
      /* event */ Event, 
      /* hotkeys */ typings.angularDashHotkeys.angularDashHotkeysMod.angularMod.hotkeys.Hotkey, 
      Unit
    ]
  ): typings.angularDashHotkeys.angularDashHotkeysMod.angularMod.hotkeys.HotkeysProviderChained = js.native
  def add(hotkeyObj: typings.angularDashHotkeys.angularDashHotkeysMod.angularMod.hotkeys.Hotkey): typings.angularDashHotkeys.angularDashHotkeysMod.angularMod.hotkeys.HotkeysProviderChained = js.native
}

