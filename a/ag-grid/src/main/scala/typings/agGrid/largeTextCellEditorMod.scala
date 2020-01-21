package typings.agGrid

import typings.agGrid.componentMod.Component
import typings.agGrid.iCellEditorMod.ICellEditor
import typings.agGrid.iCellEditorMod.ICellEditorParams
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ag-grid/dist/lib/rendering/cellEditors/largeTextCellEditor", JSImport.Namespace)
@js.native
object largeTextCellEditorMod extends js.Object {
  @js.native
  trait ILargeTextEditorParams extends ICellEditorParams {
    var cols: Double = js.native
    var maxLength: Double = js.native
    var rows: Double = js.native
  }
  
  @js.native
  class LargeTextCellEditor ()
    extends Component
       with ICellEditor {
    var focusAfterAttached: js.Any = js.native
    var params: js.Any = js.native
    var textarea: js.Any = js.native
    @JSName("afterGuiAttached")
    def afterGuiAttached_MLargeTextCellEditor(): Unit = js.native
    /** Return the final value - called by the grid once after editing is complete */
    /* CompleteClass */
    override def getValue(): js.Any = js.native
    @JSName("init")
    def init_MLargeTextCellEditor(params: ILargeTextEditorParams): Unit = js.native
    @JSName("isPopup")
    def isPopup_MLargeTextCellEditor(): Boolean = js.native
    /* private */ def onKeyDown(event: js.Any): js.Any = js.native
  }
  
  /* static members */
  @js.native
  object LargeTextCellEditor extends js.Object {
    var TEMPLATE: js.Any = js.native
  }
  
}

