package typings.activexDashIwshruntimelibrary.IWshRuntimeLibrary

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Shortcut Object */
@JSGlobal("IWshRuntimeLibrary.WshShortcut")
@js.native
class WshShortcut protected () extends js.Object {
  var Arguments: String = js.native
  var Description: String = js.native
  val FullName: String = js.native
  var Hotkey: String = js.native
  var `IWshRuntimeLibrary.WshShortcut_typekey`: WshShortcut = js.native
  var IconLocation: String = js.native
  val RelativePath: String = js.native
  var TargetPath: String = js.native
  /**
    * Possible values:
    *
    * * **1** -- Activates and displays a window. If the window is minimized or maximized, the system restores it to its original size and position. An application should specify this flag
    * when displaying the window for the first time.
    * * **3** -- Activates the window and displays it as a maximized window.
    * * **7** -- Displays the window as a minimized window. The active window remains active.
    */
  var WindowStyle: ShortcutWindowStyle = js.native
  var WorkingDirectory: String = js.native
  def Load(PathLink: String): Unit = js.native
  def Save(): Unit = js.native
}

