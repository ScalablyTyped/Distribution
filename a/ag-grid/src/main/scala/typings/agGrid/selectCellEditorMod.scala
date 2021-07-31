package typings.agGrid

import typings.agGrid.componentMod.Component
import typings.agGrid.iCellEditorMod.ICellEditor
import typings.agGrid.iCellEditorMod.ICellEditorParams
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object selectCellEditorMod {
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.agGrid.iComponentMod.IComponent because Already inherited
  - typings.agGrid.iCellEditorMod.ICellEditorComp because var conflicts: afterGuiAttached, destroy, init. Inlined  */ @JSImport("ag-grid/dist/lib/rendering/cellEditors/selectCellEditor", "SelectCellEditor")
  @js.native
  class SelectCellEditor ()
    extends Component
       with ICellEditor {
    
    @JSName("afterGuiAttached")
    def afterGuiAttached_MSelectCellEditor(): Unit = js.native
    
    var eSelect: js.Any = js.native
    
    var focusAfterAttached: js.Any = js.native
    
    @JSName("focusIn")
    def focusIn_MSelectCellEditor(): Unit = js.native
    
    /** Return the final value - called by the grid once after editing is complete */
    /* CompleteClass */
    override def getValue(): js.Any = js.native
    
    var gridOptionsWrapper: js.Any = js.native
    
    @JSName("init")
    def init_MSelectCellEditor(params: ISelectCellEditorParams): Unit = js.native
    
    var valueFormatterService: js.Any = js.native
  }
  
  @js.native
  trait ISelectCellEditorParams
    extends StObject
       with ICellEditorParams {
    
    var values: js.Array[js.Any] = js.native
  }
}
