package typings.agDashGrid

import typings.agDashGrid.distLibRenderingCellEditorsICellEditorMod.ICellEditor
import typings.agDashGrid.distLibRenderingCellEditorsICellEditorMod.ICellEditorParams
import typings.agDashGrid.distLibRenderingCellEditorsSelectCellEditorMod.ISelectCellEditorParams
import typings.agDashGrid.distLibWidgetsComponentMod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ag-grid/dist/lib/rendering/cellEditors/selectCellEditor", JSImport.Namespace)
@js.native
object distLibRenderingCellEditorsSelectCellEditorMod extends js.Object {
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
    /** Return the final value - called by the grid once after editing is complete */
    /* CompleteClass */
    override def getValue(): js.Any = js.native
    @JSName("init")
    def init_MSelectCellEditor(params: ISelectCellEditorParams): Unit = js.native
  }
  
}

