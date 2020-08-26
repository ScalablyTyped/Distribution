package typings.activexShell.Shell32

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Shell Folder View Object */
@js.native
trait ShellFolderView extends js.Object {
  /** Get Application object */
  val Application: js.Any = js.native
  /** Get Current View Mode */
  var CurrentViewMode: Double = js.native
  /** The currently focused item in the folder */
  val FocusedItem: ShellFolderItem = js.native
  /** Get the folder being viewed */
  val Folder: Folder3 = js.native
  /** Get Folder Flags */
  var FolderFlags: Double = js.native
  /** Get Group By Column */
  var GroupBy: String = js.native
  /** Set Icon Size */
  var IconSize: Double = js.native
  @JSName("Shell32.ShellFolderView_typekey")
  var Shell32DotShellFolderView_typekey: ShellFolderView = js.native
  /** Get Sorting Columns */
  var SortColumns: String = js.native
  /** Returns the view options for showing a folder. */
  val ViewOptions: ShellFolderViewOptions = js.native
  /** Filter View */
  def FilterView(bstrFilterText: String): Unit = js.native
  /** Show items menu and return command selected */
  def PopupItemMenu(pfi: ShellFolderItem): String = js.native
  def PopupItemMenu(pfi: ShellFolderItem, vx: js.UndefOr[scala.Nothing], vy: js.Any): String = js.native
  def PopupItemMenu(pfi: ShellFolderItem, vx: js.Any): String = js.native
  def PopupItemMenu(pfi: ShellFolderItem, vx: js.Any, vy: js.Any): String = js.native
  /** Select the item */
  def SelectItem(pvfi: ShellFolderItem, dwFlags: ShellFolderViewSelectItem): Unit = js.native
  /** Select Item relative to the Current Item */
  def SelectItemRelative(iRelative: Double): Unit = js.native
  /** The collection of Selected Items in folder */
  def SelectedItems(): FolderItems3 = js.native
}

