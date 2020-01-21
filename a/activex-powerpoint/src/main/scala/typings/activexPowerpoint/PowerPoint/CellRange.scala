package typings.activexPowerpoint.PowerPoint

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PowerPoint.CellRange")
@js.native
class CellRange protected () extends js.Object {
  val Application: typings.activexPowerpoint.PowerPoint.Application = js.native
  val Borders: typings.activexPowerpoint.PowerPoint.Borders = js.native
  val Count: Double = js.native
  val Parent: js.Any = js.native
  @JSName("PowerPoint.CellRange_typekey")
  var PowerPointDotCellRange_typekey: CellRange = js.native
  def Item(Index: Double): Cell = js.native
}

