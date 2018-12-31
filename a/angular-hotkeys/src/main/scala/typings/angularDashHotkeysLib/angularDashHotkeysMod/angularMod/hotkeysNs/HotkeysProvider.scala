package typings
package angularDashHotkeysLib.angularDashHotkeysMod.angularMod.hotkeysNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HotkeysProvider extends js.Object {
  /**
    * Configurable setting for the cheat sheet description.
    * @default 'Show / hide this help menu'
    */
  var cheatSheetDescription: java.lang.String = js.native
  /**
    * Configurable setting for the cheat sheet hotkey.
    * @default '?'
    */
  var cheatSheetHotkey: java.lang.String = js.native
  /**
    * Configurable setting to disable the cheatsheet entirely.
    * @default true
    */
  var includeCheatSheet: scala.Boolean = js.native
  /**
    * Cheat sheet template in the event you want to totally customize it.
    */
  var template: java.lang.String = js.native
  /**
    * Configurable settings for the cheat sheet footer in HTML.
    * @default null
    */
  var templateFooter: java.lang.String | scala.Null = js.native
  /**
    * Configurable settings for the cheat sheet header in HTML.
    * This overrides the normal title if specified.
    * @default null
    */
  var templateHeader: java.lang.String | scala.Null = js.native
  /**
    * Configurable setting for the cheat sheet title
    * @default 'Keyboard Shortcuts'
    */
  var templateTitle: java.lang.String = js.native
  /**
    * Configurable setting to disable ngRoute hooks.
    */
  var useNgRoute: scala.Boolean = js.native
  /**
    * Creates a new Hotkey and creates the Mousetrap binding.
    */
  def add(combo: java.lang.String): Hotkey = js.native
  def add(combo: java.lang.String, description: java.lang.String): Hotkey = js.native
  def add(
    combo: java.lang.String,
    description: java.lang.String,
    callback: js.Function2[/* event */ stdLib.Event, /* hotkey */ Hotkey, scala.Unit]
  ): Hotkey = js.native
  def add(
    combo: java.lang.String,
    description: java.lang.String,
    callback: js.Function2[/* event */ stdLib.Event, /* hotkey */ Hotkey, scala.Unit],
    action: java.lang.String
  ): Hotkey = js.native
  def add(
    combo: java.lang.String,
    description: java.lang.String,
    callback: js.Function2[/* event */ stdLib.Event, /* hotkey */ Hotkey, scala.Unit],
    action: java.lang.String,
    allowIn: js.Array[java.lang.String]
  ): Hotkey = js.native
  def add(
    combo: java.lang.String,
    description: java.lang.String,
    callback: js.Function2[/* event */ stdLib.Event, /* hotkey */ Hotkey, scala.Unit],
    action: java.lang.String,
    allowIn: js.Array[java.lang.String],
    persistent: scala.Boolean
  ): Hotkey = js.native
  def add(combo: js.Array[java.lang.String]): Hotkey = js.native
  def add(combo: js.Array[java.lang.String], description: java.lang.String): Hotkey = js.native
  def add(
    combo: js.Array[java.lang.String],
    description: java.lang.String,
    callback: js.Function2[/* event */ stdLib.Event, /* hotkey */ Hotkey, scala.Unit]
  ): Hotkey = js.native
  def add(
    combo: js.Array[java.lang.String],
    description: java.lang.String,
    callback: js.Function2[/* event */ stdLib.Event, /* hotkey */ Hotkey, scala.Unit],
    action: java.lang.String
  ): Hotkey = js.native
  def add(
    combo: js.Array[java.lang.String],
    description: java.lang.String,
    callback: js.Function2[/* event */ stdLib.Event, /* hotkey */ Hotkey, scala.Unit],
    action: java.lang.String,
    allowIn: js.Array[java.lang.String]
  ): Hotkey = js.native
  def add(
    combo: js.Array[java.lang.String],
    description: java.lang.String,
    callback: js.Function2[/* event */ stdLib.Event, /* hotkey */ Hotkey, scala.Unit],
    action: java.lang.String,
    allowIn: js.Array[java.lang.String],
    persistent: scala.Boolean
  ): Hotkey = js.native
  /**
    * Creates a new Hotkey and creates the Mousetrap binding.
    */
  def add(hotkeyObj: Hotkey): Hotkey = js.native
  /**
    * Binds the hotkey to a particular scope.
    * Useful if the scope is destroyed, we can automatically destroy the hotkey binding.
    * @param scope The scope to bind to
    */
  def bindTo(scope: angularLib.angularMod.angularNs.IScope): HotkeysProviderChained = js.native
  def del(combo: Hotkey): scala.Unit = js.native
  /**
    * Removes and unbinds a hotkey
    * @param combo The keyboard combo (shortcut) or the HotKey object
    */
  def del(combo: java.lang.String): scala.Unit = js.native
  def del(combo: js.Array[java.lang.String]): scala.Unit = js.native
  /**
    * Returns the Hotkey object
    * @param combo The keyboard combo (shortcut)
    */
  def get(combo: java.lang.String): Hotkey = js.native
  def get(combo: js.Array[java.lang.String]): Hotkey = js.native
  /**
    * Purges all non-persistent hotkeys (such as those defined in routes)
    *
    * Without this, the same hotkey would get recreated everytime
    * the route is accessed.
    */
  def purgeHotkeys(): scala.Unit = js.native
  /**
    * Toggles the help menu element's visiblity
    */
  def toggleCheatSheet(): scala.Unit = js.native
}

