package typings
package agDashGridLib.distLibRenderingColumnHoverServiceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ag-grid/dist/lib/rendering/columnHoverService", "ColumnHoverService")
@js.native
class ColumnHoverService ()
  extends agDashGridLib.distLibContextBeanStubMod.BeanStub {
  var columnApi: js.Any = js.native
  var eventService: js.Any = js.native
  var gridApi: js.Any = js.native
  var selectedColumns: js.Any = js.native
  def clearMouseOver(): scala.Unit = js.native
  def isHovered(column: agDashGridLib.distLibEntitiesColumnMod.Column): scala.Boolean = js.native
  def setMouseOver(columns: js.Array[agDashGridLib.distLibEntitiesColumnMod.Column]): scala.Unit = js.native
}

