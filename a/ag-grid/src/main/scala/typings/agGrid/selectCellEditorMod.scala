package typings.agGrid

import typings.agGrid.componentMod.Component
import typings.agGrid.iCellEditorMod.ICellEditor
import typings.agGrid.iCellEditorMod.ICellEditorParams
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ag-grid/dist/lib/rendering/cellEditors/selectCellEditor", JSImport.Namespace)
@js.native
object selectCellEditorMod extends js.Object {
  @js.native
  trait ISelectCellEditorParams extends ICellEditorParams {
    var values: js.Array[_] = js.native
  }
  
  @js.native
  class SelectCellEditor ()
    extends Component
       with ICellEditor {
    var eSelect: js.Any = js.native
    var focusAfterAttached: js.Any = js.native
    var gridOptionsWrapper: js.Any = js.native
    var valueFormatterService: js.Any = js.native
    @JSName("afterGuiAttached")
    def afterGuiAttached_MSelectCellEditor(): Unit = js.native
    @JSName("focusIn")
    def focusIn_MSelectCellEditor(): Unit = js.native
    @JSName("init")
    def init_MSelectCellEditor(params: ISelectCellEditorParams): Unit = js.native
  }
  
}

