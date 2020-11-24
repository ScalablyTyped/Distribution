package typings.agGrid.gridCellMod

import typings.agGrid.columnMod.Column
import typings.agGrid.gridRowMod.GridRow
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ag-grid/dist/lib/entities/gridCell", "GridCell")
@js.native
class GridCell protected () extends js.Object {
  def this(gridCellDef: GridCellDef) = this()
  
  var column: Column = js.native
  
  def createId(): String = js.native
  
  def equals(other: GridCell): Boolean = js.native
  
  var floating: String = js.native
  
  def getGridCellDef(): GridCellDef = js.native
  
  def getGridRow(): GridRow = js.native
  
  var rowIndex: Double = js.native
}
