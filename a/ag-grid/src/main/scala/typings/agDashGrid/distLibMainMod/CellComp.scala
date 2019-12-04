package typings.agDashGrid.distLibMainMod

import typings.agDashGrid.distLibRenderingBeansMod.Beans
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ag-grid/dist/lib/main", "CellComp")
@js.native
class CellComp protected ()
  extends typings.agDashGrid.distLibRenderingCellCompMod.CellComp {
  def this(
    scope: js.Any,
    beans: Beans,
    column: typings.agDashGrid.distLibEntitiesColumnMod.Column,
    rowNode: typings.agDashGrid.distLibEntitiesRowNodeMod.RowNode,
    rowComp: typings.agDashGrid.distLibRenderingRowCompMod.RowComp,
    autoHeightCell: Boolean
  ) = this()
}

/* static members */
@JSImport("ag-grid/dist/lib/main", "CellComp")
@js.native
object CellComp extends js.Object {
  var DOM_DATA_KEY_CELL_COMP: String = js.native
}

