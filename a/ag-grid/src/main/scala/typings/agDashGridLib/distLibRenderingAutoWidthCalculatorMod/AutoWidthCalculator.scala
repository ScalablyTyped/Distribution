package typings
package agDashGridLib.distLibRenderingAutoWidthCalculatorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ag-grid/dist/lib/rendering/autoWidthCalculator", "AutoWidthCalculator")
@js.native
class AutoWidthCalculator () extends js.Object {
  var gridOptionsWrapper: js.Any = js.native
  var gridPanel: js.Any = js.native
  var headerRootComp: js.Any = js.native
  var rowRenderer: js.Any = js.native
  /* private */ def cloneItemIntoDummy(eCell: js.Any, eDummyContainer: js.Any): js.Any = js.native
  /* private */ def getHeaderCellForColumn(column: js.Any): js.Any = js.native
  def getPreferredWidthForColumn(column: agDashGridLib.distLibEntitiesColumnMod.Column): scala.Double = js.native
  /* private */ def putRowCellsIntoDummyContainer(column: js.Any, eDummyContainer: js.Any): js.Any = js.native
  def registerGridComp(gridPanel: agDashGridLib.distLibGridPanelGridPanelMod.GridPanel): scala.Unit = js.native
  def registerHeaderRootComp(headerRootComp: agDashGridLib.distLibHeaderRenderingHeaderRootCompMod.HeaderRootComp): scala.Unit = js.native
}

