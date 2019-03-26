package typings
package agDashGridLib.distLibValueServiceValueServiceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ag-grid/dist/lib/valueService/valueService", "ValueService")
@js.native
class ValueService () extends js.Object {
  var cellExpressions: js.Any = js.native
  var columnController: js.Any = js.native
  var eventService: js.Any = js.native
  var expressionService: js.Any = js.native
  var gridOptionsWrapper: js.Any = js.native
  var initialised: js.Any = js.native
  var valueCache: js.Any = js.native
  /* private */ def executeValueGetter(filterValueGetter: js.Any, data: js.Any, column: js.Any, rowNode: js.Any): js.Any = js.native
  def getKeyForNode(
    col: agDashGridLib.distLibEntitiesColumnMod.Column,
    rowNode: agDashGridLib.distLibEntitiesRowNodeMod.RowNode
  ): js.Any = js.native
  def getValue(
    column: agDashGridLib.distLibEntitiesColumnMod.Column,
    rowNode: agDashGridLib.distLibEntitiesRowNodeMod.RowNode
  ): js.Any = js.native
  def getValue(
    column: agDashGridLib.distLibEntitiesColumnMod.Column,
    rowNode: agDashGridLib.distLibEntitiesRowNodeMod.RowNode,
    forFilter: scala.Boolean
  ): js.Any = js.native
  def getValue(
    column: agDashGridLib.distLibEntitiesColumnMod.Column,
    rowNode: agDashGridLib.distLibEntitiesRowNodeMod.RowNode,
    forFilter: scala.Boolean,
    ignoreAggData: scala.Boolean
  ): js.Any = js.native
  /* private */ def getValueCallback(node: js.Any, field: js.Any): js.Any = js.native
  def init(): scala.Unit = js.native
  def setValue(
    rowNode: agDashGridLib.distLibEntitiesRowNodeMod.RowNode,
    colKey: agDashGridLib.distLibEntitiesColumnMod.Column,
    newValue: js.Any
  ): scala.Unit = js.native
  def setValue(
    rowNode: agDashGridLib.distLibEntitiesRowNodeMod.RowNode,
    colKey: java.lang.String,
    newValue: js.Any
  ): scala.Unit = js.native
  /* private */ def setValueUsingField(data: js.Any, field: js.Any, newValue: js.Any, isFieldContainsDots: js.Any): js.Any = js.native
}

