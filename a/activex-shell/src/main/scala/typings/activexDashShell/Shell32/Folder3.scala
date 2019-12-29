package typings.activexDashShell.Shell32

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Definition of interface Folder version 3 */
@JSGlobal("Shell32.Folder3")
@js.native
class Folder3 protected () extends js.Object {
  /** Get Application object */
  val Application: js.Any = js.native
  /** Should the WebView barricade be shown? */
  val HaveToShowWebViewBarricade: Boolean = js.native
  /** Offline status of the server? */
  val OfflineStatus: OfflineFolderStatus = js.native
  /** Get Parent object */
  val ParentFolder: Folder3 = js.native
  /** Folder's FolderItem interface */
  val Self: ShellFolderItem = js.native
  @JSName("Shell32.Folder3_typekey")
  var Shell32DotFolder3_typekey: Folder3 = js.native
  /** Ask if the WebView barricade should be shown or not */
  var ShowWebViewBarricade: Boolean = js.native
  /** Get the display name for the window */
  val Title: String = js.native
  /** Copy Items to this folder. */
  def CopyHere(vItem: String): Unit = js.native
  def CopyHere(vItem: String, vOptions: FileOperationFlag): Unit = js.native
  def CopyHere(vItem: FolderItems3): Unit = js.native
  def CopyHere(vItem: FolderItems3, vOptions: FileOperationFlag): Unit = js.native
  def CopyHere(vItem: ShellFolderItem): Unit = js.native
  def CopyHere(vItem: ShellFolderItem, vOptions: FileOperationFlag): Unit = js.native
  /** Call this after the WebView barricade is dismissed by the user */
  def DismissedWebViewBarricade(): Unit = js.native
  /**
    * Get the details about an item.
    * @param vItem The item for which to retrieve the information.
    * @param iColumn An integer value that specifies the information to be retrieved. The information available for an item depends on the folder in which it is displayed. This value
    * corresponds to the zero-based column number that is displayed in a Shell view.
    */
  def GetDetailsOf(vItem: ShellFolderItem, iColumn: Double): String = js.native
  /** The collection of Items in folder */
  def Items(): FolderItems3 = js.native
  /** Move Items to this folder. */
  def MoveHere(vItem: String): Unit = js.native
  def MoveHere(vItem: String, vOptions: FileOperationFlag): Unit = js.native
  def MoveHere(vItem: FolderItems3): Unit = js.native
  def MoveHere(vItem: FolderItems3, vOptions: FileOperationFlag): Unit = js.native
  def MoveHere(vItem: ShellFolderItem): Unit = js.native
  def MoveHere(vItem: ShellFolderItem, vOptions: FileOperationFlag): Unit = js.native
  /** Create a new sub folder in this folder. */
  def NewFolder(bName: String): Unit = js.native
  /** Parse the name to get an item. */
  def ParseName(bName: String): ShellFolderItem | Null = js.native
  /** Synchronize all offline files */
  def Synchronize(): Unit = js.native
}

