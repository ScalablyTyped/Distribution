package typings.agGrid

import typings.agGrid.componentMod.Component
import typings.agGrid.iCellEditorMod.ICellEditor
import typings.agGrid.iCellEditorMod.ICellEditorParams
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object textCellEditorMod {
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.agGrid.iComponentMod.IComponent because Already inherited
  - typings.agGrid.iCellEditorMod.ICellEditorComp because var conflicts: afterGuiAttached, destroy, init. Inlined  */ @JSImport("ag-grid/dist/lib/rendering/cellEditors/textCellEditor", "TextCellEditor")
  @js.native
  class TextCellEditor ()
    extends Component
       with ICellEditor {
    
    @JSName("afterGuiAttached")
    def afterGuiAttached_MTextCellEditor(): Unit = js.native
    
    var focusAfterAttached: js.Any = js.native
    
    @JSName("focusIn")
    def focusIn_MTextCellEditor(): Unit = js.native
    
    /* private */ def getStartValue(params: js.Any): js.Any = js.native
    
    /** Return the final value - called by the grid once after editing is complete */
    /* CompleteClass */
    override def getValue(): js.Any = js.native
    
    var highlightAllOnFocus: js.Any = js.native
    
    @JSName("init")
    def init_MTextCellEditor(params: ITextCellEditorParams): Unit = js.native
    
    var params: js.Any = js.native
  }
  /* static members */
  object TextCellEditor {
    
    @JSImport("ag-grid/dist/lib/rendering/cellEditors/textCellEditor", "TextCellEditor")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("ag-grid/dist/lib/rendering/cellEditors/textCellEditor", "TextCellEditor.TEMPLATE")
    @js.native
    def TEMPLATE: js.Any = js.native
    @scala.inline
    def TEMPLATE_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TEMPLATE")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait ITextCellEditorParams
    extends StObject
       with ICellEditorParams {
    
    var useFormatter: Boolean = js.native
  }
}
