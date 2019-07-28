package typings.agDashGrid.distLibRenderingCellRendererFactoryMod

import typings.agDashGrid.Anon_ICellRenderer
import typings.agDashGrid.distLibRenderingCellRenderersICellRendererMod.ICellRendererFunc
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ag-grid/dist/lib/rendering/cellRendererFactory", "CellRendererFactory")
@js.native
class CellRendererFactory () extends js.Object {
  var cellRendererMap: js.Any = js.native
  var eventService: js.Any = js.native
  var expressionService: js.Any = js.native
  var gridOptionsWrapper: js.Any = js.native
  def addCellRenderer(key: String, cellRenderer: Anon_ICellRenderer): Unit = js.native
  def addCellRenderer(key: String, cellRenderer: ICellRendererFunc): Unit = js.native
  def getCellRenderer(key: String): Anon_ICellRenderer | ICellRendererFunc = js.native
  /* private */ def init(): js.Any = js.native
}

/* static members */
@JSImport("ag-grid/dist/lib/rendering/cellRendererFactory", "CellRendererFactory")
@js.native
object CellRendererFactory extends js.Object {
  var ANIMATE_SHOW_CHANGE: String = js.native
  var ANIMATE_SLIDE: String = js.native
  var GROUP: String = js.native
}

