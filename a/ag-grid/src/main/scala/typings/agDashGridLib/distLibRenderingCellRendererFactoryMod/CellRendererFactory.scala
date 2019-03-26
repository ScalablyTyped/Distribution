package typings
package agDashGridLib.distLibRenderingCellRendererFactoryMod

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
  def addCellRenderer(key: java.lang.String, cellRenderer: agDashGridLib.Anon_ICellRenderer): scala.Unit = js.native
  def addCellRenderer(
    key: java.lang.String,
    cellRenderer: agDashGridLib.distLibRenderingCellRenderersICellRendererMod.ICellRendererFunc
  ): scala.Unit = js.native
  def getCellRenderer(key: java.lang.String): agDashGridLib.Anon_ICellRenderer | agDashGridLib.distLibRenderingCellRenderersICellRendererMod.ICellRendererFunc = js.native
  /* private */ def init(): js.Any = js.native
}

/* static members */
@JSImport("ag-grid/dist/lib/rendering/cellRendererFactory", "CellRendererFactory")
@js.native
object CellRendererFactory extends js.Object {
  var ANIMATE_SHOW_CHANGE: java.lang.String = js.native
  var ANIMATE_SLIDE: java.lang.String = js.native
  var GROUP: java.lang.String = js.native
}

