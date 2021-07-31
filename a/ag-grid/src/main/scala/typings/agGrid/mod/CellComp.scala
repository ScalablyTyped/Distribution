package typings.agGrid.mod

import typings.agGrid.beansMod.Beans
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
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
object CellComp {
  
  @JSImport("ag-grid", "CellComp")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("ag-grid", "CellComp.DOM_DATA_KEY_CELL_COMP")
  @js.native
  def DOM_DATA_KEY_CELL_COMP: String = js.native
  @scala.inline
  def DOM_DATA_KEY_CELL_COMP_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DOM_DATA_KEY_CELL_COMP")(x.asInstanceOf[js.Any])
}
