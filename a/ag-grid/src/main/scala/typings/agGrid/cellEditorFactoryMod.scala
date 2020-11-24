package typings.agGrid

import typings.agGrid.anon.InstantiableICellEditorComp
import typings.agGrid.colDefMod.ColDef
import typings.agGrid.iCellEditorMod.ICellEditorComp
import typings.agGrid.iCellEditorMod.ICellEditorParams
import typings.agGrid.utilsMod.Promise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ag-grid/dist/lib/rendering/cellEditorFactory", JSImport.Namespace)
@js.native
object cellEditorFactoryMod extends js.Object {
  
  @js.native
  class CellEditorFactory () extends js.Object {
    
    def addCellEditor(key: String, cellEditor: InstantiableICellEditorComp): Unit = js.native
    
    var componentResolver: js.Any = js.native
    
    var context: js.Any = js.native
    
    def createCellEditor(column: ColDef, params: ICellEditorParams): Promise[ICellEditorComp] = js.native
    
    var gridOptionsWrapper: js.Any = js.native
    
    /* private */ def init(): js.Any = js.native
  }
}
