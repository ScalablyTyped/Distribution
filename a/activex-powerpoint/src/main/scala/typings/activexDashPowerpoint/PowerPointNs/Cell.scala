package typings.activexDashPowerpoint.PowerPointNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PowerPoint.Cell")
@js.native
class Cell protected () extends js.Object {
  val Application: typings.activexDashPowerpoint.PowerPointNs.Application = js.native
  val Borders: typings.activexDashPowerpoint.PowerPointNs.Borders = js.native
  val Parent: js.Any = js.native
  var `PowerPoint.Cell_typekey`: Cell = js.native
  val Selected: Boolean = js.native
  val Shape: typings.activexDashPowerpoint.PowerPointNs.Shape = js.native
  def Merge(MergeTo: Cell): Unit = js.native
  def Select(): Unit = js.native
  def Split(NumRows: Double, NumColumns: Double): Unit = js.native
}

