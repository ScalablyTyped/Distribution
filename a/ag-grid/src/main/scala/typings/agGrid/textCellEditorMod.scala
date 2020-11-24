package typings.agGrid

import typings.agGrid.componentMod.Component
import typings.agGrid.iCellEditorMod.ICellEditor
import typings.agGrid.iCellEditorMod.ICellEditorParams
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ag-grid/dist/lib/rendering/cellEditors/textCellEditor", JSImport.Namespace)
@js.native
object textCellEditorMod extends js.Object {
  
  @js.native
  trait ITextCellEditorParams extends ICellEditorParams {
    
    var useFormatter: Boolean = js.native
  }
  
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
    
    var highlightAllOnFocus: js.Any = js.native
    
    @JSName("init")
    def init_MTextCellEditor(params: ITextCellEditorParams): Unit = js.native
    
    var params: js.Any = js.native
  }
  /* static members */
  @js.native
  object TextCellEditor extends js.Object {
    
    var TEMPLATE: js.Any = js.native
  }
}
