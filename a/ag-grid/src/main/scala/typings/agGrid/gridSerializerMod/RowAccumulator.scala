package typings.agGrid.gridSerializerMod

import typings.agGrid.columnMod.Column
import typings.agGrid.rowNodeMod.RowNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RowAccumulator extends js.Object {
  
  def onColumn(column: Column, index: Double): Unit = js.native
  def onColumn(column: Column, index: Double, node: RowNode): Unit = js.native
}
