package typings.agGrid

import typings.agGrid.colDefMod.ColDef
import typings.agGrid.iCellEditorMod.ICellEditorComp
import typings.agGrid.iCellEditorMod.ICellEditorParams
import typings.agGrid.utilsMod.Promise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ag-grid/dist/lib/rendering/cellEditorFactory", JSImport.Namespace)
@js.native
object cellEditorFactoryMod extends js.Object {
  @js.native
  class CellEditorFactory () extends js.Object {
    var componentResolver: js.Any = js.native
    var context: js.Any = js.native
    var gridOptionsWrapper: js.Any = js.native
    def addCellEditor(key: String, cellEditor: AnonICellEditorComp): Unit = js.native
    def createCellEditor(column: ColDef, params: ICellEditorParams): Promise[ICellEditorComp] = js.native
    /* private */ def init(): js.Any = js.native
  }
  
}

