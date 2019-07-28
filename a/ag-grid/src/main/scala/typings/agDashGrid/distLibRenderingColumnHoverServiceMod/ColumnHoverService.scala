package typings.agDashGrid.distLibRenderingColumnHoverServiceMod

import typings.agDashGrid.distLibContextBeanStubMod.BeanStub
import typings.agDashGrid.distLibEntitiesColumnMod.Column
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ag-grid/dist/lib/rendering/columnHoverService", "ColumnHoverService")
@js.native
class ColumnHoverService () extends BeanStub {
  var columnApi: js.Any = js.native
  var eventService: js.Any = js.native
  var gridApi: js.Any = js.native
  var selectedColumns: js.Any = js.native
  def clearMouseOver(): Unit = js.native
  def isHovered(column: Column): Boolean = js.native
  def setMouseOver(columns: js.Array[Column]): Unit = js.native
}

