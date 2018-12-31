package typings
package activexDashShellLib.Shell32Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Shell Folder View Object */
@JSGlobal("Shell32.ShellFolderView")
@js.native
class ShellFolderView protected () extends js.Object {
  /** Get Application object */
  val Application: js.Any = js.native
  /** Get Current View Mode */
  var CurrentViewMode: scala.Double = js.native
  /** The currently focused item in the folder */
  val FocusedItem: ShellFolderItem = js.native
  /** Get the folder being viewed */
  val Folder: Folder3 = js.native
  /** Get Folder Flags */
  var FolderFlags: scala.Double = js.native
  /** Get Group By Column */
  var GroupBy: java.lang.String = js.native
  /** Set Icon Size */
  var IconSize: scala.Double = js.native
  var `Shell32.ShellFolderView_typekey`: ShellFolderView = js.native
  /** Get Sorting Columns */
  var SortColumns: java.lang.String = js.native
  /** Returns the view options for showing a folder. */
  val ViewOptions: ShellFolderViewOptions = js.native
  /** Filter View */
  def FilterView(bstrFilterText: java.lang.String): scala.Unit = js.native
  /** Show items menu and return command selected */
  def PopupItemMenu(pfi: ShellFolderItem): java.lang.String = js.native
  def PopupItemMenu(pfi: ShellFolderItem, vx: js.Any): java.lang.String = js.native
  def PopupItemMenu(pfi: ShellFolderItem, vx: js.Any, vy: js.Any): java.lang.String = js.native
  /** Select the item */
  def SelectItem(pvfi: ShellFolderItem, dwFlags: ShellFolderViewSelectItem): scala.Unit = js.native
  /** Select Item relative to the Current Item */
  def SelectItemRelative(iRelative: scala.Double): scala.Unit = js.native
  /** The collection of Selected Items in folder */
  def SelectedItems(): FolderItems3 = js.native
}

