package typings.agGrid

import typings.agGrid.componentMod.Component
import typings.agGrid.iCellEditorMod.ICellEditor
import typings.agGrid.iCellEditorMod.ICellEditorParams
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object largeTextCellEditorMod {
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.agGrid.iComponentMod.IComponent because Already inherited
  - typings.agGrid.iCellEditorMod.ICellEditorComp because var conflicts: afterGuiAttached, destroy, init. Inlined  */ @JSImport("ag-grid/dist/lib/rendering/cellEditors/largeTextCellEditor", "LargeTextCellEditor")
  @js.native
  class LargeTextCellEditor ()
    extends Component
       with ICellEditor {
    
    @JSName("afterGuiAttached")
    def afterGuiAttached_MLargeTextCellEditor(): Unit = js.native
    
    /* private */ var focusAfterAttached: js.Any = js.native
    
    /** Return the final value - called by the grid once after editing is complete */
    /* CompleteClass */
    override def getValue(): js.Any = js.native
    
    @JSName("init")
    def init_MLargeTextCellEditor(params: ILargeTextEditorParams): Unit = js.native
    
    @JSName("isPopup")
    def isPopup_MLargeTextCellEditor(): Boolean = js.native
    
    /* private */ def onKeyDown(event: js.Any): js.Any = js.native
    
    /* private */ var params: js.Any = js.native
    
    /* private */ var textarea: js.Any = js.native
  }
  /* static members */
  object LargeTextCellEditor {
    
    @JSImport("ag-grid/dist/lib/rendering/cellEditors/largeTextCellEditor", "LargeTextCellEditor")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("ag-grid/dist/lib/rendering/cellEditors/largeTextCellEditor", "LargeTextCellEditor.TEMPLATE")
    @js.native
    def TEMPLATE: js.Any = js.native
    inline def TEMPLATE_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TEMPLATE")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait ILargeTextEditorParams
    extends StObject
       with ICellEditorParams {
    
    var cols: Double = js.native
    
    var maxLength: Double = js.native
    
    var rows: Double = js.native
  }
}
