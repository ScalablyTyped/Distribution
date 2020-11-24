package typings.activexIwshruntimelibrary.IWshRuntimeLibrary

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** URLShortcut Object */
@js.native
trait WshURLShortcut extends js.Object {
  
  val FullName: String = js.native
  
  @JSName("IWshRuntimeLibrary.WshURLShortcut_typekey")
  var IWshRuntimeLibraryDotWshURLShortcut_typekey: WshURLShortcut = js.native
  
  def Load(PathLink: String): Unit = js.native
  
  def Save(): Unit = js.native
  
  var TargetPath: String = js.native
}
object WshURLShortcut {
  
  @scala.inline
  def apply(
    FullName: String,
    IWshRuntimeLibraryDotWshURLShortcut_typekey: WshURLShortcut,
    Load: String => Unit,
    Save: () => Unit,
    TargetPath: String
  ): WshURLShortcut = {
    val __obj = js.Dynamic.literal(FullName = FullName.asInstanceOf[js.Any], Load = js.Any.fromFunction1(Load), Save = js.Any.fromFunction0(Save), TargetPath = TargetPath.asInstanceOf[js.Any])
    __obj.updateDynamic("IWshRuntimeLibrary.WshURLShortcut_typekey")(IWshRuntimeLibraryDotWshURLShortcut_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[WshURLShortcut]
  }
  
  @scala.inline
  implicit class WshURLShortcutOps[Self <: WshURLShortcut] (val x: Self) extends AnyVal {
    
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
    def setFullName(value: String): Self = this.set("FullName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIWshRuntimeLibraryDotWshURLShortcut_typekey(value: WshURLShortcut): Self = this.set("IWshRuntimeLibrary.WshURLShortcut_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoad(value: String => Unit): Self = this.set("Load", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSave(value: () => Unit): Self = this.set("Save", js.Any.fromFunction0(value))
    
    @scala.inline
    def setTargetPath(value: String): Self = this.set("TargetPath", value.asInstanceOf[js.Any])
  }
}
