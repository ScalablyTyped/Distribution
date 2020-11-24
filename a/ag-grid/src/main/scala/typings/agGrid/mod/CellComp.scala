package typings.agGrid.mod

import typings.agGrid.beansMod.Beans
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ag-grid", "CellComp")
@js.native
class CellComp protected ()
  extends typings.agGrid.cellCompMod.CellComp {
  def this(
    scope: js.Any,
    beans: Beans,
    column: typings.agGrid.columnMod.Column,
    rowNode: typings.agGrid.rowNodeMod.RowNode,
    rowComp: typings.agGrid.rowCompMod.RowComp,
    autoHeightCell: Boolean
  ) = this()
}
/* static members */
@JSImport("ag-grid", "CellComp")
@js.native
object CellComp extends js.Object {
  
  var DOM_DATA_KEY_CELL_COMP: String = js.native
}
