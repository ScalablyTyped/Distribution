package typings.agDashGrid

import typings.agDashGrid.distLibEntitiesColDefMod.ColDef
import typings.agDashGrid.distLibRenderingCellEditorsICellEditorMod.ICellEditorComp
import typings.agDashGrid.distLibRenderingCellEditorsICellEditorMod.ICellEditorParams
import typings.agDashGrid.distLibUtilsMod.Promise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ag-grid/dist/lib/rendering/cellEditorFactory", JSImport.Namespace)
@js.native
object distLibRenderingCellEditorFactoryMod extends js.Object {
  @js.native
  class CellEditorFactory () extends js.Object {
    var componentResolver: js.Any = js.native
    var context: js.Any = js.native
    var gridOptionsWrapper: js.Any = js.native
    def addCellEditor(key: String, cellEditor: Anon_ICellEditorComp): Unit = js.native
    def createCellEditor(column: ColDef, params: ICellEditorParams): Promise[ICellEditorComp] = js.native
    /* private */ def init(): js.Any = js.native
  }
  
}

