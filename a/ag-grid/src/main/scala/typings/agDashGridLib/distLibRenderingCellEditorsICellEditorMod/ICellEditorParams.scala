package typings
package agDashGridLib.distLibRenderingCellEditorsICellEditorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ICellEditorParams extends js.Object {
  @JSName("$scope")
  var $scope: js.Any = js.native
  var api: agDashGridLib.distLibGridApiMod.GridApi = js.native
  var cellStartedEdit: scala.Boolean = js.native
  var charPress: java.lang.String = js.native
  var column: agDashGridLib.distLibEntitiesColumnMod.Column = js.native
  var columnApi: agDashGridLib.distLibColumnControllerColumnApiMod.ColumnApi = js.native
  var context: js.Any = js.native
  var eGridCell: stdLib.HTMLElement = js.native
  var keyPress: scala.Double = js.native
  var node: agDashGridLib.distLibEntitiesRowNodeMod.RowNode = js.native
  var rowIndex: scala.Double = js.native
  var value: js.Any = js.native
  def formatValue(value: js.Any): js.Any = js.native
  def onKeyDown(event: stdLib.KeyboardEvent): scala.Unit = js.native
  def parseValue(value: js.Any): js.Any = js.native
  def stopEditing(): scala.Unit = js.native
  def stopEditing(suppressNavigateAfterEdit: scala.Boolean): scala.Unit = js.native
}

