package typings.activexIwshruntimelibrary.IWshRuntimeLibrary

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** URLShortcut Object */
trait WshURLShortcut extends js.Object {
  val FullName: String
  @JSName("IWshRuntimeLibrary.WshURLShortcut_typekey")
  var IWshRuntimeLibraryDotWshURLShortcut_typekey: WshURLShortcut
  var TargetPath: String
  def Load(PathLink: String): Unit
  def Save(): Unit
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
}

