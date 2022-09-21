package typings.activexShell.Shell32

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Shell Folder View Object */
@js.native
trait ShellFolderView extends StObject {
  
  /** Get Application object */
  val Application: Any = js.native
  
  /** Get Current View Mode */
  var CurrentViewMode: Double = js.native
  
  /** Filter View */
  def FilterView(bstrFilterText: String): Unit = js.native
  
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
  
  /** Show items menu and return command selected */
  def PopupItemMenu(pfi: ShellFolderItem): String = js.native
  def PopupItemMenu(pfi: ShellFolderItem, vx: Any): String = js.native
  def PopupItemMenu(pfi: ShellFolderItem, vx: Any, vy: Any): String = js.native
  def PopupItemMenu(pfi: ShellFolderItem, vx: Unit, vy: Any): String = js.native
  
  /** Select the item */
  def SelectItem(pvfi: ShellFolderItem, dwFlags: ShellFolderViewSelectItem): Unit = js.native
  
  /** Select Item relative to the Current Item */
  def SelectItemRelative(iRelative: Double): Unit = js.native
  
  /** The collection of Selected Items in folder */
  def SelectedItems(): FolderItems3 = js.native
  
  /* private */ @JSName("Shell32.ShellFolderView_typekey")
  var Shell32DotShellFolderView_typekey: ShellFolderView = js.native
  
  /** Get Sorting Columns */
  var SortColumns: String = js.native
  
  /** Returns the view options for showing a folder. */
  val ViewOptions: ShellFolderViewOptions = js.native
}
