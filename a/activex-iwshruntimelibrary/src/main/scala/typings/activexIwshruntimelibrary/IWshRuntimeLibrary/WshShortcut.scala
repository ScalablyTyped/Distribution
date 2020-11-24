package typings.activexIwshruntimelibrary.IWshRuntimeLibrary

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Shortcut Object */
@js.native
trait WshShortcut extends js.Object {
  
  var Arguments: String = js.native
  
  var Description: String = js.native
  
  val FullName: String = js.native
  
  var Hotkey: String = js.native
  
  @JSName("IWshRuntimeLibrary.WshShortcut_typekey")
  var IWshRuntimeLibraryDotWshShortcut_typekey: WshShortcut = js.native
  
  var IconLocation: String = js.native
  
  def Load(PathLink: String): Unit = js.native
  
  val RelativePath: String = js.native
  
  def Save(): Unit = js.native
  
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
  
  @scala.inline
  implicit class WshShortcutOps[Self <: WshShortcut] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setArguments(value: String): Self = this.set("Arguments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescription(value: String): Self = this.set("Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFullName(value: String): Self = this.set("FullName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHotkey(value: String): Self = this.set("Hotkey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIWshRuntimeLibraryDotWshShortcut_typekey(value: WshShortcut): Self = this.set("IWshRuntimeLibrary.WshShortcut_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIconLocation(value: String): Self = this.set("IconLocation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoad(value: String => Unit): Self = this.set("Load", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRelativePath(value: String): Self = this.set("RelativePath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSave(value: () => Unit): Self = this.set("Save", js.Any.fromFunction0(value))
    
    @scala.inline
    def setTargetPath(value: String): Self = this.set("TargetPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWindowStyle(value: ShortcutWindowStyle): Self = this.set("WindowStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorkingDirectory(value: String): Self = this.set("WorkingDirectory", value.asInstanceOf[js.Any])
  }
}
