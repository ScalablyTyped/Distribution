package typings.activexShdocvw.global.SHDocVw

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SHDocVw.ShellNameSpace")
@js.native
class ShellNameSpace protected ()
  extends typings.activexShdocvw.SHDocVw.ShellNameSpace {
  /* CompleteClass */
  override var Columns: String = js.native
  /** number of view types */
  /* CompleteClass */
  override val CountViewTypes: Double = js.native
  /* CompleteClass */
  override var Depth: Double = js.native
  /** options  */
  /* CompleteClass */
  override var EnumOptions: Double = js.native
  /* CompleteClass */
  override var Flags: Double = js.native
  /* CompleteClass */
  override var Mode: Double = js.native
  /** get the root item */
  /* CompleteClass */
  override var Root: js.Any = js.native
  /* CompleteClass */
  @JSName("SHDocVw.ShellNameSpace_typekey")
  override var SHDocVwDotShellNameSpace_typekey: typings.activexShdocvw.SHDocVw.ShellNameSpace = js.native
  /** get the selected item */
  /* CompleteClass */
  override var SelectedItem: js.Any = js.native
  /** Query to see if subscriptions are enabled */
  /* CompleteClass */
  override val SubscriptionsEnabled: Boolean = js.native
  /* CompleteClass */
  override var TVFlags: Double = js.native
  /** method CreateSubscriptionForSelection */
  /* CompleteClass */
  override def CreateSubscriptionForSelection(): Boolean = js.native
  /** method DeleteSubscriptionForSelection */
  /* CompleteClass */
  override def DeleteSubscriptionForSelection(): Boolean = js.native
  /** expands item specified depth */
  /* CompleteClass */
  override def Expand(var_0: js.Any, iDepth: Double): Unit = js.native
  /** method Export */
  /* CompleteClass */
  override def Export(): Unit = js.native
  /** method Import */
  /* CompleteClass */
  override def Import(): Unit = js.native
  /** method InvokeContextMenuCommand */
  /* CompleteClass */
  override def InvokeContextMenuCommand(strCommand: String): Unit = js.native
  /** method MoveSelectionDown */
  /* CompleteClass */
  override def MoveSelectionDown(): Unit = js.native
  /** method MoveSelectionTo */
  /* CompleteClass */
  override def MoveSelectionTo(): Unit = js.native
  /** method MoveSelectionUp */
  /* CompleteClass */
  override def MoveSelectionUp(): Unit = js.native
  /** method NewFolder */
  /* CompleteClass */
  override def NewFolder(): Unit = js.native
  /** method ResetSort */
  /* CompleteClass */
  override def ResetSort(): Unit = js.native
  /** collection of selected items */
  /* CompleteClass */
  override def SelectedItems(): js.Any = js.native
  /** old, use put_Root() instead */
  /* CompleteClass */
  override def SetRoot(bstrFullPath: String): Unit = js.native
  /** set view type */
  /* CompleteClass */
  override def SetViewType(iType: Double): Unit = js.native
  /** method Synchronize */
  /* CompleteClass */
  override def Synchronize(): Unit = js.native
  /** unselects all items */
  /* CompleteClass */
  override def UnselectAll(): Unit = js.native
}

