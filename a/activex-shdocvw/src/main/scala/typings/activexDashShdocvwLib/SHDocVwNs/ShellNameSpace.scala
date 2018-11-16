package typings
package activexDashShdocvwLib.SHDocVwNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SHDocVw.ShellNameSpace")
@js.native
class ShellNameSpace protected () extends js.Object {
  var Columns: java.lang.String = js.native
  /** number of view types */
  val CountViewTypes: scala.Double = js.native
  var Depth: scala.Double = js.native
  /** options  */
  var EnumOptions: scala.Double = js.native
  var Flags: scala.Double = js.native
  var Mode: scala.Double = js.native
  /** get the root item */
  var Root: js.Any = js.native
  var `SHDocVw.ShellNameSpace_typekey`: ShellNameSpace = js.native
  /** get the selected item */
  var SelectedItem: js.Any = js.native
  /** Query to see if subscriptions are enabled */
  val SubscriptionsEnabled: scala.Boolean = js.native
  var TVFlags: scala.Double = js.native
  /** method CreateSubscriptionForSelection */
  def CreateSubscriptionForSelection(): scala.Boolean = js.native
  /** method DeleteSubscriptionForSelection */
  def DeleteSubscriptionForSelection(): scala.Boolean = js.native
  /** expands item specified depth */
  def Expand(var_0: js.Any, iDepth: scala.Double): scala.Unit = js.native
  /** method Export */
  def Export(): scala.Unit = js.native
  /** method Import */
  def Import(): scala.Unit = js.native
  /** method InvokeContextMenuCommand */
  def InvokeContextMenuCommand(strCommand: java.lang.String): scala.Unit = js.native
  /** method MoveSelectionDown */
  def MoveSelectionDown(): scala.Unit = js.native
  /** method MoveSelectionTo */
  def MoveSelectionTo(): scala.Unit = js.native
  /** method MoveSelectionUp */
  def MoveSelectionUp(): scala.Unit = js.native
  /** method NewFolder */
  def NewFolder(): scala.Unit = js.native
  /** method ResetSort */
  def ResetSort(): scala.Unit = js.native
  /** collection of selected items */
  def SelectedItems(): js.Any = js.native
  /** old, use put_Root() instead */
  def SetRoot(bstrFullPath: java.lang.String): scala.Unit = js.native
  /** set view type */
  def SetViewType(iType: scala.Double): scala.Unit = js.native
  /** method Synchronize */
  def Synchronize(): scala.Unit = js.native
  /** unselects all items */
  def UnselectAll(): scala.Unit = js.native
}

