package typings
package angularDashHotkeysLib.angularDashHotkeysMod.angularMod.hotkeysNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Hotkey extends js.Object {
  /**
    * The type of event to listen for, such as keypress, keydown or keyup.
    * Usage of this parameter is discouraged as the underlying library will pick the most suitable option automatically.
    * This should only be necessary in advanced situations.
    */
  var action: js.UndefOr[java.lang.String] = js.undefined
  /**
    * An array of tag names to allow this combo in ('INPUT', 'SELECT', and/or 'TEXTAREA')
    */
  var allowIn: js.UndefOr[
    js.Array[
      angularDashHotkeysLib.angularDashHotkeysLibStrings.INPUT | angularDashHotkeysLib.angularDashHotkeysLibStrings.SELECT | angularDashHotkeysLib.angularDashHotkeysLibStrings.TEXTAREA
    ]
  ] = js.undefined
  /**
    * They keyboard combo (shortcut) you want to bind to.
    */
  var combo: java.lang.String | js.Array[java.lang.String]
  /**
    * The description for what the combo does and is only used for the Cheat Sheet.
    * If it is not supplied, it will not show up, and in effect, allows you to have unlisted hotkeys.
    */
  var description: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Whether the hotkey persists navigation events
    */
  var persistent: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The function to execute when the key(s) are pressed. Passes along two arguments, event and hotkey
    */
  def callback(event: stdLib.Event, hotkey: Hotkey): scala.Unit
}

object Hotkey {
  @scala.inline
  def apply(
    callback: (stdLib.Event, Hotkey) => scala.Unit,
    combo: java.lang.String | js.Array[java.lang.String],
    action: java.lang.String = null,
    allowIn: js.Array[
      angularDashHotkeysLib.angularDashHotkeysLibStrings.INPUT | angularDashHotkeysLib.angularDashHotkeysLibStrings.SELECT | angularDashHotkeysLib.angularDashHotkeysLibStrings.TEXTAREA
    ] = null,
    description: java.lang.String = null,
    persistent: js.UndefOr[scala.Boolean] = js.undefined
  ): Hotkey = {
    val __obj = js.Dynamic.literal(callback = js.Any.fromFunction2(callback), combo = combo.asInstanceOf[js.Any])
    if (action != null) __obj.updateDynamic("action")(action)
    if (allowIn != null) __obj.updateDynamic("allowIn")(allowIn)
    if (description != null) __obj.updateDynamic("description")(description)
    if (!js.isUndefined(persistent)) __obj.updateDynamic("persistent")(persistent)
    __obj.asInstanceOf[Hotkey]
  }
}

