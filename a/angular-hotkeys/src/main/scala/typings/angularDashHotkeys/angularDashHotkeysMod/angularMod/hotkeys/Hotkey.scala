package typings.angularDashHotkeys.angularDashHotkeysMod.angularMod.hotkeys

import typings.angularDashHotkeys.angularDashHotkeysStrings.INPUT
import typings.angularDashHotkeys.angularDashHotkeysStrings.SELECT
import typings.angularDashHotkeys.angularDashHotkeysStrings.TEXTAREA
import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Hotkey extends js.Object {
  /**
    * The type of event to listen for, such as keypress, keydown or keyup.
    * Usage of this parameter is discouraged as the underlying library will pick the most suitable option automatically.
    * This should only be necessary in advanced situations.
    */
  var action: js.UndefOr[String] = js.undefined
  /**
    * An array of tag names to allow this combo in ('INPUT', 'SELECT', and/or 'TEXTAREA')
    */
  var allowIn: js.UndefOr[js.Array[INPUT | SELECT | TEXTAREA]] = js.undefined
  /**
    * They keyboard combo (shortcut) you want to bind to.
    */
  var combo: String | js.Array[String]
  /**
    * The description for what the combo does and is only used for the Cheat Sheet.
    * If it is not supplied, it will not show up, and in effect, allows you to have unlisted hotkeys.
    */
  var description: js.UndefOr[String] = js.undefined
  /**
    * Whether the hotkey persists navigation events
    */
  var persistent: js.UndefOr[Boolean] = js.undefined
  /**
    * The function to execute when the key(s) are pressed. Passes along two arguments, event and hotkey
    */
  def callback(event: Event, hotkey: Hotkey): Unit
}

object Hotkey {
  @scala.inline
  def apply(
    callback: (Event, Hotkey) => Unit,
    combo: String | js.Array[String],
    action: String = null,
    allowIn: js.Array[INPUT | SELECT | TEXTAREA] = null,
    description: String = null,
    persistent: js.UndefOr[Boolean] = js.undefined
  ): Hotkey = {
    val __obj = js.Dynamic.literal(callback = js.Any.fromFunction2(callback), combo = combo.asInstanceOf[js.Any])
    if (action != null) __obj.updateDynamic("action")(action.asInstanceOf[js.Any])
    if (allowIn != null) __obj.updateDynamic("allowIn")(allowIn.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (!js.isUndefined(persistent)) __obj.updateDynamic("persistent")(persistent.asInstanceOf[js.Any])
    __obj.asInstanceOf[Hotkey]
  }
}

