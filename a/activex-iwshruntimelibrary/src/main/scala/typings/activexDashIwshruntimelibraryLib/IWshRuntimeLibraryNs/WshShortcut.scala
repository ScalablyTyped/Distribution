package typings
package activexDashIwshruntimelibraryLib.IWshRuntimeLibraryNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Shortcut Object */
@JSGlobal("IWshRuntimeLibrary.WshShortcut")
@js.native
class WshShortcut protected () extends js.Object {
  var Arguments: java.lang.String = js.native
  var Description: java.lang.String = js.native
  val FullName: java.lang.String = js.native
  var Hotkey: java.lang.String = js.native
  var `IWshRuntimeLibrary.WshShortcut_typekey`: WshShortcut = js.native
  var IconLocation: java.lang.String = js.native
  val RelativePath: java.lang.String = js.native
  var TargetPath: java.lang.String = js.native
  /**
           * Possible values:
           *
           * * **1** -- Activates and displays a window. If the window is minimized or maximized, the system restores it to its original size and position. An application should specify this flag
           * when displaying the window for the first time.
           * * **3** -- Activates the window and displays it as a maximized window.
           * * **7** -- Displays the window as a minimized window. The active window remains active.
           */
  var WindowStyle: ShortcutWindowStyle = js.native
  var WorkingDirectory: java.lang.String = js.native
  def Load(PathLink: java.lang.String): scala.Unit = js.native
  def Save(): scala.Unit = js.native
}

