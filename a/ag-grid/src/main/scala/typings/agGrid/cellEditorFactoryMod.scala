package typings.agGrid

import typings.agGrid.anon.InstantiableICellEditorComp
import typings.agGrid.colDefMod.ColDef
import typings.agGrid.iCellEditorMod.ICellEditorComp
import typings.agGrid.iCellEditorMod.ICellEditorParams
import typings.agGrid.utilsMod.Promise
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cellEditorFactoryMod {
  
  @JSImport("ag-grid/dist/lib/rendering/cellEditorFactory", "CellEditorFactory")
  @js.native
  class CellEditorFactory () extends StObject {
    
    def addCellEditor(key: String, cellEditor: InstantiableICellEditorComp): Unit = js.native
    
    var componentResolver: js.Any = js.native
    
    var context: js.Any = js.native
    
    def createCellEditor(column: ColDef, params: ICellEditorParams): Promise[ICellEditorComp] = js.native
    
    var gridOptionsWrapper: js.Any = js.native
    
    /* private */ def init(): js.Any = js.native
  }
}
