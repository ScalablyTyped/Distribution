package typings.activexShdocvw.SHDocVw

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SHDocVw.ShellNameSpace")
@js.native
class ShellNameSpace protected () extends js.Object {
  var Columns: String = js.native
  /** number of view types */
  val CountViewTypes: Double = js.native
  var Depth: Double = js.native
  /** options  */
  var EnumOptions: Double = js.native
  var Flags: Double = js.native
  var Mode: Double = js.native
  /** get the root item */
  var Root: js.Any = js.native
  @JSName("SHDocVw.ShellNameSpace_typekey")
  var SHDocVwDotShellNameSpace_typekey: ShellNameSpace = js.native
  /** get the selected item */
  var SelectedItem: js.Any = js.native
  /** Query to see if subscriptions are enabled */
  val SubscriptionsEnabled: Boolean = js.native
  var TVFlags: Double = js.native
  /** method CreateSubscriptionForSelection */
  def CreateSubscriptionForSelection(): Boolean = js.native
  /** method DeleteSubscriptionForSelection */
  def DeleteSubscriptionForSelection(): Boolean = js.native
  /** expands item specified depth */
  def Expand(var_0: js.Any, iDepth: Double): Unit = js.native
  /** method Export */
  def Export(): Unit = js.native
  /** method Import */
  def Import(): Unit = js.native
  /** method InvokeContextMenuCommand */
  def InvokeContextMenuCommand(strCommand: String): Unit = js.native
  /** method MoveSelectionDown */
  def MoveSelectionDown(): Unit = js.native
  /** method MoveSelectionTo */
  def MoveSelectionTo(): Unit = js.native
  /** method MoveSelectionUp */
  def MoveSelectionUp(): Unit = js.native
  /** method NewFolder */
  def NewFolder(): Unit = js.native
  /** method ResetSort */
  def ResetSort(): Unit = js.native
  /** collection of selected items */
  def SelectedItems(): js.Any = js.native
  /** old, use put_Root() instead */
  def SetRoot(bstrFullPath: String): Unit = js.native
  /** set view type */
  def SetViewType(iType: Double): Unit = js.native
  /** method Synchronize */
  def Synchronize(): Unit = js.native
  /** unselects all items */
  def UnselectAll(): Unit = js.native
}

