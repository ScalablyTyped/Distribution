package typings.activexPowerpoint.PowerPoint

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PowerPoint.PrintRanges")
@js.native
class PrintRanges protected () extends js.Object {
  val Application: typings.activexPowerpoint.PowerPoint.Application = js.native
  val Count: Double = js.native
  val Parent: js.Any = js.native
  @JSName("PowerPoint.PrintRanges_typekey")
  var PowerPointDotPrintRanges_typekey: PrintRanges = js.native
  def Add(Start: Double, End: Double): PrintRange = js.native
  def ClearAll(): Unit = js.native
  def Item(Index: Double): PrintRange = js.native
}

