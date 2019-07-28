package typings.agDashGrid.distLibRenderingCellEditorFactoryMod

import typings.agDashGrid.Anon_ICellEditorComp
import typings.agDashGrid.distLibEntitiesColDefMod.ColDef
import typings.agDashGrid.distLibRenderingCellEditorsICellEditorMod.ICellEditorComp
import typings.agDashGrid.distLibRenderingCellEditorsICellEditorMod.ICellEditorParams
import typings.agDashGrid.distLibUtilsMod.Promise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ag-grid/dist/lib/rendering/cellEditorFactory", "CellEditorFactory")
@js.native
class CellEditorFactory () extends js.Object {
  var componentResolver: js.Any = js.native
  var context: js.Any = js.native
  var gridOptionsWrapper: js.Any = js.native
  def addCellEditor(key: String, cellEditor: Anon_ICellEditorComp): Unit = js.native
  def createCellEditor(column: ColDef, params: ICellEditorParams): Promise[ICellEditorComp] = js.native
  /* private */ def init(): js.Any = js.native
}

