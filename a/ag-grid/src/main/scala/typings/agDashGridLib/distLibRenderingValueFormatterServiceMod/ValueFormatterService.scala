package typings
package agDashGridLib.distLibRenderingValueFormatterServiceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ag-grid/dist/lib/rendering/valueFormatterService", "ValueFormatterService")
@js.native
class ValueFormatterService () extends js.Object {
  var expressionService: js.Any = js.native
  var gridOptionsWrapper: js.Any = js.native
  def formatValue(
    column: agDashGridLib.distLibEntitiesColumnMod.Column,
    rowNode: agDashGridLib.distLibEntitiesRowNodeMod.RowNode,
    $scope: js.Any,
    value: js.Any
  ): java.lang.String = js.native
}

