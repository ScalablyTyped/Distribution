package typings.activexIwshruntimelibrary.IWshRuntimeLibrary

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Shortcut Object */
trait WshShortcut extends js.Object {
  var Arguments: String
  var Description: String
  val FullName: String
  var Hotkey: String
  @JSName("IWshRuntimeLibrary.WshShortcut_typekey")
  var IWshRuntimeLibraryDotWshShortcut_typekey: WshShortcut
  var IconLocation: String
  val RelativePath: String
  var TargetPath: String
  /**
    * Possible values:
    *
    * * **1** -- Activates and displays a window. If the window is minimized or maximized, the system restores it to its original size and position. An application should specify this flag
    * when displaying the window for the first time.
    * * **3** -- Activates the window and displays it as a maximized window.
    * * **7** -- Displays the window as a minimized window. The active window remains active.
    */
  var WindowStyle: ShortcutWindowStyle
  var WorkingDirectory: String
  def Load(PathLink: String): Unit
  def Save(): Unit
}

object WshShortcut {
  @scala.inline
  def apply(
    Arguments: String,
    Description: String,
    FullName: String,
    Hotkey: String,
    IWshRuntimeLibraryDotWshShortcut_typekey: WshShortcut,
    IconLocation: String,
    Load: String => Unit,
    RelativePath: String,
    Save: () => Unit,
    TargetPath: String,
    WindowStyle: ShortcutWindowStyle,
    WorkingDirectory: String
  ): WshShortcut = {
    val __obj = js.Dynamic.literal(Arguments = Arguments.asInstanceOf[js.Any], Description = Description.asInstanceOf[js.Any], FullName = FullName.asInstanceOf[js.Any], Hotkey = Hotkey.asInstanceOf[js.Any], IconLocation = IconLocation.asInstanceOf[js.Any], Load = js.Any.fromFunction1(Load), RelativePath = RelativePath.asInstanceOf[js.Any], Save = js.Any.fromFunction0(Save), TargetPath = TargetPath.asInstanceOf[js.Any], WindowStyle = WindowStyle.asInstanceOf[js.Any], WorkingDirectory = WorkingDirectory.asInstanceOf[js.Any])
    __obj.updateDynamic("IWshRuntimeLibrary.WshShortcut_typekey")(IWshRuntimeLibraryDotWshShortcut_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[WshShortcut]
  }
}

