package typings.activexPowerpoint.PowerPoint

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PowerPoint.Cell")
@js.native
class Cell protected () extends js.Object {
  val Application: typings.activexPowerpoint.PowerPoint.Application = js.native
  val Borders: typings.activexPowerpoint.PowerPoint.Borders = js.native
  val Parent: js.Any = js.native
  @JSName("PowerPoint.Cell_typekey")
  var PowerPointDotCell_typekey: Cell = js.native
  val Selected: Boolean = js.native
  val Shape: typings.activexPowerpoint.PowerPoint.Shape = js.native
  def Merge(MergeTo: Cell): Unit = js.native
  def Select(): Unit = js.native
  def Split(NumRows: Double, NumColumns: Double): Unit = js.native
}

