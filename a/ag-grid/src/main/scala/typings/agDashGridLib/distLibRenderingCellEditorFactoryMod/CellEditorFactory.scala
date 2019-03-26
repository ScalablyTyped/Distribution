package typings
package agDashGridLib.distLibRenderingCellEditorFactoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ag-grid/dist/lib/rendering/cellEditorFactory", "CellEditorFactory")
@js.native
class CellEditorFactory () extends js.Object {
  var componentResolver: js.Any = js.native
  var context: js.Any = js.native
  var gridOptionsWrapper: js.Any = js.native
  def addCellEditor(key: java.lang.String, cellEditor: agDashGridLib.Anon_ICellEditorComp): scala.Unit = js.native
  def createCellEditor(
    column: agDashGridLib.distLibEntitiesColDefMod.ColDef,
    params: agDashGridLib.distLibRenderingCellEditorsICellEditorMod.ICellEditorParams
  ): agDashGridLib.distLibUtilsMod.Promise[agDashGridLib.distLibRenderingCellEditorsICellEditorMod.ICellEditorComp] = js.native
  /* private */ def init(): js.Any = js.native
}

