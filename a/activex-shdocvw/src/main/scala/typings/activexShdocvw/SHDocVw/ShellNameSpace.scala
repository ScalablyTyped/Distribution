package typings.activexShdocvw.SHDocVw

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ShellNameSpace extends StObject {
  
  var Columns: String
  
  /** number of view types */
  val CountViewTypes: Double
  
  /** method CreateSubscriptionForSelection */
  def CreateSubscriptionForSelection(): Boolean
  
  /** method DeleteSubscriptionForSelection */
  def DeleteSubscriptionForSelection(): Boolean
  
  var Depth: Double
  
  /** options  */
  var EnumOptions: Double
  
  /** expands item specified depth */
  def Expand(var_0: js.Any, iDepth: Double): Unit
  
  /** method Export */
  def Export(): Unit
  
  var Flags: Double
  
  /** method Import */
  def Import(): Unit
  
  /** method InvokeContextMenuCommand */
  def InvokeContextMenuCommand(strCommand: String): Unit
  
  var Mode: Double
  
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
  
  /** get the root item */
  var Root: js.Any
  
  @JSName("SHDocVw.ShellNameSpace_typekey")
  var SHDocVwDotShellNameSpace_typekey: ShellNameSpace
  
  /** get the selected item */
  var SelectedItem: js.Any
  
  /** collection of selected items */
  def SelectedItems(): js.Any
  
  /** old, use put_Root() instead */
  def SetRoot(bstrFullPath: String): Unit
  
  /** set view type */
  def SetViewType(iType: Double): Unit
  
  /** Query to see if subscriptions are enabled */
  val SubscriptionsEnabled: Boolean
  
  /** method Synchronize */
  def Synchronize(): Unit
  
  var TVFlags: Double
  
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
  
  @scala.inline
  implicit class ShellNameSpaceMutableBuilder[Self <: ShellNameSpace] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColumns(value: String): Self = StObject.set(x, "Columns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCountViewTypes(value: Double): Self = StObject.set(x, "CountViewTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreateSubscriptionForSelection(value: () => Boolean): Self = StObject.set(x, "CreateSubscriptionForSelection", js.Any.fromFunction0(value))
    
    @scala.inline
    def setDeleteSubscriptionForSelection(value: () => Boolean): Self = StObject.set(x, "DeleteSubscriptionForSelection", js.Any.fromFunction0(value))
    
    @scala.inline
    def setDepth(value: Double): Self = StObject.set(x, "Depth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnumOptions(value: Double): Self = StObject.set(x, "EnumOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpand(value: (js.Any, Double) => Unit): Self = StObject.set(x, "Expand", js.Any.fromFunction2(value))
    
    @scala.inline
    def setExport(value: () => Unit): Self = StObject.set(x, "Export", js.Any.fromFunction0(value))
    
    @scala.inline
    def setFlags(value: Double): Self = StObject.set(x, "Flags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImport(value: () => Unit): Self = StObject.set(x, "Import", js.Any.fromFunction0(value))
    
    @scala.inline
    def setInvokeContextMenuCommand(value: String => Unit): Self = StObject.set(x, "InvokeContextMenuCommand", js.Any.fromFunction1(value))
    
    @scala.inline
    def setMode(value: Double): Self = StObject.set(x, "Mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMoveSelectionDown(value: () => Unit): Self = StObject.set(x, "MoveSelectionDown", js.Any.fromFunction0(value))
    
    @scala.inline
    def setMoveSelectionTo(value: () => Unit): Self = StObject.set(x, "MoveSelectionTo", js.Any.fromFunction0(value))
    
    @scala.inline
    def setMoveSelectionUp(value: () => Unit): Self = StObject.set(x, "MoveSelectionUp", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewFolder(value: () => Unit): Self = StObject.set(x, "NewFolder", js.Any.fromFunction0(value))
    
    @scala.inline
    def setResetSort(value: () => Unit): Self = StObject.set(x, "ResetSort", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRoot(value: js.Any): Self = StObject.set(x, "Root", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSHDocVwDotShellNameSpace_typekey(value: ShellNameSpace): Self = StObject.set(x, "SHDocVw.ShellNameSpace_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectedItem(value: js.Any): Self = StObject.set(x, "SelectedItem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectedItems(value: () => js.Any): Self = StObject.set(x, "SelectedItems", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetRoot(value: String => Unit): Self = StObject.set(x, "SetRoot", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetViewType(value: Double => Unit): Self = StObject.set(x, "SetViewType", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSubscriptionsEnabled(value: Boolean): Self = StObject.set(x, "SubscriptionsEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSynchronize(value: () => Unit): Self = StObject.set(x, "Synchronize", js.Any.fromFunction0(value))
    
    @scala.inline
    def setTVFlags(value: Double): Self = StObject.set(x, "TVFlags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnselectAll(value: () => Unit): Self = StObject.set(x, "UnselectAll", js.Any.fromFunction0(value))
  }
}
