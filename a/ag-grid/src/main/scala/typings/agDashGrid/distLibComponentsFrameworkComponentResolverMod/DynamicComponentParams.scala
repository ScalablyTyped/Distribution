package typings.agDashGrid.distLibComponentsFrameworkComponentResolverMod

import typings.agDashGrid.distLibColumnControllerColumnApiMod.ColumnApi
import typings.agDashGrid.distLibEntitiesColDefMod.ColDef
import typings.agDashGrid.distLibEntitiesColumnMod.Column
import typings.agDashGrid.distLibEntitiesRowNodeMod.RowNode
import typings.agDashGrid.distLibGridApiMod.GridApi
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DynamicComponentParams extends js.Object {
  @JSName("$scope")
  var $scope: js.UndefOr[js.Any] = js.native
  var api: GridApi = js.native
  var colDef: js.UndefOr[ColDef] = js.native
  var column: js.UndefOr[Column] = js.native
  var columnApi: ColumnApi = js.native
  var data: js.UndefOr[js.Any] = js.native
  var node: js.UndefOr[RowNode] = js.native
  var rowIndex: js.UndefOr[Double] = js.native
}

