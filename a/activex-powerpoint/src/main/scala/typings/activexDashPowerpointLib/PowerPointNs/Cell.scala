package typings
package activexDashPowerpointLib.PowerPointNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PowerPoint.Cell")
@js.native
class Cell protected () extends js.Object {
  val Application: activexDashPowerpointLib.PowerPointNs.Application = js.native
  val Borders: activexDashPowerpointLib.PowerPointNs.Borders = js.native
  val Parent: js.Any = js.native
  var `PowerPoint.Cell_typekey`: Cell = js.native
  val Selected: scala.Boolean = js.native
  val Shape: activexDashPowerpointLib.PowerPointNs.Shape = js.native
  def Merge(MergeTo: Cell): scala.Unit = js.native
  def Select(): scala.Unit = js.native
  def Split(NumRows: scala.Double, NumColumns: scala.Double): scala.Unit = js.native
}

