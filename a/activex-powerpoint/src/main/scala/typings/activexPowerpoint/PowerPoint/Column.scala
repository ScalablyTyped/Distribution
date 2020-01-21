package typings.activexPowerpoint.PowerPoint

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PowerPoint.Column")
@js.native
class Column protected () extends js.Object {
  val Application: typings.activexPowerpoint.PowerPoint.Application = js.native
  val Cells: CellRange = js.native
  val Parent: js.Any = js.native
  @JSName("PowerPoint.Column_typekey")
  var PowerPointDotColumn_typekey: Column = js.native
  var Width: Double = js.native
  def Delete(): Unit = js.native
  def Select(): Unit = js.native
}

