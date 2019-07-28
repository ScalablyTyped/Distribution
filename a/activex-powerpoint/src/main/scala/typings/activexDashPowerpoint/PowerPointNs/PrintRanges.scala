package typings.activexDashPowerpoint.PowerPointNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PowerPoint.PrintRanges")
@js.native
class PrintRanges protected () extends js.Object {
  val Application: typings.activexDashPowerpoint.PowerPointNs.Application = js.native
  val Count: Double = js.native
  val Parent: js.Any = js.native
  var `PowerPoint.PrintRanges_typekey`: PrintRanges = js.native
  def Add(Start: Double, End: Double): PrintRange = js.native
  def ClearAll(): Unit = js.native
  def Item(Index: Double): PrintRange = js.native
}

