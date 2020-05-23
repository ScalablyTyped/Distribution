package typings.activexShdocvw.SHDocVw

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ShellNameSpace extends js.Object {
  var Columns: String
  /** number of view types */
  val CountViewTypes: Double
  var Depth: Double
  /** options  */
  var EnumOptions: Double
  var Flags: Double
  var Mode: Double
  /** get the root item */
  var Root: js.Any
  @JSName("SHDocVw.ShellNameSpace_typekey")
  var SHDocVwDotShellNameSpace_typekey: ShellNameSpace
  /** get the selected item */
  var SelectedItem: js.Any
  /** Query to see if subscriptions are enabled */
  val SubscriptionsEnabled: Boolean
  var TVFlags: Double
  /** method CreateSubscriptionForSelection */
  def CreateSubscriptionForSelection(): Boolean
  /** method DeleteSubscriptionForSelection */
  def DeleteSubscriptionForSelection(): Boolean
  /** expands item specified depth */
  def Expand(var_0: js.Any, iDepth: Double): Unit
  /** method Export */
  def Export(): Unit
  /** method Import */
  def Import(): Unit
  /** method InvokeContextMenuCommand */
  def InvokeContextMenuCommand(strCommand: String): Unit
  /** method MoveSelectionDown */
  def MoveSelectionDown(): Unit
  /** method MoveSelectionTo */
  def MoveSelectionTo(): Unit
  /** method MoveSelectionUp */
  def MoveSelectionUp(): Unit
  /** method NewFolder */
  def NewFolder(): Unit
  /** method ResetSort */
  def ResetSort(): Unit
  /** collection of selected items */
  def SelectedItems(): js.Any
  /** old, use put_Root() instead */
  def SetRoot(bstrFullPath: String): Unit
  /** set view type */
  def SetViewType(iType: Double): Unit
  /** method Synchronize */
  def Synchronize(): Unit
  /** unselects all items */
  def UnselectAll(): Unit
}

object ShellNameSpace {
  @scala.inline
  def apply(
    Columns: String,
    CountViewTypes: Double,
    CreateSubscriptionForSelection: () => Boolean,
    DeleteSubscriptionForSelection: () => Boolean,
    Depth: Double,
    EnumOptions: Double,
    Expand: (js.Any, Double) => Unit,
    Export: () => Unit,
    Flags: Double,
    Import: () => Unit,
    InvokeContextMenuCommand: String => Unit,
    Mode: Double,
    MoveSelectionDown: () => Unit,
    MoveSelectionTo: () => Unit,
    MoveSelectionUp: () => Unit,
    NewFolder: () => Unit,
    ResetSort: () => Unit,
    Root: js.Any,
    SHDocVwDotShellNameSpace_typekey: ShellNameSpace,
    SelectedItem: js.Any,
    SelectedItems: () => js.Any,
    SetRoot: String => Unit,
    SetViewType: Double => Unit,
    SubscriptionsEnabled: Boolean,
    Synchronize: () => Unit,
    TVFlags: Double,
    UnselectAll: () => Unit
  ): ShellNameSpace = {
    val __obj = js.Dynamic.literal(Columns = Columns.asInstanceOf[js.Any], CountViewTypes = CountViewTypes.asInstanceOf[js.Any], CreateSubscriptionForSelection = js.Any.fromFunction0(CreateSubscriptionForSelection), DeleteSubscriptionForSelection = js.Any.fromFunction0(DeleteSubscriptionForSelection), Depth = Depth.asInstanceOf[js.Any], EnumOptions = EnumOptions.asInstanceOf[js.Any], Expand = js.Any.fromFunction2(Expand), Export = js.Any.fromFunction0(Export), Flags = Flags.asInstanceOf[js.Any], Import = js.Any.fromFunction0(Import), InvokeContextMenuCommand = js.Any.fromFunction1(InvokeContextMenuCommand), Mode = Mode.asInstanceOf[js.Any], MoveSelectionDown = js.Any.fromFunction0(MoveSelectionDown), MoveSelectionTo = js.Any.fromFunction0(MoveSelectionTo), MoveSelectionUp = js.Any.fromFunction0(MoveSelectionUp), NewFolder = js.Any.fromFunction0(NewFolder), ResetSort = js.Any.fromFunction0(ResetSort), Root = Root.asInstanceOf[js.Any], SelectedItem = SelectedItem.asInstanceOf[js.Any], SelectedItems = js.Any.fromFunction0(SelectedItems), SetRoot = js.Any.fromFunction1(SetRoot), SetViewType = js.Any.fromFunction1(SetViewType), SubscriptionsEnabled = SubscriptionsEnabled.asInstanceOf[js.Any], Synchronize = js.Any.fromFunction0(Synchronize), TVFlags = TVFlags.asInstanceOf[js.Any], UnselectAll = js.Any.fromFunction0(UnselectAll))
    __obj.updateDynamic("SHDocVw.ShellNameSpace_typekey")(SHDocVwDotShellNameSpace_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShellNameSpace]
  }
}

