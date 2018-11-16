package typings
package angularDashHotkeysLib.angularDashHotkeysMod.angularMod.hotkeysNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HotkeysProviderChained extends js.Object {
  def add(
    combo: java.lang.String,
    description: java.lang.String,
    callback: js.Function2[/* event */ stdLib.Event, /* hotkeys */ Hotkey, scala.Unit]
  ): HotkeysProviderChained = js.native
  def add(
    combo: js.Array[java.lang.String],
    description: java.lang.String,
    callback: js.Function2[/* event */ stdLib.Event, /* hotkeys */ Hotkey, scala.Unit]
  ): HotkeysProviderChained = js.native
  def add(hotkeyObj: Hotkey): HotkeysProviderChained = js.native
}

