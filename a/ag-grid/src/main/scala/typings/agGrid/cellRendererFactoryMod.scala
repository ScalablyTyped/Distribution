package typings.agGrid

import typings.agGrid.anon.InstantiableICellRenderer
import typings.agGrid.iCellRendererMod.ICellRendererFunc
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ag-grid/dist/lib/rendering/cellRendererFactory", JSImport.Namespace)
@js.native
object cellRendererFactoryMod extends js.Object {
  @js.native
  class CellRendererFactory () extends js.Object {
    var cellRendererMap: js.Any = js.native
    var eventService: js.Any = js.native
    var expressionService: js.Any = js.native
    var gridOptionsWrapper: js.Any = js.native
    def addCellRenderer(key: String, cellRenderer: InstantiableICellRenderer): Unit = js.native
    def addCellRenderer(key: String, cellRenderer: ICellRendererFunc): Unit = js.native
    def getCellRenderer(key: String): InstantiableICellRenderer | ICellRendererFunc = js.native
    /* private */ def init(): js.Any = js.native
  }
  
  /* static members */
  @js.native
  object CellRendererFactory extends js.Object {
    var ANIMATE_SHOW_CHANGE: String = js.native
    var ANIMATE_SLIDE: String = js.native
    var GROUP: String = js.native
  }
  
}

