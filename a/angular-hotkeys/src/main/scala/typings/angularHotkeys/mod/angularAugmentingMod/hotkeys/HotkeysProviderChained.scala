package typings.angularHotkeys.mod.angularAugmentingMod.hotkeys

import typings.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HotkeysProviderChained extends js.Object {
  def add(
    combo: String,
    description: String,
    callback: js.Function2[/* event */ Event_, /* hotkeys */ Hotkey, Unit]
  ): HotkeysProviderChained = js.native
  def add(
    combo: js.Array[String],
    description: String,
    callback: js.Function2[/* event */ Event_, /* hotkeys */ Hotkey, Unit]
  ): HotkeysProviderChained = js.native
  def add(hotkeyObj: Hotkey): HotkeysProviderChained = js.native
}

